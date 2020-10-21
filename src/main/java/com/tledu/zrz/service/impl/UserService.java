package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.IUserDao;
import com.tledu.zrz.model.User;
import com.tledu.zrz.service.IUserService;
import com.tledu.zrz.util.ERPException;
import com.tledu.zrz.util.ObjectFactory;

public class UserService implements IUserService {
	private IUserDao userDao = ObjectFactory.getUserDao();

	@Override
	public User login(User user) throws ERPException {
		// 根据用户名查询,数据库是否有数据
		User oldUser = userDao.loadByUsername(user.getUsername());
		// 如果没有 说明用户名不存在
		if (oldUser == null) {
			// throw 抛异常 会终止程序生命周期执行
			throw new ERPException("用户名不存在");
		}
		// 如果有 就比较密码
		// 不一致 说明密码不正确
		if (!oldUser.getPassword().equals(user.getPassword())) {
			throw new ERPException("密码不正确");
		}

		// 一致 说明登陆成功
		return oldUser;
	}

	@Override
	public List<User> list() {
		return userDao.list();
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

	@Override
	public void add(User user) {
		userDao.add(user);
	}


	@Override
	public boolean verifyUsername(String username) {
		User user = userDao.loadByUsername(username);
		if (user == null) {
			return false;
		}
		return true;
	}

	@Override
	public User load(int id) {
		return userDao.load(id);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}
}
