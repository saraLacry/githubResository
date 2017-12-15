<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<script type="text/javascript" src="js/indentstatistics.js"></script>
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
	font-size: 14px;
	width: 700px;
}

.tableindent td {
font-weight: bold;
	width: 350px;
} 
.tableindent td span{
	color:green;
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
</style>

<div id="tabs">
	<div title="返回列表"
		style="padding: 0 10px; display: block; background: #F3F3F3;">
		<br>

		<div class="content">
			<div style="font-size: 12px;">订单管理 >> 代下订单</div>
			<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			时间：<input id="data1" type="text" class="easyui-datebox"
				required="required"> </input> 
			&nbsp;&nbsp;与&nbsp;&nbsp; 
			<input id="data2" type="text" class="easyui-datebox" required="required" onchange="data2change()"> </input> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="#" class="easyui-linkbutton" iconCls="icon-search"
				onclick="statisticeQuery()">点击查询</a>
			<br>
			<br>
			<div style="border-bottom: 2px solid #ccc;"></div>
			<br>
			<div class="one">客户信息列表</div>
			<div class="two">
				<a href="#" class="easyui-linkbutton" iconCls="icon-search"
					onclick="statisticeQueryTwo()">查看详情</a>
			</div>
			<br>
			<table id="indentstatisticstable"></table>
		</div>

	</div>
</div>
<form id="indentstatisticsXiangqin"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<input type="hidden" id="id" name="id" class="textbox"
		style="width: 200px">
		<div id="p" class="easyui-progressbar" data-options="value:60" style="width:400px;"></div>
	<table class="tableindent">
		<tr>
			<td>月份：<span id="data"></span></td>
			<td>订单数量：<span id="count"></span></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td>总金额(万元)：<span id="allMoney"></span></td>
			<td>本月目标(万元)：<span id="mMoney"></span>万</td>
		</tr>
		<tr>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td>完成率：<span id="sss"></span>%</td>
			<td></td>
		</tr>
	</table>
	<br>
</form>