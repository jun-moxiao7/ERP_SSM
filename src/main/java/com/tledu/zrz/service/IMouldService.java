package com.tledu.zrz.service;

import java.util.List;

import com.tledu.zrz.model.Mould;

public interface IMouldService {

	public List<Mould> listMould();

	public Mould listMould(String id);

}
