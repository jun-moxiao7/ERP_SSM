package com.tledu.zrz.service;

import java.util.List;

import com.tledu.zrz.model.hr.Inform;
import com.tledu.zrz.model.hr.Transfer;



public interface ITransferService {

	public void add(Transfer transfer);

	public boolean verifyUserId(int userid);

	public List<Transfer> list();

	public List<Transfer> list(Transfer transfer);

	public void delete(int id);



}
