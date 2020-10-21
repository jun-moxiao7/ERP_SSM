package com.tledu.zrz.model.hr;

import com.tledu.zrz.model.Dept;
import com.tledu.zrz.model.User;

public class Transfer {
	//调职申请编号
	private int id;
	//申请人id
	private User user;
	//调职申请人
	private String name;
	//申请日期
	private String applyDate;
	//希望日期
	private String hopeDate;
	//入职日期
	private String entryDate;
	
	//部门调动
	private Dept dept;
	//当前职位
	private String onPost;
	//当前职等
	private String onRank;
	//调至职位
	private String afterPost;
	//调至职等
	private String afterRank;
	//当前薪资
	private String onWages;
	//调至后薪资
	private String afterWages;
	//申请类别
	private String type;
	//事由
	private String reasons;
	//备注
	private String ps;
	//当前部门
	private String onDeptName;
	public String getOnDeptName() {
		return onDeptName;
	}
	public void setOnDeptName(String onDeptName) {
		this.onDeptName = onDeptName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getHopeDate() {
		return hopeDate;
	}
	public void setHopeDate(String hopeDate) {
		this.hopeDate = hopeDate;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public String getOnPost() {
		return onPost;
	}
	public void setOnPost(String onPost) {
		this.onPost = onPost;
	}
	public String getOnRank() {
		return onRank;
	}
	public void setOnRank(String onRank) {
		this.onRank = onRank;
	}
	public String getAfterPost() {
		return afterPost;
	}
	public void setAfterPost(String afterPost) {
		this.afterPost = afterPost;
	}
	public String getAfterRank() {
		return afterRank;
	}
	public void setAfterRank(String afterRank) {
		this.afterRank = afterRank;
	}
	public String getOnWages() {
		return onWages;
	}
	public void setOnWages(String onWages) {
		this.onWages = onWages;
	}
	public String getAfterWages() {
		return afterWages;
	}
	public void setAfterWages(String afterWages) {
		this.afterWages = afterWages;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getReasons() {
		return reasons;
	}
	public void setReasons(String reasons) {
		this.reasons = reasons;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public Transfer(int id, User user, String name, String applyDate,
			String hopeDate, String entryDate, Dept dept, String onPost,
			String onRank, String afterPost, String afterRank, String onWages,
			String afterWages, String type, String reasons, String ps,String onDeptName) {
		super();
		this.id = id;
		this.user = user;
		this.name = name;
		this.applyDate = applyDate;
		this.hopeDate = hopeDate;
		this.entryDate = entryDate;
		this.dept = dept;
		this.onPost = onPost;
		this.onRank = onRank;
		this.afterPost = afterPost;
		this.afterRank = afterRank;
		this.onWages = onWages;
		this.afterWages = afterWages;
		this.type = type;
		this.reasons = reasons;
		this.ps = ps;
		this.onDeptName = onDeptName;
	}
	public Transfer(User user, String name, String applyDate, String hopeDate,
			String entryDate, Dept dept, String onPost, String onRank,
			String afterPost, String afterRank, String onWages,
			String afterWages, String type, String reasons, String ps,String onDeptName) {
		super();
		this.user = user;
		this.name = name;
		this.applyDate = applyDate;
		this.hopeDate = hopeDate;
		this.entryDate = entryDate;
		this.dept = dept;
		this.onPost = onPost;
		this.onRank = onRank;
		this.afterPost = afterPost;
		this.afterRank = afterRank;
		this.onWages = onWages;
		this.afterWages = afterWages;
		this.type = type;
		this.reasons = reasons;
		this.ps = ps;
		this.onDeptName = onDeptName;
	}
	public Transfer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Transfer(int id) {
		super();
		this.id = id;
	}
	public Transfer(int id, User user, String name) {
		super();
		this.id = id;
		this.user = user;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Transfer [id=" + id + ", user=" + user + ", name=" + name
				+ ", applyDate=" + applyDate + ", hopeDate=" + hopeDate
				+ ", entryDate=" + entryDate + ", dept=" + dept + ", onPost="
				+ onPost + ", onRank=" + onRank + ", afterPost=" + afterPost
				+ ", afterRank=" + afterRank + ", onWages=" + onWages
				+ ", afterWages=" + afterWages + ", type=" + type
				+ ", reasons=" + reasons + ", ps=" + ps + ", onDeptName="
				+ onDeptName + "]";
	}
}
