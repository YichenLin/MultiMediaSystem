<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<meta charset="utf-8">

<link rel="stylesheet" href="../css/main.css">

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

<body class="easyui-layout">
	<div data-options="region:'north',href:'top.jsp'"
		style="height:100px;"></div>
	<div
		data-options="region:'west', title:'主菜单',href:'menu.jsp',border:false"
		style="width:200px;"></div>
	<div data-options="region:'center',border:false"></div>
</body>
</html>
