package com.icss.service;

import java.util.List;

import com.icss.dao.ResourceTypeDAO;
import com.icss.po.ResTypePO;

public class ResTypeService {

	private ResourceTypeDAO dao = new ResourceTypeDAO();
	
	public List<ResTypePO> findAll() throws Exception{
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
