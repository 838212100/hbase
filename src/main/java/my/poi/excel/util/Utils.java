package my.poi.excel.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class Utils {
	
	// 因为到用接口返回来的日期值均为2020-1-1的形式 没有补全 所以用 yyyy-MM-dd的形式
	private static final String YYYYMMDD = "yyyy-M-d";
	
	private Utils() {}
	
	/**
	 * 字符串转日期类型
	 * @param dateStr
	 * @return
	 */
	public static LocalDate stringToDateFormat(String dateStr) {
		return LocalDate.parse(dateStr, DateTimeFormatter.ofPattern(YYYYMMDD));
	}
	
	/**
	 * 日期转字符串
	 * @param date
	 * @return
	 */
	public static String dateToStringFormat(LocalDate localDate) {
		return localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
	}
	
	public static void main(String[] args) {
		Set<LocalDate> setDate = new HashSet<LocalDate>();
		LocalDate date1 = stringToDateFormat("2020-8-9");
//		setDate.add(date1);
		setDate.add(LocalDate.now());
		for(LocalDate date : setDate) {
			System.out.println(date);
		}
		if(setDate.contains(date1)) {
			System.out.println("you");
		} else {
			System.out.println("wu");
		}
		if(date1.equals(LocalDate.now())) {
			System.out.println("yiyang");
		} else {
			System.out.println("no");
		}
	}

}
