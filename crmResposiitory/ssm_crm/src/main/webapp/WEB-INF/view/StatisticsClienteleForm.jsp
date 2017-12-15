<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户构成统计</title>
</head>
<body>
	统计分析>> 客户构成统计
	<center>
	月份：<input  id="from"  type= "text" class= "easyui-datebox" required ="required"> </input>   
		 
		 <input type="button" value="查询"/>
	</center>
	<hr>
	<table id="statisticsClienteleFormTable"></table>
	  <script type="text/javascript" src="js/statisticsClienteleForm.js"></script>
</body>
</html>