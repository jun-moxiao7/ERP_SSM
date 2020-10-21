package com.tledu.zrz.service;

import java.util.List;

import com.tledu.zrz.model.hr.Inform;


public interface IInformService {

	public void add(Inform inform);

	public boolean verifyUserId(int userId);

	public List<Inform> list();

	public List<Inform> list(int userId);

	public void delete(int id);


}
