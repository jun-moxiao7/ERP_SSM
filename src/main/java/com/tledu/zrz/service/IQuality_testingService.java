package com.tledu.zrz.service;

import java.util.List;

import com.tledu.zrz.model.Quality_testing;

public interface IQuality_testingService {
	public List<Quality_testing> list();

	/**
	 * 根据ID删除用户
	 * 
	 * @param id
	 */
	public void delete(String rule_name);

	/**
	 * 添加用户,用户名不能重复
	 * 
	 * @param user
	 */
	public void add(Quality_testing quality_testing);
}
