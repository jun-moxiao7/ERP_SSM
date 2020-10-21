package com.tledu.zrz.dao;

import java.util.List;

import com.tledu.zrz.model.Mould;

public interface IMouldDao {

	public List<Mould> listMould();

	public Mould listMould(String id);

}
