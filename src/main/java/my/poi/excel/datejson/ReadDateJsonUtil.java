package my.poi.excel.datejson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.sf.json.JSONObject;

public class ReadDateJsonUtil {
	
	public static void main(String[] args) {
        String path = ReadDateJsonUtil.class.getClassLoader().getResource("dateJson.json").getPath();
        
        // map放入Data类信息，用于入口类DataModel中private List<Data> data属性的放入
		List<Map<String, String>> classMap = new ArrayList<Map<String, String>>();
//		classMap.put("data", Data.class);
        
        String s = readJsonFile(path);
        JSONObject jobj = JSONObject.fromObject(s);
//        JSONArray movies = jobj.getJSONArray("RECORDS");//构建JSONArray数组
        classMap = (Map<String, Object>) JSONObject.toBean(jobj, List.class);
        
        for (Entry<String, Object> entry : classMap.entrySet()) {
//        	System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        	Map<String, String> m = new HashMap<String, String>();
        	m = (Map<String, String>) JSONObject.toBean(entry, Map.class);
        	System.out.println(m);
		}
//        System.out.println(classMap);
    }
	
	//读取json文件
    public static String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
