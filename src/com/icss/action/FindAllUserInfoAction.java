package com.icss.action;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.JSONUtil;

import com.icss.service.UserInfoService;
import com.icss.vo.PageVO;
import com.icss.vo.UserInfoVO;

public class FindAllUserInfoAction {
	private int page;
	private int rows;

	private UserInfoService service = new UserInfoService();

	public String execute() {
		try {
			PageVO<UserInfoVO> pageVO = service.pageAllByTables(page, rows);
			ServletActionContext.getResponse().getWriter()
					.print(JSONUtil.serialize(pageVO));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

}
