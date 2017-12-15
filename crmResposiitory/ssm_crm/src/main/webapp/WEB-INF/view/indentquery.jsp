<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<script type="text/javascript" src="js/indentquery.js"></script>
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
			<br>
			<p>
				<select id="likeIndentquery" class="easyui-combobox" name="dept"
					style="width: 100px; height: 26px;">
					<option value="订单号">订单号</option>
					<option value="收货人">收货人</option>
					<option value="商品名称">商品名称</option>
					<option value="商品编号">商品编号</option>
					
				</select> <input type="text" name="sousuoIndentQuery" id="sousuoIndentQuery"
					style="height: 20px; width: 200px">

				&nbsp;&nbsp;&nbsp;&nbsp;
				时间:<input id="ddone" type="text"
					class="easyui-datebox" required="required" style="width: 100px; height: 26px;" > </input> 与：<input
					id="ddTwo" type="text" class="easyui-datebox" required="required" style="width: 100px; height: 26px;" >
				</input> 之间
				&nbsp;&nbsp;&nbsp;&nbsp;状态： <input id="INDEN_TSTATE"
					class="easyui-combobox" name="INDEN_TSTATE"
					data-options="valueField:'id',textField:'text',url:'get_data.php'"
					style="width: 100px; height: 26px;" /> <a href="#"
					class="easyui-linkbutton" iconCls="icon-search"
					onclick="queryIndentQuery();">点击查询</a>
			<div style="border-bottom: 2px solid #ccc;"></div>
			<br>
			<div class="one">客户信息列表</div>
			<div class="two">
				<a href="#" class="easyui-linkbutton" iconCls="icon-search"
					onclick="queryIndentQueryTwo();">查看详情</a>
			</div>
			<br>
			<table id="indentquery"></table>
		</div>

	</div>
</div>

<form id="queryindent"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<input type="hidden" id="id" name="id" class="textbox"
		style="width: 200px">
	<div style="font-size:18px;font-weight: bold;padding-top: 20px">订单其他详细信息</div>
	<table class="tableindent" >
		<tr>
			<td colspan="2"><span>》》》》》》》》》》》》》》》》》》》》》》》《《《《《《《《《《《《《《《《《《《《《《《</span></td>
		</tr>
		<tr>
			<td>订单类型/订单号：<span id="indentnumber"></span></td>
			<td>收货人：<span id="clientresourceid"></span></td>
		</tr>
		<tr>
			<td>商品：<span id="goods"></span></td>
			<td>状态：<span id="indentstate"></span></td>
		</tr>
		<tr>
			<td>支付方式：<span id="paymentid"></span></td>
			<td>配送方式：<span id="indentdelivery"></span></td>
		</tr>
		<tr>
			<td>下单时间：<span id="indenttime"></span></td>
			<td>订单负责人：<span id="indentuserId"></span></td>
		</tr>
		<!-- <tr>
			<td colspan="2"><span>》》》》》》》》》》》》》》》》》《《《《《《《《《《《《《《《《《</span></td>
		</tr> -->
	</table>
	<div id="app"></div>
	<!-- <div style="font-size:18px;font-weight: bold;padding-top: 20px">订单商品详细信息</div>
	<table class="tableindent">
		<tr>
			<td colspan="2"><span>》》》》》》》》》》》》》》》》》《《《《《《《《《《《《《《《《《</span></td>
		</tr>
		<tr>
			<td colspan="2">商品名：<span id="indentQuerygoodsName"></span></td>
		</tr>
		<tr>
			<td>价格：<span id="indentQueryindentGoodsMoney"></span></td>
			<td>购买数量：<span id="indentQueryindentGoodsNumber"></span></td>
		</tr>
		<tr>
			<td colspan="2"><span>》》》》》》》》》》》》》》》》》《《《《《《《《《《《《《《《《《</span></td>
		</tr>
	</table> -->
</form>

