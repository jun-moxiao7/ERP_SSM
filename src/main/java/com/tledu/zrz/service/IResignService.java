package com.tledu.zrz.service;

import java.util.List;

import com.tledu.zrz.model.hr.Resign;

public interface IResignService {
	public  List<Resign> list();
	
	/*
	 * 根据ID删除部门,如果该部门下有员工,则不能删除该部门
	 * 
	 */
//	public void delete(int id) throws ERPException;

	/*
	 * 添加部门
	 * 
	 */
	public void add(Resign resign);
//	public int getId(int deptid);

	/*
	 * 
	 * 校验部门名称是否存在
	 * 
	 */
	public boolean verifyUserId(int userid);
	public Resign selectUserId(int userid);

	public List<Resign> list(int userid, String name);

	public void delete(int id);


	

	/**
	 * 根据ID 查询部门
	 * 
	 */
//	public Resign load(int id);
	
//	public void update(Resign resign);
}
