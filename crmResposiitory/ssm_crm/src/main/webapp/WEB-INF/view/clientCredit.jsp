<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<script type="text/javascript" src="js/clientCredit.js">
	
</script>
<style type="text/css">
.one {
	float: left;
	font-size: 12px;
	padding-top: 6px;
}

.two {
	padding-left: 600px;
}

.content {
	padding: 10px 35px;
}

p {
	padding-left: 60px;
}

.tableindent {
	padding: 20px;
	font-size: 16px;
	width: 500px;
	height: 300px;
}

.tableindent td {
	width: 350px;
}

.contentTwo {
	padding: 10px 35px;
}

.tableindentTwo {
	padding-left: 120px;
}

.tableindentTwo td {
	width: 350px;
}

.td1 {
	padding-top: 16px;
	font-weight: bold;
}

.td2 {
	padding-left: 60px;
	color: green;
}
/* .td3{
	padding-left:600px;
} */
.tablesss{
	border: 1px;
}
.tablesss tr {
	font-size: 14px;
}

.jesu p {
	padding-left: 350px;
}

span {
	/* color:red; */
	font-weight: bold;
}
</style>

<div id="tabs">
	<div title="返回列表"
		style="padding: 0 10px; display: block; background: #F3F3F3;">
		<br>

		<div class="content">
			<div style="font-size: 12px;">客户管理>> 客户信誉管理</div>
			<br>
			<p>
					客户姓名: <input type="text" name="sousuo" id="sousuo"
					style="height: 20px; width: 200px;"> 
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;<a href="#"
					class="easyui-linkbutton" iconCls="icon-search"
					onclick="indent_tool.query();">点击查询</a>
			<div style="border-bottom: 2px solid #ccc;"></div>
			<br>
			<div class="one">客户信息列表</div>
			<div class="two">
				<a href="#" class="easyui-linkbutton" iconCls="icon-search"
					onclick="indent_tool.queryTwo();">查看详情</a>
				
			</div>
			<br>
			<table id="credit"></table>
		</div>

	</div>
</div>

<form id="credit_queryTwo"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<input type="hidden" id="id" name="id" class="textbox"
		style="width: 200px">
	<table class="tableindent">
		<tr>
			<td>客户姓名：<span id="clientName"></span>
			</td>
			<td>性别：<span id="clientSex"></span>
			</td>
		</tr>
		<tr>
			<td>客户类型：<span id="clientType"></span></td>
			<td>客户编号：<span id="clientCode"></span></td>
		</tr>
		<tr>
			<td>联系电话：<span id="workPhone"></span></td>
			<td>服务代表：<span id="userId"></span></td>
		</tr>
		<tr>
			<td>已消费次数：<span id="num"></span></td>
			<td>客户状态：<span id="clientState"></span></td>
		</tr>
		<tr>
			<td>电子邮件：<span id="email"></span></td>
			<td>信誉等级：<span id="grade">A</span></td>
		</tr>
	</table>
</form>
<form id="credit_queryThere"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<div id="tabs">
		<div title="返回列表"
			style="padding: 0 10px; display: block; background: #F3F3F3;">
			<br>

			<div class="contentTwo">
				<div style="font-size: 12px;">订单管理>> 代下订单 >>下单操作</div>
				<br>
				<table class="tableindentTwo">
					<tr>
						<td>客户姓名：<span id="clientNameTwo"></span>
						</td>
						<td>性别：<span id="clientSexTwo"></span></td>
					</tr>
					<tr>
						<td>客户类型：<span id="clientTypeTwo"></span></td>
						<td>客户状态：<span id="clientStateTwo"></span></td>
					</tr>
					<tr>
						<td>联系电话：<span id="workPhoneTwo"></span></td>
						<td>服务代表：<span id="userIdTwo"></span></td>
					</tr>
					<tr>
						<td>已消费次数：<span id="numTwo"></span></td>
						<td>信誉等级：<span id="grade">A</span></td>
					</tr>
				</table>
				<br>
				<div style="border-bottom: 2px solid #ccc;"></div>

				<br>
				<div class="one">可选购商品信息列表</div>
				<br> <br> <br>
				<table id="credit_querytable"></table>
			</div>

		</div>
	</div>
</form>

