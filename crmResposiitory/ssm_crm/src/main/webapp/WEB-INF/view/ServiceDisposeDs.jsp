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
		    <input type="hidden" id="serviceId" value="${service1.serviceId}">
			<input type="hidden" id="operationid" value="${user.userId}">
			服务名称： ${service1.serviceName }
			<div>服务类型：${service1.serviceType} 服务状态：${service1.serviceState}
			</div>
			<div>创建人： ${service1.foundidName}
				创建时间：${service1.serviceInsertdate}</div>
			<div>待处理人：${service1.disposeidName }</div>
			<div>服务内容：${service1.serviceContent}</div>

			处理结果：
			<select id="disposeceresult" name="disposeceresult">
				<option value="已处理">已处理
				<option value="未处理">未处理
			</select>

			<TR>
				<TD class=field>处理说名：</TD>
				<TD><TEXTAREA id="disposeExplain">${service1.disposeExplain}</TEXTAREA></TD>
			</TR>
		</table>

		<br> <input type="button" id="disposecebuttonss" value="保存"><br>
	</div>
	<center></center>
	<script type="text/javascript">
		$(function() {
            $("#disposecebuttonss").click(function(){
            	var disposeceresult = $("#disposeceresult").val();
            	var disposeExplain = $("#disposeExplain").val();
            	var operationid=$("#operationid").val();
            	var serviceid=$("#serviceId").val();
            	alert(serviceid);
                $.ajax({
                	url:"disposecebuttonup"
                	,type:"post",
                		data:{
                			disposeceresult:disposeceresult,
                			disposeExplain:disposeExplain,
                			opid:operationid,
                			serviceId:serviceid
    					}
                });
            });
		});
	</script>
</body>
</html>