package com.tledu.zrz.service;

import java.util.List;

import com.tledu.zrz.model.Evalution;

public interface IEvalutionService {

	public boolean verifyId(String id);

	public void add(Evalution evalution);

	public List<Evalution> list();

	public List<Evalution> list(Evalution evalution);

	public void delete(String id);

}
