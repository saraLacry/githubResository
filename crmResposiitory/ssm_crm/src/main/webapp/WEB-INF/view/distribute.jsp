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

			分配处理人：
			<select id="opid" name="disposeceresult">
				<option value="1">龙小天
				<option value="2">潘文和
				<option value="4">mike
				<option value="7">不开心
				<option value="9">周英健
			</select> <
		</table>

		<br> <input type="button" id="disposecebuttonss" value="保存"><br>
	</div>
	<center></center>
	<script type="text/javascript">
		$(function() {
			$("#disposecebuttonss").click(function() {
				var opid = $("#opid").val();
				var serviceId = $("#serviceId").val();
				$.ajax({
					url : "distrAllocation",
					type : "post",
					data : {
						opid : opid,
						serviceId : serviceId
					}
				});
			});
		});
	</script>
</body>
</html>