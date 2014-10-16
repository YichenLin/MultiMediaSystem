package com.icss.po;

import java.sql.Date;
import java.sql.ResultSet;

import com.icss.commons.RowMapper;

public class ResourcePO implements RowMapper<ResourcePO>{

	private int	resId;
	private String resName;
	private int resType;
	private int resUploader;
	private int resDownloads;
	private int resVisitTimes;
	private Date resUploadTime;
	private int resSize;
	private String resFormat;
	private String resUrl;
	private String resDescription;
	
	
	
	@Override
	public ResourcePO mapRow(ResultSet rs, int index) throws Exception {
		ResourcePO po = new ResourcePO();
		po.setResId(rs.getInt("res_id"));
		po.setResName(rs.getString("res_name"));
		po.setResType(rs.getInt("resource_type"));
		po.setResUploader(rs.getInt("res_uploader"));
		po.setResDownloads(rs.getInt("downloads"));
		po.setResVisitTimes(rs.getInt("visitTimes"));
		po.setResUploadTime(rs.getDate("res_uploadTime"));
		po.setResSize(rs.getInt("res_size"));
		po.setResFormat(rs.getString("res_format"));
		po.setResUrl(rs.getString("res_url"));
		po.setResDescription(rs.getString("description"));
		
		return po;
	}



	public int getResId() {
		return resId;
	}



	public void setResId(int resId) {
		this.resId = resId;
	}



	public String getResName() {
		return resName;
	}



	public void setResName(String resName) {
		this.resName = resName;
	}



	public int getResType() {
		return resType;
	}



	public void setResType(int resType) {
		this.resType = resType;
	}



	public int getResUploader() {
		return resUploader;
	}



	public void setResUploader(int resUploader) {
		this.resUploader = resUploader;
	}



	public int getResDownloads() {
		return resDownloads;
	}



	public void setResDownloads(int resDownloads) {
		this.resDownloads = resDownloads;
	}



	public int getResVisitTimes() {
		return resVisitTimes;
	}



	public void setResVisitTimes(int resVisitTimes) {
		this.resVisitTimes = resVisitTimes;
	}



	public Date getResUploadTime() {
		return resUploadTime;
	}



	public void setResUploadTime(Date resUploadTime) {
		this.resUploadTime = resUploadTime;
	}



	public int getResSize() {
		return resSize;
	}



	public void setResSize(int i) {
		this.resSize = i;
	}



	public String getResFormat() {
		return resFormat;
	}



	public void setResFormat(String resFormat) {
		this.resFormat = resFormat;
	}



	public String getResUrl() {
		return resUrl;
	}



	public void setResUrl(String resUrl) {
		this.resUrl = resUrl;
	}



	public String getResDescription() {
		return resDescription;
	}



	public void setResDescription(String resDescription) {
		this.resDescription = resDescription;
	}

}
