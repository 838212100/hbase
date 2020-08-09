/**
  * Copyright 2020 jb51.net 
  */
package my.poi.excel.phpapi.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import my.poi.excel.util.Utils;

/**
 * Auto-generated: 2020-08-05 16:32:21
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class Data {

	@JsonProperty("StdStg")
	private int stdstg;
	@JsonProperty("StdStl")
	private int stdstl;
	@JsonProperty("_update_time")
	private String UpdateTime;
	@JsonProperty("cambrian_appid")
	private String cambrianAppid;
	private List<Almanac> almanac;
	private List<Holiday> holiday;
	private List<Holidaylist> holidaylist;
	private String key;
	private String selectday;
	private LocalDate selectdayLdate;
	private String url;
	private String loc;
	@JsonProperty("SiteId")
	private int siteid;
	@JsonProperty("_version")
	private int Version;
	@JsonProperty("_select_time")
	private int SelectTime;
	private String clicklimit;
	@JsonProperty("ExtendedLocation")
	private String extendedlocation;
	@JsonProperty("OriginQuery")
	private String originquery;
	private String tplt;
	private String resourceid;
	private String fetchkey;
	@JsonProperty("role_id")
	private int roleId;
	@JsonProperty("disp_type")
	private int dispType;
	private String appinfo;

	public void setStdstg(int stdstg) {
		this.stdstg = stdstg;
	}

	public int getStdstg() {
		return stdstg;
	}

	public void setStdstl(int stdstl) {
		this.stdstl = stdstl;
	}

	public int getStdstl() {
		return stdstl;
	}

	public void setUpdateTime(String UpdateTime) {
		this.UpdateTime = UpdateTime;
	}

	public String getUpdateTime() {
		return UpdateTime;
	}

	public void setCambrianAppid(String cambrianAppid) {
		this.cambrianAppid = cambrianAppid;
	}

	public String getCambrianAppid() {
		return cambrianAppid;
	}

	public void setAlmanac(List<Almanac> almanac) {
		this.almanac = almanac;
	}

	public List<Almanac> getAlmanac() {
		return almanac;
	}

	public void setHoliday(List<Holiday> holiday) {
		this.holiday = holiday;
	}

	public List<Holiday> getHoliday() {
		return holiday;
	}

	public void setHolidaylist(List<Holidaylist> holidaylist) {
		this.holidaylist = holidaylist;
	}

	public List<Holidaylist> getHolidaylist() {
		return holidaylist;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setSelectday(String selectday) {
		this.selectday = selectday;
		this.selectdayLdate = Utils.stringToDateFormat(selectday); 
	}

	public String getSelectday() {
		return selectday;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getLoc() {
		return loc;
	}

	public void setSiteid(int siteid) {
		this.siteid = siteid;
	}

	public int getSiteid() {
		return siteid;
	}

	public void setVersion(int Version) {
		this.Version = Version;
	}

	public int getVersion() {
		return Version;
	}

	public void setSelectTime(int SelectTime) {
		this.SelectTime = SelectTime;
	}

	public int getSelectTime() {
		return SelectTime;
	}

	public void setClicklimit(String clicklimit) {
		this.clicklimit = clicklimit;
	}

	public String getClicklimit() {
		return clicklimit;
	}

	public void setExtendedlocation(String extendedlocation) {
		this.extendedlocation = extendedlocation;
	}

	public String getExtendedlocation() {
		return extendedlocation;
	}

	public void setOriginquery(String originquery) {
		this.originquery = originquery;
	}

	public String getOriginquery() {
		return originquery;
	}

	public void setTplt(String tplt) {
		this.tplt = tplt;
	}

	public String getTplt() {
		return tplt;
	}

	public void setResourceid(String resourceid) {
		this.resourceid = resourceid;
	}

	public String getResourceid() {
		return resourceid;
	}

	public void setFetchkey(String fetchkey) {
		this.fetchkey = fetchkey;
	}

	public String getFetchkey() {
		return fetchkey;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setDispType(int dispType) {
		this.dispType = dispType;
	}

	public int getDispType() {
		return dispType;
	}

	public void setAppinfo(String appinfo) {
		this.appinfo = appinfo;
	}

	public String getAppinfo() {
		return appinfo;
	}

	/**
	 * @return the selectdayLdate
	 */
	public LocalDate getSelectdayLdate() {
		return selectdayLdate;
	}

	/**
	 * @param selectdayLdate the selectdayLdate to set
	 */
	public void setSelectdayLdate(LocalDate selectdayLdate) {
		this.selectdayLdate = selectdayLdate;
	}
	
}