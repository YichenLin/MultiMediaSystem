package com.icss.dao;

import java.util.List;

import com.icss.po.UserTypePO;

public class UserTypeDAO extends DAOSupport<UserTypePO> {

	@Override
	public List<UserTypePO> findAll() throws Exception {
		// TODO Auto-generated method stub
		return db.list("select * from usertype", new UserTypePO());
	}

	@Override
	public void add(UserTypePO vo) throws Exception {
		db.execute("insert into usertype values(null,?)", vo.getUserTypeName());

	}

	@Override
	public void modify(UserTypePO vo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(UserTypePO vo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public UserTypePO findById(UserTypePO vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
