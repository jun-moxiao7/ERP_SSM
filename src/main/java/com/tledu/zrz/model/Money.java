package com.tledu.zrz.model;

public class Money {
	private int id;
	/**
	 * 姓名/用户名
	 */
	private String title;
	/**
	 * 密码
	 */
	private String year;
	private String month;
	private String start;
	private String end;
	private String nickname;
	public Money() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Money(String title,String con, String year, String month, String start,
			String end, String nickname, String date, String cons) {
		// TODO Auto-generated constructor stub
		super();
		this.title = title;
		this.con = con;
		this.year = year;
		this.month = month;
		this.start = start;
		this.end = end;
		this.nickname = nickname;
		this.date = date;
		this.cons = cons;
		
	}
	public Money(int id, String title, String year, String month, String start,
			String end, String nickname, String date, String con, String cons) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.month = month;
		this.start = start;
		this.end = end;
		this.nickname = nickname;
		this.date = date;
		this.con = con;
		this.cons = cons;
	}
	
	private String date;
	private String con;
	private String cons;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	public String getCons() {
		return cons;
	}
	public void setCons(String cons) {
		this.cons = cons;
	}

	
}
