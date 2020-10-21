package com.tledu.zrz.model.hr;

import com.tledu.zrz.model.User;

public class Resign {
	//离职申请单编号
	private int id;
	//申请日期
	private String applyDate;
	//离职类型
	private String type;
	//离职原因（事由）
	private String reason;
	//访谈纪录
	private String records;
	//备注
	private String ps;
	//存储申请人id
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyData(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getRecords() {
		return records;
	}
	public void setRecords(String records) {
		this.records = records;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Resign(int id, String applyDate, String type, String reason, String records, String ps,
			User user) {
		super();
		this.id = id;
		this.applyDate = applyDate;
		this.type = type;
		this.reason = reason;
		this.records = records;
		this.ps = ps;
		this.user = user;
	}
	public Resign( String applyDate, String type, String reason, String records, String ps, User user) {
		super();
		this.applyDate = applyDate;
		this.type = type;
		this.reason = reason;
		this.records = records;
		this.ps = ps;
		this.user = user;
	}
	public Resign() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Resign [id=" + id + ", applyDate=" + applyDate + ", type=" + type + ", reason="
				+ reason + ", records=" + records + ", ps=" + ps + ", user=" + user + "]";
	}
	public Resign(int id) {
		super();
		this.id = id;
	}
	
	
	
	
}
