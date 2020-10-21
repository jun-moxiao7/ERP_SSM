package com.tledu.zrz.model;

public class Mould {
	private String id;
	private String name;
	private String theme;
	private String dateType;
	private String date;
	private String startTime;
	private String endTime;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "Mould [id=" + id + ", name=" + name + ", theme=" + theme
				+ ", dateType=" + dateType + ", date=" + date + ", startTime="
				+ startTime + ", endTime=" + endTime + "]";
	}
	public Mould() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mould(String id, String name, String theme, String dateType,
			String date, String startTime, String endTime) {
		super();
		this.id = id;
		this.name = name;
		this.theme = theme;
		this.dateType = dateType;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Mould(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
