package com.tledu.zrz.dao;

import java.util.List;

import com.tledu.zrz.model.Check;

public interface ICheckDao {
	/**
	 * 根据用户名,查询用户
	 * 
	 * @param username
	 * @return
	 */


	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	public List<Check> list();

	/**
	 * 根据ID删除用户
	 * 
	 * @param id
	 */
	public void delete(int c_id);

	/**
	 * 添加用户,用户名不能重复
	 * 
	 * @param user
	 */
	public void add(Check check);

	/**
	 * 根据ID 查询用户
	 * 
	 * @param id
	 * @return
	 */
	public Check load(int c_id);

	public List<Check> list(int c_id);


	

	
}
