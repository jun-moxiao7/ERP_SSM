package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.ICheckDao;
import com.tledu.zrz.model.Check;
import com.tledu.zrz.service.ICheckService;
import com.tledu.zrz.util.ERPException;
import com.tledu.zrz.util.ObjectFactory;


public class CheckService implements ICheckService {
	private ICheckDao checkDao = ObjectFactory.getCheckDao();

	@Override
	public List<Check> list() {
		return checkDao.list();
	}

	@Override
	public void delete(int c_id) {
		checkDao.delete(c_id);
	}

	@Override
	public void add(Check check) {
		checkDao.add(check);
	}

	@Override
	public Check login(Check check) throws ERPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Check> list(int c_id) {
		// TODO Auto-generated method stub
		return checkDao.list(c_id);
	}

	@Override
	public Check load(int c_id) {
		// TODO Auto-generated method stub
		return null;
	}

	



}