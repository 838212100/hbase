package my.poi.excel.datejson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import java.util.Map.Entry;

import my.poi.excel.util.Constant;
import net.sf.json.JSONObject;

public class ReadDateJsonUtil {
	
//	public static void main(String[] args) {
//		Map<String, Map<String, String>> map = getDateJsonMap();
//		System.out.println(map);
//    }
	
	/**
	 * 将json文件中的内容转为 Map
	 * 形式为 Map<String, Map<String, String>>
	 * 1表示休息日 2表示节假日
	 * <p>Title: getDateJsonMap</p>  
	 * <p>Description: </p>  
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Map<String, String>> getDateJsonMap(){
		// json文件路径
		String path = ReadDateJsonUtil.class.getClassLoader().getResource("dateJson.json").getPath();
		
		// 读取json文件内容
        JSONObject jobj = JSONObject.fromObject(readJsonFile(path));

//      1表示休息日 2表示节假日
        Map<String, Map<String, String>> classMap = (Map<String, Map<String, String>>) JSONObject.toBean(jobj, Map.class);
        
        for (Entry<String, Map<String, String>> entry : classMap.entrySet()) {
        	Map<String, String> m = (Map<String, String>) JSONObject.toBean(JSONObject.fromObject(entry.getValue()), Map.class);
        	classMap.put(entry.getKey(), m);
		}
		return classMap;
	}
	
	/**
	 * 读取json文件内容
	 * <p>Title: readJsonFile</p>  
	 * <p>Description: </p>  
	 * @param fileName
	 * @return
	 */
    public static String readJsonFile(String fileName) {
    	
    	FileReader fileReader = null;
    	Reader reader = null;
        try {
            File jsonFile = new File(fileName);
            fileReader = new FileReader(jsonFile);
            reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            return sb.toString();
            
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
        	try {
				fileReader.close();
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
    
    /**
     *  返回值班类型
     *  0 工作日
     *  1 休息日
     *  2 节假日
     * <p>Title: workDayType</p>  
     * <p>Description: </p>  
     * @param date
     * @return
     */
    public static Integer workDayType(Map<String, Map<String, String>> holidaysOrWeekJson, String date) {
    	
    	Integer dayType = Constant.WORKDAY;
    	String[] dateArray = date.split("-");
    	
    	String yearMonthKey = dateArray[0] + dateArray[1];
    	String dayKey = dateArray[2];
    	
    	Map<String, String> monthMap = holidaysOrWeekJson.get(yearMonthKey);
    	
    	if(monthMap.containsKey(dayKey)) {
    		dayType = Integer.valueOf(monthMap.get(dayKey));
    	}
    	return dayType;
    }

}
