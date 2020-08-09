/**
  * Copyright 2020 jb51.net 
  */
package my.poi.excel.phpapi.model;

import java.time.LocalDate;

import my.poi.excel.util.Utils;

/**
 * Auto-generated: 2020-08-05 16:32:21
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class Holidaylist {

	private String name;
	private String startday;
	private LocalDate startdayLdate;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setStartday(String startday) {
		this.startday = startday;
		this.startdayLdate = Utils.stringToDateFormat(startday); 
	}

	public String getStartday() {
		return startday;
	}
	

	/**
	 * @return the startdayLdate
	 */
	public LocalDate getStartdayLdate() {
		return startdayLdate;
	}

	/**
	 * @param startdayLdate the startdayLdate to set
	 */
	public void setStartdayLdate(LocalDate startdayLdate) {
		this.startdayLdate = startdayLdate;
	}

}