package com.tledu.zrz.dao;

import java.util.List;

import com.tledu.zrz.model.hr.Transfer;

public interface ITransferDao {

	public void add(Transfer transfer);

	public Transfer loadByUserId(int userid);

	public List<Transfer> list();

	public List<Transfer> list(Transfer transfer);

	public void delete(int id);

}
