package com.tledu.zrz.service;

import java.util.List;

import com.tledu.zrz.model.Quality_testing;

public interface IQuality_testingService {
	public List<Quality_testing> list();

	/**
	 * ����IDɾ���û�
	 * 
	 * @param id
	 */
	public void delete(String rule_name);

	/**
	 * ����û�,�û��������ظ�
	 * 
	 * @param user
	 */
	public void add(Quality_testing quality_testing);
}
