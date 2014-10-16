package com.icss.po;

import java.sql.ResultSet;

import com.icss.commons.RowMapper;

public class ResTypePO implements RowMapper<ResTypePO> {

	private int resTypeId;
	private String resTypeName;

	@Override
	public ResTypePO mapRow(ResultSet rs, int index) throws Exception {
		ResTypePO po = new ResTypePO();
		po.setResTypeId(rs.getInt("res_type_id"));
		po.setResTypeName(rs.getString("res_typeName"));

		return po;
	}

	public int getResTypeId() {
		return resTypeId;
	}

	public void setResTypeId(int resTypeId) {
		this.resTypeId = resTypeId;
	}

	public String getResTypeName() {
		return resTypeName;
	}

	public void setResTypeName(String resTypeName) {
		this.resTypeName = resTypeName;
	}

}
