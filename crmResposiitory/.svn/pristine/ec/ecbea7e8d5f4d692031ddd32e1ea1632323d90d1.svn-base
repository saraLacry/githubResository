<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>合同查看页面</title>
</head>
<body style="background-image: url('img/30772641_8.jpg');">
	<!--jquery文件-->
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<!--easyui核心文件-->
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<!--对应的语言包-->
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	<!--皮肤文件-->
	<link rel="stylesheet" type="text/css"
		href="easyui/themes/default/easyui.css" />
	<!--图标文件-->
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
	<!-- 自定义导入js -->
	<script type="text/javascript" src="js/compactAudit.js"></script>
	<div style="text-align: center;">
		<h1>合同查看页面</h1>
		
			合同名称：<input style="width: 600px" name="compactName"
				value="${sessionScope.select.compactName}" readonly="true"><br> 合同类型 :<select
				name="dectionarycodingId">

				<c:forEach items="${sessionScope.lx}" var="product">
					<c:if
						test="${product.dectionarycodingId==sessionScope.select.compactType}">
						<option value="${product.dectionarycodingId}">${product.dictionaryvalue}</option>
					</c:if>
					<c:if
						test="${product.dectionarycodingId!=sessionScope.select.compactType}">
						<option value="${product.dectionarycodingId}">${product.dictionaryvalue}</option>
					</c:if>
				</c:forEach>
			</select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 处理人 :<select
				name="compactPendingPersonId">
				<c:forEach items="${sessionScope.compactUserCelect}" var="product">

					<c:if test="${product.userId==sessionScope.select.usernameid}">
						<option value="${product.userId}">${product.userName}</option>
					</c:if>

					<c:if test="${product.userId!=sessionScope.select.usernameid}">
						<option value="${product.userId}">${product.userName}</option>
					</c:if>

				</c:forEach>
			</select> <br>合同金额: <input style="width: 200px" name="compactMoney"
				value="${sessionScope.select.compactMoney}" readonly="true"> <br> 甲方: <input
				style="width: 300px" name="compactOwnerName"
				value="${sessionScope.select.compactOwnerName}" readonly="true"> 乙方:<input
				style="width: 300px" name="compactSecondName"
				value="${sessionScope.select.compactSecondName}" readonly="true"><br>
			企业经营许可证号: <input style="width: 200px" name="compactLicenceOwner"
				value="${sessionScope.select.compactLicenceOwner}" readonly="true">
			企业经营许可证号:<input style="width: 200px" name="compactLicenceSecond"
				value="${sessionScope.select.compactLicenceSecond}" readonly="true"><br>
			合同内容:<br>
			<textarea name="compactContent" rows="10" cols="100">${sessionScope.select.compactContent}</textarea>
			<br> 备注信息：
			<textarea name="compactRemarks" rows="10" cols="50" >${sessionScope.select.compactRemarks}</textarea>
			 <input
				type="button" value="返回" onclick="CompactTuichu()">
			

		
	</div>
<!-- 自定义导入js -->
<script type="text/javascript" src="js/compactCreate.js"></script>
</body>
</html>