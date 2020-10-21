package com.tledu.zrz.service;

import java.util.List;

import com.tledu.zrz.model.Record;
import com.tledu.zrz.util.ERPException;

public interface IRecordService {
	
	public Record login(Record record) throws ERPException;

	
	public List<Record> list();

	
	public void delete(int examnum);


	public void add(Record record);


	public boolean verifyRecordtitlename(String recordtitlename);
	public Record load(String Recordtitlename);


	public Record load(int examnum);


	public List<Record> list(int examnum);


	
	
	
}
