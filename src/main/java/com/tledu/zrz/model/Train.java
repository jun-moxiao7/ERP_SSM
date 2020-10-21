package com.tledu.zrz.model;

public class Train {
private int id;
private String trainname;
private String fashion;
private String teacher;
private String startTime;
private String endTime;
private String addr;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTrainname() {
	return trainname;
}
public void setTrainname(String trainname) {
	this.trainname = trainname;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getFashion() {
	return fashion;
}
public void setFashion(String fashion) {
	this.fashion = fashion;
}
public String getTeacher() {
	return teacher;
}
public void setTeacher(String teacher) {
	this.teacher = teacher;
}
public String getStartTime() {
	return startTime;
}
public void setStartTime(String startTime) {
	this.startTime = startTime;
}
public String getEndTime() {
	return endTime;
}
public void setEndTime(String endTime) {
	this.endTime = endTime;
}
public Train(int id, String trainname, String fashion, String teacher, String startTime, String endTime, String addr) {
	super();
	this.id = id;
	this.trainname = trainname;
	this.fashion = fashion;
	this.teacher = teacher;
	this.startTime = startTime;
	this.endTime = endTime;
	this.addr = addr;
}
public Train(String trainname, String fashion, String teacher, String startTime, String endTime, String addr) {
	super();
	this.trainname = trainname;
	this.fashion = fashion;
	this.teacher = teacher;
	this.startTime = startTime;
	this.endTime = endTime;
	this.addr = addr;
}
public Train() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Train [id=" + id + ", trainname=" + trainname + ", fashion=" + fashion + ", teacher=" + teacher + ", startTime="
			+ startTime + ", endTime=" + endTime + ", addr=" + addr + "]";
}


}
