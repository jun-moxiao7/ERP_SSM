package com.tledu.zrz.model.hr;

public class Inform {
	// 调职单编号
	private int id;
	// 员工编号
	private int userId;
	// 员工姓名
	private String userName;
	// 事由
	private String reasons;
	// 原部門
	private String onDeptName;
	// 原岗位
	private String  onPost;
	// 原岗位职等
	private String onRank;
	// 调入部门
	private String afterDeptName;
	// 调入岗位
	private String afterPost;
	// 调入岗位职等
	private String afterRank;
	// 调入时间
	private String inTime;
	// 调出时间
	private String outTime;
	// 制单人
	private String name;
	// 制单日期
	private String date;
	//确认人
	private String cName;
	// 确认日期
	private String cdate;
	//备注
	private String ps;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getReasons() {
		return reasons;
	}
	public void setReasons(String reasons) {
		this.reasons = reasons;
	}
	public String getOnDeptName() {
		return onDeptName;
	}
	public void setOnDeptName(String onDeptName) {
		this.onDeptName = onDeptName;
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
	public String getAfterDeptName() {
		return afterDeptName;
	}
	public void setAfterDeptName(String afterDeptName) {
		this.afterDeptName = afterDeptName;
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
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
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
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public Inform(int id, int userId, String userName, String reasons,
			String onDeptName, String onPost, String onRank,
			String afterDeptName, String afterPost, String afterRank,
			String inTime, String outTime, String name, String date,
			String cName, String cdate, String ps) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.reasons = reasons;
		this.onDeptName = onDeptName;
		this.onPost = onPost;
		this.onRank = onRank;
		this.afterDeptName = afterDeptName;
		this.afterPost = afterPost;
		this.afterRank = afterRank;
		this.inTime = inTime;
		this.outTime = outTime;
		this.name = name;
		this.date = date;
		this.cName = cName;
		this.cdate = cdate;
		this.ps = ps;
	}
	public Inform(int userId, String userName, String reasons,
			String onDeptName, String onPost, String onRank,
			String afterDeptName, String afterPost, String afterRank,
			String inTime, String outTime, String name, String date,
			String cName, String cdate, String ps) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.reasons = reasons;
		this.onDeptName = onDeptName;
		this.onPost = onPost;
		this.onRank = onRank;
		this.afterDeptName = afterDeptName;
		this.afterPost = afterPost;
		this.afterRank = afterRank;
		this.inTime = inTime;
		this.outTime = outTime;
		this.name = name;
		this.date = date;
		this.cName = cName;
		this.cdate = cdate;
		this.ps = ps;
	}
	public Inform(int id) {
		super();
		this.id = id;
	}
	public Inform() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inform(int id, int userId, String userName, String onDeptName,
			String onPost, String afterDeptName, String afterPost,
			String inTime, String outTime) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.onDeptName = onDeptName;
		this.onPost = onPost;
		this.afterDeptName = afterDeptName;
		this.afterPost = afterPost;
		this.inTime = inTime;
		this.outTime = outTime;
	}
	@Override
	public String toString() {
		return "inform [id=" + id + ", userId=" + userId + ", userName="
				+ userName + ", reasons=" + reasons + ", onDeptName="
				+ onDeptName + ", onPost=" + onPost + ", onRank=" + onRank
				+ ", afterDeptName=" + afterDeptName + ", afterPost="
				+ afterPost + ", afterRank=" + afterRank + ", inTime=" + inTime
				+ ", outTime=" + outTime + ", name=" + name + ", date=" + date
				+ ", cName=" + cName + ", cdate=" + cdate + ", ps=" + ps + "]";
	}
	
}
