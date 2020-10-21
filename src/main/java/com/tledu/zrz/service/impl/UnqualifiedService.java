package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.IUnqualifiedDao;
import com.tledu.zrz.model.Unqualified;
import com.tledu.zrz.service.IUnqualifiedService;
import com.tledu.zrz.util.ObjectFactory;

public class UnqualifiedService implements IUnqualifiedService{

	private IUnqualifiedDao unqualifiedDao = ObjectFactory.getUnqualifiedDao();
	@Override
	public List<Unqualified> list() {
		return unqualifiedDao.list();
	}

	@Override
	public void delete(String number) {
		// TODO Auto-generated method stub
		unqualifiedDao.delete(number);
	}

	@Override
	public void add(Unqualified unqualified) {
		// TODO Auto-generated method stub
		unqualifiedDao.add(unqualified);
	}

	@Override
	public List<Unqualified> list(String number, String main_title, String report_list, String name, String bill_state,
			String verify_state) {
		
		return unqualifiedDao.list(number,main_title,report_list,name,bill_state,verify_state);
	}

}
