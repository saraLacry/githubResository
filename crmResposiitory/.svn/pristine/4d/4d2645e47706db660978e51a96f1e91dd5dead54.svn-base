<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>服务创建</title>
</head>
<body>
	服务管理>> 服务创建>> 创建服务
	<!-- 数据表格 -->
	<table id="Found">
		<div id="tb">
			<!-- 进行选项查询 -->
			<!-- 添加一条服务我需要        添加一个名称 类型和状态需要使用字典 最后操作时间 跟添加这条数据的人
		     操作人就是最后一个操作这条数据的人  待处理人默认就是我的上级  
		     添加一个客户名  服务内容 客户电话 和信息 
		  -->
			<form action="" method="post">
			 <input type="hidden" id="userName" value="${user.userName }"/>
				服务名称：<input type="text" name="ServiceName" value=""> 类型： <select
					name="ServiceType">
					<option value="不限">不限
					<option value="售前服务">售前服务
					<option value="售后服务">售后服务
					<option value="投诉服务">投诉服务
					<option value="咨询服务">咨询服务
				</select> 状态： <select name="ServiceState">
					<option value="不限">不限
				</select> <input type="submit" value="查询">
			</form>

			<hr />


			<!-- 进行选项查询 -->
			<form action="" method="post">
				<center>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;创建服务<input type="button" value="添加"
						id="ServicefoundAdd"> <input type="button" value="修改"
						id="ServicefoundUpdate"> <input type="button" value="删除"
						id="serviceFoundDel"><input type="button" value="提交"
						id="submitService"> 
						<input type="button" value="查看" id="queryService">
						
				</center>
			</form>
		</div>
	</table>
	<!-- insert页面 -->
	<div id="foundService"></div>
	<!-- update页面 -->
	<div id="ServiceUpdate"></div>
	<!-- 查询 -->
	<div id="servicequery"></div>
	<!-- 自定义导入js -->
	<script type="text/javascript" src="js/ServiceFound.js"></script>
</body>
</html>