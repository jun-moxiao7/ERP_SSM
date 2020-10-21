package com.tledu.zrz.model;

//考核任务
public class AT {
	private String id;
	private String theme;
	private String dateType;
	private String year;
	private String date;
	private String startTime;
	private String endTime;
	private String ps;
	private String persons;
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
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
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public String getPersons() {
		return persons;
	}
	public void setPersons(String persons) {
		this.persons = persons;
	}
	@Override
	public String toString() {
		return "AT [id=" + id + ", theme=" + theme + ", dateType=" + dateType
				+ ", year=" + year + ", date=" + date + ", startTime="
				+ startTime + ", endTime=" + endTime + ", ps=" + ps
				+ ", persons=" + persons + "]";
	}
	public AT() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AT(String id, String theme, String dateType, String year,
			String date, String startTime, String endTime, String ps,
			String persons) {
		super();
		this.id = id;
		this.theme = theme;
		this.dateType = dateType;
		this.year = year;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.ps = ps;
		this.persons = persons;
	}
	public AT(String id) {
		super();
		this.id = id;
	}
	
}
