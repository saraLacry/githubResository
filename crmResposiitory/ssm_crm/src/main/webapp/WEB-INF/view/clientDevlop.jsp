<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户发展计划</title>


<!-- 自定义的js -->
<script type="text/javascript" src="js/clientDevlop.js"></script>

	<table id="develop">
	<p/>客户管理》》客户发展计划</table>
	<div id="develop_tool">
		 <!-- Unnamed (下拉列表框) -->
    <div id="u128" class="ax_下拉列表框" style="padding-left: 355px">
      	月份：<input type="text" id="month">
      &nbsp;&nbsp;&nbsp;<a href="#"
			class="easyui-linkbutton" iconCls="icon-search"
			onclick="develop_tool.search();">查询</a>
    </div>

		<div style="margin-bottom: 5px;padding-left: 550px">
			<a href="#" class="easyui-linkbutton" iconCls="icon-add"
				plain="true" onclick="develop_tool.add();">添加</a> <a href="#"
				class="easyui-linkbutton" iconCls="icon-edit" plain="true"
				onclick="develop_tool.edit();">修改</a> <a href="#"
				class="easyui-linkbutton" iconCls="icon-remove" plain="true"
				onclick="develop_tool.remove();">删除</a> <a href="#"
				class="easyui-linkbutton" iconCls="icon-edit" plain="true"
				onclick="develop_tool.query();">查看</a><a href="#"
				class="easyui-linkbutton" iconCls="icon-reload" plain="true"
				onclick="develop_tool.reload();">刷新</a> <a href="#"
				class="easyui-linkbutton" iconCls="icon-redo" plain="true"
				onclick="develop_tool.redo();">取消选择</a>
		</div>
	</div>
	<form id="develop_add"
		style="margin: 0; padding: 5px 0 0 25px; color: #333;">
		<p>
			计划编码：<input type="text" name="developCode" class="textbox"
				style="width: 200px;" />
		</p>
		<p>
			计        划      人：<input type="text" name="planName" class="textbox"
				style="width: 200px;" />
		</p>
		<p>
			计划月份：<input id="developMonth" type="text" name="developMonth" class="textbox"
				style="width: 200px;" />
		</p>
		<p>
			计划内容：<textarea rows="10" cols="48" name="planContent"></textarea>
		</p>
		
	</form>
	<form id="develop_edit"
		style="margin: 0; padding: 5px 0 0 25px; color: #333;">
		<input type="hidden" id="id_edit" name="id_edit" class="textbox"
			style="width: 200px;" />
		<p>
			计划编码：<input type="text" name="developCode_edit" class="textbox"
				style="width: 200px;" />
		</p>
		<p>
			计划人：<input type="text" name="planName_edit" class="textbox"
				style="width: 200px;" />
		</p>
		<p>
			计划月份：<input type="text" id="developMonth_edit" name="developMonth_edit" class="textbox"
				style="width: 200px;" />
		</p>
		<p>
			计划状态：<input type="text" name="planState_edit" class="textbox"
				style="width: 200px;" />
		</p>
		
		<p>
			计划内容：<textarea rows="10" cols="68" name="planContent_edit"></textarea>
		</p>
	</form>
</body>
</html>