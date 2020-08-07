/**
  * Copyright 2020 jb51.net 
  */
package my.poi.excel.phpapi.model;

import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2020-08-05 16:32:21
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class Holiday {

	private List<Datalist> dataList;
	private String desc;
	private Date festival;
	private int listNumBaidu;
	private String name;
	private String rest;

	public void setDataList(List<Datalist> dataList) {
		this.dataList = dataList;
	}

	public List<Datalist> getDataList() {
		return dataList;
	}

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

	public void setListNumBaidu(int listNumBaidu) {
		this.listNumBaidu = listNumBaidu;
	}

	public int getListNumBaidu() {
		return listNumBaidu;
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

	@Override
	public String toString() {
		return "Holiday [dataList=" + dataList + ", desc=" + desc + ", festival=" + festival + ", listNumBaidu="
				+ listNumBaidu + ", name=" + name + ", rest=" + rest + "]";
	}
	
}