<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<script type="text/javascript" src="js/replaceindent.js">
	$('#manager_querytotal').dialog('open');
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
	padding-left: 80px;
}

.tableindentTwo td {
	width: 350px;
}
.tableindentTwo td span{
	color:green;
}
.td1 {
	padding-top: 10px;
	
}

.td2 {
	padding-left: 60px;
	color: green;
}
.tablesss{
	border: 1px;
}
.tablesss tr {
	font-size: 14px;
}

.jesu p {
	padding-left: 20px;
}

span {
	/* color:green;  */
	font-weight: bold;
}
</style>

<div id="tabs">
	<div
		style="padding: 0 10px; display: block; background: #F3F3F3;">
		<br>

		<div class="content">
			<div style="font-size: 12px;">订单管理>> 代下订单</div>
			<br>
			<p>
				<select id="way" class="easyui-combobox" name="way"
					style="width: 100px; height: 26px;">
					<option value="客户姓名">客户姓名</option>
					<option value="联系电话">联系电话</option>
				</select> <input type="text" name="sousuo" id="sousuo"
					style="height: 20px; width: 200px;"> <a href="#"
					class="easyui-linkbutton" iconCls="icon-search"
					onclick="queryreplace();">点击查询</a>
			<div style="border-bottom: 2px solid #ccc;"></div>
			<br>
			<div class="one">客户信息列表</div>
			<div class="two">
				<a href="#" class="easyui-linkbutton" iconCls="icon-search"
					onclick="queryreplaceTwo()">详情</a>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <div class="easyui-linkbutton"
					iconCls="icon-ok" onclick="nextOne();">下单</div>
			</div>
			<br>
			<table id="replaceindent"></table>
		</div>

	</div>
</div>

<form id="manager_queryTwo"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<input type="hidden" id="id" name="id" class="textbox"
		style="width: 200px">
	<div style="font-size:18px;font-weight: bold;padding-top: 20px">客户其他详细信息</div>
	<table class="tableindent">
		<tr>
			<td colspan="2"><span>》》》》》》》》》》》》》》》》》》》》》》》《《《《《《《《《《《《《《《《《《《《《《《</span></td>
		</tr>
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
			<td>地址：<span id="adress"></span></td>
		</tr>
		<tr>
			<td>客户生日：<span id="clientBrithday"></span></td>
			<td>客户状态：<span id="clientState"></span></td>
		</tr>
		<tr>
			<td>电子邮件：<span id="email"></span></td>
			<td>备注：<span id="remark"></span></td>
		</tr>
		
	</table>
	<div style="font-size:18px;font-weight: bold;padding-top: 20px">消费信息</div>
	<table class="tableindent">
		<tr>
			<td>已消费次数：<span id="num"></span></td>
			</td>
			<td>服务代表：<span id="userId"></span></td>
		</tr>
		<tr>
			<td colspan="2"><span>》》》》》》》》》》》》》》》》》》》》》》》《《《《《《《《《《《《《《《《《《《《《《《</span></td>
		</tr>
	</table>
</form>
<form id="manager_queryThere"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<div id="tabs">
		<div 
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
						<!-- <td>消费总额：<span id="money"></span></td> -->
					</tr>
				</table>
				<br>
				<div style="border-bottom: 2px solid #ccc;"></div>

				<br>
				<div class="one">可选购商品信息列表</div>
				<br> <br> <br>
				<table id="manager_querytable"></table>
			</div>

		</div>
	</div>
</form>

<form id="manager_querytotal"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<div id="tabs">
		<div 
			style="padding: 0 10px; display: block; background: #F3F3F3;">
			<br>

			<div class="contentTwo">
				<div style="font-size: 12px;">订单管理>> 代下订单 >>订单结算</div>
				<br>
				<table class="tablesss">
					<tr>
						<td class="td1">填写并核对订单信息</td>
					</tr>
					<tr>
						<td class="td1">收货人信息</td>
						<td><input type="button" id="sub" onclick="udpateOne();"
							value="修改"></td>
					</tr>
					<tr>	
						<td class="td2">
						姓名： <span id="name"><span id="clientNameThere"></span></span>
						</td>
					</tr>
					<tr>
						<td class="td2">
						联系电话：<span id="phone"><span id="workPhoneThere"></span></span>
						 </td>
					</tr>
					<tr>
						<td class="td2">
						地点：<span id="address"><span id="adressThere"></span></span>
						</td>
					</tr>
					<tr>
						<td class="td1">支付及配送方式</td>
					</tr>
					<tr>
						<td class="td2">支付方式：<select id="pay" class="easyui-combobox"
							name="pay" style="width: 100px; height: 26px;">
								<option value="线上支付">线上支付</option>
								<option value="线下支付">线下支付</option>
						</select>
						</td>
					</tr>
					<tr>
						<td class="td2">配送方式：<select id="delivery" class="easyui-combobox" name="pay"
							style="width: 100px; height: 26px;">
								<option value="邮寄">邮寄</option>
								<option value="自取">自取</option>
						</select>
						</td>
					</tr>
					<!-- <tr>
						<td class="td1">发票信息</td>
						<td><input type="button" onclick="indent_tool.udpateThere();"
							value="修改"></td>

					</tr>
					<tr>
						<td class="td2">公司 明细</td>
					</tr> -->
					<tr>
						<td class="td1">商品清单</td>
						<td><input type="button" onclick="fanhui();"
							value="返回"></td>
					</tr>
					<tr>
						<td class="jesu">
							<table id="manager_querytotaltable"></table>
							<p>
								<span id="suml"></span>件商品，总商品金额： ￥<span id="allmoneyOne" style="color:red"></span>万元
							</p>
							<p>
								运费： ￥<span id="yunfei" style="color:red"></span>万元
							</p>
							<p>
								应付总额：￥<span id="allmoneyTwo" style="color:red"></span>万元
							</p>
						</td>
					</tr>
					<tr>
						<td style="font-size: 18px;"><p style="padding-left: 260px;">
								应付总额： ￥<span id="allmoneyThere" style="color:red"></span>万元 </td>
					</tr>
				</table>
			</div>

		</div>
	</div>
</form>