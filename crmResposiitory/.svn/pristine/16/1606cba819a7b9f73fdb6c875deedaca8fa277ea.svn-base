<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看员工</title>
</head>
<body>
	系统管理>> 员工管理>> 查看员工信息
	<div style="text-align: center;">
		<table>
			<tr>
				<td>员工编码：</td>
				<td><input type="text" value="${staffUser.userNumber}"
					id="inpugIds_update" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>员工姓名：</td>
				<td><input type="text" value="${staffUser.userName}"
					id="inpugIds_name" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>性别：</td>
				<td><input type="radio" value="42" checked="checked"
					name="inputNams_radio_1" />男</td>
				<td><input type="radio" value="43" name="inputNams_radio_1" />女</td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>状态：</td>
				<td><input type="radio" value="44" checked="checked"
					name="inputNams_radios_1" />正常</td>
				<td><input type="radio" value="45" name="inputNams_radios_1" />禁用</td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>所属部门 ：</td>
				<td><select id="selectIds_selects_1Ids">
						<option value="">无</option>
				</select></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>角色身份:</td>
				<td><input type="hidden" id="staffRolehiddenIds"
					value="${staffRole.roleId}" /><input type="text"
					value="${staffRole.roleName}" name="inputIds_ids_1" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>联系电话:</td>
				<td><input type="text" value="${staffUser.phone }"
					id="phoneIds_1" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>备注信息:</td>
				<td><input type="text" value="${staffUser.remark }"
					id="inputIds_remork_1" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
		</table>
	</div>
	<script type="text/javascript">
		$(function() {
			
			var row = $("#staff").datagrid('getSelected');//单行
			$.ajax({
				url : 'staffUpdateSelect',
				type : 'post',
				data : {
					userId:row.userId,
					userNumber: row.userNumber,
					userName: row.userName,
					sexs: row.sexs,
					states: row.states,
					roleIds: row.roleIds,
					phone: row.phone,
					remark: row.remark
				}
			});
			
			/* 获取部门 */
			$.ajax({
				url : 'getDeptSelectCount',
				type : 'post',
				data:{
					userId:row.userId
				},
				success : function(result) {
					var htmls = "";
					if ("" != result || null != result) {
						htmls += "<option value="+result.deptId+">"
								+ result.deptName + "</option>";
						}
						$("#selectIds_selects_1Ids").html(htmls);
				}
			});
		});
	</script>
</body>
</html>