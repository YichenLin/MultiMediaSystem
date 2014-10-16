<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<div class="top_logo"></div>
<div
	style="float:left;margin-top:20px;margin-left:100px;margin-bottom: 0;">
	欢迎<span style="color:red;">${user.userName }</span>进入多媒体资源管理系统
</div>

<div style="float:right;" class="top_menu">
	<a class="easyui-linkbutton" data-options="plain:true"
		href="upload.jsp">文件上传</a>| <a class="easyui-linkbutton"
		data-options="plain:true" href="personalInfo.jsp">个人中心</a>| <a
		class="easyui-linkbutton" data-options="plain:true"
		href="updatePwd.jsp">修改密码</a>| <a class="easyui-linkbutton _outlog"
		data-options="plain:true" href="">安全退出</a>

</div>
<script type="text/javascript">
	$(function() {
		$(".top_menu a").click(function() {
			//获取当前点击的超链接的href值
			var href = $(this).attr('href');

			//获取layout布局中center
			var c = $('body').layout("panel", "center");
			c.panel('refresh', href);
			return false;

		});
	});

	//退出系统
	$("._outlog").click(function() {
		$.messager.confirm("退出提示", "您确定要退出本系统吗？", function(r) {
			if (r) {
				$.post("outLogin.action", {}, function(data) {
					if (data != null) {
						window.location = "login.jsp";
					}
				}, "json");
			}
		});
		return false;

	});
</script>
