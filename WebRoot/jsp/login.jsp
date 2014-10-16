<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Login Page</title>


<!--第一步：导入jQuery核心库-->
<script type="text/javascript" src="../script/jquery-1.8.3.min.js"></script>
<!--第二步：导入easyui核心库-->
<script type="text/javascript" src="../script/jquery.easyui.min.js"></script>
<!--第三步：导入中文语言库-->
<script type="text/javascript" src="../script/easyui-lang-zh_CN.js"></script>
<!--第四步：导入easyUI图标样式 在themes文件夹下-->
<link type="text/css" rel="stylesheet" href="../style/icon.css" />
<!--第五步：导入easyUI皮肤包  在themes/default文件夹下-->
<link type="text/css" rel="stylesheet" href="../style/easyui.css" />

<!-- 由于formbox.js 和 easyui.min.js是基于jquery的 所以需要先引入jquery -->
<link rel="stylesheet" type="text/css" href="../css/login.css">
<script type="text/javascript" src="../script/formbox.js"></script>

<script type="text/javascript" language="javascript">
	$(function() {

		var imgs = $("#imageShow>div:eq(0) img");
		var as = $("#imageShow>div:eq(1) a");
		var index = 0;
		var timeout;
		var setImg = function() {
			window.clearTimeout(timeout);
			if (index > imgs.size()) {
				index = 0;
			}
			imgs.fadeOut(1000);
			imgs.eq(index).fadeIn(3000);
			as.removeClass("the");
			as.eq(index).addClass("the");
			index++;
			window.setTimeout(setImg, 5000);//定时执行下一次
		}
		setImg();
		$.each(as, function(i, v) {
			$(v).click(function() {
				index = i;
				setImg();
			});
		});
	});
</script>
</head>

<body>
	<div id="top" style="z-index:1"></div>
	<div id="tabs">
		<ul id="tabMenu">
			<li class="regular"><a href="test.html">游客浏览</a></li>

			<li class="dropdown"><a href="#tab1">用户登录</a></li>

			<li class="regular"><a href="register.jsp">用户注册</a></li>

			<li class="regular"><a href="#tab2">找回密码</a></li>

			<li class="regular"><a href="#tab3">关于作者</a></li>

			<li class="regular"><a href="#tab3">联系我们</a></li>
		</ul>
	</div>

	<div id="tabContainer">
		<ul id="tabPanes"
			style="margin-left: 182px; height: 240px; display: block; overflow: hidden;z-index:1">
			<li id="tab1" style="position: absolute; display: none;">
				<p></p>

				<div class="formcontainer">
					<form id="login_form" method="post" name="myform">
						<div class="text">
							<label for="username">用户名</label> <input class="user" type="text"
								name="userName" id="username">
						</div>

						<div class="text">
							<label for="password">密码</label> <input class="pwd"
								type="password" name="userPwd" id="password">
						</div>

						<tr>
							<td align="right">用户类型:</td>
							<td><select id="cc" class="easyui-combobox"
								name="userTypeId" style="width:155px;"
								data-options="valueField:'userTypeId',
  	 						textField:'userTypeName',
  	 						url:'../findAllUserType.action'">
							</select></td>
						</tr>

						<div class="text">
							<br> <input type="checkbox" name="rememberme"
								id="rememberme"> 记住我
						</div>

						<tr>
							<td colspan="2" align="center"><a
								class="easyui-linkbutton login_submit "
								href="javascript:void(0)">登录</a></td>
						</tr>
					</form>
				</div>
				<p></p>
			</li>
		</ul>
	</div>

	<center>
		<div class="frame">
			<div class="left">
				<div id="imageShow" class="div1">
					<div style="width:658px; height:417px; overflow:hidden;">
						<img src="../images/01b.png"> <img src="../images/02b.png"
							style="display: none;"> <img src="../images/03.jpg"
							style="display: none;"> <img src="../images/04.jpg"
							style="display: none;">
					</div>

					<div class="btn1">
						<a class="the" href="javascript:void(0);"></a> <a
							href="javascript:void(0);"></a> <a href="javascript:void(0);"></a>
						<a href="javascript:void(0);"></a>
					</div>
				</div>
			</div>
		</div>
	</center>

	<script type="text/javascript">
		//登录
		$('.login_submit').click(function() {

			$('#login_form').form('submit', {
				//表单提交的目标  action或servlet
				url : '../login.action',

				//表单提交时的验证信息，返回的true或false
				onSubmit : function() {
					return $('#login_form').form('validate');
				},
				//表单提交成功后执行的操作
				success : function(data) {
					//根据data返回的数据进行判断
					var dd = $.parseJSON(data);
					if (dd.msg == null) {
						window.location = 'main.jsp';
					} else {
						window.location = 'login.jsp';
					}
					//window.location='back_main.jsp';
				}
			});
			//表单提交
			//$('#login_form').submit();	
		});
		//重置
		$('.login_reset').click(function() {
			//清除表单内容
			$("#login_form").form('clear');
		});
	</script>
</body>
</html>
