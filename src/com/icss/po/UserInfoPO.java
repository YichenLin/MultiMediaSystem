package com.icss.po;
import java.sql.Date;
import java.sql.ResultSet;

import com.icss.commons.RowMapper;

public class UserInfoPO implements RowMapper<UserInfoPO>{

	private int userId;
	private int userTypeId;
	private String userName;
	private String userPwd;
	private String userPhone;
	private String userEmail;
	private String userSex;
	private Date userBirthday;
	
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
	
	public UserInfoPO mapRow(ResultSet rs, int index)throws Exception{
		UserInfoPO po=new UserInfoPO();
		po.setUserId(rs.getInt("user_id"));
		po.setUserTypeId(rs.getInt("user_type_id"));
		po.setUserName(rs.getString("user_name"));
		po.setUserPwd(rs.getString("user_password"));
		po.setUserPhone(rs.getString("user_phone"));
		po.setUserEmail(rs.getString("user_email"));
		po.setUserSex(rs.getString("user_sex"));
		po.setUserBirthday(rs.getDate("user_birthday"));
		return po;
	}
	
}
