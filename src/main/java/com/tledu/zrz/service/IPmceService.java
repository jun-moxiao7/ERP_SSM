package com.tledu.zrz.service;

import java.util.List;

import com.tledu.zrz.dao.impl.PmceDao;
import com.tledu.zrz.model.Pmce;
import com.tledu.zrz.util.ERPException;

public interface IPmceService {
	
	public PmceDao login(Pmce pmce) throws ERPException;

	
	public List<Pmce> list();
	public List<Pmce> list(int id);
	
	public void delete(int id);


	public void add(Pmce pmce);


	public boolean verifyPmcetitle(String title);
	public Pmce load(int id);


	
	
	
}
