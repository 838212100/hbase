package my.poi.excel.util;

/**
 * 一些常量
 * 三种节假日定义的内容互不影响，无需太多关注
 * @author yang
 *
 */
public class Constant {
	
	public static final String SECONDARYDEP = "机场产品开发与交付部"; 
	
	// ---------- 自己定义的 ---------- 
	// 节假日
	public static final int HOLIDAYS = 2; 
	// 周末
	public static final int WEEKEND = 1; 
	// 工作日
	public static final int WORKDAY = 0;
	
	// ---------- 联网查询接口返回的状态 ---------- 
	// Json返回日期的状态值  status=1 代表节假日
	public static final int JSONSTATUSHOLIDAYS = 1;
	// Json返回日期的状态值  status=2 代表工作日
	public static final int JSONSTATUSWORKDAY = 2;
	
	
	// ---------- Json文件中内容 ---------- 
	// 1表示休息日
	public static final int JSONFILESTATUSWEEKEND = 1;
	// 2表示节假日
	public static final int JSONFILESTATUSHOLIDAYS = 2;
	
	
	
	public static final String YYYY_MM_DD = "yyyy-MM-dd";
	// 工作日核算小时数为 4 小时
	public static final int WORKDAYTOTALTIME = 4; 
	// 节假日日核算小时数为 6 小时
	public static final int HOLIDAYSTOTALTIME = 6; 
	
	private Constant() {}
	
	public static enum rowTital{
		
	    值班人工号("number", "员工编号"),
	    值班人姓名("name", "姓名"),
	    二级部门("secondaryDep", "二级部门"),
	    值班开始日期("startDate", "值班开始日期"),
	    值班开始时间("startTime", "值班开始时间"),
	    值班结束日期("endDate", "值班结束日期"),
	    值班结束时间("entTime", "值班结束时间"),
	    核算小时("totalTime", "核算小时");
		
		private final String name;
	    private final String desc;
	    
		private rowTital (String name, String desc) {
	        this.name = name;
	        this.desc = desc;
	    }
		
		public String getName() {
	        return name;
	    }
	    public String getDesc() {
	        return desc;
	    }
	    
	}
    
    // 延时工作类型
    public static enum workType{
    	值班, 普通加班, 上线加班
    }
    
    public static String workType(int type) {
    	String typeStr = "";
    	switch (type) {
		case 0:
			typeStr = wordDayType.工作日.toString();
			break;
		case 1:
			typeStr = wordDayType.休息日.toString();
			break;
		case 2:
			typeStr = wordDayType.节假日.toString();
			break;
		default:
			break;
		}
		return typeStr;
    }
    
    // 延时工作事由
    public static enum workCause{
    	二线值班, 加班
    }
    
    // 工作日类型
    public static enum wordDayType{
    	工作日, 休息日, 节假日
    }

    
    // 中国农历节假日
    public static enum lunarCalendarHolidays {
    	除夕("十二月三十", "除夕"),
	    春节("正月初一", "春节"),
	    端午节("五月初五", "端午节"),
	    中秋节("八月十五", "中秋节");
		
		private final String date;
	    private final String desc;
	    
		private lunarCalendarHolidays (String date, String desc) {
	        this.date = date;
	        this.desc = desc;
	    }
		
		public String getDate() {
	        return date;
	    }
	    public String getDesc() {
	        return desc;
	    }
	}
    
    // 中国公历节假日
    public static enum gregorianCalendarHolidays {
		/*
		 * 元旦("公历一月初一", "元旦"), 清明节("公历四月五号左右", "清明节"), 劳动节("公历五月初一", "劳动节"),
		 * 国庆节("公历十月初一", "国庆节");
		 */
    	元旦("一月初一", "元旦"),
	    清明节("四月五号左右", "清明节"),
	    劳动节("五月初一", "劳动节"),
	    国庆节("十月初一", "国庆节");
		
		private final String date;
	    private final String desc;
	    
		private gregorianCalendarHolidays (String date, String desc) {
	        this.date = date;
	        this.desc = desc;
	    }
		
		public String getDate() {
	        return date;
	    }
	    public String getDesc() {
	        return desc;
	    }
	}
    
    public static enum TITLE{
		
	    员工编号("number", "员工编号"),
	    姓名("name", "姓名"),
	    二级部门("secondaryDep", "二级部门"),
	    延时工作类型("workType", "延时工作类型（值班/普通加班/上线加班）"),
	    延时工作事由("workCause", "延时工作事由（如为值班，请填写所值班名称；加班，请填写加班事由；上线，请填写上线工单号）"),
	    延时工作日类型("wordDayType", "工作日/休息日/法定节假日"),
	    延时工作日期("startDate", "延时工作开始日期"),
	    延时工作开始时间("startTime", "延时工作开始时间（按24小时制填写）"),
	    延时工作结束日期("endDate", "延时工作结束日期"),
	    延时工作结束时间("entTime", "延时工作结束时间 （按24小时制填写）"),
	    核算小时("totalTime", "核算小时");
		
		private final String name;
	    private final String desc;
	    
		private TITLE (String name, String desc) {
	        this.name = name;
	        this.desc = desc;
	    }
		
		public String getName() {
	        return name;
	    }
	    public String getDesc() {
	        return desc;
	    }
	    
	}
    
}