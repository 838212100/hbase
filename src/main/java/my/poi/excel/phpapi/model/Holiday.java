/**
  * Copyright 2020 jb51.net 
  */
package my.poi.excel.phpapi.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated: 2020-08-05 16:32:21
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class Holiday {

    private String desc;
    private Date festival;
    @JsonProperty("dataList")
    private List<Datalist> datalist;
    @JsonProperty("listNumBaidu")
    private int listnumbaidu;
    private String name;
    private String rest;
    public void setDesc(String desc) {
         this.desc = desc;
     }
     public String getDesc() {
         return desc;
     }

    public void setFestival(Date festival) {
         this.festival = festival;
     }
     public Date getFestival() {
         return festival;
     }

    public void setDatalist(List<Datalist> datalist) {
         this.datalist = datalist;
     }
     public List<Datalist> getDatalist() {
         return datalist;
     }

    public void setListnumbaidu(int listnumbaidu) {
         this.listnumbaidu = listnumbaidu;
     }
     public int getListnumbaidu() {
         return listnumbaidu;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setRest(String rest) {
         this.rest = rest;
     }
     public String getRest() {
         return rest;
     }

}