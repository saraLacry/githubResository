<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户流失统计</title>
</head>
<body>
	统计分析>> 客户流失统计
	<center>
		月份:<input  id="statistcsdd"  type= "text" class= "easyui-datebox" required ="required"> </input> 
		 <input type="button" value="查询" onclick="statiscsInquire()"> 
	</center>
	<hr>
	<table id="statiscsAwayFormTabe"></table>
	<script type="text/javascript" src="js/statiscsAwayForm.js"></script>
</body>
</html>