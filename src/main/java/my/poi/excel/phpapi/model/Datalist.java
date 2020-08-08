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
public class Datalist {

	private String date;
	private String status;
	private LocalDate ldate;

	public void setDate(String date) {
		this.date = date;
		this.ldate = Utils.stringToDateFormat(date); 
	}

	public String getDate() {
		return date;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
	
	public LocalDate getLdate() {
		return ldate;
	}

}