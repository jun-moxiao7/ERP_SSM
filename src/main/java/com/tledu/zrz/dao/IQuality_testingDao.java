package com.tledu.zrz.dao;

import java.util.List;

import com.tledu.zrz.model.Quality_testing;


public interface IQuality_testingDao {
	/**
	 * ��ѯ���в���
	 * 
	 * @return
	 */
	public List<Quality_testing> list();

	/**
	 * ���ݲ��ű��ɾ������
	 * 
	 * @param ���ű��
	 */
	public void delete(String rule_name);

	/**
	 * ��Ӳ���,�����������ظ�
	 * 
	 * @param user
	 */
	public void add(Quality_testing quality_testing);

	
}