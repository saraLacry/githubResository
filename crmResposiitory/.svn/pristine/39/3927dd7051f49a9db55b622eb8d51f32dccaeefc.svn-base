<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加员工信息</title>
</head>
<body>
	系统管理>> 员工管理>> 增加员工信息
	<div style="text-align: center;">
		<table>
			<tr>
				<td>员工编码：</td>
				<td><input type="text" id="inpugIds_updates" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>员工姓名：</td>
				<td><input type="text" id="inpugIds_names" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>性别：</td>
				<td><input type="radio" value='42' checked="checked"
					name="inputNams_radios" />男</td>
				<td><input type="radio" value='43' name="inputNams_radios" />女</td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>状态：</td>
				<td><input type="radio" value="44" checked="checked"
					name="inputNams_radioids" />正常</td>
				<td><input type="radio" value="45" name="inputNams_radioids" />禁用</td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>所属部门 ：</td>
				<td><select id="selectIds_selects">
						<option value="">无</option>
				</select></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>角色身份:</td>
				<td><select id="selectIds_selectRoleids">
						<option value="">无</option>
				</select></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>联系电话:</td>
				<td><input type="text" id="phoneIds" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>备注信息:</td>
				<td><input type="text" id="inputIds_remorks" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td><input type="button" value="保存" id="InsertsaveIds" /></td>
			</tr>
		</table>
	</div>

	<script type="text/javascript">
		$(function() {
			$('input:radio:first').attr('checked', 'checked');
			var valsex = $('input:radio[name="inputNams_radios"]:checked')
					.val();
			var valstate = $('input:radio[name="inputNams_radioids"]:checked')
					.val();
			$("#InsertsaveIds").click(function() {
				$.ajax({
					url : 'InsertsaveIdsAdds',
					type : 'post',
					data : {
						userNumber : $("#inpugIds_updates").val(),
						userName : $("#inpugIds_names").val(),
						sex : valsex,
						state : valstate,
						deptId : $("#selectIds_selects").val(),
						roleId : $("#selectIds_selectRoleids").val(),
						remark : $("#inputIds_remorks").val(),
						phone : $("#phoneIds").val(),
					},
					success : function(result) {
						alert("增加成功!");
						$('#staff').datagrid("reload");
					}
				});

			});

			/* 获取部门 */
			$.ajax({
				url : 'getDeptSelect',
				type : 'post',
				success : function(result) {
					var htmls = "";
					if ("" != result || null != result) {
						for (var i = 0; i < result.length; i++) {
							htmls += "<option value="+result[i].deptId+">"
									+ result[i].deptName + "</option>";
						}
						$("#selectIds_selects").html(htmls);
					}
				}
			});

			/* 获取角色 */
			$.ajax({
				url : 'getRoleSelect',
				type : 'post',
				success : function(result) {
					var html = "";
					if ("" != result || null != result) {
						for (var i = 0; i < result.length; i++) {
							html += "<option value="+result[i].roleId+">"
									+ result[i].roleName + "</option>";
						}
						$("#selectIds_selectRoleids").html(html);
					}
				}
			});
		});
	</script>
</body>
</html>