package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.IExamDao;
import com.tledu.zrz.model.Exam;
import com.tledu.zrz.service.IExamService;
import com.tledu.zrz.util.ObjectFactory;

public class ExamService implements IExamService {
	private IExamDao examDao = ObjectFactory.getExamDao();


	@Override
	public List<Exam> list() {
		return examDao.list();
	}

	@Override
	public void delete(int id) {
		examDao.delete(id);
	}

	@Override
	public void add(Exam exam) {
		examDao.add(exam);
	}


	@Override
	public boolean verifyTrainname(String trainname) {
		Exam exam = examDao.loadByTrainname(trainname);
		if (exam == null) {
			return false;
		}
		return true;
	}

	@Override
	public Exam load(int id) {
		return examDao.load(id);
	}

	@Override
	public void update(Exam exam) {
		examDao.update(exam);
	}

	@Override
	public List<Exam> list(int id, String trainname,  String examiner) {
		
		return examDao.list(id, trainname, examiner);
	}
}