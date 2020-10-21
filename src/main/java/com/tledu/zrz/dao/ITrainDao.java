package com.tledu.zrz.dao;

import java.util.List;

import com.tledu.zrz.model.Train;

public interface ITrainDao {
	/**
	 * ������ѵ��,��ѯ��ѵ
	 * 
	 * @param branchname
	 * @return
	 */
	public Train loadByTrainname(String trainname);

	/**
	 * ��ѯ������ѵ
	 * 
	 * @return
	 */
	public List<Train> list();
	public List<Train> list(int id,String trainname,String fashion);

	/**
	 * ������ѵ���ɾ����ѵ
	 * 
	 * @param ��ѵ���
	 */
	public void delete(int id);

	/**
	 * �����ѵ,��ѵ�������ظ�
	 * 
	 * @param train
	 */
	public void add(Train train);

	/**
	 * ����id ��ѯ��ѵ
	 * 
	 * @param id
	 * @return
	 */
	public Train load(int id);
	public void update(Train train);
}
