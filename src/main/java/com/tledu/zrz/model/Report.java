package com.tledu.zrz.model;

public class Report {
	private String number;
	private String main_title;
	private String source_class;
	private String unit;
	private String unit_class;
	private String check_class;
	private String fashion;
	private String person;
	private String dept;
	private String date;
	private String bill_state;
	private String verify_state;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMain_title() {
		return main_title;
	}
	public void setMain_title(String main_title) {
		this.main_title = main_title;
	}
	public String getSource_class() {
		return source_class;
	}
	public void setSource_class(String source_class) {
		this.source_class = source_class;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getUnit_class() {
		return unit_class;
	}
	public void setUnit_class(String unit_class) {
		this.unit_class = unit_class;
	}
	public String getCheck_class() {
		return check_class;
	}
	public void setCheck_class(String check_class) {
		this.check_class = check_class;
	}
	public String getFashion() {
		return fashion;
	}
	public void setFashion(String fashion) {
		this.fashion = fashion;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBill_state() {
		return bill_state;
	}
	public void setBill_state(String bill_state) {
		this.bill_state = bill_state;
	}
	public String getVerify_state() {
		return verify_state;
	}
	public void setVerify_state(String verify_state) {
		this.verify_state = verify_state;
	}
	public Report(String number, String main_title, String source_class, String unit, String unit_class,
			String check_class, String fashion, String person, String dept, String date, String bill_state,
			String verify_state) {
		super();
		this.number = number;
		this.main_title = main_title;
		this.source_class = source_class;
		this.unit = unit;
		this.unit_class = unit_class;
		this.check_class = check_class;
		this.fashion = fashion;
		this.person = person;
		this.dept = dept;
		this.date = date;
		this.bill_state = bill_state;
		this.verify_state = verify_state;
	}
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Report [number=" + number + ", main_title=" + main_title + ", source_class=" + source_class + ", unit="
				+ unit + ", unit_class=" + unit_class + ", check_class=" + check_class + ", fashion=" + fashion
				+ ", person=" + person + ", dept=" + dept + ", date=" + date + ", bill_state=" + bill_state
				+ ", verify_state=" + verify_state + "]";
	}
	
}
