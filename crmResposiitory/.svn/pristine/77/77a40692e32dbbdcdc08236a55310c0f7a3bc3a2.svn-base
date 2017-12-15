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
		服务管理>> 服务处理>> 查询操作<br> <br> <br>
		<table>                                                   
		    <input type="hidden" id="serviceId" value="${service2.serviceId}">
			<input type="hidden" id="operationid" value="${user.userId}">
			服务名称： ${service2.serviceName }
			<div>服务类型：${service2.serviceType} 服务状态：${service2.serviceState}
			</div>
			<div>创建人： ${service2.foundidName}
				创建时间：${service2.serviceInsertdate}</div>
			<div>待处理人：${service2.disposeidName }</div>
			<div>服务内容：${service2.serviceContent}</div>

			处理结果：
			<select id="disposeceresult" name="disposeceresult">
				<option value="已处理">${service2.disposeceresult}
				
			</select>

			<TR>
				<TD class=field>处理说名：</TD>
				<TD><TEXTAREA id="disposeExplain">${service2.disposeExplain}</TEXTAREA></TD>
			</TR>
		</table>

	
	</div>
	<center></center>
	<script type="text/javascript">
		
	</script>
</body>
</html>