package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.ITrainDao;
import com.tledu.zrz.model.Train;
import com.tledu.zrz.service.ITrainService;
import com.tledu.zrz.util.ObjectFactory;

public class TrainService implements ITrainService{
	private ITrainDao trainDao = ObjectFactory.getTrainDao();
	@Override
	public List<Train> list() {
		return trainDao.list();
	}
	@Override
	public List<Train> list(int id , String trainname, String fashion) {
		// TODO Auto-generated method stub
		return trainDao.list(id,trainname,fashion);
	}

	@Override
	public void delete(int id) {
		trainDao.delete(id);
		
	}

	@Override
	public void add(Train train) {
		trainDao.add(train);
		
	}

	@Override
	public boolean verifytrainname(String trainname) {
		Train train = trainDao.loadByTrainname(trainname);
		if (train == null) {
			return false;
		}
		return true;
	}

	@Override
	public Train load(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Train train) {
		// TODO Auto-generated method stub
		
	}

	

}
