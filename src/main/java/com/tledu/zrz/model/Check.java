package com.tledu.zrz.model;

public class Check {
	// private int deptId;
	
	
	private int c_id;
	/**
	 * 姓名/用户名
	 */
	private String c_title;
	/**
	 * 密码
	 */
	private String c_type;
	/**
	 * 昵称
	 */
	private String c_adr;
	private String c_adrs;
	private String c_types;
	private String c_name;
	private String c_dep;
	private String c_way;
	private String c_names;
	private String c_deps;
	private String c_date;
	public Check(int c_id, String c_title, String c_type, String c_adr,
			String c_adrs, String c_types, String c_name, String c_dep,
			String c_way, String c_names, String c_deps, String c_date) {
		super();
		this.c_id = c_id;
		this.c_title = c_title;
		this.c_type = c_type;
		this.c_adr = c_adr;
		this.c_adrs = c_adrs;
		this.c_types = c_types;
		this.c_name = c_name;
		this.c_dep = c_dep;
		this.c_way = c_way;
		this.c_names = c_names;
		this.c_deps = c_deps;
		this.c_date = c_date;
	}
	public Check( String c_title, String c_type, String c_adr,
			String c_adrs, String c_types, String c_name, String c_dep,
			String c_way, String c_names, String c_deps, String c_date) {
		super();
		
		this.c_title = c_title;
		this.c_type = c_type;
		this.c_adr = c_adr;
		this.c_adrs = c_adrs;
		this.c_types = c_types;
		this.c_name = c_name;
		this.c_dep = c_dep;
		this.c_way = c_way;
		this.c_names = c_names;
		this.c_deps = c_deps;
		this.c_date = c_date;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_title() {
		return c_title;
	}
	public void setC_title(String c_title) {
		this.c_title = c_title;
	}
	public String getC_type() {
		return c_type;
	}
	public void setC_type(String c_type) {
		this.c_type = c_type;
	}
	public String getC_adr() {
		return c_adr;
	}
	public void setC_adr(String c_adr) {
		this.c_adr = c_adr;
	}
	public String getC_adrs() {
		return c_adrs;
	}
	public void setC_adrs(String c_adrs) {
		this.c_adrs = c_adrs;
	}
	public String getC_way() {
		return c_way;
	}
	public void setC_way(String c_way) {
		this.c_way = c_way;
	}
	public String getC_names() {
		return c_names;
	}
	public void setC_names(String c_names) {
		this.c_names = c_names;
	}
	public String getC_deps() {
		return c_deps;
	}
	public void setC_deps(String c_deps) {
		this.c_deps = c_deps;
	}
	public String getC_date() {
		return c_date;
	}
	public void setC_date(String c_date) {
		this.c_date = c_date;
	}
	public Check(int c_id, String c_title, String c_type, String c_adr,
			String c_adrs, String c_way, String c_names, String c_deps,
			String c_date) {
		super();
		this.c_id = c_id;
		this.c_title = c_title;
		this.c_type = c_type;
		this.c_adr = c_adr;
		this.c_adrs = c_adrs;
		this.c_way = c_way;
		this.c_names = c_names;
		this.c_deps = c_deps;
		this.c_date = c_date;
	}
	public Check() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Check [c_id=" + c_id + ", c_title=" + c_title + ", c_type="
				+ c_type + ", c_adr=" + c_adr + ", c_adrs=" + c_adrs
				+ ", c_way=" + c_way + ", c_names=" + c_names + ", c_deps="
				+ c_deps + ", c_date=" + c_date + "]";
	}
	public String getC_types() {
		return c_types;
	}
	public void setC_types(String c_types) {
		this.c_types = c_types;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_dep() {
		return c_dep;
	}
	public void setC_dep(String c_dep) {
		this.c_dep = c_dep;
	}




}
