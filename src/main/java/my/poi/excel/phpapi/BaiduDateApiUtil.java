package my.poi.excel.phpapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import my.poi.excel.phpapi.model.Almanac;
import my.poi.excel.phpapi.model.Data;
import my.poi.excel.phpapi.model.DataModel;
import my.poi.excel.phpapi.model.Datalist;
import my.poi.excel.phpapi.model.Holiday;
import my.poi.excel.phpapi.model.Holidaylist;
import my.poi.excel.util.Constant;
import my.poi.excel.util.Utils;
import net.sf.json.JSONObject;

/**
 * 百度日历接口
 * @author yang
 *
 */
public class BaiduDateApiUtil {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BaiduDateApiUtil.class);
	
	private BaiduDateApiUtil() {}
	
	/**
	  * 调用百度日历接口，传入年、月即可
	  * 获取所有节假日信息，包括国家串休的节假日
	  * 目前做的情况是将json串一层层的转换为JavaBean
	  * 需要注意转型的问题，通过JSONObject.toBean处理过的才会转换为想要的java类，注意不能强制转型，会报强转的错
	 * @param year
	 * @param month
	 * @return 只返回对应的DataModel的信息 没有过多余的处理
	 */
	public static DataModel getCalendar(String year, String month) {
		DataModel dataModel = null;
		try {
			URL url = new URL("https://sp0.baidu.com/8aQDcjqpAAV3otqbppnN2DJv/api.php?query="+year+"%E5%B9%B4"+month+"%E6%9C%88&resource_id=6018&format=json");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(10000);
			conn.setRequestMethod("GET");
			conn.setDoInput(true);
			conn.setDoOutput(true);
			 
		    // 输出返回结果
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "GBK"));
			
			StringBuilder sb = new StringBuilder();
			String lines;
			while ((lines = reader.readLine()) != null) {
                sb.append(lines);
            }
			
			// map放入Data类信息，用于入口类DataModel中private List<Data> data属性的放入
			Map<String, Class<?>> classMap = new HashMap<String, Class<?>>();
			classMap.put("data", Data.class);
			
			// 使用JSONObject转换返回的json串
			JSONObject jsonObject = JSONObject.fromObject(replaceJsonStr(sb.toString()));
			// 转换为类 DataModel json转java入口类
			dataModel = (DataModel) JSONObject.toBean(jsonObject, DataModel.class, classMap);
			
			if(!dataModel.getData().isEmpty()) {
				// json串中只有一个Data 取0位置的即可
				Data dataM = dataModel.getData().get(0);
				// 清除map 放入Datalist类
				classMap.clear();
				classMap.put("dataList", Datalist.class);
				
				// 获取Holiday 此时获取到的类型为net.sf.ezmorph.bean.MorphDynaBean 需要通过JSONObject转为Holiday类型
				List<Holiday> holidayList = dataM.getHoliday();
				for (int i = 0; i < holidayList.size(); i++) {
					Holiday holidayModel = (Holiday) JSONObject.toBean(JSONObject.fromObject(holidayList.get(i)), Holiday.class, classMap);
					holidayList.set(i, holidayModel);
					List<Datalist> dataList = holidayModel.getDataList();
					holidayList.get(i).setDataList(dataList);
				}
				
				// 放入Almanac
				List<Almanac> almanacList = dataM.getAlmanac();
				for (int i = 0; i < almanacList.size(); i++) {
					almanacList.set(i, (Almanac) JSONObject.toBean(JSONObject.fromObject(almanacList.get(i)), Almanac.class));
				}
				
				// 放入Holidaylist
				List<Holidaylist> HolidaylistList = dataM.getHolidaylist();
				for (int i = 0; i < HolidaylistList.size(); i++) {
					HolidaylistList.set(i, (Holidaylist) JSONObject.toBean(JSONObject.fromObject(HolidaylistList.get(i)), Holidaylist.class));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			LOGGER.error("获取接口URL问题：" + e.getMessage());
		}
		return dataModel;
	}
	
	
	/**
	  * 替换Json串中内容，为了便于转为JavaBean
	 * "list"会转为List.java类 需要改为："list" -> "dataList"
	 * "list#num#baidu"会转为list#num#baidu属性，private String list#num#baidu; 命名有错误，不能含有#号，需要改为："list#num#baidu" -> "listNumBaidu"
	 * @param jsonStr
	 * @return
	 */
	private static String replaceJsonStr(String jsonStr) {
		String strRep = jsonStr;
		// 将返回的串中所有 "list" 修改为 "dataList"  将返回的串中所有 "list#num#baidu" 修改为 "listNumBaidu"
		// 带有"" 号确保找到的内容的唯一性
		return strRep.replaceAll("\"list\"", "\"dataList\"").replaceAll("\"list#num#baidu\"", "\"listNumBaidu\"");
	}
	
	/**
	  * 根据接口中的结果holiday，判断一天date
	 * @param holiday
	 * @param date
	 * @return
	 */
	public static int workDayType(DataModel monthDate, String date) {1判断date是不是2020-1-1的形式 而不是2020-01-01
		// 字符串转换为日期
		LocalDate ldate = Utils.stringToDateFormat(date);
		// 2节假日  1周末  0工作日
		int dayType = Constant.WORKDAY;
		// 将所有的节日放入
		Set<LocalDate> setDate = new HashSet<LocalDate>();
		List<Holiday> holidaylist = monthDate.getData().get(0).getHoliday();
		for (int i = 0; i < holidaylist.size(); i++) {
			List<Datalist> datalist = holidaylist.get(i).getDataList();
			for(Datalist data : datalist) {
				setDate.add(data.getLdate());
			}
		}
		// 判断是否为节假日 在Set中有，则为节假日
		if(setDate.contains(ldate)) {
			dayType = Constant.HOLIDAYS;
		}
		// 判断是否为周末
		if(dayType == 0) {
			if(Utils.isWeekend(ldate)){
				dayType = Constant.WEEKEND;
			}
		}
		return dayType;
	}
	
	public static void main(String[] args) {
//		if(null != getCalendar("2020", "5")) {
//			System.out.println("not null");
//		} else {
//			System.out.println("is null");
//		}
	}

}