package com.icss.action;

import com.icss.po.UserInfoPO;
import com.icss.service.UserInfoService;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction implements ModelDriven<UserInfoPO> {

	private UserInfoPO po = new UserInfoPO();
	private UserInfoService service = new UserInfoService();
	private String msg;

	public UserInfoPO getPo() {
		return po;
	}

	public void setPo(UserInfoPO po) {
		this.po = po;
	}

	public UserInfoService getService() {
		return service;
	}

	public void setService(UserInfoService service) {
		this.service = service;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String execute(){
		try {
			service.register(po);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			msg="注册失败";
		}
		return "json";
	}
	
	@Override
	public UserInfoPO getModel() {
		// TODO Auto-generated method stub
		return po;
	}
}
