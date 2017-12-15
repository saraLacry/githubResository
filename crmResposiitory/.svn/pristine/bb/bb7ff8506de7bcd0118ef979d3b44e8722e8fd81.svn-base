<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div style="padding-left: 200px;">
	<form:form commandName="contend" id="contendSave">
		<table >
			<form:hidden path="id" />
			<tr>
				<td width="100px;">分析结果标题:</td>
				<td><form:input path="contendTitle" /></td>
			</tr>
			<tr>
				<td width="100px;">分析时间:</td>
				<td><input type=text name="date" value="${contend.date }"
					class="easyui-datebox" editable=false required="required" /></td>
			</tr>
			<tr>
				<td width="100px;">分析类型:</td>
				<td><form:select path="type">
						<form:options items="${list }" itemValue="dectionarycodingId"
							itemLabel="dictionaryvalue" />
					</form:select>
			</tr>
			<tr>
				<c:if test="${contend.state != null }">
					<td>状态:</td>
					<td>${contend.state}</td>
				</c:if>
			</tr>
			<tr>
				<td>导入数据:</td>
				<td>
					<%-- <form:input path="linakmanhousephone"/> --%>
				</td>
			</tr>

			<tr>
				<td style="text-align: right"><input type="button" value="保存"
					onclick="contendSave()" /></td>
				<td><input type="button" value="返回" onclick="contendClose()" /></td>
			</tr>
		</table>
	</form:form>
</div>

<script type="text/javascript">
	function contendSave() {
		var id = "${contend.id}"
		var url = '';
		var succeed = '';
		var defeated = '';
		if (id > 0) {
			url = 'updatecontend'
			succeed = '修改成功!'
			defeated = '修改失败!'
		} else {
			url = 'savecontend'
			succeed = '保存成功!'
			defeated = '保存失败!'
		}
		$.messager.progress();
		$('#contendSave').form('submit', {
			url : url,
			success : function(data) {
				$.messager.progress('close');
				if (data == "true") {
					$('#contendSave').form('reset');
					$.messager.show({
						title : '提示',
						msg : succeed,
					});
					$('#contendVote').window('close');
					$("#contendManager").datagrid('reload');
				} else {
					$.messager.show({
						title : '提示',
						msg : defeated,
					});
				}
			},
		});
	}
</script>