<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript">
	var userId = "${user.userId}"
	var id = "${plan.id}"
	var createId = "${plan.createUser.userId}"
	function pass(){
		
		$.ajax({
			url:'planUpdate',
			type:'post',
			dataType:'json',
			data:'id='+id+'&state=3&lastUserName='+userId+"&manageUser=0",
			success:function(data){
				if (data == true) {
					$('#update').form('reset');
					$.messager.show({
						title : '提示',
						msg : '审批成功!',
					});
					$('#vote').window('close');
					$("#manager").datagrid('reload');
				} else {
					$.messager.show({
						title : '提示',
						msg : '审批失败!',
					});
				}
			}
		})
	}
	
	function answer(){
		$.ajax({
			url:'planUpdate',
			type:'post',
			dataType:'json',
			data:'id='+id+'&state=1&lastUserName='+userId+"&manageUser="+createId,
			success:function(data){
				if (data == true) {
					$('#update').form('reset');
					$.messager.show({
						title : '提示',
						msg : '审批成功!',
					});
					$('#vote').window('close');
					$("#manager").datagrid('reload');
				} else {
					$.messager.show({
						title : '提示',
						msg : '审批失败!',
					});
				}
			}
		})
	}
</script>
<div style="padding-left: 170px;">
<form>
<input type="hidden" name="lastUserName" value="${user.userId }">
<p>
	计划编码:&nbsp;&nbsp;&nbsp;&nbsp;${plan.planNumber }</p>
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
	<textarea rows="8" cols="20" >${plan.planText}</textarea>
</p>
<c:if test="${plan.user.userId==user.userId and plan.state=='已提交'}">
<input type="button" value="通过" onclick="pass()">
&nbsp;&nbsp; 
<input type="button" value="打回" onclick="answer()">
&nbsp;&nbsp;
</c:if>
<input type="button" value="返回" onclick="sellClose();">
</form>
</div>