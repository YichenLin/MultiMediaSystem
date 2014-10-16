package com.icss.dao;

import java.util.List;

import com.icss.po.ResourcePO;
import com.icss.vo.PageVO;
import com.icss.vo.ResourceVO;

public class ResourceDAO extends DAOSupport<ResourcePO> {

	@Override
	public void add(ResourcePO po) throws Exception {
		String sql = "insert into resources values(null,?,?,?,?,?,?,?,?,?,?)";
		db.execute(sql, po.getResName(), po.getResType(), po.getResUploader(),
				po.getResDownloads(), po.getResVisitTimes(),
				po.getResUploadTime(), po.getResSize(), po.getResFormat(),
				po.getResUrl(), po.getResDescription());
	}

	@Override
	public void modify(ResourcePO po) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ResourcePO po) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ResourcePO> findAll() throws Exception {
		return db.list("select * from resources", new ResourcePO());
	}

	@Override
	public ResourcePO findById(ResourcePO po) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	// 如果不加where限定， 将会产生笛卡尔积从而产生u*t*w条数据
	public PageVO<ResourceVO> pageAllResByTables(int pageIndex, int rowMax)
			throws Exception {
		return page(
				"select u.*, t.res_typeName, w.user_name from resources u, resourceType t, userInfo w where u.resource_type = t.res_type_id and u.res_uploader = w.user_id",
				pageIndex, rowMax, new ResourceVO());

	}

	public PageVO<ResourceVO> pageAllImageByTables(int pageIndex, int rowMax)
			throws Exception {
		return page(
				"select u.*, t.res_typeName, w.user_name from resources u, resourceType t, userInfo w where u.resource_type = t.res_type_id and u.res_uploader = w.user_id and u.resource_type = 1",
				pageIndex, rowMax, new ResourceVO());
	}

	public PageVO<ResourceVO> pageAllMusicByTables(int pageIndex, int rowMax)
			throws Exception {
		return page(
				"select u.*, t.res_typeName, w.user_name from resources u, resourceType t, userInfo w where u.resource_type = t.res_type_id and u.res_uploader = w.user_id and u.resource_type = 3",
				pageIndex, rowMax, new ResourceVO());
	}

}
