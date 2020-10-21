package com.tledu.zrz.service;

import java.util.List;

import com.tledu.zrz.model.Check;
import com.tledu.zrz.util.ERPException;

public interface ICheckService {
	
	public Check login(Check check) throws ERPException;

	
	public List<Check> list();
	public List<Check> list(int c_id);
	
	public void delete(int c_id);


	public void add(Check check);


	
	public Check load(int c_id);
	
	
}
