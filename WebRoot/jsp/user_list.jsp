<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div class="user_datagird"></div>
<script type="text/javascript">
	$(function() {
		window.updateType = function(id) {
			alert(id);
		}
		$(".user_datagird")
				.datagrid(
						{
							//url地址，用于加载json格式数据
							url : '../findAllUser.action',
							pagination : true,//分页
							pageList : [ 5, 10, 15 ],//每页显示的条数
							toolbar : [ {
								iconCls : 'icon-edit',
								handler : function() {
									alert('修改用户权限');
								}
							} ],
							columns : [ [
									{
										field : "userName",
										title : "用户名"
									},
									{
										field : "userPwd",
										title : "密码",
										formatter : function(value, row, index) {
											return "****";
										}
									},
									{
										field : "userTypeName",
										title : "用户类型"
									},
									{
										field : "userSex",
										title : "性别"
									},
									{
										field : "userBirthday",
										title : "出生日期",
										formatter : function(value, row, index) {
											if (value != null) {
												return value.substring(0, 10);
											}
											return value;
										}
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
