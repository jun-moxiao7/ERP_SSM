package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.IPmceDao;
import com.tledu.zrz.dao.impl.PmceDao;
import com.tledu.zrz.model.Pmce;
import com.tledu.zrz.service.IPmceService;
import com.tledu.zrz.util.ERPException;
import com.tledu.zrz.util.ObjectFactory;

public class PmceService implements IPmceService {
	private IPmceDao pmceDao = ObjectFactory.getPmceDao();

	@Override
	public List<Pmce> list() {
		return pmceDao.list();
	}

	@Override
	public void delete(int id) {
		pmceDao.delete(id);
	}

	@Override
	public void add(Pmce pmce) {
		pmceDao.add(pmce);
	}


	@Override
	public boolean verifyPmcetitle(String title) {
		Pmce pmce = pmceDao.loadByPmcetitle(title);
		if (pmce == null) {
			return false;
		}
		return true;
	}

	@Override
	public Pmce load(int id) {
		return pmceDao.load(id);
	}

	@Override
	public PmceDao login(Pmce pmce) throws ERPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pmce> list(int id) {
		// TODO Auto-generated method stub
		return null;
	}





}