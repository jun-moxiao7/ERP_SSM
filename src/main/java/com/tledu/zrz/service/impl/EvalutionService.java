package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.IEvalutionDao;
import com.tledu.zrz.model.Evalution;
import com.tledu.zrz.service.IEvalutionService;
import com.tledu.zrz.util.ObjectFactory;

public class EvalutionService implements IEvalutionService {
	private IEvalutionDao evalutionDao = ObjectFactory.getEvalutionDao();
	@Override
	public boolean verifyId(String id) {
		Evalution evalution = evalutionDao.loadById(id);
		if (evalution == null) {
			return false;
		}
		return true;
	}
	@Override
	public void add(Evalution evalution) {
		evalutionDao.add(evalution);
		}
	@Override
	public List<Evalution> list() {
		return evalutionDao.list();
		}
	@Override
	public List<Evalution> list(Evalution evalution) {
		return evalutionDao.list(evalution);
		}
	@Override
	public void delete(String id) {
		evalutionDao.delete(id);
		
		}

}
