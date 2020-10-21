package com.tledu.zrz.dao;

import java.util.List;

import com.tledu.zrz.model.Report;

public interface IReportDao {
	public List<Report> list();
	
	public List<Report> list(
			String number,String main_title,String source_class,String check_class,String fashion,
			String person,String dept,String bill_state,String verify_state);
	
	public void delete(String number);
	
	
	public void add(Report report);
}
