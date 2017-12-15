<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门修改</title>
</head>
<body>
	系统管理>> 组织结构>> 修改组织结构
	<div id="organDiv_Span" style="margin-left: 35%">
		<table>
			<tr>
				<td>组织编码:</td>
				<td></td>
				<td><input type="text" value="${deptUpdateSelect.deptNumber }" id="organzationSpan_1" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>组织简称:</td>
				<td></td>
				<td><input type="text" value="${deptUpdateSelect.deptName }" id="organzationSpan_2" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>组织全称:</td>
				<td></td>
				<td><input type="text" value="${deptUpdateSelect.deptBeneluxName }" id="organzationSpan_3" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>所属部门:</td>
				<td></td>
				<td><select id="organzationSpan_4">
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
				<td><input type="text" value="${deptUpdateSelect.deptSynopsis }" id="organzationSpan_5" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>备注信息:</td>
				<td></td>
				<td><input type="text" value="${deptUpdateSelect.deptRemark }" id="organzationSpan_6" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td><input type="button" value="修改" id='organzationSpan_7' /></td>
			</tr>
		</table>
	</div>
	<script type="text/javascript">
		var row = $("#organizationStructure").datagrid('getSelected');//单行
		$("#organzationSpan_7").click(function() {
			$.ajax({
				url : 'organzationUpdateDept',
				type : 'post',
				data : {
					deptId:row.deptId,
					deptNumber:$("#organzationSpan_1").val(),
					deptName:$("#organzationSpan_2").val(),
					deptBeneluxName:$("#organzationSpan_3").val(),
					superiorDept:$("#organzationSpan_4").val(),
					deptSynopsis:$("#organzationSpan_5").val(),
					deptRemark:$("#organzationSpan_6").val()
				},
				success : function(result) {
					alert("修改成功!");
					$('#organizationStructure').datagrid("reload");
				}
			});
		});
		
		/* 修改部门前的查询 */
		$.ajax({
			url:'organzationUpdateDeptSelect',
			type:'post',
			data:{
				deptId:row.deptId,
				deptNumber:row.deptNumber,
				deptName:row.deptName,
				deptBeneluxName:row.deptBeneluxName,
				superiorDept:row.superiorDept,
				deptSynopsis:row.deptSynopsis,
				deptRemark:row.deptRemark
			}
		});
		
		/* 查询所属部门 */
		$.ajax({
			url:'selectBelongDept',
			type:'post',
			data:{
				deptId:row.deptId
			},
			success:function(result){
				var htmls = "";
				if ("" != result || null != result) {
						htmls += "<option value="+result.superiorDept+">"
								+ result.superiorDept + "</option>";
					$("#organzationSpan_4").html(htmls);
				}
			}
		});
	</script>
</body>
</html>