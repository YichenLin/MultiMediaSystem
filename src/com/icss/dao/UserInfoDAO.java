package com.icss.dao;

import java.util.List;

import com.icss.po.UserInfoPO;
import com.icss.vo.PageVO;
import com.icss.vo.UserInfoVO;

public class UserInfoDAO extends DAOSupport<UserInfoPO> {

	@Override
	public void add(UserInfoPO vo) throws Exception {
		db.execute("insert into userInfo values(null,?,?,?,?,?,?,?)",
				vo.getUserTypeId(), vo.getUserName(), vo.getUserPwd(),
				vo.getUserPhone(), vo.getUserEmail(), vo.getUserSex(),
				vo.getUserBirthday());

	}

	@Override
	public void modify(UserInfoPO vo) throws Exception {
		db.execute(
				"update userInfo set user_type_id=?, user_name=?, user_password=?, user_phone=?, user_email=?, user_sex=?, user_birthday=? where user_id=?",
				vo.getUserTypeId(), vo.getUserName(), vo.getUserPwd(),
				vo.getUserPhone(), vo.getUserEmail(), vo.getUserSex(),
				vo.getUserBirthday(), vo.getUserId());

	}

	@Override
	public void delete(UserInfoPO vo) throws Exception {
		db.execute("delete from userInfo where user_id=?", vo.getUserId());

	}

	@Override
	public List<UserInfoPO> findAll() throws Exception {
		return db.list("select * from userInfo", new UserInfoPO());
	}

	@Override
	public UserInfoPO findById(UserInfoPO vo) throws Exception {
		return db.get("select * from userInfo where user_id =?",
				new UserInfoPO(), vo.getUserId());
	}

	public PageVO<UserInfoVO> pageAllByTables(int pageIndex, int rowMax)
			throws Exception {
		return page("select u.*,t.type_name  from userInfo u,usertype t where u.user_type_id = t.user_type_id",pageIndex,rowMax,new UserInfoVO());
	}

	public UserInfoPO findUserToLogin(UserInfoPO vo) throws Exception {
		return db
				.get("select * from userInfo where user_name =? and user_password=? and user_type_id=?",
						new UserInfoPO(),  vo.getUserName(),
						vo.getUserPwd(), vo.getUserTypeId());
	}

}
