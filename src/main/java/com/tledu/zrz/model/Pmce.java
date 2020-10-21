package com.tledu.zrz.model;

public class Pmce {
	private int id;
	/**
	 * 姓名/用户名
	 */
	private String title;
	/**
	 * 密码
	 */
	private String name;
	private String date;
	private String nick;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public Pmce(int id, String title, String name, String date, String nick) {
		super();
		this.id = id;
		this.title = title;
		this.name = name;
		this.date = date;
		this.nick = nick;
	}
	public Pmce(int id, String title, String name, String date) {
		super();
		this.id = id;
		this.title = title;
		this.name = name;
		this.date = date;
		
	}
	public Pmce( String title, String name, String date,String nick) {
		super();
		
		this.title = title;
		this.name = name;
		this.date = date;
		
	}
	public Pmce() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}