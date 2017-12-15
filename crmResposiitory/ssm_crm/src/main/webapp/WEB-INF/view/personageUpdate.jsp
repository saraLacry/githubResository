<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人信息密码修改</title>
</head>
<body id="bodys">
	系统管理>> 个人信息>> 修改密码
	<br>
	<br>
	<input id="inputHiddenUserIds" type="hidden" value="${user.userId}" />
	<table style="margin-left: 300px;">
		<tr>
			<td>登录ID：</td>
			<td>
				<!-- 登录ID -->${user.loginId}<input id="inputHiddenPass" type="hidden" value="${user.passWord}"/>
			</td>
		</tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr>
			<td>原始密码：</td>
			<td><input id="originalPass" type="password" name="passWord" /></td>
		</tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr>
			<td>新密码 ：</td>
			<td><input id="newPassId_1" type="password" name="newpassWord" /></td>
		</tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr></tr>
		<tr>
			<td>确认密码 ：</td>
			<td><input id="newPassIds_2" type="password" name="querenpassWord" /></td>
		</tr>
	</table>
	<br>
	<br>
	<center>
		<a href="#"><input id="inputId_submit" type="submit" value="提交" /></a>
	</center>
	<script type="text/javascript">
		$(function(){
			$("#inputId_submit").click(function(){
				
				$(document).keypress(function(e) {
					// 回车键事件  
					if (e.which == 13) {
						$('#inputId_submit').click();
					}
				});
				
				if ($("#newPassIds_2").val() != $("#newPassId_1").val()){
					alert("两次密码输入有误!");
					return false;
				}
				
				if ($("#newPassId_1").val() == $("#originalPass").val()){
					alert("新密码与旧密码相同,安全系数较低!");
					return false;
				}
				
				if ($("#originalPass").val() != null){
					if ($("#originalPass").val() != $("#inputHiddenPass").val()){
						alert("密码错误,请重新输入!");
					}else{
						$.ajax({
							url:'loginPassUpdate',
							type:'post',
							data:{
								passWord:$("#newPassId_1").val(),
								userId:$("#inputHiddenUserIds").val()
							},
							success:function(result){
								alert("修改成功!");
								alert("用户名或密码错误!");
								location="zhuxiao";
							}
						});
					}
				}
			});
		});
	</script>
</body>
</html>