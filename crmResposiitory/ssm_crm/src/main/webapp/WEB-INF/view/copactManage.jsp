<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
    <!-- 
     合同管理页面
     -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>compactManage</title>


<!--jquery文件-->
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<!--easyui核心文件-->
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<!--对应的语言包-->
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	<!--皮肤文件-->
	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css" />
	<!--图标文件-->
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
</head>
<body>



<!-- 添加 -->
<div id="compactManageTabletb">
     合同名称：<input type="text" name="compactNamet">
 
      类型：<select id="dectionarycodingIdt">
        <option value="0" >请选择</option>
        <c:forEach   items= "${sessionScope.lx}"  var="product" >
		<option value="${product.dectionarycodingId}">${product.dictionaryvalue}</option>
		</c:forEach>
	    </select>
    状态：
<select id="compactStatusIdt">
        <option  value="0" >请选择</option>
       <c:forEach   items= "${sessionScope.zt}"  var="product" >
		<option value="${product.dectionarycodingId}">${product.dictionaryvalue}</option>
		</c:forEach>
</select>
<input type="button" onClick="queryManage()" value="查询">
<hr/>
<h3>合同信息列表</h3>
<input type="button" value="执行" onClick="compactzx()">
<input type="button" value="变更" onClick="compactgx()">
<input type="button" value="查询" onclick="managexxxx()">
<input type="button" value="转让" onClick="compactassignment()">
<input type="button" value="解除" onClick="compactremove()">
</div>
<!-- 数据表格 -->
<table id="compactManageT"></table>  
<!-- 自定义导入js -->
<script type="text/javascript" src="js/compactManage.js"></script>
</body>
</html>