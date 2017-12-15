<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门增加</title>
</head>
<body>
	系统管理>> 组织结构>> 增加组织结构
	<div id="organDiv_Span_1" style="margin-left: 35%">
		<table>
			<tr>
				<td>组织编码:</td>
				<td></td>
				<td><input type="text" id="organzationSpan_1ids" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>组织简称:</td>
				<td></td>
				<td><input type="text" id="organzationSpan_2ids" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>组织全称:</td>
				<td></td>
				<td><input type="text" id="organzationSpan_3ids" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>所属部门:</td>
				<td></td>
				<td><select id="organzationSpan_4ids">
						<option value="">无</option>
				</select></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>部门简介:</td>
				<td></td>
				<td><input type="text" id="organzationSpan_5ids" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>备注信息:</td>
				<td></td>
				<td><input type="text" id="organzationSpan_6ids" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td><input type="button" value="增加" id='organzationSpan_7ids' /></td>
			</tr>
		</table>
	</div>
	<script type="text/javascript">
		$("#organzationSpan_7ids").click(function() {
			$.ajax({
				url : 'organzationAddDept',
				type : 'post',
				data : {
					deptNumber:$("#organzationSpan_1ids").val(),
					deptName:$("#organzationSpan_2ids").val(),
					deptBeneluxName:$("#organzationSpan_3ids").val(),
					superiorDept:$("#organzationSpan_4ids").val(),
					deptSynopsis:$("#organzationSpan_5ids").val(),
					deptRemark:$("#organzationSpan_6ids").val()
				},
				success : function(result) {
					alert("增加成功!");
					$('#organizationStructure').datagrid("reload");
				}
			});
		});
		
		/* 查询部门 */
		$.ajax({
			url:'selectDeptCountSpan',
			type:'post',
			success:function(result){
				var htmls = "";
				if ("" != result || null != result) {
					for (var i = 0; i < result.length; i++) {
						htmls += "<option value="+result[i].deptId+">"
								+ result[i].deptName + "</option>";
					}
					$("#organzationSpan_4ids").html(htmls);
				}
			}
		});
	</script>
</body>
</html>