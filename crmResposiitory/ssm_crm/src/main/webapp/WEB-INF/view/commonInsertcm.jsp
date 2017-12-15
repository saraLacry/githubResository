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
			<tr>
				<td><input type="hidden" id="FoundId"
					value="${user.userName }"> 
					问题标题：<input type="text" id="IssueName">
			</tr>



			问题类型：
			<select id="IssueType" name="feedbackResult">
				<option value="售后问题">售后问题
				<option value="售前问题">售前问题
				<option value="咨询服务">咨询服务
				<option value="投诉服务">投诉服务
			</select>

			<TR>
				
				<TD>答复要点：<TEXTAREA id="IssueAnswer"></TEXTAREA></TD>
				<TD>备注信息：<TEXTAREA id="Remark"></TEXTAREA></TD>
			</TR>
		</table>
		<br> <input type="button" id="insert" value="保存"><br>
	</div>
	<center></center>
	<script type="text/javascript">
		$(function(){
			$("#insert").click(function(){
				var IssueName = $("#IssueName").val();
				var IssueType = $("#IssueType").val();
				var Remark = $("#Remark").val();
				var IssueAnswer = $("#IssueAnswer").val();
				var FoundId = $("#FoundId").val();
				$.ajax({
					url:'insertCommonIssue',
					type:'post',
					data:{
						IssueName:IssueName,
						IssueType:IssueType,
						Remark:Remark,
						IssueAnswer:IssueAnswer,
						FoundId:FoundId
					}
				});
			});
			
		});
	</script>
</body>
</html>