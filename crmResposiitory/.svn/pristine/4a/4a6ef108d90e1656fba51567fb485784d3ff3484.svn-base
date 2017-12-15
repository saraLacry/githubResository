<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div style="padding-left: 100px;">	
		<table border="1px">
			<tr>
				<td width="100px;">联系人编码:</td>
				<td>${linkman.linkmannumber}</td>
				<td width="100px;">联系人姓名:</td>
				<td>${linkman.linkmanName}</td>
			</tr>
			<tr>
				<td width="100px;">性别:</td>
				<td><c:forEach items="${list }" var="dict">
					<c:if test="${dict.dectionarycodingId==linkman.linkmansex }">
						${dict.dictionaryvalue }
					</c:if>
				</c:forEach>
				<td width="100px;">生日:</td>
				<td>${linkman.linkmanbirth}</td>
			</tr>
			<tr>
				<td width="100px;">手机:</td>
				<td>${linkman.linkmanphone }</td>
				<td width="100px;">办公电话:</td>
				<td>${linkman.linkmanworkphone }</td>
			</tr>
			<tr>
				<td>电子邮箱:</td>
				<td>${linkman.linkmanemail }</td>
				<td>家庭电话:</td>
				<td>${linkman.linakmanhousephone }</td>
			</tr>
			
			<tr>
				<td>联系地址:</td>
				<td colspan="3" ><textarea rows="5" cols="60" readonly="true">${linkman.linkmanaddress }</textarea></td>
			</tr>

			<tr>
				<td >备注信息:</td>
				<td colspan="3"><textarea rows="5" cols="60" readonly="true">${linkman.linkmanremoek }</textarea></td>
			</tr>
			<tr>
				<td colspan="4" style="text-align: center" ><input type="button" value="返回" onclick="linkmanClose()"/></td>
			</tr>
		</table>
	</div>