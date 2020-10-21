package com.tledu.zrz.service.impl;

import java.util.List;

import com.tledu.zrz.dao.IDeptDao;
import com.tledu.zrz.model.Dept;
import com.tledu.zrz.service.IDeptService;
import com.tledu.zrz.util.ERPException;
import com.tledu.zrz.util.ObjectFactory;

public class DeptService implements IDeptService {

	private IDeptDao deptDao = ObjectFactory.getDeptDao();

	@Override
	public List<Dept> list() {
		return deptDao.list();
	}

	@Override
	public void delete(int id) throws ERPException {
		// 根据部门ID 去t_user表中进行查询 count(*) 如果大于0 ,说明该部门下还有员工
		int count = ObjectFactory.getUserDao().loadByDeptId(id);
		if (count > 0) {
			throw new  ERPException("该部门下还有员工,不能删除哦~");
		}
		deptDao.delete(id);

	}

	@Override
	public void add(Dept dept) {
		deptDao.add(dept);

	}

	@Override
	public boolean verifyName(String name) {
		Dept dept = deptDao.loadByName(name);
		if (dept == null) {
			return false;
		}
		return true;
	}

	@Override
	public Dept load(int id) {
		return deptDao.load(id);
	}

	@Override
	public void update(Dept dept) {
		deptDao.update(dept);
	}

	@Override
	public Dept loadByName(String afterdeptname) {
		
		return deptDao.loadByName(afterdeptname);
	}

}
