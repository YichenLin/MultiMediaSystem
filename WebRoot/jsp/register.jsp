<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<meta charset="utf-8">

<link rel="stylesheet" href="../css/demo.css">
<link rel="stylesheet" href="../css/sky-forms.css">

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


</head>

<body>
	<div class="body body-s">
		<form action="" class="sky-form" id="register_form" method="post">
			<header>用户注册</header>
			<input type="hidden" name="userTypeId" value="3" />
			<fieldset>
				<section> <label class="input"> <i
					class="icon-append icon-user"></i> <input
					class="easyui-validatebox" name="userName"
					data-options="required:true" placeholder="用户名" /> <b
					class="tooltip tooltip-bottom-right">请只使用字母与数字</b>
				</label> </section>



				<section> <label class="input"> <i
					class="icon-append icon-lock"></i> <input type="password"
					class="easyui-validatebox" name="userPwd"
					data-options="required:true" placeholder="密码" /> <b
					class="tooltip tooltip-bottom-right">请只使用字母与数字</b>
				</label> </section>

				<section> <label class="input"> <i
					class="icon-append icon-lock"></i> <input type="password"
					placeholder="请再输入一次密码"> <b
					class="tooltip tooltip-bottom-right">请只使用字母与数字</b>
				</label> </section>

				<section> <label class="input"> <i
					class="icon-append icon-user"></i> <input type="text"
					placeholder="电话"> <b class="tooltip tooltip-bottom-right">请输入您的电话号码</b>
				</label> </section>

				<section> <label class="input"> <i
					class="icon-append icon-envelope-alt"></i> <input type="text"
					placeholder="Email地址"> <b
					class="tooltip tooltip-bottom-right">用来验证账号与找回密码</b>
				</label> </section>


			</fieldset>

			<fieldset>
				<div class="row">
					<section class="col col-6"> <label class="input">
						<input type="text" placeholder="姓名">
					</label> </section>
					<section class="col col-6"> <label class="input">
						<input type="text" placeholder="生日"> <b
						class="tooltip tooltip-bottom-right">请按照年-月-日的格式填写；例如：1991-04-20</b>

					</label> </section>
				</div>

				<section> <label class="select"> <select>
						<option value="0" selected="" disabled="">性别</option>
						<option value="1">男</option>
						<option value="2">女</option>

				</select> <i></i>
				</label> </section>


			</fieldset>
			<footer>
			<tr>
				<td colspan="2" align="center"><a
					class="easyui-linkbutton register_submit "
					href="javascript:void(0)">注册</a> <a
					class="easyui-linkbutton register_reset " href="javascript:void(0)">重置</a></td>
			</tr>
			<button type="submit" class="button">Submit</button>
			</footer>
		</form>

		<script type="text/javascript">
			$('.register_submit').click(function() {
				$('#register_form').form('submit', {
					url : '../register.action',
					onSubmit : function() {
						return $('#register_form').form('validate');
					},
					success : function(data) {
						var dd = $.parseJSON(data);
						
						if (dd.msg == null) {
							window.location = 'main.jsp';
						} else {
							$.messager.alert("错误提示", dd.msg);
						}
					}

				});
			});
		</script>
	</div>

</body>
</html>
