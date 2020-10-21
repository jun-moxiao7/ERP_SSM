package com.tledu.zrz.service;

import java.util.List;

import com.tledu.zrz.model.AT;

public interface IATService {

	public boolean verifyId(String id);

	public void add(AT at);

	public List<AT> list();

	public void delete(String id);

}
