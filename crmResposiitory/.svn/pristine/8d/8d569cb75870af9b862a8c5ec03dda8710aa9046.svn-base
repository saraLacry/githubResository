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
		系统管理>> 角色管理 >> 增加角色 <br> <br> <br>
		<table>
			<tr>
				<td>角色名称：</td>
				<td><input type="text" name="deptName" id="deptNames" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
		</table>
		<br> <br>
	</div>
	<center>
		<input id="input_1" type="button" value="增加" />
	</center>
	<script type="text/javascript">
		$(function() {
			/* 添加角色 */
			$("#input_1").click(function() {
				alert($("#deptNames").val());
				$.ajax({
					url : 'roleManagerAddsSelect',
					type : 'post',
					data : {
						roleName : $("#deptNames").val(),
					},
					success : function(result) {
						alert(result);
						if (null != result) {
							$.ajax({
								url : 'roleManagerAdds',
								type : 'post',
								data : {
									roleName : $("#deptNames").val()
								},
								success : function(result) {
									if (result == "" || result == null) {
										alert("增加成功!");
										$('#roleManage').datagrid("reload");
									}
								}
							});
						} else {
							alert("该角色已经存在了!");
						}
					}
				});
			});
		});
	</script>
</body>
</html>