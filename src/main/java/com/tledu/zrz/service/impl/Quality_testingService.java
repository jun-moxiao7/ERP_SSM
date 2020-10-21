package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.IQuality_testingDao;
import com.tledu.zrz.model.Quality_testing;
import com.tledu.zrz.service.IQuality_testingService;
import com.tledu.zrz.util.ObjectFactory;

public class Quality_testingService implements IQuality_testingService{
	private IQuality_testingDao quality_testingDao = ObjectFactory.getQuality_testingDao();
	
	@Override
	public List<Quality_testing> list() {
		return quality_testingDao.list();
	}

	@Override
	public void delete(String rule_name) {
		// TODO Auto-generated method stub
		quality_testingDao.delete(rule_name);
	}

	@Override
	public void add(Quality_testing quality_testing) {
		// TODO Auto-generated method stub
		quality_testingDao.add(quality_testing);
	}

}
