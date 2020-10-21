package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.IRecordDao;
import com.tledu.zrz.model.Record;
import com.tledu.zrz.service.IRecordService;
import com.tledu.zrz.util.ERPException;
import com.tledu.zrz.util.ObjectFactory;

public class RecordService implements IRecordService {
	private IRecordDao recordDao = ObjectFactory.getRecordDao();

	

	@Override
	public List<Record> list() {
		return recordDao.list();
	}

	@Override
	public void delete(int examnum) {
		recordDao.delete(examnum);
	}

	@Override
	public void add(Record record) {
		recordDao.add(record);
	}


	@Override
	public boolean verifyRecordtitlename(String Recordtitlename) {
		Record record = recordDao.loadByRecordtitlename(Recordtitlename);
		if (record == null) {
			return false;
		}
		return true;
	}

	@Override
	public Record load(int examnum) {
		return recordDao.load(examnum);
	}

	@Override
	public Record login(Record record) throws ERPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Record load(String Recordtitlename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Record> list(int examnum) {
		// TODO Auto-generated method stub
		return recordDao.list(examnum);
	}

	
	
}
