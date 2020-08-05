/**
  * Copyright 2020 jb51.net 
  */
package my.poi.excel.phpapi.model;

import java.util.Date;

/**
 * Auto-generated: 2020-08-05 16:32:21
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class Holidaylist {

    private String name;
    private Date startday;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setStartday(Date startday) {
         this.startday = startday;
     }
     public Date getStartday() {
         return startday;
     }

}