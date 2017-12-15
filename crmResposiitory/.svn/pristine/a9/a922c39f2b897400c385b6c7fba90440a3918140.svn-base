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
		服务管理>> 服务添加>> 查询服务 <br> <br> <br>
		<table>

      <input type="hidden"  id="serviceId" name=serviceId value="${UpdatequeryServiceUpdate.serviceId}" />

			服务名称：
			<input type="text" height="50px" disabled="disabled"
				disabled="disabled" value="${UpdatequeryServiceUpdate.serviceName}" />
			服务类型：
			<input type="text" height="50px" id="beizhuIds" disabled="disabled"
				value="${UpdatequeryServiceUpdate.serviceType}" />

			<tr>
				<td>服务客户：</td>
				<td><input type="text" height="50px"
					value="${UpdatequeryServiceUpdate.clientName}" disabled="disabled" /></td>
				<td>联系电话：</td>
				<td><input type="text" height="50px" id="phoneClient"
				name="phoneClient"	value="${UpdatequeryServiceUpdate.phoneClient}" /></td>
			</tr>

			<TR>
				<TD class=field>服务内容：</TD>
				<TD><TEXTAREA id="serviceContent" name="serviceContent">${UpdatequeryServiceUpdate.serviceContent}</TEXTAREA></TD>
			</TR>
			<TR>
				<TD class=field>服务详细：</TD>
				<TD><TEXTAREA id="remark" name="remark">${UpdatequeryServiceUpdate.remark }</TEXTAREA></TD>
			</TR>
		</table>
		<br> <input type="button" id="update" value="保存"><br>

	</div>
	<center></center>
	<script type="text/javascript">
		$(function() {
			
			$("#update").click(function() {
				var phoneClient = $("#phoneClient").val();
				var  serviceContent= $("#serviceContent").val();
				var remark=$("#remark").val();
				var serviceId = $("#serviceId").val();
				alert("sdf");
				$.ajax({
					url:"updateFoundFound",
					type:"post",
					data:{
						phoneClient:phoneClient,
						serviceContent:serviceContent,
						remark:remark,
						serviceId:serviceId
					}
				});
				
			});
		});
	</script>
</body>
</html>