<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<div class="user_datagrid"></div>

<script type="text/javascript">
	$(function()
	{
		window.updateType = function(id) {
			alert(id);
		}
		$(".user_datagrid")
				.datagrid(
						{

							url : '../findAllImage.action',
							pagination : true,
							pageList : [ 5, 10, 15 ],
							toolbar : [ {
								iconCls : 'icon-edit',
								handler : function() {
									alert('修改图片信息')
								}
							} ],
							/* 需与json里地类型名匹配，即VO，PO里的名称匹配 */
							columns : [ [
									{
										field : "resId",
										title : "图片id",
									},
									{
										field : "resName",
										title : "图片名",
									},
									{
										field : "resType",
										title : "图片类型",
									},
									{
										field : "resUploader",
										title : "上传者",
									},
									{
										field : "resDownloads",
										title : "下载统计",
									},
									{
										field : "resVisitTimes",
										title : "访问次数",
									},
									{
										field : "resUploadTime",
										title : "上传时间",
									},
									{
										field : "resSize",
										title : "资源大小",
									},
									{
										field : "resFormat",
										title : "资源类型",
									},
									{
										field : "resUrl",
										title : "资源地址",
									},
									{
										field : "resDescription",
										title : "资源描述",
									},
									{
										field : "resTypeName",
										title : "资源类型名",
									},
									{
										field : "userName",
										title : "上传者用户名",
									},
									{
										field : "dsd",
										title : "操作",
										formatter : function(value, row, index) {

											return "<a href=\"javascript:updateType('"
													+ row.userId
													+ "')\">修改权限</a>&nbsp;&nbsp;<a href=\"javascript:delete('"
													+ row.userId
													+ "')\">删除</a>";

										}
									} ] ]
						});

	});
</script>