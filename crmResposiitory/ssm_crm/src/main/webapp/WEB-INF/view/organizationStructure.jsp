<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>组织结构</title>
</head>
<body>
	系统管理>> 组织结构
	<!-- 添加 -->
	<!-- 数据表格 -->
	<table id="organizationStructure">
		<div id="tb2">
			<!-- 进行选项查询 -->
			<form action="" method="post">
				<hr>
				<center>
					组织结构信息列表&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button"
						value="添加" id="organzationAdd"> <input type="button"
						value="修改" id="organzationUpdate"> <input type="button"
						value="删除" id="organzationDel">
				</center>
			</form>
		</div>
	</table>
	<div id="organzationDiragedAdd"></div>
	<div id="organzationDiragedUpdat"></div>
	<!-- 自定义导入js -->
	<script type="text/javascript" src="js/organizationStructure.js"></script>
</body>
</html>