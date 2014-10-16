package com.icss.service;

import com.icss.dao.UserInfoDAO;
import com.icss.po.UserInfoPO;
import com.icss.vo.PageVO;
import com.icss.vo.UserInfoVO;

public class UserInfoService {

	private UserInfoDAO dao = new UserInfoDAO();

	public UserInfoPO login(String userName, String userPwd, int userTypeId)
			throws Exception {
		UserInfoPO po = new UserInfoPO();
		po.setUserName(userName);
		po.setUserTypeId(userTypeId);
		po.setUserPwd(userPwd);

		return dao.findUserToLogin(po);
	}

	// 注册添加用户
	public void register(UserInfoPO po) throws Exception {
		dao.add(po);
	}

	// 浏览全部用户信息
	public PageVO<UserInfoVO> pageAllByTables(int pageIndex, int rowMax)
			throws Exception {
		return dao.pageAllByTables(pageIndex, rowMax);
	}
}
