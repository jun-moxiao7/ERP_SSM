package com.tledu.zrz.dao;

import java.util.List;

import com.tledu.zrz.model.Quality_testing;


public interface IQuality_testingDao {
	/**
	 * 查询所有部门
	 * 
	 * @return
	 */
	public List<Quality_testing> list();

	/**
	 * 根据部门编号删除部门
	 * 
	 * @param 部门编号
	 */
	public void delete(String rule_name);

	/**
	 * 添加部门,部门名不能重复
	 * 
	 * @param user
	 */
	public void add(Quality_testing quality_testing);

	
}