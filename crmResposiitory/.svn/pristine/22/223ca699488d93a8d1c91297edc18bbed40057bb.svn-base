<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基础信息修改</title>
</head>
<body>
	系统管理>> 基础信息>> 修改基础信息
	<div id="organDiv_Span_base" style="margin-left: 35%">
		<table>
			<tr>
				<td>参数关键字:</td>
				<td></td>
				<td><input type="text" value="${baseUpdateSelect.baseKey }"
					id="organzationSpan_1base" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>参数值:</td>
				<td></td>
				<td><input type="text" value="${baseUpdateSelect.basevalue }"
					id="organzationSpan_2base" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>参数描述:</td>
				<td></td>
				<td><input type="text"
					value="${baseUpdateSelect.basedescribe }" id="organzationSpan_3base" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td><input type="button" value="修改" id='organzationSpan_7base' /></td>
			</tr>
		</table>
	</div>
	<script type="text/javascript">
		var row = $("#basicsmessage").datagrid('getSelected');//单行
		$("#organzationSpan_7base").click(function() {
			$.ajax({
				url : 'basicsmessageUpdateBase',
				type : 'post',
				data : {
					baseId:row.baseId,
					baseKey : $("#organzationSpan_1base").val(),
					basevalue : $("#organzationSpan_2base").val(),
					basedescribe : $("#organzationSpan_3base").val()
				},
				success : function(result) {
					alert("修改成功!");
					$('#basicsmessage').datagrid("reload");
				}
			});
		});

		/* 修改基础前的查询 */
		$.ajax({
			url : 'basicsmessageUpdateBaseSelect',
			type : 'post',
			data : {
				baseKey : row.baseKey,
				basevalue : row.basevalue,
				basedescribe : row.basedescribe
			}
		});
	</script>
</body>
</html>