package com.tledu.zrz.model;

public class Record {
	private int examnum;
	
	private String titlename;
	/**
	 * 密码
	 */
	private String charge;
	/**
	 * 昵称
	 */
	private String start;

	private String end;
	private String adr;
	private String cdn;
	private int peonum;
	private String per;
	private String content;
	private String result;
	private String remarks;
	public int getExamnum() {
		return examnum;
	}
	public void setExamnum(int examnum) {
		this.examnum = examnum;
	}
	public String getTitlename() {
		return titlename;
	}
	public void setTitlename(String titlename) {
		this.titlename = titlename;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
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
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public String getCdn() {
		return cdn;
	}
	public void setCdn(String cdn) {
		this.cdn = cdn;
	}
	public int getPeonum() {
		return peonum;
	}
	public void setPeonum(int peonum) {
		this.peonum = peonum;
	}
	public Record(int examnum, String titlename, String charge, String start,
			String end, String adr, String cdn, int peonum) {
		super();
		this.examnum = examnum;
		this.titlename = titlename;
		this.charge = charge;
		this.start = start;
		this.end = end;
		this.adr = adr;
		this.cdn = cdn;
		this.peonum = peonum;
	}

	public Record(String titlename, String charge, String start,
			String end, String adr, String cdn, int peonum, String per,
			String content, String result, String remarks) {
		super();
		
		this.titlename = titlename;
		this.charge = charge;
		this.start = start;
		this.end = end;
		this.adr = adr;
		this.cdn = cdn;
		this.peonum = peonum;
		this.per = per;
		this.content = content;
		this.result = result;
		this.remarks = remarks;
	}
	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Record [examnum=" + examnum + ", titlename=" + titlename
				+ ", charge=" + charge + ", start=" + start + ", end=" + end
				+ ", adr=" + adr + ", cdn=" + cdn + ", peonum=" + peonum + "]";
	}
	public String getPer() {
		return per;
	}
	public void setPer(String per) {
		this.per = per;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemark(String remarks) {
		this.remarks = remarks;
	}

	
}
