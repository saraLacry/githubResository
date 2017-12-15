<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基础信息增加</title>
</head>
<body>
	系统管理>> 基础信息>> 增加基础信息
	<input type="hidden" value="${user.userId }" id="basicsmessageHiddenids"/>
	<div id="organDiv_Span_base_1" style="margin-left: 35%">
		<table>
			<tr>
				<td>参数关键字:</td>
				<td></td>
				<td><input type="text" id="organzationSpan_1base_1" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>参数值:</td>
				<td></td>
				<td><input type="text" id="organzationSpan_2base_2" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>参数描述:</td>
				<td></td>
				<td><input type="text" id="organzationSpan_3base_3" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td><input type="button" value="增加"
					id='organzationSpan_7base_7' /></td>
			</tr>
		</table>
	</div>
	<script type="text/javascript">
		var row = $("#basicsmessage").datagrid('getSelected');//单行
		$("#organzationSpan_7base_7").click(function() {
			$.ajax({
				url : 'basicsmessageAddBase',
				type : 'post',
				data : {
					userName:$("#basicsmessageHiddenids").val(),
					baseKey : $("#organzationSpan_1base_1").val(),
					basevalue : $("#organzationSpan_2base_2").val(),
					basedescribe : $("#organzationSpan_3base_3").val()
				},
				success : function(result) {
					alert("增加成功!");
					$('#basicsmessage').datagrid("reload");
				}
			});
		});
	</script>
</body>
</html>