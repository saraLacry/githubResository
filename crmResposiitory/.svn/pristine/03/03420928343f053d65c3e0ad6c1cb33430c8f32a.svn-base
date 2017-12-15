<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色修改</title>
</head>
<body>
	<div style="margin-left: 400px;">
		系统管理>> 角色管理 >> 修改角色 <br> <br> <br>
		<table>
			<tr>
				<td>角色名称：</td>
				<td><input type="text" id="roleNamesid" />${roles.roleName}</td>
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
		<input id="input_1" type="button" value="保存" />
	</center>
	<script type="text/javascript">
		$(function() {
			var row = $("#roleManage").datagrid('getSelected');//单行
			/* 修改 */
			$("#input_1").click(function() {
				$.ajax({
					url : 'roleManagerUpdate',
					type : 'post',
					data : {
						roleId : row.roelId,
						roleName : $("#roleNamesid").val()
					},
					success : function(result) {
						alert("修改成功!");
						$('#roleManage').datagrid("reload");
					}
				});
			});
		});
	</script>
</body>
</html>