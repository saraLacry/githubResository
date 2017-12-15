<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<script type="text/javascript" src="js/clientCare.js">
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

		<div class="content" id="care_tool">
			<div style="font-size: 12px;">客户管理>> 客户满意度管理</div>
			<br>
			<p>
				客户姓名： <input type="text" name="sousuo_2" id="sousuo_2"
					style="height: 20px; width: 200px;">
				&nbsp;&nbsp;&nbsp; 分配状态：<select id="shareState_1" class="text_sketch">
       			</select>  <a href="#" class="easyui-linkbutton"
					iconCls="icon-search" onclick="care_tool.search();">点击查询</a>
			<div style="border-bottom: 2px solid #ccc;"></div>
			<br>
			<div class="one">客户满意度信息列表</div>
			
			<div style="margin-bottom: 5px; padding-left: 550px">
				<a href="#" class="easyui-linkbutton" iconCls="icon-add"
					plain="true" onclick="care_tool.query();">设置提醒</a> <a href="#"
					class="easyui-linkbutton" iconCls="icon-edit" plain="true"
					onclick="scheme_tool.query();">关怀详情</a>
			</div>
			<br>
			
		</div>
		<table id="care"></table>

	</div>
</div>

 
<form id="total_edit"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<input type="hidden" id="id_edit" name="id_edit" class="textbox"
		style="width: 200px">
	<input type="hidden" name="clientId_edit" class="textbox"
		style="width: 200px">
	<input type="hidden" name="indentid_edit" class="textbox"
		style="width: 200px">
	
	<table class="tableindent">
		<tr>
			<td>客户姓名：<span id="clientName_edit"></span>
			</td>
			<td>客户性别：<span id="clientSex_edit"></span></td>
		</tr>
		<tr>
			<td>客户类型：<span id="clientType_edit"></span></td>
			<td>客户状态：<span id="clientState_edit"></span></td>
		</tr>
		<tr>
			
			<td>客户生日：<span id="clientBrithday_edit"></span></td>
			<td>质量满意度：<span id="qualitySatisfied_edit"></span></td>
		</tr>
		<tr>
			<td>信誉等级：<span id="priceSatisfied_edit"></span>
			</td>
			<td>价值等级：<span id="num_edit"></span>
			</td>
		</tr>
	</table>
	<table id="care_edit_tool">
		<p>关怀提醒信息列表</p>
	</table>
	<div id="total_edit_tool">
	<div style="margin-bottom: 5px;padding-left: 470px;">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add"
			plain="true" onclick="care_tool.add();">添加</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="care_tool.edit();">修改</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			onclick="care_tool.remove();">删除</a><a href="#"
			class="easyui-linkbutton" iconCls="icon-redo" plain="true"
			onclick="care_tool.back();">返回</a>
		</div>
	</div>
	
</form>

<form id="total_edit2"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<input type="hidden" id="id_edit" name="id_edit" class="textbox"
		style="width: 200px">
	<input type="hidden" name="clientId_edit" class="textbox"
		style="width: 200px">
	<input type="hidden" name="indentid_edit" class="textbox"
		style="width: 200px">
	
	<table class="tableindent">
		<tr>
			<td>客户姓名：<span id="clientName_edit2"></span>
			</td>
			<td>客户性别：<span id="clientSex_edit2"></span></td>
		</tr>
		<tr>
			<td>客户类型：<span id="clientType_edit2"></span></td>
			<td>客户状态：<span id="clientState_edit2"></span></td>
		</tr>
		<tr>
			<td>价值等级：<span id="sumSatisfied_edit2"></span>
			</td>
			<td>质量满意度：<span id="qualitySatisfied_edit2"></span></td>
		</tr>
		<tr>
			<td>信誉等级：<span id="priceSatisfied_edit2"></span>
			</td>
			<td>建议方案<span id="num_edit2"></span></td>
		</tr>
		<tr>
			<td>可选方案：A、B、C、D</td>
		</tr>
	</table>
	<table id="care_edit_tool2">
		<p>关怀记录详细列表</p>
	</table>
	<div id="total_edit_tool2">
		<div style="margin-bottom: 5px;padding-left: 470px;">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add"
			plain="true" onclick="scheme_tool.add();">添加</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="scheme_tool.edit();">修改</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			onclick="scheme_tool.remove();">删除</a><a href="#"
			class="easyui-linkbutton" iconCls="icon-redo" plain="true"
			onclick="scheme_tool.back();">返回</a>
		</div>
	</div>
	
</form>

	<form id="care_add"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<input type="hidden" id="id" name="id" class="textbox"
		style="width: 200px">
	<table class="tableindent">
		<tr>
			<td>提醒名称：<input type="text" id="remindName" name="remindName" class="textbox">
			</td>
		</tr>
		<tr>
			<td>提醒时间：<input type="text" id="remindTime" name="remindTime" class="textbox">
			
		</tr>
		<tr>
			<td>提醒类型：<select id="remindType" name="remindType" class="textbox"></select></td>
		</tr>
		<tr>
			<td>提醒周期：<input type="checkbox" id="remindDay" name="remindDay" value="周一" checked="checked">周一
						<input type="checkbox" id="remindDay" name="remindDay" value="周二" class="textbox">周二
						<input type="checkbox" id="remindDay" name="remindDay" value="周三" class="textbox">周三
						<input type="checkbox" id="remindDay" name="remindDay" value="周四" class="textbox">周四
						<input type="checkbox" id="remindDay" name="remindDay" value="周五" class="textbox">周五
						<input type="checkbox" id="remindDay" name="remindDay" value="周六" class="textbox">周六
						<input type="checkbox" id="remindDay" name="remindDay" value="周日" class="textbox">周日
			</td>
		</tr>
		<tr>
			<td>提醒频率：<select id="remindRate" name="remindRate" class="textbox">
						<option value="5分钟/次" class="textbox">5分钟
						<option value="10分钟/次" class="textbox">10分钟
						<option value="30分钟/次" class="textbox">30分钟
						<option value="60分钟/次" class="textbox">60分钟
			</select>
			</td>
		</tr>
		
		<tr>
			<td colspan="2" style="text-align: top">
			备注信息：<textarea rows="10" cols="50" id="remark" name="remark" class="textbox"></textarea>
			</td>
		</tr>
	</table>
</form>
<form id="care_edit"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<input type="hidden" id="id_edit" name="id_edit" class="textbox"
		style="width: 200px">
	<table class="tableindent">
		<tr>
			<td>提醒名称：<input type="text" id="remindName_edit" name="remindName_edit" class="textbox">
			</td>
		</tr>
		<tr>
			<td>提醒时间：<input type="text" id="remindTime_edit" name="remindTime_edit" class="textbox">
			
		</tr>
		<tr>
			<td>提醒类型：<select id="remindType_edit" name="remindType_edit" class="textbox">
				<option></option>
			</select></td>
		</tr>
		<tr>
			<td>提醒周期：<input type="checkbox" id="remindDay_edit" name="remindDay_edit" value="周一" class="textbox">周一
						<input type="checkbox" id="remindDay_edit" name="remindDay_edit" value="周二" class="textbox">周二
						<input type="checkbox" id="remindDay_edit" name="remindDay_edit" value="周三" class="textbox">周三
						<input type="checkbox" id="remindDay_edit" name="remindDay_edit" value="周四" class="textbox">周四
						<input type="checkbox" id="remindDay_edit" name="remindDay_edit" value="周五" class="textbox">周五
						<input type="checkbox" id="remindDay_edit" name="remindDay_edit" value="周六" class="textbox">周六
						<input type="checkbox" id="remindDay_edit" name="remindDay_edit" value="周日" class="textbox">周日
			</td>
		</tr>
		<tr>
			<td>提醒频率：<select id="remindRate_edit" name="remindRate_edit" class="textbox">
						<option value="5分钟" class="textbox">5分钟
						<option value="10分钟" class="textbox">10分钟
						<option value="30分钟" class="textbox">30分钟
						<option value="60分钟" class="textbox">60分钟
			</select>
			</td>
		</tr>
		
		<tr>
			<td colspan="2" style="text-align: top">
			备注信息：<textarea rows="10" cols="50" id="remark_edit" name="remark_edit"></textarea>
			</td>
		</tr>
	</table>
	
</form>

<form id="scheme_add"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<input type="hidden" id="id" name="id" class="textbox"
		style="width: 200px">
	<table class="tableindent">
		<tr>
			<td>方案名称：<input type="text" id="remindNames" 
			name="remindNames" class="textbox">
			</td>
		</tr>
		<tr>
			<td>执行时间：<input type="text" id="executedate"
			name="executedate" class="textbox">
			
		</tr>
		<tr>
			<td>执行方案：<select id="executeScheme"
			name="executeScheme" class="textbox">
			</select>
			</td>
		</tr>
		<tr>
			<td colspan="2" style="text-align: top">
			备注信息：<textarea rows="10" cols="50" id="remark" 
			name="remarks" class="textbox"></textarea>
			</td>
		</tr>
	</table>
</form>
<form id="scheme_edit"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<input type="hidden" id="id_edit2" name="id_edit2" class="textbox"
		style="width: 200px">
	<table class="tableindent">
		<tr>
			<td>方案名称：<input type="text" id="remindNames_edit" 
			name="remindNames_edit" class="textbox">
			</td>
		</tr>
		<tr>
			<td>执行时间：<input type="text" id="executedate_edit"
			name="executedate_edit" class="textbox">
			
		</tr>
		<tr>
			<td>执行方案：<input type="text" id="executeScheme_edit"
			name="executeScheme_edit" class="textbox"></td>
		</tr>
		<tr>
			<td>执行结果：<input type="text" id="executeResult_edit"
			name="executeResult_edit" class="textbox">
			</td>
		</tr>
		
		<tr>
			<td colspan="2" style="text-align: top">
			备注信息：<textarea rows="10" cols="50" id="remark_edit" 
			name="remarks_edit" class="textbox"></textarea>
			</td>
		</tr>
	</table>
</form>
