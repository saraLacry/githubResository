<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<style>
</style>
<div style="padding-left: 100px;">
		<table >
			<tr>
				<td width="100px;">机会编码:</td>
				<td >${chance.chanceNumber}</td>
			</tr>
			<tr>
				<td width="100px;">机会名称:</td>
				<td >${chance.chanceName}</td>
			</tr>
			<tr>
				<td width="100px;">机会类型:</td>
				<td >
					<c:forEach items="${list}" var="c">
						<c:if test="${c.dectionarycodingId == chance.chanceType }">
							${c.dictionaryvalue }
						</c:if>
					</c:forEach>
				</td>
			</tr>
			<tr>
				<td>机会内容:</td>
				<td><textarea rows="5" cols="60" readonly="readonly">${chance.chanceContext }</textarea></td>
			</tr>

			<tr>
				<td >备注信息:</td>
				<td ><textarea rows="5" cols="60" readonly="readonly">${chance.remark }</textarea></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center" ><input type="button" value="返回" onclick="chanceClose()"/></td>
			</tr>
		</table>
	</div>
