<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据字典增加</title>
</head>
<body>
	系统管理>> 数据字典>> 增加数据字典
	<input type="hidden" value="${user.userId}" id="dictionahiddenIdsAdd"/>
	<div id="dictionPopleDiv_ids_1ids" style="margin-left: 35%;">
		<table>
			<tr>
				<td>字典编码：</td>
				<td></td>
				<td><input type="text" id="dictionPoplIds_1ids" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>字典名称：</td>
				<td></td>
				<td><input type="text" id="dictionPoplIds_2ids" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>参数值：</td>
				<td></td>
				<td><input type="text" id="dictionPoplIds_3ids" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>备注信息：</td>
				<td></td>
				<td><input type="text" id="dictionPoplIds_4ids" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><input type="button" value="增加" id="dictionPoplIds_5ids" /></td>
				<td></td>
			</tr>
		</table>
	</div>
	<script type="text/javascript">
		$(function() {
			var row = $("#dictionaries").datagrid('getSelected');// 单行
			$("#dictionPoplIds_5ids").click(function() {
				$.ajax({
					url : 'dictionaAddDisc',
					type : 'post',
					data : {
						dictionarycoding : $("#dictionPoplIds_1ids").val(),
						dictionaryName : $("#dictionPoplIds_2ids").val(),
						dictionaryvalue : $("#dictionPoplIds_3ids").val(),
						dictionaryremark : $("#dictionPoplIds_4ids").val(),
						userName : $("#dictionahiddenIdsAdd").val()
					},
					success : function(result) {
						alert("增加成功!");
						$('#dictionaries').datagrid("reload");
					}
				});
			});
		});
	</script>
</body>
</html>