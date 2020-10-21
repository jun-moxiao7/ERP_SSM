package com.tledu.zrz.dao;

import java.util.List;

import org.omg.CORBA.INTERNAL;

import com.tledu.zrz.model.Pmce;

public interface IPmceDao {
	/**
	 * 根据用户名,查询用户
	 * 
	 * @param username
	 * @return
	 */
	public Pmce loadByPmcetitle(String Pmcetitle);

	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	public List<Pmce> list();
	public List<Pmce> list(int id);
	/**
	 * 根据ID删除用户
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 添加用户,用户名不能重复
	 * 
	 * @param user
	 */
	public void add(Pmce pmce);

	/**
	 * 根据ID 查询用户
	 * 
	 * @param id
	 * @return
	 */
//	public boolean verifyDeparname(String deparname);
	public Pmce load(int id);

	



	

	



	

	

	



	
}
