package com.tledu.zrz.service;

import java.util.List;

import com.tledu.zrz.model.Train;

public interface ITrainService {
	/**
	 * ��ѯ������ѵ
	 * 
	 * @return
	 */
	public List<Train> list();
	public List<Train> list(int id,String trainname,String fashion);

	/**
	 * ����IDɾ����ѵ
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * �����ѵ,��ѵ�������ظ�
	 * 
	 * @param train
	 */
	public void add(Train train);

	/**
	 * 
	 * У����ѵ���Ƿ����
	 * 
	 * @param username
	 * @return
	 */
	public boolean verifytrainname(String trainname);

	/**
	 * ����ID ��ѯ��ѵ
	 * 
	 * @param id
	 * @return
	 */
	public Train load(int id);
	
	public void update(Train train);
}
