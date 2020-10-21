package com.tledu.zrz.dao;

import java.util.List;

import com.tledu.zrz.model.Money;
import com.tledu.zrz.model.User;

public interface IMoneyDao {
	/**
	 * 根据用户名,查询用户
	 * 
	 * @param username
	 * @return
	 */
	public Money loadByMoneytitle(String title);

	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	public List<Money> list();

	
	public List<Money> list(int id,String title);
	/**
	 * 根据ID删除用户
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 添加用户,用户名不能重复
	 * 
	 * @param user
	 */
	public void add(Money money);

	/**
	 * 根据ID 查询用户
	 * 
	 * @param id
	 * @return
	 */
//	public User load(int id);
//	public void update(User user);

	
}
