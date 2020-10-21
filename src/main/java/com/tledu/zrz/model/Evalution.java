package com.tledu.zrz.model;

public class Evalution {
	//编号
	private String id;
	//主题
	private String	theme;
	//鉴定周期分类
	private String	dateType;
	//鉴定周期
	private String	year;
	private String	date;
	
	//开始日期
	private String	startTime;
	//结束日期
	private String	endTime;
	//工作内容
	private String	work;
	//完成情况
	private String	achieve;
	//后续工作
	private String	followUp;
	//存在不足
	private String	insufficient;
	//存在困难
	private String	hard;
	//个人建议
	private String	suggest;
	//备注
	private String	ps;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getDateType() {
		return dateType;
	}
	public void setDateType(String dateType) {
		this.dateType = dateType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getAchieve() {
		return achieve;
	}
	public void setAchieve(String achieve) {
		this.achieve = achieve;
	}
	public String getFollowUp() {
		return followUp;
	}
	public void setFollowUp(String followUp) {
		this.followUp = followUp;
	}
	public String getInsufficient() {
		return insufficient;
	}
	public void setInsufficient(String insufficient) {
		this.insufficient = insufficient;
	}
	public String getHard() {
		return hard;
	}
	public void setHard(String hard) {
		this.hard = hard;
	}
	public String getSuggest() {
		return suggest;
	}
	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Evalution() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Evalution [id=" + id + ", theme=" + theme + ", dateType="
				+ dateType + ", year=" + year + ", date=" + date
				+ ", startTime=" + startTime + ", endTime=" + endTime
				+ ", work=" + work + ", achieve=" + achieve + ", followUp="
				+ followUp + ", insufficient=" + insufficient + ", hard="
				+ hard + ", suggest=" + suggest + ", ps=" + ps + "]";
	}
	public Evalution(String id) {
		super();
		this.id = id;
	}
	public Evalution(String id, String theme, String dateType, String year,
			String date, String startTime, String endTime, String work,
			String achieve, String followUp, String insufficient, String hard,
			String suggest, String ps) {
		super();
		this.id = id;
		this.theme = theme;
		this.dateType = dateType;
		this.year = year;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.work = work;
		this.achieve = achieve;
		this.followUp = followUp;
		this.insufficient = insufficient;
		this.hard = hard;
		this.suggest = suggest;
		this.ps = ps;
	}
	public Evalution(String id, String theme, String dateType, String year,
			String date, String startTime, String endTime) {
		super();
		this.id = id;
		this.theme = theme;
		this.dateType = dateType;
		this.year = year;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Evalution(String id, String theme, String dateType, String year,
			String date) {
		super();
		this.id = id;
		this.theme = theme;
		this.dateType = dateType;
		this.year = year;
		this.date = date;
	}
	
	
	
	
	
}
