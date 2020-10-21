package com.tledu.zrz.dao;

import java.util.List;

import com.tledu.zrz.model.hr.Inform;

public interface IInformDao {

	public void add(Inform inform);

	public Inform loadByUserId(int userId);

	public List<Inform> list();

	public List<Inform> list(int userId);

	public void delete(int id);

}
