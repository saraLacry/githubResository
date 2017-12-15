<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

系统管理>> 个人信息
<br>
<br>
<input id="inputHiddenUserId" type="hidden" value="${user.userId}" />
<table style="margin-left: 300px;">
	<tr>
		<td>员工姓名：</td>
		<td>
			<!-- 员工姓名 -->${user.userName}
		</td>
		<td>员工编号：</td>
		<td>
			<!-- 员工编号 -->${user.userNumber}
		</td>
	</tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr>
		<td>所在部门：</td>
		<td>
			<!-- 所在部门 -->${user.dept.deptName}
		</td>
		<td>当前状态：</td>
		<td>
			<!-- 当前状态 -->正常
		</td>
	</tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr>
		<td>系统角色：</td>
		<td>
			<!-- 系统角色 -->${user.role.roleName}
		</td>
		<td>创建时间：</td>
		<td>
			<!-- 创建时间 -->${user.createTime}
		</td>
	</tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr>
		<td>登录ID：</td>
		<td>
			<!-- 登录ID --> <input id="inputLoginId_1" type="text"
			value="${user.loginId}" /><input id="userUpdateLoginId_2"
			type="button" value="修改" />
		</td>
		<td>联系电话：</td>
		<td>
			<!-- 联系电话 --> <input id="userPhoneSpanWithids" type="text"
			value="${user.phone}" /><input id="userUpdatephone_2" type="button"
			value="修改" />
		</td>
	</tr>
</table>
<br>
<br>
<center>
	<input type="button" value="修改密码" id="inputId_1" />
</center>
<div id="personages"></div>
<script type="text/javascript">
	$(function() {
		$("#inputId_1").click(function() {
			$("#personages").dialog({
				iconCls : "icon-newadd",
				title : '修改密码',
				width : 1000,
				height : 600,
				closed : false,
				cache : false,
				href : 'personageUpdate',
				modal : true
			});
		});

		/* 修改登录Id */
		$("#userUpdateLoginId_2").click(function() {
			$.ajax({
				url : 'personalInformationLoginId',
				type : 'post',
				data : {
					loginId : $("#inputLoginId_1").val(),
					userId : $("#inputHiddenUserId").val()
				},
				success : function(result) {
					alert("修改成功！");
					alert("用户名或密码错误!");
					location = "zhuxiao";
				}
			});
		});

		/* 修改手机号 */
		$("#userUpdatephone_2").click(function() {
			$.ajax({
				url : 'personalInformationPhone',
				type : 'post',
				data : {
					phone : $("#userPhoneSpanWithids").val(),
					userId : $("#inputHiddenUserId").val()
				},
				success : function(result) {
					alert("修改成功！");
				}
			});
		});
	})
</script>