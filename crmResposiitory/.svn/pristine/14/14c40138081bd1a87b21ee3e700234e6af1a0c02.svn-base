<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据字典修改</title>
</head>
<body>
	系统管理>> 数据字典>> 修改数据字典
	<input type="hidden" value="${user.userId}" id="dictionahiddenIds"/>
	<div id="dictionPopleDiv_ids" style="margin-left: 35%;">
		<table>
			<tr>
				<td>字典编码：</td>
				<td></td>
				<td><input type="text"
					value="${dictionaryUpdateSelect.dictionarycoding }"
					id="dictionPoplIds_1" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>字典名称：</td>
				<td></td>
				<td><input type="text"
					value="${dictionaryUpdateSelect.dictionaryName }"
					id="dictionPoplIds_2" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>参数值：</td>
				<td></td>
				<td><input type="text"
					value="${dictionaryUpdateSelect.dictionaryvalue }"
					id="dictionPoplIds_3" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>备注信息：</td>
				<td></td>
				<td><input type="text"
					value="${dictionaryUpdateSelect.dictionaryremark }"
					id="dictionPoplIds_4" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><input type="button" value="修改" id="dictionPoplIds_5" /></td>
				<td></td>
			</tr>
		</table>
	</div>
	<script type="text/javascript">
		$(function() {
			var row = $("#dictionaries").datagrid('getSelected');// 单行
			$("#dictionPoplIds_5").click(function() {
				$.ajax({
					url : 'dictionaUpdateDisc',
					type : 'post',
					data : {
						dectionarycodingId : row.dectionarycodingId,
						dictionarycoding : $("#dictionPoplIds_1").val(),
						dictionaryName : $("#dictionPoplIds_2").val(),
						dictionaryvalue : $("#dictionPoplIds_3").val(),
						dictionaryremark : $("#dictionPoplIds_4").val(),
						userName : $("#dictionahiddenIds").val()
					},
					success : function(result) {
						alert("修改成功!");
						$('#dictionaries').datagrid("reload");
					}
				});
			});

			/* 修改前的查询 */
			$.ajax({
				url : 'dictionaUpdateDiscSelect',
				type : 'post',
				data : {
					dectionarycodingId : row.dectionarycodingId,
					dictionarycoding : row.dictionarycoding,
					dictionaryName : row.dictionaryName,
					dictionaryvalue : row.dictionaryvalue,
					dictionaryremark : row.dictionaryremark
				}
			});
		});
	</script>
</body>
</html>