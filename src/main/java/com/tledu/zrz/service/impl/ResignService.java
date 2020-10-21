package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.IResignDao;
import com.tledu.zrz.model.hr.Resign;
import com.tledu.zrz.service.IResignService;
import com.tledu.zrz.util.ObjectFactory;

public class ResignService implements IResignService {

	private IResignDao resignDao = ObjectFactory.getResignDao();

	@Override
	public List<Resign> list() {
		return resignDao.list();
	}

	@Override
	public void delete(int id){
		resignDao.delete(id);
	}

	@Override
	public void add(Resign resign) {
		resignDao.add(resign);

	}



	@Override
	public boolean verifyUserId(int userid) {
		Resign resign = resignDao.loadByUserId(userid);
		if (resign == null) {
			return false;
		}
		return true;
	}

	@Override
	public Resign selectUserId(int userid) {
		Resign resign = resignDao.loadByUserId(userid);
		return resign;
	}

	@Override
	public List<Resign> list(int userid ,String name) {
		return resignDao.list(userid,name);
	}





	

}
