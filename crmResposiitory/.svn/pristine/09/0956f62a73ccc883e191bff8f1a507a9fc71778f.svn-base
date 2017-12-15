<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript">
	function adddept() {

	}

	function insertForecast() {

	}
</script>
<table>
	<form id="forecastSave">
		<tr>
			<td width="150px;" height="40px">预测结果标题:</td>
			<td width="150px;"><input type="text" name="title" /></td>
		</tr>
	
		<tr>
			<td height="40px">目标预测时间:</td>
			<td><input type="text" name="date" /></td>
		</tr>
	
		<tr>
			<td height="40px">预测类型:</td>
			<td><select name="type" onclick="adddept()">
					<c:forEach items="${list}" var="i">
						<c:choose>
							<c:when test="${user.role.roleName == 销售总监 }">
								<c:if test="${i.dictionaryvalue!=个人预测 }">
									<option value="${i.dectionarycodingId }">${i.dictionaryvalue }</option>
								</c:if>
							</c:when>
						</c:choose>
						<c:if test="${i.dictionaryvalue!=整体预测 }">
							<option value="${i.dectionarycodingId }">${i.dictionaryvalue }</option>
						</c:if>
					</c:forEach>
			</select></td>
		</tr>
	
		<%-- <tr>
			<td colspan="2" height="40px">预测结果:</td>
		</tr>
	
		<tr>
			<td colspan="2" height="40px">${forecast.text }</td>
		</tr> --%>
	
		<tr>
			<td style="text-align: center"><input type="button" value="执行"
				onclick="insertForecast()" /><input type="button" value="返回"
				onclick="forecastClose()" /></td>
		</tr>
	</form>
</table>