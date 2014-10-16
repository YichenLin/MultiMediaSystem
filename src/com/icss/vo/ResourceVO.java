package com.icss.vo;

import java.sql.Date;
import java.sql.ResultSet;

import com.icss.commons.RowMapper;

public class ResourceVO implements RowMapper<ResourceVO>{

//	页面column里地field名需与下面的类型名匹配
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
	private String resTypeName;
	private String userName;
	
	@Override
	public ResourceVO mapRow(ResultSet rs, int index) throws Exception {
		ResourceVO vo = new ResourceVO();
		vo.setResId(rs.getInt("res_id"));
		vo.setResName(rs.getString("res_name"));
		vo.setResType(rs.getInt("resource_type"));
		vo.setResUploader(rs.getInt("res_uploader"));
		vo.setResDownloads(rs.getInt("downloads"));
		vo.setResVisitTimes(rs.getInt("visitTimes"));
		vo.setResUploadTime(rs.getDate("res_uploadTime"));
		vo.setResSize(rs.getInt("res_size"));
		vo.setResFormat(rs.getString("res_format"));
		vo.setResUrl(rs.getString("res_url"));
		vo.setResDescription(rs.getString("description"));
		vo.setResTypeName(rs.getString("res_typeName"));
		vo.setUserName(rs.getString("user_name"));
		return vo;
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

	public void setResSize(int resSize) {
		this.resSize = resSize;
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

	public String getResTypeName() {
		return resTypeName;
	}

	public void setResTypeName(String resTypeName) {
		this.resTypeName = resTypeName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
