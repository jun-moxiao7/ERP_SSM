package com.tledu.zrz.service;

import java.util.List;

import com.tledu.zrz.model.Money;
import com.tledu.zrz.util.ERPException;

public interface IMoneyService {
	
	public Money login(Money money) throws ERPException;

	
	public List<Money> list();
	public List<Money> list(int id,String title);
	
	public void delete(int id);


	public void add(Money money);


	public boolean verifyMoneytitle(String title);
	public Money load(int id);
	
	
}
