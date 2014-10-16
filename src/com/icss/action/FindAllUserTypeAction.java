package com.icss.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.JSONUtil;

import com.icss.po.UserTypePO;
import com.icss.service.UserTypeService;

public class FindAllUserTypeAction {

	private UserTypeService service = new UserTypeService();

	public String execute() {
		List<UserTypePO> list = new ArrayList<UserTypePO>();

		try {
			list = service.findAll();
			// JSONUtil.serialize(list) 将；list集合转换为json格式的数据
			ServletActionContext.getResponse().getWriter()
					.print(JSONUtil.serialize(list));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}