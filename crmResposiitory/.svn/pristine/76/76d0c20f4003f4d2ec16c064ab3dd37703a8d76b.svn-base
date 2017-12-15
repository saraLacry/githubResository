<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户关系管理主页</title>
<!--JQuery核心文件-->
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<!--JQuery核心文件-->
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<!--对应的语言包-->
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
<!--对应的样式文件-->
<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css" />
<!--对应的图标样式-->
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
<!-- 自定义的js -->
<script type="text/javascript" src="js/homepage.js"></script>
<style type="text/css">
A {
	text-decoration: NONE
}
 td{
	height:30px;
} 
</style>
</head>

<body class="easyui-layout">
	<!-- 上面部分 -->
	<div data-options="region:'north'"
		style="height: 85px; background: white;">
		<center>
			<h1 style="color: red;">客户管理系统</h1>
		</center>
		<h3 style="margin-left: 500px;">
			欢迎：${user.loginId}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;部门：${user.dept.deptName}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;角色：${user.role.roleName}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[<a
				href="zhuxiao" style="color: red;">退出</a>]
		</h3>
	</div>

	<!-- 下面 -->
	<div
		data-options="region:'south',title:'版权声明',split:true,noheader:true"
		style="height: 48px;">
		<p>
		<center>
			<b style="color: red;">&copy;天团boy版权所有</b>
		</center>
		</p>
	</div>

	<!-- 左侧 -->
	<div id="div_span" data-options="region:'west',title:'导航'"
		iconCls="icon-sum" style="width: 240px; background: #cccccc;">
		<center>
			<h1 style="color: greenyellow;">${user.userName}</h1>
		</center>
		<div id="div_1"
			style="margin-left: 13px; width: 170px; height: 120px; border: solid 0px red;">
			<img src="easyui/demo-mobile/images/ayst.jpg">
		</div>
		<center>
			<p style="color: red; font-size: 16px;">时间像是流水</p>
		</center>
		<center>
			<p style="color: red; font-size: 16px;">而我就是水中的鱼</p>
		</center>
		<center>
			<p style="color: red; font-size: 16px;">明知水流急湍</p>
		</center>
		<center>
			<p style="color: red; font-size: 16px;">却仍奋力向上游着</p>
		</center>
		<ul id="pox" style="margin-left: 50px;">

		</ul>
	</div>
	<input type="hidden" id='inputIds_userid' value="${user.userId}" />

	<!-- 中间 -->
	<div data-options="region:'center'"
		style="height: 100px; overflow: hidden;">
		<div id="tt" class="easyui-tabs" border="false" fit="true">
			<div title="起始页" iconCls="icon-tip"
				style="padding: 0 10px; display: block; background-image: url('img/longshaos.png');">
				<center>
					<H1 style="color: green;">客户关系管理系统欢迎您....</H1>
				</center>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		$(function() {

			// 			$.ajax({
			// 				url:'loginDeptIdSelect',
			// 				type:'post',
			// 				data:{
			// 					userId:$("#inputIds_userid").val()
			// 				},
			// 				success:function(result){

			// 				}
			// 			});

			$("#pox").tree({
				url : "rootTree",
				lines : true,
				onClick : function(none) {
					if (none.url != "") {
						if ($("#tt").tabs('exists', none.text)) {
							$("#tt").tabs('select', none.text);
						} else {
							$("#tt").tabs('add', {
								title : none.text,
								closable : true,
								href : none.url,
							});
						}
					}
				},
			});
		});
	</script>
</body>
</html>