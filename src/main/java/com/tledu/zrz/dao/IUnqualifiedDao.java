package com.tledu.zrz.dao;

import java.util.List;

import com.tledu.zrz.model.Unqualified;

public interface IUnqualifiedDao {
	public List<Unqualified> list();
	
	public List<Unqualified> list(String number ,String main_title,String report_list,
			String name,String bill_state,String verify_state);
	
	
	public void delete(String number);
	
	
	public void add(Unqualified unqualified);
}
