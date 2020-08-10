package my.poi.excel.util;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
	
	/**
	  * 判断是否为周末
	 * @param localDate
	 * @return
	 */
	public static boolean isWeekend(LocalDate localDate) {
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
	}
	
}