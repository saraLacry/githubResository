<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div style="padding-left: 170px;">
	<form:form id="update" commandName="plan">
		<form:hidden path="id" />
		<input type="hidden" name="lastUserName" value="${user.userId }">
		<p>
			计划编码:&nbsp;&nbsp;&nbsp;&nbsp;
			<form:input path="planNumber" />
		</p>
		<span><p>
				计划人姓名:&nbsp;&nbsp;&nbsp;&nbsp;${plan.createUser.userName}</p></span>
		<p>
			计划月份:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="date"
				value="${plan.date }" class="easyui-datebox" editable=false
				required="required" />
		</p>
		<span><p>计划状态:&nbsp;&nbsp;&nbsp;&nbsp;${plan.state}</p></span>
		<p>
			计划内容:&nbsp;&nbsp;&nbsp;&nbsp;
			<form:textarea path="planText" rows="8" cols="20" />
		</p>
		<input type="button" value="保存" onclick="updatePlan()">&nbsp;&nbsp;<input
			type="button" value="返回" onclick="sellClose();">
	</form:form>
</div>
<script type="text/javascript">
	function updatePlan() {
		$.messager.progress();
		$('#update').form('submit', {
			url : 'planUpdate',
			success : function(data) {
				$.messager.progress('close');
				if (data == "true") {
					$('#update').form('reset');
					$.messager.show({
						title : '提示',
						msg : '修改成功!',
					});
					$('#sellVote').window('close');
					$("#sellManager").datagrid('reload');
				} else {
					$.messager.show({
						title : '提示',
						msg : '修改失败!',
					});
				}
			},
		});
	}
</script>
</script>