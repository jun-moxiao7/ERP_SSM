package com.tledu.zrz.dao;

import java.util.List;

import com.tledu.zrz.model.Evalution;

public interface IEvalutionDao {

	public Evalution loadById(String id);

	public void add(Evalution evalution);

	public List<Evalution> list();

	public List<Evalution> list(Evalution evalution);

	public void delete(String id);

}
