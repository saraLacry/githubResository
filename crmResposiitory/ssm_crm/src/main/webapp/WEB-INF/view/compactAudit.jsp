<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <!-- 
        合同审核
    
     -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>合同审核</title>

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


<!-- 工具栏 -->
<div id="ZcompactTb">
<!-- 进行选项查询 -->
          合同名称：<input type="text" name="compactNames">
 
      类型：<select id="dectionarycodingIds">
        <option value="0" >请选择</option>
        <c:forEach   items= "${sessionScope.lx}"  var="product" >
		<option value="${product.dectionarycodingId}">${product.dictionaryvalue}</option>
		</c:forEach>
	    </select>
    状态：
<select id="compactStatusIds">
        <option  value="0" >请选择</option>
       <c:forEach   items= "${sessionScope.zt}"  var="product" >
		<option value="${product.dectionarycodingId}">${product.dictionaryvalue}</option>
		</c:forEach>
</select>
<input type="button" onClick="queryAudit()" value="查询">
<hr/>
<h3>合同信息列表</h3>
<!-- 自定义导入js -->
<script type="text/javascript" src="js/compactAudit.js"></script>

<input type="button" value="查询" onClick="aidotxxxx()">
<input type="button" value="审核" onClick="compactsh()">

</div>
<!-- 数据表格 -->
<table id="compactAuditTable"></table> 

</body>
</html>