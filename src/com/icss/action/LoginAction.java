package com.icss.action;

import org.apache.struts2.ServletActionContext;

import com.icss.po.UserInfoPO;
import com.icss.service.UserInfoService;

public class LoginAction {

//	属性名称一定要和jsp页面的name一模一样 
	
	private String userName;
	private String userPwd;
	private int userTypeId;
	private String msg;
	
	private UserInfoService service=new UserInfoService();

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

	public int getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String execute(){
		UserInfoPO po=null;
		
		try {
			po=service.login(userName,userPwd, userTypeId);
			//将对象存放在session对象中
			ServletActionContext.getRequest().getSession().setAttribute("user",po);
		} catch (Exception e) {
			msg="登录失败";
		}
		
		return "json";
		
		
		
	}
	
	
}
