package com.tledu.zrz.model;

public class Quality_testing {
	private String rule_name;
	private String goods_name;
	private String number_head;
	private	String dateformat;
	private int length;
	private String example;
	private String rule;
	private String	status;
	public String getRule_name() {
		return rule_name;
	}
	public void setRule_name(String rule_name) {
		this.rule_name = rule_name;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getNumber_head() {
		return number_head;
	}
	public void setNumber_head(String number_head) {
		this.number_head = number_head;
	}
	public String getDateformat() {
		return dateformat;
	}
	public void setDateformat(String dateformat) {
		this.dateformat = dateformat;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getExample() {
		return example;
	}
	public void setExample(String example) {
		this.example = example;
	}
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Quality_testing(String rule_name, String goods_name, String number_head, String dateformat, int length,
			String example, String rule, String status) {
		super();
		this.rule_name = rule_name;
		this.goods_name = goods_name;
		this.number_head = number_head;
		this.dateformat = dateformat;
		this.length = length;
		this.example = example;
		this.rule = rule;
		this.status = status;
	}
	public Quality_testing() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Quality_testing [rule_name=" + rule_name + ", goods_name=" + goods_name + ", number_head=" + number_head
				+ ", dateformat=" + dateformat + ", length=" + length + ", example=" + example + ", rule=" + rule
				+ ", status=" + status + "]";
	}
	
}
