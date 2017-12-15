<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色增加</title>
</head>
<body id="bodyids">
	<div style="margin-left: 400px;">
		服务管理>> 服务处理>> 处理操作<br> <br> <br>
		<table>
			<input type="hidden" id="serviceId"
				value="${alcationquery.serviceId}">
			<input type="hidden" id="operationid" value="${user.userId}">
			服务名称： ${alcationquery.serviceName }
			<div>服务类型：${alcationquery.serviceType}
				服务状态：${alcationquery.serviceState}</div>
			<div>创建人： ${alcationquery.foundidName}
				创建时间：${alcationquery.serviceInsertdate}</div>
			<div>待处理人：${alcationquery.disposeidName }</div>
			<div>服务内容：${alcationquery.serviceContent}</div>

			

	
	</div>
	<center></center>
	<script type="text/javascript">
	
	</script>
</body>
</html>