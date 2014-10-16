package com.icss.dao;

import java.util.List;

import com.icss.po.ResTypePO;

public class ResourceTypeDAO extends DAOSupport<ResTypePO> {

	public List<ResTypePO> findAll() throws Exception {

		return db.list("select * from resourceType", new ResTypePO());

	}

	@Override
	public void add(ResTypePO po) throws Exception {
		db.execute("insert into resourceType values(null, ?)", po.getResTypeName());
	}

	@Override
	public void modify(ResTypePO po) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ResTypePO po) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public ResTypePO findById(ResTypePO po) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
