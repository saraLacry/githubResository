<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<table style="padding-left: 250px;">
	<tr>
		<td height="60px" width="120px;">分析结果标题:</td>
		<td width="120px;" >${contend.contendTitle}</td>
	</tr>
	<tr>
		<td height="60px">目标预测时间:</td>
		<td>${contend.date}</td>
	</tr>
	<tr>
		<td height="60px">分析类型:</td>
		<td>
			<c:forEach items="${list }" var="di">
				<c:if test="${di.dectionarycodingId==contend.type }">
					${di.dictionaryvalue}
				</c:if>
			</c:forEach>
		</td>
	</tr>
	<tr>
		<td height="20px"  colspan="2">分析结果</td>
	</tr>
	<tr>
		<td height="60px"  colspan="2">
			${contend.result }
		</td>
	</tr>
	<tr>
		<td colspan="2" style="text-align: center"><input type="button" value="返回" onclick="contendClose()" /></td>
	</tr>
</table>