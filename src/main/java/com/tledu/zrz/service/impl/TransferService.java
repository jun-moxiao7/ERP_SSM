package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.ITransferDao;
import com.tledu.zrz.model.hr.Transfer;
import com.tledu.zrz.service.ITransferService;
import com.tledu.zrz.util.ObjectFactory;

public class TransferService implements ITransferService {
	private ITransferDao transferDao = ObjectFactory.getTransferDao();
	@Override
	public void add(Transfer transfer) {
		transferDao.add(transfer);
	}
	@Override
	public boolean verifyUserId(int userid) {
		Transfer transfer = transferDao.loadByUserId(userid);
		if (transfer == null) {
			return false;
		}
		return true;
	}
	@Override
	public List<Transfer> list() {
		return transferDao.list();
	}
	@Override
	public List<Transfer> list(Transfer transfer) {
		return transferDao.list(transfer);
	}
	@Override
	public void delete(int id) {
		transferDao.delete(id);
		
	}

}
