package my.poi.excel.model;

/**
 * ��ʱ��������
 * @author yang
 *
 */
public class ExcelDataVo {
	
	// Ա�����
	private String number;
	// ����
	private String name;
	// ��������
	private String secondaryDep;
	// ��ʱ��������(ֵ�ࡢ��ͨ�Ӱࡢ���߼Ӱ�)
	private String workType; 
	// ��ʱ��������
	private String workCause;
	// ����������(�����ա���Ϣ�ա��ڼ���)
	private String workDayType;
	// ��ʱ������ʼ����
	private String startDate;
	// ��ʱ������ʼʱ��
	private String startTime;
	// ��ʱ������������
	private String endDate;
	// ��ʱ��������ʱ��
	private String entTime;
	// ����Сʱ =IF(F3="������",4,IF(F3="��Ϣ��",6,IF(F3="�ڼ���",6,0)))
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
