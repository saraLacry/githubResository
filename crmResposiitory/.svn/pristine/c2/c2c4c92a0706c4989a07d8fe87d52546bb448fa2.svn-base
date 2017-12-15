<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>服务分配</title>
</head>
<body>
	<!-- 数据表格 -->
	<table id="allocation">
		<div id="alloc">
		     <input type="hidden" id="userid" value="${user.userId }"/>
		     <input type="hidden" id="userName" value="${user.userName }"/>
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
			<h3>服务分配列表</h3>
			<input type="submit" value="分配" id="allocationaaa"> <input
				type="submit" value="查看" id="allocationquery">
		  </div>

	</table>
	<div id="allocafenp"></div>
	<!-- 自定义导入js -->
	<script type="text/javascript" src="js/ServiceAllocation.js"></script>
</body>
</html>