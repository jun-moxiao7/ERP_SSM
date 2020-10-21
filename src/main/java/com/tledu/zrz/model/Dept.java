package com.tledu.zrz.model;


public class Dept {
	private int id;
	private String name;
	/**
	 * 部门介绍
	 */
	private String desc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Dept(int id) {
		super();
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Dept(int id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	public Dept(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}

	public Dept() {
		super();
	}

	public Dept(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}

}
