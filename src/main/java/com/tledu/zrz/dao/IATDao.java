package com.tledu.zrz.dao;

import java.util.List;

import com.tledu.zrz.model.AT;

public interface IATDao {

	public AT loadById(String id);

	public void add(AT at);

	public List<AT> list();

	public void delete(String id);

}
