package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.IMouldDao;
import com.tledu.zrz.model.Mould;
import com.tledu.zrz.service.IMouldService;
import com.tledu.zrz.util.ObjectFactory;

public class MouldService implements IMouldService {
	private IMouldDao mouldDao = ObjectFactory.getMouldDao();
	@Override
	public List<Mould> listMould() {
		return mouldDao.listMould();
	}
	@Override
	public Mould listMould(String id) {
		// TODO Auto-generated method stub
		return mouldDao.listMould(id);
	}

}
