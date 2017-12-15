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
		    <input type="hidden" id="serviceId" value="${servicesubmit.serviceId}">
			<input type="hidden" id="operationid" value="${user.userId}">
			服务名称： ${servicesubmit.serviceName }
			<div>服务类型：${servicesubmit.serviceType} 服务状态：${servicesubmit.serviceState}
			</div>
			<div>创建人： ${servicesubmit.foundidName}
				创建时间：${servicesubmit.serviceInsertdate}</div>
			<div>待处理人：${servicesubmit.disposeidName }</div>
			<div>服务内容：${servicesubmit.serviceContent}</div>

			处理结果：
			<select id="feedbackResult" name="feedbackResult">
				<option value="已反馈">已反馈
				<option value="已反馈">未反馈
			</select>

			<TR>
				<TD class=field>反馈说名：</TD>
				<TD><TEXTAREA id="feedbackExplain">${servicesubmit.feedbackExplain}</TEXTAREA></TD>
			</TR>
		</table>
	<br> <input type="button" id="servicesubmitmitt" value="保存"><br>
	</div>
	<center></center>
	<script type="text/javascript">
	$(function() {
        $("#servicesubmitmitt").click(function(){
        	var feedbackResult = $("#feedbackResult").val();
        	var feedbackExplain = $("#feedbackExplain").val();
        	var operationid=$("#operationid").val();
        	var serviceid=$("#serviceId").val();
        	alert("sdf");
            $.ajax({
            	url:"servicesubmitmittsupda"
            	,type:"post"
            		,data:{
            			feedbackResult:feedbackResult,
            			feedbackExplain:feedbackExplain,
            			opid:operationid,
            			serviceId:serviceid
					}
            });
        });
	});
	</script>
</body>
</html>