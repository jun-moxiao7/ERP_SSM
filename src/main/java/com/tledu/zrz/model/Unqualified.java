package com.tledu.zrz.model;

public class Unqualified {
	private String number;
	private String main_title;
	private String source_class;
	private String report_list;
	private String good_number;
	private String name;
	private String person;
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
	public String getReport_list() {
		return report_list;
	}
	public void setReport_list(String report_list) {
		this.report_list = report_list;
	}
	public String getGood_number() {
		return good_number;
	}
	public void setGood_number(String good_number) {
		this.good_number = good_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
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
	public Unqualified(String number, String main_title, String source_class, String report_list, String good_number,
			String name, String person, String date, String bill_state, String verify_state) {
		super();
		this.number = number;
		this.main_title = main_title;
		this.source_class = source_class;
		this.report_list = report_list;
		this.good_number = good_number;
		this.name = name;
		this.person = person;
		this.date = date;
		this.bill_state = bill_state;
		this.verify_state = verify_state;
	}
	public Unqualified() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Unqualified [number=" + number + ", main_title=" + main_title + ", source_class=" + source_class
				+ ", report_list=" + report_list + ", good_number=" + good_number + ", name=" + name + ", person="
				+ person + ", date=" + date + ", bill_state=" + bill_state + ", verify_state=" + verify_state + "]";
	}
}
