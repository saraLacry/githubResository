<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户资源管理</title>


<!-- 自定义的js -->
<script type="text/javascript" src="js/clientResource.js"></script>

	<table id="resource">
	<p/>客户管理》》客户资源管理</table>
	<div id="resource_tool">
		 <!-- Unnamed (下拉列表框) -->
    <div id="u128" class="ax_下拉列表框" style="padding-left: 305px">
      <select id="chaxun" class="text_sketch">
      	<option selected="selected" value=""></option>
        <option value="客户姓名">客户姓名</option>
        <option value="联系电话">联系电话</option>
      </select>&nbsp;&nbsp;&nbsp;
        <input type="text" id="valu" name="valu" class="textbox"
				style="width: 200px;height: 20px;" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;分配状态：
     
       <select id="shareState" class="text_sketch">
       </select>
      &nbsp;&nbsp;&nbsp;<a href="#"
			class="easyui-linkbutton" iconCls="icon-search"
			onclick="resource_tool.search();">搜  索</a>
    </div>

		<div style="margin-bottom: 5px;padding-left: 550px">
			<a href="#" class="easyui-linkbutton" iconCls="icon-add"
				plain="true" onclick="resource_tool.add();">添加</a> <a href="#"
				class="easyui-linkbutton" iconCls="icon-edit" plain="true"
				onclick="resource_tool.edit();">修改</a> <a href="#"
				class="easyui-linkbutton" iconCls="icon-remove" plain="true"
				onclick="resource_tool.query();">查看</a><a href="#"
				class="easyui-linkbutton" iconCls="icon-reload" plain="true"
				onclick="resource_tool.share();">分配</a> <a href="#"
				class="easyui-linkbutton" iconCls="icon-reload" plain="true"
				onclick="resource_tool.reload();">刷新</a> <a href="#"
				class="easyui-linkbutton" iconCls="icon-redo" plain="true"
				onclick="resource_tool.redo();">取消选择</a>
		</div>
	</div>
	<form id="resource_add"
		style="margin: 0; padding: 5px 0 0 25px; color: #333;">
		<p>
			客户编码：<input type="text" name="clientCode" class="textbox"
				style="width: 200px;" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			客户姓名：<input type="text" name="clientName" class="textbox"
				style="width: 200px;" />
		</p>
		
		<p>
			客户性别：<input type="radio" name="clientSex" class="textbox"
				style="width: 80px;" value="男" checked="checked"/>男 
				<input type="radio" name="clientSex" class="textbox"
				style="width: 80px;" value="女"/>女
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			客户生日：<input id="clientBrithday" type="text" name="clientBrithday"
					class="easyui-datebox" required="required" style="width: 100px; height: 26px;" />
				
		</p>
		
		<p>
			客户类型：
				<select name="clientType" id="clientType" style="width: 100px">
					<option value="">
				</select>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;
			客户状态：
				<select id="clientState" name="clientState" style="width: 100px">
					<option>
				</select>
		</p>
		
		<p>
			手   机   号：<input type="text" name="clientPhone" class="textbox"
				style="width: 200px;" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			办公电话：<input type="text" name="workPhone" class="textbox"
			style="width: 200px;" />
		</p>
		
		<p>
			电子邮箱：<input type="text" name="email" class="textbox"
				style="width: 200px;" />
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			家庭电话：<input type="text" name="familyPhone" class="textbox"
				style="width: 200px;" />
		</p>
		
		<p>
			联系地址：<textarea rows="10" cols="68" name="adress"></textarea>
		</p>
		<p>
			备注信息：<textarea rows="10" cols="68" name="remark"></textarea>
		</p>
	</form>
	
	<form id="resource_edit"
		style="margin: 0; padding: 5px 0 0 25px; color: #333;">
		<input type="hidden" name="id_edit" class="textbox"
			style="width: 200px;" />
		<p>
			客户编码：<input type="text" name="clientCode_edit" class="textbox"
				style="width: 200px;" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			客户姓名：<input type="text" name="clientName_edit" class="textbox"
				style="width: 200px;" />
		</p>
		
		<p>
			客户性别：<input type="radio" name="clientSex_edit" class="textbox"
				style="width: 80px;" checked="checked" value="男"/>男 
				<input type="radio" name="clientSex_edit" class="textbox"
				style="width: 80px;" value="女"/>女
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			客户生日：<input id="clientBrithday_edit" type="text" name="clientBrithday_edit"
					class="easyui-datebox" required="required" style="width: 100px; height: 26px;" />
		</p>
		
		<p>
			客户类型：
				<select id="clientType_edit" name="clientType_edit" style="width: 100px">
					<option name="clientType_edit">
				</select>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;
			客户状态：
				<select id="clientState_edit" name="clientState_edit" style="width: 100px">
					<option name="clientState_edit">
				</select>
		</p>
		
		<p>
			手   机   号：<input type="text" name="clientPhone_edit" class="textbox"
				style="width: 200px;" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			办公电话：<input type="text" name="workPhone_edit" class="textbox"
			style="width: 200px;" />
		</p>
		
		<p>
			电子邮箱：<input type="text" name="email_edit" class="textbox"
				style="width: 200px;" />
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			家庭电话：<input type="text" name="familyPhone_edit" class="textbox"
				style="width: 200px;" />
		</p>
		<p>
			联系地址：<textarea rows="10" cols="68" name="adress_edit"></textarea>
		</p>
		<p>
			备注信息：<textarea rows="10" cols="68" name="remark_edit"></textarea>
		</p>
	</form>
	
	<form id="resource_share"
		style="margin: 0; padding: 5px 0 0 25px; color: #333;">
		<input type="hidden" name="id_share" class="textbox"
			style="width: 200px;" />
		<p>   
			客户编码：<input type="text" name="clientCode_share" class="textbox"
				style="width: 200px;" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			客户姓名：<input type="text" name="clientName_share" class="textbox"
				style="width: 200px;" />
		</p>
		
		<p>
			客户性别：<input type="radio" name="clientSex_share" class="textbox"
				style="width: 80px;" checked="checked" value="男"/>男 
				<input type="radio" name="clientSex_share" class="textbox"
				style="width: 80px;" value="女"/>女
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			客户生日：<input type="text" name="clientBrithday_share" class="textbox"
				style="width: 200px;" />
		</p>
		
		<p>
			客户类型：
				<select id="clientType_share" name="clientType_share" style="width: 100px">
					<option name="clientType_share">
				</select>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;
			客户状态：
				<select id="clientState_share" name="clientState_share" style="width: 100px">
					<option name="clientState_share">
				</select>
		</p>
		
		<p>
			手   机   号：<input type="text" name="clientPhone_share" class="textbox"
				style="width: 200px;" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			办公电话：<input type="text" name="workPhone_share" class="textbox"
			style="width: 200px;" />
		</p>
		
		<p>
			电子邮箱：<input type="text" name="email_share" class="textbox"
				style="width: 200px;" />
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			家庭电话：<input type="text" name="familyPhone_share" class="textbox"
				style="width: 200px;" />
		</p>
		
		<p>
			分配给：<select id="userName_share" name="userName_share" style="width: 100px">
					<option name="userName_share"/>
				</select>
		</p>
		</form>
	
	
</body>
</html>