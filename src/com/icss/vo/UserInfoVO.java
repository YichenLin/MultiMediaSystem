package com.icss.vo;

import java.sql.Date;
import java.sql.ResultSet;

import com.icss.commons.RowMapper;



//view object 用于显示多张表查询的结合结果（因为po只是针对数据库的单张表的对象）
public class UserInfoVO implements RowMapper<UserInfoVO>{

	private int userId;
	private int userTypeId;
	private String userName;
	private String userPwd;
	private String userPhone;
	private String userEmail;
	private String userSex;
	private Date userBirthday;
	private String userTypeName;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public Date getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}
	public String getUserTypeName() {
		return userTypeName;
	}
	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}
	@Override
	public UserInfoVO mapRow(ResultSet rs, int index) throws Exception {
		UserInfoVO vo=new UserInfoVO();
		vo.setUserId(rs.getInt("user_id"));
		vo.setUserTypeId(rs.getInt("user_type_id"));
		vo.setUserName(rs.getString("user_name"));
		vo.setUserPwd(rs.getString("user_password"));
		vo.setUserPhone(rs.getString("user_phone"));
		vo.setUserEmail(rs.getString("user_email"));
		vo.setUserSex(rs.getString("user_sex"));
		vo.setUserBirthday(rs.getDate("user_birthday"));
		vo.setUserTypeName(rs.getString("type_name"));
		return vo;
	}

	
}