<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<script type="text/javascript" src="js/clientSatisfied.js">
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
	width: 700px;
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
.tablesss {
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

		<div class="content" id="satisfied_tool">
			<div style="font-size: 12px;">客户管理>> 客户满意度管理</div>
			<br>
			<p>
				客户姓名： <input type="text" name="sousuo_1" id="sousuo_1"
					style="height: 20px; width: 200px;">
				&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton"
					iconCls="icon-search" onclick="satisfied_tool.search();">点击查询</a>
			<div style="border-bottom: 2px solid #ccc;"></div>
			<br>
			<div class="one">客户满意度信息列表</div>
			<div style="margin-bottom: 5px; padding-left: 550px">
				<a href="#" class="easyui-linkbutton" iconCls="icon-add"
					plain="true" onclick="satisfied_tool.add();">添加</a> <a href="#"
					class="easyui-linkbutton" iconCls="icon-edit" plain="true"
					onclick="satisfied_tool.edit();">修改</a> <a href="#"
					class="easyui-linkbutton" iconCls="icon-remove" plain="true"
					onclick="satisfied_tool.remove();">删除</a> <a href="#"
					class="easyui-linkbutton" iconCls="icon-edit" plain="true"
					onclick="satisfied_tool.query();">查看</a><a href="#"
					class="easyui-linkbutton" iconCls="icon-reload" plain="true"
					onclick="satisfied_tool.reload();">刷新</a> <a href="#"
					class="easyui-linkbutton" iconCls="icon-redo" plain="true"
					onclick="satisfied_tool.redo();">取消选择</a>
			</div>
			<br>
			
		</div>
		<table id="satisfied"></table>

	</div>
</div>

 <form id="satisfied_add"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<input type="hidden" id="id" name="id" class="textbox"
		style="width: 200px">
	<input type="hidden" name="clientId" class="textbox"
		style="width: 200px">
	<input type="hidden" name="indentid" class="textbox"
		style="width: 200px">
	<table class="tableindent">
		<!-- <tr>
			<td>客户编码：<span id="clientCode"></span>
			</td>
			<td>客户姓名：<span id="clientName"></span>
			</td>
		</tr>
		<tr>
			<td>客户性别：<span id="clientSex"></span>
			
			<td>客户类型：<span id="clientType"></span></td>
		</tr>
		<tr>
			<td>客户状态：<span id="clientState"></span></td>
			<td>已消费次数：<span id="num"></span></td>
		</tr> -->
		<tr>
			<td>质量满意度：<input id="qualitySatisfied" name="qualitySatisfied">
			</td>
			<td>服务满意度：<input id="serveSatisfied" name="serveSatisfied">
			</td>
		</tr>
		<tr>
			<td>性比价满意度：<input id="priceSatisfied" name="priceSatisfied">
			</td>
			<td>总体满意度：<input id="sumSatisfied" name="sumSatisfied">
			</td>
		</tr>
		<tr>
			<td colspan="2" style="text-align: top">客户反馈：<textarea rows="10" cols="50" id="clientFeedback" name="clientFeedback"></textarea>
			</td>
		</tr>
	</table>
</form>
<form id="satisfied_edit"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<input type="hidden" id="id_edit" name="id_edit" class="textbox"
		style="width: 200px">
	<input type="hidden" name="clientId_edit" class="textbox"
		style="width: 200px">
	<input type="hidden" name="indentid_edit" class="textbox"
		style="width: 200px">
	<table class="tableindent">
		<tr>
			<td>客户编码：<span id="clientCode_edit" name="clientCode_edit"></span>
			</td>
			<td>客户姓名：<span id="clientName_edit"></span>
			</td>
		</tr>
		<tr>
			<td>客户性别：<span id="clientSex_edit"></span>
			
			<td>客户类型：<span id="clientType_edit"></span></td>
		</tr>
		<tr>
			<td>客户状态：<span id="clientState_edit"></span></td>
			<td>已消费次数：<span id="num_edit"></span></td>
		</tr>
		<tr>
			<td>质量满意度：<input id="qualitySatisfied_edit" name="qualitySatisfied_edit">
			</td>
			<td>服务满意度：<input id="serveSatisfied_edit" name="serveSatisfied_edit">
			</td>
		</tr>
		<tr>
			<td>性比价满意度：<input id="priceSatisfied_edit" name="priceSatisfied_edit">
			</td>
			<td>总体满意度：<input id="sumSatisfied_edit" name="sumSatisfied_edit">
			</td>
		</tr>
		<tr>
			<td colspan="2" style="text-align: top">客户反馈：<textarea rows="10" cols="50" id="clientFeedback_edit" name="clientFeedback_edit"></textarea>
			</td>
		</tr>
	</table>
</form>
