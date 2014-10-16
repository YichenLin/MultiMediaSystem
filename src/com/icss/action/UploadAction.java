package com.icss.action;

import java.io.File;

import com.icss.po.ResourcePO;
import com.icss.service.ResourceService;

public class UploadAction {

	private ResourceService service = new ResourceService();
	private File upload;
	private String uploadFileName;
	// private String uploadFormat;
	private int userId;
	private String resDescription;
	// private int accessRightId;
	private int resTypeId;
	private String msg;

	public String execute() {
		System.out.println("FileName: " + uploadFileName);
		System.out.println("userId: " + userId);
		// System.out.println(uploadFormat);
		System.out.println("resTypeId: " + resTypeId);
		System.out.println("resDescription: " + resDescription);
		ResourcePO po = new ResourcePO();
		// po.setAccessRightID(accessRightId);

		po.setResName(uploadFileName);
		// po.setResFormat(uploadFormat);
		po.setResUploader(userId);
		po.setResDescription(resDescription);
		po.setResType(resTypeId);

		try {
			service.addRes(upload, po);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "json";

	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	// public String getUploadFormat() {
	// return uploadFormat;
	// }
	//
	// public void setUploadFormat(String uploadFormat) {
	// this.uploadFormat = uploadFormat;
	// }

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getResDescription() {
		return resDescription;
	}

	public void setResDescription(String resDescription) {
		this.resDescription = resDescription;
	}

	public int getResTypeId() {
		return resTypeId;
	}

	public void setResTypeId(int resTypeId) {
		this.resTypeId = resTypeId;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
