package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.IMoneyDao;
import com.tledu.zrz.model.Money;
import com.tledu.zrz.service.IMoneyService;
import com.tledu.zrz.util.ERPException;
import com.tledu.zrz.util.ObjectFactory;

public class MoneyService implements IMoneyService {
	private IMoneyDao moneyDao = ObjectFactory.getMoneyDao();

	@Override
	public List<Money> list() {
		return moneyDao.list();
	}

	@Override
	public void delete(int id) {
		moneyDao.delete(id);
	}

	@Override
	public void add(Money money) {
		moneyDao.add(money);
	}


	@Override
	public boolean verifyMoneytitle(String title) {
		Money money = moneyDao.loadByMoneytitle(title);
		if (money == null) {
			return false;
		}
		return true;
	}

	@Override
	public Money login(Money money) throws ERPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Money load(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Money> list(int id, String title) {
		// TODO Auto-generated method stub
		return moneyDao.list(id,title);
	}
}
	