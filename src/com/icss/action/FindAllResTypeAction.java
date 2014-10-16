package com.icss.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.JSONException;
import org.apache.struts2.json.JSONUtil;

import com.icss.po.ResTypePO;
import com.icss.service.ResTypeService;

public class FindAllResTypeAction {

	private ResTypeService service = new ResTypeService();

	public String execute() throws Exception {
		List<ResTypePO> list = new ArrayList<ResTypePO>();

		try {
			list = service.findAll();
			ServletActionContext.getResponse().getWriter()
					.print(JSONUtil.serialize(list));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

}
