package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.IRecordDao;
import com.tledu.zrz.dao.IReportDao;
import com.tledu.zrz.model.Report;
import com.tledu.zrz.service.IReportService;
import com.tledu.zrz.util.ObjectFactory;

public class ReportService implements IReportService{

	private IReportDao reportDao = ObjectFactory.getReportDao();
	@Override
	public List<Report> list() {
		return reportDao.list();
	}

	@Override
	public void delete(String number) {
		// TODO Auto-generated method stub
		reportDao.delete(number);
	}

	@Override
	public void add(Report report) {
		// TODO Auto-generated method stub
		reportDao.add(report);
	}

	@Override
	public List<Report> list(String number, String main_title, String source_class, String check_class, String fashion,
			String person, String dept, String bill_state, String verify_state) {
		
		return reportDao.list(number,  main_title,  source_class,  check_class,  fashion,
				 person,  dept,  bill_state,  verify_state);
	}

}
