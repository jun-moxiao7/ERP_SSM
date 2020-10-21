package com.tledu.zrz.service;

import java.util.List;

import com.tledu.zrz.model.Exam;
import com.tledu.zrz.util.ERPException;

public interface IExamService {

	/**
	 * ��ѯ�����û�
	 * 
	 * @return
	 */
	public List<Exam> list();
	public List<Exam> list(int id, String trainname,  String examiner);
	/**
	 * ����IDɾ���û�
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * ����û�,�û��������ظ�
	 * 
	 * @param user
	 */
	public void add(Exam exam);

	/**
	 * 
	 * У���û����Ƿ����
	 * 
	 * @param username
	 * @return
	 */
	public boolean verifyTrainname(String trainname);

	/**
	 * ����ID ��ѯ�û�
	 * 
	 * @param id
	 * @return
	 */
	public Exam load(int id);
	
	public void update(Exam exam);
}