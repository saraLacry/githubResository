<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户服务统计</title>
</head>
<body>
	统计分析>> 客户服务统计
	<center>
		查询时间:<input  id="start"  type= "text" class= "easyui-datebox" required ="required"> </input>   
		——<input  id="end"  type= "text" class= "easyui-datebox" required ="required"> </input>  
		 <input type="button" value="查询">
	</center>
	<hr>
	<table id="statisticsServiceFormTable"></table>
	  <script type="text/javascript" src="js/statisticsServiceForm.js"></script>
		
</body>
</html>