<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>服务反馈</title>
</head>
<body>

	<input type="hidden" id="userName" value="${user.userName}">
	<!-- 数据表格 -->
	<table id="feedback">
		<div id="fk">
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
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;服务反馈<input type="button" value="反馈"
						id="submitupdate"> <input type="button" value="查询"
						id="sunmitqueryser">

				</center>
			</form>
		</div>
	</table>
	<div id="submitupdateby"></div>
	<div id="querysubmitService"></div>
	<!-- 自定义导入js -->
	<script type="text/javascript" src="js/ServiceFeedback.js"></script>



</body>
</html>