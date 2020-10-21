package com.tledu.zrz.dao;

import java.util.List;

import com.tledu.zrz.model.hr.Resign;

public interface IResignDao {

	/*
	 * 添加部门
	 * 
	 */
	public void add(Resign resign);


	public Resign loadByUserId(int userid);

	public List<Resign> list();


	public List<Resign> list(int userid, String name);


	public void delete(int id);
}
