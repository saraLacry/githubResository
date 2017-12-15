<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色管理</title>
</head>
<body>
	系统管理>> 角色管理
	<!-- 添加 -->
	<!-- 数据表格 -->
	<table id="roleManage">
		<div id="tb1">
			<!-- 进行选项查询 -->
			<form action="" method="post">
				<hr>
				<center>
					角色信息列表&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="添加"
						id="compactAdd"> <input type="button" value="修改"
						id="compactUpdate"> <input type="button" value="删除"
						id="compactDel">
<!-- 						<input type="button" value="授权" id="compactShou"> -->
				</center>
			</form>
		</div>
	</table>
	<!-- 修改专用 -->
	<div id="roleManageUpdates"></div>
	<!-- 添加专用 -->
	<div id="roleManageAdd"></div>
	<!-- 授权专用 -->
	<div id="roleManageShouquan"></div>
	<!-- 自定义导入js -->
	<script type="text/javascript" src="js/roleManage.js"></script>
</body>
</html>