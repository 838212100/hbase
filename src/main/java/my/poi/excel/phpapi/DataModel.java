package my.poi.excel.phpapi;

/**
  * 根据调用接口返回的json的生成类
 * @author yang
 *
 */
public class DataModel {

	/** 
	* status : 0
	* t : 
	* set_cache_time : 
	* data : [{"StdStg":6018,"StdStl":8,"_update_time":"1580102250","cambrian_appid":"0","almanac":[{"avoid":"诸事不宜.","date":"2020-5-1","suit":"出行.修饰垣墙.造畜椆栖.教牛马.余事勿取."},{"avoid":"嫁娶.纳财.安葬.出行.开市.立券.作灶.栽种.","date":"2020-5-2","suit":"祭祀.祈福.开光.求嗣.解除.伐木.出火.入宅.移徙.安床.拆卸.修造.动土.造畜椆栖."},{"avoid":"谢土.祈福.上梁.作灶.斋醮.修造.入宅.安门.","date":"2020-5-3","suit":"纳采.嫁娶.开光.出行.理发.会亲友.开市.安床.栽种.牧养.入殓.移柩.启攒."},{"avoid":"诸事不宜.","date":"2020-5-4","suit":"祭祀.平治道涂.解除.修饰垣墙.余事勿取."},{"avoid":"祈福.嫁娶.入宅.安床.作灶.","date":"2020-5-5","suit":"祭祀.沐浴.移徙.破土.安葬.扫舍.平治道涂."},{"avoid":"动土.破土.嫁娶.嫁娶.","date":"2020-5-6","suit":"祭祀.祈福.斋醮.求嗣.安机械.纳畜.移徙.入宅.安机械.塑绘.开光.起基.竖柱.上梁.作灶.安门.安香.出火.造屋.启攒.安葬."},{"avoid":"移徙.入宅.造屋.架马.","date":"2020-5-7","suit":"嫁娶.纳采.订盟.斋醮.开光.祭祀.祈福.求医.治病.会亲友.动土.解除.捕捉.纳畜.牧养.入殓.破土.安葬."},{"avoid":"行丧.安葬.","date":"2020-5-8","suit":"祭祀.沐浴.解除.破屋.坏垣.余事勿取."},{"avoid":"斋醮.开市.嫁娶.作灶.","date":"2020-5-9","suit":"沐浴.扫舍.余事勿取."},{"avoid":"嫁娶.出火.移徙.入宅.","date":"2020-5-10","suit":"开市.交易.立券.安机械.会亲友.开光.求医.治病.造屋.起基.修造.动土.定磉.竖柱.上梁.安门.作灶.放水.作厕.开池.栽种.牧养.造畜椆栖.破土.安葬.立碑."},{"avoid":"开市.动土.祭祀.斋醮.安葬.探病.","date":"2020-5-11","suit":"栽种.捕捉.畋猎.余事勿取."},{"avoid":"开市.入宅.探病.出火.造屋.","date":"2020-5-12","suit":"嫁娶.祭祀.祈福.求嗣.斋醮.订盟.纳采.解除.出行.动土.破土.习艺.针灸.理发.会亲友.起基.修造.动土.竖柱.定磉.安床.拆卸.纳畜.牧养.放水.破土.除服.成服.修坟.立碑."},{"avoid":"余事勿取.","date":"2020-5-13","suit":"余事勿取."},{"avoid":"破土.安葬.","date":"2020-5-14","suit":"塞穴.断蚁.结网.余事勿取."},{"avoid":"","date":"2020-5-15","suit":"开光.出行.纳采.嫁娶.伐木.架马.出火.拆卸.移徙.入宅.造庙.造桥.造船.造畜椆栖.开市.入殓.除服.成服.移柩.安葬."},{"avoid":"诸事不宜.","date":"2020-5-16","suit":"进人口.牧养.置产.塞穴.结网.余事勿取."},{"avoid":"会亲友.进人口.修造.动土.起基.移徙.开市.纳畜.入殓.除服.成服.移柩.破土.安葬.修坟.立碑.会亲友.","date":"2020-5-17","suit":"开光.出行.嫁娶."},{"avoid":"安门.","date":"2020-5-18","suit":"嫁娶.纳采.出行.祭祀.祈福.开市.动土.移徙.入宅.破土.安葬."},{"avoid":"开市.开光.","date":"2020-5-19","suit":"嫁娶.纳采.求医.治病.修造.动土.移徙.入宅.破土.安葬."},{"avoid":"诸事不宜.","date":"2020-5-20","suit":"祭祀.破屋.坏垣.余事勿取."},{"avoid":"祈福.斋醮.","date":"2020-5-21","suit":"嫁娶.纳采.祭祀.祈福.出行.动土.上梁.移徙.入宅.破土.安葬."},{"avoid":"嫁娶.安葬.","date":"2020-5-22","suit":"纳采.祭祀.祈福.开市.求医.治病.动土.纳畜."},{"avoid":"动土.破土.安葬.","date":"2020-5-23","suit":"嫁娶.纳采.出行.移徙.入宅."},{"avoid":"嫁娶.安葬.","date":"2020-5-24","suit":"订盟.纳采.祭祀.动土.破土.交易.立券."},{"avoid":"赴任.捕捉.","date":"2020-5-25","suit":"嫁娶.裁衣.祭祀.出行.安床.作灶.移徙.入宅.破土.安葬."},{"avoid":"诸事不宜.","date":"2020-5-26","suit":"塞穴.结网.余事勿取."},{"avoid":"移徙.入宅.","date":"2020-5-27","suit":"嫁娶.订盟.纳采.出行.祭祀.祈福.斋醮.动土.上梁.破土.安葬."},{"avoid":"开市.安葬.","date":"2020-5-28","suit":"订盟.纳采.会亲友.安床.作灶.造畜椆栖."},{"avoid":"诸事不宜.","date":"2020-5-29","suit":"沐浴.平治道涂.扫舍.入殓.移柩.破土.启攒.安葬.余事勿取."},{"avoid":"","date":"2020-5-30","suit":"嫁娶.祭祀.祈福.求嗣.开光.出行.出火.拆卸.动土.上梁.进人口.入宅.移徙.安床.安门.开市.交易.立券.挂匾.栽种.破土.安葬."},{"avoid":"嫁娶.上梁.修造.拆卸.架马.入宅.伐木.动土.出火.开柱眼.","date":"2020-5-31","suit":"祭祀.开光.出行.解除.塑绘.裁衣.入殓.移柩.破土.启攒.安葬.除服.成服."}],"holiday":[{"desc":"1月1日放假一天","festival":"2020-1-1","list":[{"date":"2020-1-1","status":"1"}],"list#num#baidu":1,"name":"元旦","rest":"2019年12月30日和2019年12月31日请假两天，与周末连休可拼5天小长假。"},{"desc":"1月24日放假一天","festival":"2020-1-24","list":[{"date":"2020-1-24","status":"1"}],"list#num#baidu":1,"name":"除夕","rest":"农历腊月最后一天为除夕，即大年初一前夜，又称为年三十。"},{"desc":"1月24日(除夕)至1月30日放假7天，1月19日，2月1日上班","festival":"2020-1-25","list":[{"date":"2020-1-24","status":"1"},{"date":"2020-1-25","status":"1"},{"date":"2020-1-26","status":"1"},{"date":"2020-1-27","status":"1"},{"date":"2020-1-28","status":"1"},{"date":"2020-1-29","status":"1"},{"date":"2020-1-30","status":"1"},{"date":"2020-1-19","status":"2"},{"date":"2020-1-31","status":"1"},{"date":"2020-2-1","status":"1"},{"date":"2020-2-2","status":"1"}],"list#num#baidu":11,"name":"春节","rest":"2020年1月19日至2020年1月23日请假5天，与周末连休可拼13天长假。"},{"desc":"4月4日至4月6日放假3天","festival":"2020-4-4","list":[{"date":"2020-4-4","status":"1"},{"date":"2020-4-5","status":"1"},{"date":"2020-4-6","status":"1"}],"list#num#baidu":3,"name":"清明节","rest":"2020年4月7日至2020年4月10日请假4天，与周末连休可拼9天长假。"},{"desc":"5月1日至5月5日放假5天，4月26日，5月9日上班","festival":"2020-5-1","list":[{"date":"2020-5-1","status":"1"},{"date":"2020-5-2","status":"1"},{"date":"2020-5-3","status":"1"},{"date":"2020-5-4","status":"1"},{"date":"2020-5-5","status":"1"},{"date":"2020-4-26","status":"2"},{"date":"2020-5-9","status":"2"}],"list#num#baidu":7,"name":"劳动节","rest":"2020年4月26日至2020年4月30日请假5天，与周末连休可拼11天长假。"},{"desc":"6月25日至6月27日放假3天，6月28日上班","festival":"2020-6-25","list":[{"date":"2020-6-25","status":"1"},{"date":"2020-6-26","status":"1"},{"date":"2020-6-27","status":"1"},{"date":"2020-6-28","status":"2"}],"list#num#baidu":4,"name":"端午节","rest":"2020年6月22日至2020年6月24日请假3天，与周末连休可拼8天长假。"},{"desc":"10月1日至10月8日放假8天，9月27日，10月10日上班","festival":"2020-10-1","list":[{"date":"2020-10-1","status":"1"},{"date":"2020-10-2","status":"1"},{"date":"2020-10-3","status":"1"},{"date":"2020-10-4","status":"1"},{"date":"2020-10-5","status":"1"},{"date":"2020-10-6","status":"1"},{"date":"2020-10-7","status":"1"},{"date":"2020-10-8","status":"1"},{"date":"2020-9-27","status":"2"},{"date":"2020-10-10","status":"2"}],"list#num#baidu":10,"name":"中秋节","rest":"10月9日至10月10日请假2天，与周末连休可拼11天长假。"},{"desc":"10月1日至10月8日放假8天，9月27日，10月10日上班","festival":"2020-10-1","list":[{"date":"2020-10-1","status":"1"},{"date":"2020-10-2","status":"1"},{"date":"2020-10-3","status":"1"},{"date":"2020-10-4","status":"1"},{"date":"2020-10-5","status":"1"},{"date":"2020-10-6","status":"1"},{"date":"2020-10-7","status":"1"},{"date":"2020-10-8","status":"1"},{"date":"2020-9-27","status":"2"},{"date":"2020-10-10","status":"2"}],"list#num#baidu":10,"name":"国庆节","rest":"10月9日至10月10日请假2天，与周末连休可拼11天长假。"}],"holidaylist":[{"name":"元旦","startday":"2020-1-1"},{"name":"除夕","startday":"2020-1-24"},{"name":"春节","startday":"2020-1-25"},{"name":"清明节","startday":"2020-4-4"},{"name":"劳动节","startday":"2020-5-1"},{"name":"端午节","startday":"2020-6-25"},{"name":"中秋节","startday":"2020-10-1"},{"name":"国庆节","startday":"2020-10-1"}],"key":"2020年5月","selectday":"2020-5-1","url":"http://nourl.baidu.com/6018","loc":"https://dss1.baidu.com/8aQDcnSm2Q5IlBGlnYG/q?r=2002753&k=2020%E5%B9%B45%E6%9C%88","SiteId":2002753,"_version":2767,"_select_time":1580102077,"clicklimit":"1-3","ExtendedLocation":"","OriginQuery":"2020年05月","tplt":"calendar_new","resourceid":"6018","fetchkey":"6018_2020年5月","role_id":10,"disp_type":0,"appinfo":""}]
	*/ 
	
	private String status;
	private String t;
	private String set_cache_time;
	private java.util.List<DataBen> data;
	
	public void setStatus(String status){
		this.status = status;
	}
	
	public String getStatus(){
		return status;
	}

	public void setT(String t){
		this.t = t;
	}
	
	public String getT(){
		return t;
	}

	public void setSet_cache_time(String set_cache_time){
		this.set_cache_time = set_cache_time;
	}
	
	public String getSet_cache_time(){
		return set_cache_time;
	}

	public void setData(java.util.List<DataBen> data){
		this.data = data;
	}
	
	public java.util.List<DataBen> getData(){
		return data;
	}
	

	@Override
	public String toString() {
		return "DataModel [status=" + status + ", t=" + t + ", set_cache_time=" + set_cache_time + ", data=" + data
				+ "]";
	}



	public static class DataBen {
	
		/** 
		* StdStg : 6018
		* StdStl : 8
		* _update_time : 1580102250
		* cambrian_appid : 0
		* almanac : [{"avoid":"诸事不宜.","date":"2020-5-1","suit":"出行.修饰垣墙.造畜椆栖.教牛马.余事勿取."},{"avoid":"嫁娶.纳财.安葬.出行.开市.立券.作灶.栽种.","date":"2020-5-2","suit":"祭祀.祈福.开光.求嗣.解除.伐木.出火.入宅.移徙.安床.拆卸.修造.动土.造畜椆栖."},{"avoid":"谢土.祈福.上梁.作灶.斋醮.修造.入宅.安门.","date":"2020-5-3","suit":"纳采.嫁娶.开光.出行.理发.会亲友.开市.安床.栽种.牧养.入殓.移柩.启攒."},{"avoid":"诸事不宜.","date":"2020-5-4","suit":"祭祀.平治道涂.解除.修饰垣墙.余事勿取."},{"avoid":"祈福.嫁娶.入宅.安床.作灶.","date":"2020-5-5","suit":"祭祀.沐浴.移徙.破土.安葬.扫舍.平治道涂."},{"avoid":"动土.破土.嫁娶.嫁娶.","date":"2020-5-6","suit":"祭祀.祈福.斋醮.求嗣.安机械.纳畜.移徙.入宅.安机械.塑绘.开光.起基.竖柱.上梁.作灶.安门.安香.出火.造屋.启攒.安葬."},{"avoid":"移徙.入宅.造屋.架马.","date":"2020-5-7","suit":"嫁娶.纳采.订盟.斋醮.开光.祭祀.祈福.求医.治病.会亲友.动土.解除.捕捉.纳畜.牧养.入殓.破土.安葬."},{"avoid":"行丧.安葬.","date":"2020-5-8","suit":"祭祀.沐浴.解除.破屋.坏垣.余事勿取."},{"avoid":"斋醮.开市.嫁娶.作灶.","date":"2020-5-9","suit":"沐浴.扫舍.余事勿取."},{"avoid":"嫁娶.出火.移徙.入宅.","date":"2020-5-10","suit":"开市.交易.立券.安机械.会亲友.开光.求医.治病.造屋.起基.修造.动土.定磉.竖柱.上梁.安门.作灶.放水.作厕.开池.栽种.牧养.造畜椆栖.破土.安葬.立碑."},{"avoid":"开市.动土.祭祀.斋醮.安葬.探病.","date":"2020-5-11","suit":"栽种.捕捉.畋猎.余事勿取."},{"avoid":"开市.入宅.探病.出火.造屋.","date":"2020-5-12","suit":"嫁娶.祭祀.祈福.求嗣.斋醮.订盟.纳采.解除.出行.动土.破土.习艺.针灸.理发.会亲友.起基.修造.动土.竖柱.定磉.安床.拆卸.纳畜.牧养.放水.破土.除服.成服.修坟.立碑."},{"avoid":"余事勿取.","date":"2020-5-13","suit":"余事勿取."},{"avoid":"破土.安葬.","date":"2020-5-14","suit":"塞穴.断蚁.结网.余事勿取."},{"avoid":"","date":"2020-5-15","suit":"开光.出行.纳采.嫁娶.伐木.架马.出火.拆卸.移徙.入宅.造庙.造桥.造船.造畜椆栖.开市.入殓.除服.成服.移柩.安葬."},{"avoid":"诸事不宜.","date":"2020-5-16","suit":"进人口.牧养.置产.塞穴.结网.余事勿取."},{"avoid":"会亲友.进人口.修造.动土.起基.移徙.开市.纳畜.入殓.除服.成服.移柩.破土.安葬.修坟.立碑.会亲友.","date":"2020-5-17","suit":"开光.出行.嫁娶."},{"avoid":"安门.","date":"2020-5-18","suit":"嫁娶.纳采.出行.祭祀.祈福.开市.动土.移徙.入宅.破土.安葬."},{"avoid":"开市.开光.","date":"2020-5-19","suit":"嫁娶.纳采.求医.治病.修造.动土.移徙.入宅.破土.安葬."},{"avoid":"诸事不宜.","date":"2020-5-20","suit":"祭祀.破屋.坏垣.余事勿取."},{"avoid":"祈福.斋醮.","date":"2020-5-21","suit":"嫁娶.纳采.祭祀.祈福.出行.动土.上梁.移徙.入宅.破土.安葬."},{"avoid":"嫁娶.安葬.","date":"2020-5-22","suit":"纳采.祭祀.祈福.开市.求医.治病.动土.纳畜."},{"avoid":"动土.破土.安葬.","date":"2020-5-23","suit":"嫁娶.纳采.出行.移徙.入宅."},{"avoid":"嫁娶.安葬.","date":"2020-5-24","suit":"订盟.纳采.祭祀.动土.破土.交易.立券."},{"avoid":"赴任.捕捉.","date":"2020-5-25","suit":"嫁娶.裁衣.祭祀.出行.安床.作灶.移徙.入宅.破土.安葬."},{"avoid":"诸事不宜.","date":"2020-5-26","suit":"塞穴.结网.余事勿取."},{"avoid":"移徙.入宅.","date":"2020-5-27","suit":"嫁娶.订盟.纳采.出行.祭祀.祈福.斋醮.动土.上梁.破土.安葬."},{"avoid":"开市.安葬.","date":"2020-5-28","suit":"订盟.纳采.会亲友.安床.作灶.造畜椆栖."},{"avoid":"诸事不宜.","date":"2020-5-29","suit":"沐浴.平治道涂.扫舍.入殓.移柩.破土.启攒.安葬.余事勿取."},{"avoid":"","date":"2020-5-30","suit":"嫁娶.祭祀.祈福.求嗣.开光.出行.出火.拆卸.动土.上梁.进人口.入宅.移徙.安床.安门.开市.交易.立券.挂匾.栽种.破土.安葬."},{"avoid":"嫁娶.上梁.修造.拆卸.架马.入宅.伐木.动土.出火.开柱眼.","date":"2020-5-31","suit":"祭祀.开光.出行.解除.塑绘.裁衣.入殓.移柩.破土.启攒.安葬.除服.成服."}]
		* holiday : [{"desc":"1月1日放假一天","festival":"2020-1-1","list":[{"date":"2020-1-1","status":"1"}],"list#num#baidu":1,"name":"元旦","rest":"2019年12月30日和2019年12月31日请假两天，与周末连休可拼5天小长假。"},{"desc":"1月24日放假一天","festival":"2020-1-24","list":[{"date":"2020-1-24","status":"1"}],"list#num#baidu":1,"name":"除夕","rest":"农历腊月最后一天为除夕，即大年初一前夜，又称为年三十。"},{"desc":"1月24日(除夕)至1月30日放假7天，1月19日，2月1日上班","festival":"2020-1-25","list":[{"date":"2020-1-24","status":"1"},{"date":"2020-1-25","status":"1"},{"date":"2020-1-26","status":"1"},{"date":"2020-1-27","status":"1"},{"date":"2020-1-28","status":"1"},{"date":"2020-1-29","status":"1"},{"date":"2020-1-30","status":"1"},{"date":"2020-1-19","status":"2"},{"date":"2020-1-31","status":"1"},{"date":"2020-2-1","status":"1"},{"date":"2020-2-2","status":"1"}],"list#num#baidu":11,"name":"春节","rest":"2020年1月19日至2020年1月23日请假5天，与周末连休可拼13天长假。"},{"desc":"4月4日至4月6日放假3天","festival":"2020-4-4","list":[{"date":"2020-4-4","status":"1"},{"date":"2020-4-5","status":"1"},{"date":"2020-4-6","status":"1"}],"list#num#baidu":3,"name":"清明节","rest":"2020年4月7日至2020年4月10日请假4天，与周末连休可拼9天长假。"},{"desc":"5月1日至5月5日放假5天，4月26日，5月9日上班","festival":"2020-5-1","list":[{"date":"2020-5-1","status":"1"},{"date":"2020-5-2","status":"1"},{"date":"2020-5-3","status":"1"},{"date":"2020-5-4","status":"1"},{"date":"2020-5-5","status":"1"},{"date":"2020-4-26","status":"2"},{"date":"2020-5-9","status":"2"}],"list#num#baidu":7,"name":"劳动节","rest":"2020年4月26日至2020年4月30日请假5天，与周末连休可拼11天长假。"},{"desc":"6月25日至6月27日放假3天，6月28日上班","festival":"2020-6-25","list":[{"date":"2020-6-25","status":"1"},{"date":"2020-6-26","status":"1"},{"date":"2020-6-27","status":"1"},{"date":"2020-6-28","status":"2"}],"list#num#baidu":4,"name":"端午节","rest":"2020年6月22日至2020年6月24日请假3天，与周末连休可拼8天长假。"},{"desc":"10月1日至10月8日放假8天，9月27日，10月10日上班","festival":"2020-10-1","list":[{"date":"2020-10-1","status":"1"},{"date":"2020-10-2","status":"1"},{"date":"2020-10-3","status":"1"},{"date":"2020-10-4","status":"1"},{"date":"2020-10-5","status":"1"},{"date":"2020-10-6","status":"1"},{"date":"2020-10-7","status":"1"},{"date":"2020-10-8","status":"1"},{"date":"2020-9-27","status":"2"},{"date":"2020-10-10","status":"2"}],"list#num#baidu":10,"name":"中秋节","rest":"10月9日至10月10日请假2天，与周末连休可拼11天长假。"},{"desc":"10月1日至10月8日放假8天，9月27日，10月10日上班","festival":"2020-10-1","list":[{"date":"2020-10-1","status":"1"},{"date":"2020-10-2","status":"1"},{"date":"2020-10-3","status":"1"},{"date":"2020-10-4","status":"1"},{"date":"2020-10-5","status":"1"},{"date":"2020-10-6","status":"1"},{"date":"2020-10-7","status":"1"},{"date":"2020-10-8","status":"1"},{"date":"2020-9-27","status":"2"},{"date":"2020-10-10","status":"2"}],"list#num#baidu":10,"name":"国庆节","rest":"10月9日至10月10日请假2天，与周末连休可拼11天长假。"}]
		* holidaylist : [{"name":"元旦","startday":"2020-1-1"},{"name":"除夕","startday":"2020-1-24"},{"name":"春节","startday":"2020-1-25"},{"name":"清明节","startday":"2020-4-4"},{"name":"劳动节","startday":"2020-5-1"},{"name":"端午节","startday":"2020-6-25"},{"name":"中秋节","startday":"2020-10-1"},{"name":"国庆节","startday":"2020-10-1"}]
		* key : 2020年5月
		* selectday : 2020-5-1
		* url : http://nourl.baidu.com/6018
		* loc : https://dss1.baidu.com/8aQDcnSm2Q5IlBGlnYG/q?r=2002753&k=2020%E5%B9%B45%E6%9C%88
		* SiteId : 2002753
		* _version : 2767
		* _select_time : 1580102077
		* clicklimit : 1-3
		* ExtendedLocation : 
		* OriginQuery : 2020年05月
		* tplt : calendar_new
		* resourceid : 6018
		* fetchkey : 6018_2020年5月
		* role_id : 10
		* disp_type : 0
		* appinfo : 
		*/ 
	
		private int StdStg;
	
		private int StdStl;
	
		private String _update_time;
	
		private String cambrian_appid;
	
		private String key;
	
		private String selectday;
	
		private String url;
	
		private String loc;
	
		private int SiteId;
	
		private int _version;
	
		private int _select_time;
	
		private String clicklimit;
	
		private String ExtendedLocation;
	
		private String OriginQuery;
	
		private String tplt;
	
		private String resourceid;
	
		private String fetchkey;
	
		private int role_id;
	
		private int disp_type;
	
		private String appinfo;
	
		private java.util.List<AlmanacBen> almanac;
	
		private java.util.List<HolidayBen> holiday;
	
		private java.util.List<HolidaylistBen> holidaylist;
	
		public void setStdStg(int StdStg){
			this.StdStg = StdStg;
		}
	
		public int getStdStg(){
			return StdStg;
		}
	
		public void setStdStl(int StdStl){
			this.StdStl = StdStl;
		}
	
		public int getStdStl(){
			return StdStl;
		}
	
		public void set_update_time(String _update_time){
			this._update_time = _update_time;
		}
	
		public String get_update_time(){
			return _update_time;
		}
	
		public void setCambrian_appid(String cambrian_appid){
			this.cambrian_appid = cambrian_appid;
		}
	
		public String getCambrian_appid(){
			return cambrian_appid;
		}
	
		public void setKey(String key){
			this.key = key;
		}
	
		public String getKey(){
			return key;
		}
	
		public void setSelectday(String selectday){
			this.selectday = selectday;
		}
	
		public String getSelectday(){
			return selectday;
		}
	
		public void setUrl(String url){
			this.url = url;
		}
	
		public String getUrl(){
			return url;
		}
	
		public void setLoc(String loc){
			this.loc = loc;
		}
	
		public String getLoc(){
			return loc;
		}
	
		public void setSiteId(int SiteId){
			this.SiteId = SiteId;
		}
	
		public int getSiteId(){
			return SiteId;
		}
	
		public void set_version(int _version){
			this._version = _version;
		}
	
		public int get_version(){
			return _version;
		}
	
		public void set_select_time(int _select_time){
			this._select_time = _select_time;
		}
	
		public int get_select_time(){
			return _select_time;
		}
	
		public void setClicklimit(String clicklimit){
			this.clicklimit = clicklimit;
		}
	
		public String getClicklimit(){
			return clicklimit;
		}
	
		public void setExtendedLocation(String ExtendedLocation){
			this.ExtendedLocation = ExtendedLocation;
		}
	
		public String getExtendedLocation(){
			return ExtendedLocation;
		}
	
		public void setOriginQuery(String OriginQuery){
			this.OriginQuery = OriginQuery;
		}
	
		public String getOriginQuery(){
			return OriginQuery;
		}
	
		public void setTplt(String tplt){
			this.tplt = tplt;
		}
	
		public String getTplt(){
			return tplt;
		}
	
		public void setResourceid(String resourceid){
			this.resourceid = resourceid;
		}
	
		public String getResourceid(){
			return resourceid;
		}
	
		public void setFetchkey(String fetchkey){
			this.fetchkey = fetchkey;
		}
	
		public String getFetchkey(){
			return fetchkey;
		}
	
		public void setRole_id(int role_id){
			this.role_id = role_id;
		}
	
		public int getRole_id(){
			return role_id;
		}
	
		public void setDisp_type(int disp_type){
			this.disp_type = disp_type;
		}
	
		public int getDisp_type(){
			return disp_type;
		}
	
		public void setAppinfo(String appinfo){
			this.appinfo = appinfo;
		}
	
		public String getAppinfo(){
			return appinfo;
		}
	
		public void setAlmanac(java.util.List<AlmanacBen> almanac){
			this.almanac = almanac;
		}
	
		public java.util.List<AlmanacBen> getAlmanac(){
			return almanac;
		}
	
		public void setHoliday(java.util.List<HolidayBen> holiday){
			this.holiday = holiday;
		}
	
		public java.util.List<HolidayBen> getHoliday(){
			return holiday;
		}
	
		public void setHolidaylist(java.util.List<HolidaylistBen> holidaylist){
			this.holidaylist = holidaylist;
		}
	
		public java.util.List<HolidaylistBen> getHolidaylist(){
			return holidaylist;
		}

		@Override
		public String toString() {
			return "DataBen [StdStg=" + StdStg + ", StdStl=" + StdStl + ", _update_time=" + _update_time
					+ ", cambrian_appid=" + cambrian_appid + ", key=" + key + ", selectday=" + selectday + ", url="
					+ url + ", loc=" + loc + ", SiteId=" + SiteId + ", _version=" + _version + ", _select_time="
					+ _select_time + ", clicklimit=" + clicklimit + ", ExtendedLocation=" + ExtendedLocation
					+ ", OriginQuery=" + OriginQuery + ", tplt=" + tplt + ", resourceid=" + resourceid + ", fetchkey="
					+ fetchkey + ", role_id=" + role_id + ", disp_type=" + disp_type + ", appinfo=" + appinfo
					+ ", almanac=" + almanac + ", holiday=" + holiday + ", holidaylist=" + holidaylist + "]";
		}
		
	}
	
	public static class AlmanacBen {
	
		/** 
		* avoid : 诸事不宜.
		* date : 2020-5-1
		* suit : 出行.修饰垣墙.造畜椆栖.教牛马.余事勿取.
		*/ 
	
		private String avoid;
	
		private String date;
	
		private String suit;
	
		public void setAvoid(String avoid){
			this.avoid = avoid;
		}
	
		public String getAvoid(){
			return avoid;
		}
	
		public void setDate(String date){
			this.date = date;
		}
	
		public String getDate(){
			return date;
		}
	
		public void setSuit(String suit){
			this.suit = suit;
		}
	
		public String getSuit(){
			return suit;
		}

		@Override
		public String toString() {
			return "AlmanacBen [avoid=" + avoid + ", date=" + date + ", suit=" + suit + "]";
		}
		
	}
	
	public static class HolidayBen {
	
		/** 
		* desc : 1月1日放假一天
		* festival : 2020-1-1
		* list : [{"date":"2020-1-1","status":"1"}]
		* list#num#baidu : 1
		* name : 元旦
		* rest : 2019年12月30日和2019年12月31日请假两天，与周末连休可拼5天小长假。
		*/ 
	
		private String desc;
	
		private String festival;
	
		private int listNumBaidu;
	
		private String name;
	
		private String rest;
	
		private java.util.List<ListBen> list;
	
		public void setDesc(String desc){
			this.desc = desc;
		}
	
		public String getDesc(){
			return desc;
		}
	
		public void setFestival(String festival){
			this.festival = festival;
		}
	
		public String getFestival(){
			return festival;
		}
	
		public void setListNumBaidu(int listNumBaidu){
			this.listNumBaidu = listNumBaidu;
		}
	
		public int getListNumBaidu(){
			return listNumBaidu;
		}
	
		public void setName(String name){
			this.name = name;
		}
	
		public String getName(){
			return name;
		}
	
		public void setRest(String rest){
			this.rest = rest;
		}
	
		public String getRest(){
			return rest;
		}
	
		public void setList(java.util.List<ListBen> list){
			this.list = list;
		}
	
		public java.util.List<ListBen> getList(){
			return list;
		}

		@Override
		public String toString() {
			return "HolidayBen [desc=" + desc + ", festival=" + festival + ", listNumBaidu=" + listNumBaidu + ", name="
					+ name + ", rest=" + rest + ", list=" + list + "]";
		}
		
	}
	
	public static class ListBen {
	
		/** 
		* date : 2020-1-1
		* status : 1
		*/ 
	
		private String date;
	
		private String status;
	
		public void setDate(String date){
			this.date = date;
		}
	
		public String getDate(){
			return date;
		}
	
		public void setStatus(String status){
			this.status = status;
		}
	
		public String getStatus(){
			return status;
		}

		@Override
		public String toString() {
			return "ListBen [date=" + date + ", status=" + status + "]";
		}
		
	}
	
	public static class HolidaylistBen {
	
		/** 
		* name : 元旦
		* startday : 2020-1-1
		*/ 
	
		private String name;
	
		private String startday;
	
		public void setName(String name){
			this.name = name;
		}
	
		public String getName(){
			return name;
		}
	
		public void setStartday(String startday){
			this.startday = startday;
		}
	
		public String getStartday(){
			return startday;
		}

		@Override
		public String toString() {
			return "HolidaylistBen [name=" + name + ", startday=" + startday + "]";
		}
		
	}

}
