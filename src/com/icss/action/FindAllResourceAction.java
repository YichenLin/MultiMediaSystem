package com.icss.action;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.JSONUtil;

import com.icss.service.ResourceService;
import com.icss.vo.PageVO;
import com.icss.vo.ResourceVO;

public class FindAllResourceAction {

	private int page;
	private int rows;

	private ResourceService service = new ResourceService();

	public String execute() {
		try {
			PageVO<ResourceVO> pageVO = service.pageAllResByTables(page, rows);
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
