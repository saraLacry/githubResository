<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<table>
	<tr>
		<td width="150px;" height="40px">预测结果标题:</td>
		<td width="150px;">${forecast.title }</td>
	</tr>

	<tr>
		<td height="40px">目标预测时间:</td>
		<td>${forecast.date }</td>
	</tr>


	<tr>
		<c:choose>
			<c:when test="${forecast.type == 个人预测 }">
				<td height="40px">目标预测员工:</td>
				<td>${forecast.userName}</td>
			</c:when>
			<c:otherwise>
				<td height="40px">目标预测部门:</td>
				<td>${forecast.deptName}</td>
			</c:otherwise>
		</c:choose>

	</tr>

	<tr>
		<td colspan="2" height="40px">预测结果:</td>
	</tr>

	<tr>
		<td colspan="2" height="40px">${forecast.text }</td>
	</tr>
	
	<tr>
		<td style="text-align: center"><input type="button" value="返回" onclick="forecastClose()" /></td>
	</tr>
</table>