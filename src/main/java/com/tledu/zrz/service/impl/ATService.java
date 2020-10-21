package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.IATDao;
import com.tledu.zrz.model.AT;
import com.tledu.zrz.service.IATService;
import com.tledu.zrz.util.ObjectFactory;

public class ATService implements IATService {
	private IATDao atDao = ObjectFactory.getATDao();
	@Override
	public boolean verifyId(String id) {
		AT at = atDao.loadById(id);
		if (at == null) {
			return false;
		}
		return true;
	}
	@Override
	public void add(AT at) {
		atDao.add(at);
		
	}
	@Override
	public List<AT> list() {
		// TODO Auto-generated method stub
		return atDao.list();
	}
	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		atDao.delete(id);
	}

}
