<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<div class="easyui-accordion" style="width:400px; height:500px;"
	data-options="fit:true">


	<div title="资源管理">
		<ul class="sub_menu">
			<li><a class="easyui-linkbutton" href="image_list.jsp"
				data-options="plain:true">图片管理</a></li>
			<li><a class="easyui-linkbutton" href="music_list.jsp"
				data-options="plain:true">音乐管理</a></li>
			<li><a class="easyui-linkbutton" href="mediaDemo.html"
				data-options="plain:true">视频管理</a></li>
			<li><a class="easyui-linkbutton" href="world.html"
				data-options="plain:true">文档管理</a></li>
			<li><a class="easyui-linkbutton" href=""
				data-options="plain:true">其他管理</a></li>
		</ul>
	</div>

	<div title="用户管理">
		<ul class="sub_menu">
			<li><a class="easyui-linkbutton" href="rightDemo.html"
				data-options="plain:true">权限管理</a></li>
			<li><a class="easyui-linkbutton" href="user_list.jsp"
				data-options="plain:true">浏览用户信息</a></li>


		</ul>
	</div>
	<div title="个人中心">
		<ul class="sub_menu">
			<li><a class="easyui-linkbutton" href=""
				data-options="plain:true">修改密码</a></li>
			<li><a class="easyui-linkbutton" href=""
				data-options="plain:true">资源统计</a></li>
			<li><a class="easyui-linkbutton" href=""
				data-options="plain:true">日志统计</a></li>

		</ul>
	</div>
</div>
<script type="text/javascript">
	$(function() {
		$(".sub_menu a").click(function() {
			//获取当前点击的超链接的href值
			var href = $(this).attr('href');

			//获取layout布局中center
			var c = $('body').layout("panel", "center");
			c.panel('refresh', href);
			return false;

		});
	});
</script>


