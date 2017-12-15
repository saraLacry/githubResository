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
		服务管理>> 服务添加>> 添加服务 <br> <br> <br>
		<table>
		
			<tr>
				<td>服务名称：</td>
				     <input type="hidden" id="opid" value="${user.userId}"/>
				     <input type="hidden" id="diId" value="${user.leaduserId}"/>
				<td><input type="text" name="serviceName" id="serviceName" /></td>
			</tr> 
			<tr>
				<td>服务类型：</td>
				<td><select id="serviceType">
						<option value="售前服务">售前服务</option>
						<option value="售后服务">售后服务</option>
						<option value="投诉服务">投诉服务</option>
						<option value="咨询服务">咨询服务</option>
				</select></td>
			</tr>
			<tr><td>服务客戶：</td>
				<td><input type="text" name="clientName" id="clientName" /></td></tr>
			<tr>
			<td>联系电话：</td>
				<td><input type="text" name="phoneClient" id="phoneClient" /></td>
			</tr>
			<tr>
				<TR>
				<TD class=field>服務內容：</TD>
				<TD><TEXTAREA id="serviceContent"></TEXTAREA></TD>
			</TR>
				<TR>
				<TD class=field>备注信息：</TD>
				<TD><TEXTAREA id="remark"></TEXTAREA></TD>
			</TR>
			</tr>
		</table>
		<br> <input id="insertService" type="button" value="增加" /> <br>
	</div>
	<script type="text/javascript">
	     $(function(){
	    	
             $("#insertService").click(function(){
            	 var opid = $("#opid").val();
            	 var serviceType = $("#serviceType").val();
            	 var clientName = $("#clientName").val();
            	 var phoneClient = $("#phoneClient").val();
            	 var serviceContent = $("#serviceContent").val();
            	 var remark = $("remark").val();
            	 var serviceName = $("#serviceName").val();
            	 var diId = $("#diId").val();
            	 $.ajax({
            		 url:"insertServiceinto",
            		 type:"post",
            		 data :{
            			 diId:diId,
            			 opid:opid,
            			 serviceType:serviceType,
            			 clientName:clientName,
            			 phoneClient:phoneClient,
            			 serviceContent:serviceContent,
            			 remark:remark,
            			 serviceName:serviceName
            		 }
            	 
            	 })
             });
	     });
	</script>
</body>
</html>