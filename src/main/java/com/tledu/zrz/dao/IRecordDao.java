package com.tledu.zrz.dao;

import java.util.List;

import com.tledu.zrz.model.Record;



public interface IRecordDao {
	/**
	 * 根据用户名,查询用户
	 * 
	 * @param username
	 * @return
	 */
	public Record loadByRecordtitlename(String Recordtitlename);

	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	public List<Record> list();

	/**
	 * 根据ID删除用户
	 * 
	 * @param id
	 */
	public void delete(int examnum);

	/**
	 * 添加用户,用户名不能重复
	 * 
	 * @param user
	 */
	public void add(Record record);

	/**
	 * 根据ID 查询用户
	 * 
	 * @param id
	 * @return
	 */
//	public boolean verifyDeparname(String deparname);
	public Record load(int recordexamnum);

	public List<Record> list(int examnum);
	
	

	



	
}
