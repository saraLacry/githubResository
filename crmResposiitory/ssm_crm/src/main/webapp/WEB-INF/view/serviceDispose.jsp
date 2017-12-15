<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>服务处理</title>
</head>
<body>
	<input type="hidden" id="userName" value="${user.userName}">
	<!-- 数据表格 -->
	<table id="dispose">

		<div id="di">
			<!-- 进行选项查询 -->
			<form action="" method="post">

				服务名称：<input type="text" name="ServiceName" value=""> 类型：<select
					name="ServiceType">
					<option value="未分配">
				</select> 状态：<select name="ServiceState">

					<option value="">
				</select> <input type="submit" value="查询">
			</form>
			<hr />


			<form action="" method="post">
				<center>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;服务处理列表<input type="button" value="处理"
						id="ServiceDisposeDs"> 
				<input type="button" value="查询"id="disposedsqssa">

				</center>
			</form>

		</div>
	</table>
	<div id="ServiceDisposeDsds"></div>
	<div id="queryquerydispsedas"></div>
	<!-- 自定义导入js -->
	<script type="text/javascript" src="js/ServiceDispose.js"></script>
</body>
</html>