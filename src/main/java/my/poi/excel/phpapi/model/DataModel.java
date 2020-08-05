/**
  * Copyright 2020 jb51.net 
  */
package my.poi.excel.phpapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated: 2020-08-05 16:32:21
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class DataModel {

    private String status;
    private String t;
    @JsonProperty("set_cache_time")
    private String setCacheTime;
    private List<Data> data;
    public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setT(String t) {
         this.t = t;
     }
     public String getT() {
         return t;
     }

    public void setSetCacheTime(String setCacheTime) {
         this.setCacheTime = setCacheTime;
     }
     public String getSetCacheTime() {
         return setCacheTime;
     }

    public void setData(List<Data> data) {
         this.data = data;
     }
     public List<Data> getData() {
         return data;
     }

}