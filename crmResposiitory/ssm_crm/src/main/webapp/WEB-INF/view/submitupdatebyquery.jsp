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
		    <input type="hidden" id="serviceId" value="${servicesubmitquery.serviceId}">
			<input type="hidden" id="operationid" value="${user.userId}">
			服务名称： ${servicesubmitquery.serviceName }
			<div>服务类型：${servicesubmitquery.serviceType} 服务状态：${servicesubmitquery.serviceState}
			</div>
			<div>创建人： ${servicesubmitquery.foundidName}
				创建时间：${servicesubmitquery.serviceInsertdate}</div>
			<div>待处理人：${servicesubmitquery.disposeidName }</div>
			<div>服务内容：${servicesubmitquery.serviceContent}</div>

			当然状态：
			<select id="feedbackResult" disabled="disabled"  name="feedbackResult">
				<option value="已反馈">${servicesubmitquery.serviceState}
			</select>

			<TR>
				<TD class=field>反馈说明：</TD>
				<TD><TEXTAREA  disabled="disabled" id="feedbackExplain">${servicesubmitquery.feedbackExplain}</TEXTAREA></TD>
			</TR>
		</table>
	
	</div>
	<center></center>
	<script type="text/javascript">
	
	</script>
</body>
</html>