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
public class Almanac {

    private String avoid;
    private String date;
    private LocalDate ldate;
    private String suit;
    
    public void setAvoid(String avoid) {
         this.avoid = avoid;
     }
     public String getAvoid() {
         return avoid;
     }

    public void setDate(String date) {
         this.date = date;
         this.ldate = Utils.stringToDateFormat(date); 
     }
     public String getDate() {
         return date;
     }

    public void setSuit(String suit) {
         this.suit = suit;
     }
     public String getSuit() {
         return suit;
     }
	/**
	 * @return the ldate
	 */
	public LocalDate getLdate() {
		return ldate;
	}
	/**
	 * @param ldate the ldate to set
	 */
	public void setLdate(LocalDate ldate) {
		this.ldate = ldate;
	}

}