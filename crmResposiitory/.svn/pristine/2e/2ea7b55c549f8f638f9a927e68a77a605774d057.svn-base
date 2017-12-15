<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>用户构成统计</title>
        <!--[if IE]>
         <script type="text/javascript" src="../excanvas.js" onload="explorercanvasload"></script>
        <![endif]-->
		<script src="js/Chart.js"></script>
	</head>
	<body>
		<div id="canvas-holder">
			<canvas id="chart-area" width="300" height="300"/>
		</div>


	<script>
	 window.onload = function() {
	 var ctx = document.getElementById("canvas").getContext("2d");
	 ctx.fillRect(10, 10, 20, 20);
 };
		var pieData = [
				{
					value: 50,
					color:"#F7464A",
					highlight: "#FF5A5E",
					label: "Red"
				},
				{
					value: 50,
					color: "#46BFBD",
					highlight: "#5AD3D1",
					label: "Green"
				},

			];

			window.onload = function(){
				var ctx = document.getElementById("chart-area").getContext("2d");
				window.myPie = new Chart(ctx).Pie(pieData);
			};



	</script>
	</body>
</html>
