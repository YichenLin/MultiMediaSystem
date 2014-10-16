package com.icss.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import com.icss.commons.FileUtil;
import com.icss.dao.ResourceDAO;
import com.icss.po.ResourcePO;
import com.icss.vo.PageVO;
import com.icss.vo.ResourceVO;

public class ResourceService {

	private ResourceDAO dao = new ResourceDAO();

	// 将所有数据资料显示出来
	public PageVO<ResourceVO> pageAllResByTables(int pageIndex, int rowMax)
			throws Exception {
		return dao.pageAllResByTables(pageIndex, rowMax);
	}

	// 将所有图片资料显示出来
	public PageVO<ResourceVO> pageAllImageByTables(int pageIndex, int rowMax)
			throws Exception {
		return dao.pageAllImageByTables(pageIndex, rowMax);

	}

	// 将所有音乐资料显示出来
	public PageVO<ResourceVO> pageAllMusicByTables(int pageIndex, int rowMax)
			throws Exception {
		return dao.pageAllMusicByTables(pageIndex, rowMax);
	}

	public void addRes(File file, ResourcePO po) throws Exception {
		System.out.println("ResourceType: " + po.getResType() + " (service)");
		// 将上传时间设置为系统时间
		po.setResUploadTime(new java.sql.Date(new Date().getTime()));

		// 生成的伪随机数设置为资源编号，不会重复
		// po.setResId(UUID.randomUUID().toString());
		// 设置下载次数为0
		po.setResDownloads(0);
		// 设置文件大小，调用的是本类里面的私有方法getSize(file)
		po.setResVisitTimes(0);
		po.setResSize(getSize(file));

		String url = "/Applications/apache-tomcat-7.0.54/upload";
		// 创建文件夹
		new File(url).mkdirs();
		url = url + "/" + po.getResName();
		// 设置文件存储路径 C:\\upload\aa.txt
		po.setResUrl(url);
		FileUtil.newInstance().copy(file, new File(url));
		dao.add(po);
	}

	// 获取文件大小
	private int getSize(File file) {
		int fileSize = 0;
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			try {
				fileSize = fileInputStream.available();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return fileSize;
	}

}
