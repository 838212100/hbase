package my.poi.excel.phpapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import my.poi.excel.phpapi.model.*;
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
	 * @param year
	 * @param month
	 * @return 对应的节假日信息
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
			
			List<Holiday> listHoliday = getHoliday(replaceJsonStr(sb.toString()));
			dataModel = new DataModel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			LOGGER.error("获取接口URL问题：" + e.getMessage());
		}
		return dataModel;
	}
	
	/**
	 * 获取所有节假日信息，包括国家串休的节假日
	 * @param jsonStr
	 * @return
	 */
	private static List<Holiday> getHoliday(String jsonStr){
		
//		classMap.put("almanac", Almanac.class);
//		classMap.put("holiday", Holiday.class);
//		classMap.put("holidaylist", Holidaylist.class);
//		classMap.put("datalist", Datalist.class);
		
		Map<String, Class<?>> classMap = new HashMap<String, Class<?>>();
		classMap.put("data", Data.class);
		
		// 使用JSONObject
		JSONObject jsonObject = JSONObject.fromObject(jsonStr);
		// 生成对应类 DataModel
		DataModel dataModel = (DataModel)JSONObject.toBean(jsonObject, DataModel.class, classMap);
		
		if(!dataModel.getData().isEmpty()) {
			List<Data> list = dataModel.getData();
			for (Data data : list) {
				System.out.println((Data)data);
			}
		}
		
		
		return null;
	}
	
	/**
	  * 根据接口中的结果holiday，判断一天date
	 * @param holiday
	 * @param date
	 * @return
	 */
	public static int workDayType(DataModel monthDate, String date) {
		
		return 0;
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
	
	public static void main(String[] args) {
		if(null != getCalendar("2020", "5")) {
			System.out.println("not null");
		} else {
			System.out.println("is null");
		}
	}
	
//	public static void main(String[] args) throws Exception {
//		// 年
//		String year = "2020";
//		// 月
//		String month = "05";
//		
//		URL url = new URL("https://sp0.baidu.com/8aQDcjqpAAV3otqbppnN2DJv/api.php?query="+year+"%E5%B9%B4"+month+"%E6%9C%88&resource_id=6018&format=json1");
//	    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//	    conn.setConnectTimeout(10000);
//	    conn.setRequestMethod("GET");
//	    conn.setDoInput(true);
//	    conn.setDoOutput(true);
//	 
//	 
//	    // 输出返回结果
//	    BufferedInputStream buf = new BufferedInputStream(conn.getInputStream());
//	    
//	    int resLen =0;
//	    byte[] res = new byte[1024];
//	    StringBuilder sb=new StringBuilder();
//	    while((resLen=buf.read(res))!=-1){
//	      sb.append(new String(res, 0, resLen));
//	    }
//	     
//	    String jsonStr=sb.toString();
//
//	    System.out.println(jsonStr);
//	    
//	    //1、使用JSONObject
//        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
//        DataModel dataModel = (DataModel)JSONObject.toBean(jsonObject, DataModel.class);
//        System.out.println(dataModel.toString());
//	}

}