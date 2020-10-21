package com.tledu.zrz.dao;

import java.util.List;

import com.tledu.zrz.model.Exam;
import com.tledu.zrz.model.Train;

public interface IExamDao {
	/**
	 * ������ѵ��,��ѯ��ѵ
	 * 
	 * @param branchname
	 * @return
	 */
	public Exam loadByTrainname(String trainname);

	/**
	 * ��ѯ������ѵ
	 * 
	 * @return
	 */
	public List<Exam> list();
	public List<Exam> list(int id, String trainname,  String examiner);

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
	public void add(Exam exam);

	/**
	 * ����id ��ѯ��ѵ
	 * 
	 * @param id
	 * @return
	 */
	public Exam load(int id);
	public void update(Exam exam);
}
