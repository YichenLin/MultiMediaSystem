package com.icss.po;

import java.sql.ResultSet;

import com.icss.commons.RowMapper;

public class UserTypePO implements RowMapper<UserTypePO> {

	private int userTypeId;
	private String userTypeName;

	public int getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getUserTypeName() {
		return userTypeName;
	}

	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}

	@Override
	public UserTypePO mapRow(ResultSet rs, int index) throws Exception {
		UserTypePO po = new UserTypePO();
		po.setUserTypeId(rs.getInt("user_type_id"));
		po.setUserTypeName(rs.getString("type_name"));
		return po;
	}

}
