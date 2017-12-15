<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<style>
</style>
<div style="padding-left: 100px;">
	<table>
		<tr>
			<td width="100px;">机会编码:</td>
			<td colspan="3">${chance.chanceNumber}</td>
		</tr>

		<tr>
			<td width="100px;">机会类型:</td>
			<td colspan="3"><c:forEach items="${list}" var="c">
					<c:if test="${c.dectionarycodingId == chance.chanceType }">
							${c.dictionaryvalue }
						</c:if>
				</c:forEach></td>
		</tr>
		<tr>
			<td>录入人:</td>
			<td>${chance.userName }</td>
			<td>录入时间:</td>
			<td>${chance.startDate }</td>
		</tr>

		<tr>
			<td>最后操作人:</td>
			<td>${chance.lastName }</td>
			<td>最后修改时间:</td>
			<td>${chance.lastDateTime }</td>
		</tr>
		<tr>
			<td>机会内容:</td>
			<td colspan="3"><textarea rows="5" cols="60" readonly="readonly">${chance.chanceContext }</textarea></td>
		</tr>
	</table>
	<form:form commandName="chance" id="allotName">
		<table>
				<form:hidden path="id" />
				<input type="hidden" name="lastName" value="${user.userId }" />
				<tr>
					<td>分配给:</td>
					<td><form:select path="chanceallot">
							<form:options items="${lists}" itemValue="userId"
								itemLabel="userName" />
						</form:select></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center"><input
						type="button" value="分配" onclick="chanceAllot()" /><input
						type="button" value="返回" onclick="chanceClose()" /></td>
				</tr>
		</table>
	</form:form>
</div>
<script type="text/javascript">
	function chanceAllot() {
		$.messager.progress();
		$('#allotName').form('submit', {
			url : 'updateChance',
			success : function(data) {
				$.messager.progress('close');
				if (data == "true") {
					$('#allotName').form('reset');
					$.messager.show({
						title : '提示',
						msg : '分配成功!',
					});
					$('#chanceVote').window('close');
					$("#chanceManager").datagrid('reload');
				} else {
					$.messager.show({
						title : '提示',
						msg : '分配失败!',
					});
				}
			},
		});
	}
</script>