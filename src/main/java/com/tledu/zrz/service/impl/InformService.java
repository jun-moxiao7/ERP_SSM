package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.IInformDao;
import com.tledu.zrz.model.hr.Inform;
import com.tledu.zrz.model.hr.Transfer;
import com.tledu.zrz.service.IInformService;
import com.tledu.zrz.util.ObjectFactory;

public class InformService implements IInformService {
	private IInformDao informDao = ObjectFactory.getInformDao();
	@Override
	public void add(Inform inform) {
		// TODO Auto-generated method stub
		informDao.add(inform);
		
	}

	@Override
	public boolean verifyUserId(int userId) {
		Inform inform = informDao.loadByUserId(userId);
		System.out.println(inform);
		if (inform == null) {
			return false;
		}
		return true;
	}

	@Override
	public List<Inform> list() {
		return informDao.list();
		}

	@Override
	public List<Inform> list(int userId) {
		return informDao.list(userId);
		}

	@Override
	public void delete(int id) {
		informDao.delete(id);
		}

}
