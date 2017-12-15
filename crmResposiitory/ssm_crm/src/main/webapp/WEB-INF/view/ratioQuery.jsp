<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div style="padding-left: 200px;">
<table>
			<tr>
				<td width="150px;" height="40px;">绩效编码:</td>
				<td width="150px;">${ratio.ratioNumber}</td>
			</tr>
			<tr>
				<td height="40px;">员工姓名:</td>
		 		<td>
		 		<c:forEach items="${list }" var="i" >
		 			<c:if test="${i.userId == ratio.userName }">
		 				${i.userName }
		 			</c:if>
		 		</c:forEach>
		 		</td>
			</tr>
			<tr>
				<td height="40px;">部门:</td>
		 		<td>
		 			${ratio.deptName }
		 		</td>
			</tr>
			<tr>
				<td height="40px;">绩效等级:</td>
		 		<td>${ratio.rank}</td>
			</tr>
			<tr>
				<td height="40px;">备注信息:</td>
		 		<td><textarea rows="5" cols="30"  readonly="readonly">${ratio.text }</textarea></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center"><input type="button" value="返回" onclick="ratioClose()"  /></td>
			</tr>
		</table>
		</div>