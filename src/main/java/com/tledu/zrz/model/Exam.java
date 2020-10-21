package com.tledu.zrz.model;

public class Exam {
	private Train train;
	private int id;
	private String trainname;
	private String examiner;
	private String examinee;
	private String fashion;
	private String time;
	private String grade;
	private String trainid;
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
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	public String getTrainid() {
		return trainid;
	}
	public void setTrainid(String trainid) {
		this.trainid = trainid;
	}
	public String getExaminer() {
		return examiner;
	}
	public void setExaminer(String examiner) {
		this.examiner = examiner;
	}
	public String getExaminee() {
		return examinee;
	}
	public void setExaminee(String examinee) {
		this.examinee = examinee;
	}
	public String getFashion() {
		return fashion;
	}
	public void setFashion(String fashion) {
		this.fashion = fashion;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam(int id, String trainname, String examiner, String examinee, String fashion, String time, String grade) {
		super();
		this.id = id;
		this.trainname = trainname;
		this.examiner = examiner;
		this.examinee = examinee;
		this.fashion = fashion;
		this.time = time;
		this.grade = grade;
	}
	public Exam(String trainname, String examiner, String examinee, String fashion, String time, String grade) {
		super();
		this.trainname = trainname;
		this.examiner = examiner;
		this.examinee = examinee;
		this.fashion = fashion;
		this.time = time;
		this.grade = grade;
	}
	public Exam(String trainname, String examiner, String examinee, String fashion, String time) {
		super();
		this.trainname = trainname;
		this.examiner = examiner;
		this.examinee = examinee;
		this.fashion = fashion;
		this.time = time;
	}
	public Exam(int id, String trainname, String examiner, String examinee, String fashion, String time) {
		super();
		this.id = id;
		this.trainname = trainname;
		this.examiner = examiner;
		this.examinee = examinee;
		this.fashion = fashion;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Exam [train=" + train + ", id=" + id + ", trainname=" + trainname + ", examiner=" + examiner
				+ ", examinee=" + examinee + ", fashion=" + fashion + ", time=" + time + ", grade=" + grade
				+ ", trainid=" + trainid + "]";
	}
	
	
	
	
	
}
