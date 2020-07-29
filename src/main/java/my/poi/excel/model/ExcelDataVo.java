package my.poi.excel.model;

/**
 * 延时工作表类
 * @author yang
 *
 */
public class ExcelDataVo {
	
	// 员工编号
	private String number;
	// 姓名
	private String name;
	// 二级部门
	private String secondaryDep;
	// 延时工作类型(值班、普通加班、上线加班)
	private String workType; 
	// 延时工作事由
	private String workCause;
	// 工作日类型(工作日、休息日、节假日)
	private String workDayType;
	// 延时工作开始日期
	private String startDate;
	// 延时工作开始时间
	private String startTime;
	// 延时工作结束日期
	private String endDate;
	// 延时工作结束时间
	private String entTime;
	// 核算小时 =IF(F3="工作日",4,IF(F3="休息日",6,IF(F3="节假日",6,0)))
	private int totalTime;
	
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the secondaryDep
	 */
	public String getSecondaryDep() {
		return secondaryDep;
	}
	/**
	 * @param secondaryDep the secondaryDep to set
	 */
	public void setSecondaryDep(String secondaryDep) {
		this.secondaryDep = secondaryDep;
	}
	/**
	 * @return the workType
	 */
	public String getWorkType() {
		return workType;
	}
	/**
	 * @param workType the workType to set
	 */
	public void setWorkType(String workType) {
		this.workType = workType;
	}
	/**
	 * @return the workCause
	 */
	public String getWorkCause() {
		return workCause;
	}
	/**
	 * @param workCause the workCause to set
	 */
	public void setWorkCause(String workCause) {
		this.workCause = workCause;
	}
	
	/**
	 * @return the workDayType
	 */
	public String getWorkDayType() {
		return workDayType;
	}
	/**
	 * @param workDayType the workDayType to set
	 */
	public void setWorkDayType(String workDayType) {
		this.workDayType = workDayType;
	}
	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the entTime
	 */
	public String getEntTime() {
		return entTime;
	}
	/**
	 * @param entTime the entTime to set
	 */
	public void setEntTime(String entTime) {
		this.entTime = entTime;
	}
	/**
	 * @return the totalTime
	 */
	public int getTotalTime() {
		return totalTime;
	}
	/**
	 * @param totalTime the totalTime to set
	 */
	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}
	
	@Override
	public String toString() {
		return "ExcelDataVo [number=" + number + ", name=" + name + ", secondaryDep=" + secondaryDep + ", workType="
				+ workType + ", workCause=" + workCause + ", workDayType=" + workDayType + ", startDate=" + startDate
				+ ", startTime=" + startTime + ", endDate=" + endDate + ", entTime=" + entTime + ", totalTime="
				+ totalTime + "]";
	}

}
