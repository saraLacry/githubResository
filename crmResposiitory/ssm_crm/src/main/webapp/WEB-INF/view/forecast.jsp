<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<div style="padding: 0 0 0 300px; color: #333;" id="forecastDiv">
	<c:choose>
		<c:when test=""></c:when>
	</c:choose>
<!-- 	<a id="btn" href="#" class="easyui-linkbutton" -->
<!-- 		data-options="iconCls:'icon-add'" onclick="forecastAddItem()">预测</a>&nbsp;&nbsp;&nbsp;&nbsp; -->

	<a id="btn" href="#" class="easyui-linkbutton"
		data-options="iconCls:'icon-search'" onclick="forecastQuery()">查看</a>&nbsp;&nbsp;&nbsp;&nbsp;

	联系人:<input id="forecast" type=text class="easyui-validatebox"
		required="required" /><a id="forecastaid" href="#"
		class="easyui-linkbutton" iconCls="icon-search" onclick="oldSelect()">查询</a>
</div>
<table id="forecastManager">
</table>
<div id="forecastVote"></div>

<script type="text/javascript">
	function forecastQuery() {
		var select = $("#forecastManager").datagrid("getSelected");
		if (select != null) {
			$('#forecastVote').dialog({
				title : '查看联系人',
				width : 800,
				height : 600,
				inline : true,
				href : 'forecastQuery?id=' + select.id,
				modal : true,
				buttons : [ {
					text : '关闭',
					iconCls : 'icon-no',
					handler : function() {
						$('#forecastVote').window('close');
					},
				} ],

			});
		} else {
			alert("请选择一行数据")
		}
	}

	function forecastAddItem() {
		$('#forecastVote').dialog({
			title : '添加联系人',
			width : 800,
			height : 600,
			inline : true,
			href : 'forecastInsert',
			modal : true,
			buttons : [ {
				text : '关闭',
				iconCls : 'icon-no',
				handler : function() {
					$('#forecastVote').window('close');
				},
			} ],

		});
	}

	$(function() {
		$("#forecastManager").datagrid({
			fit : true,
			url : 'forecastPager',
			fitColumns : true,
			striped : true,
			rownumbers : true,
			border : false,
			pagination : true,
			pageSize : 10,
			pageList : [ 5, 10, 15, 20 ],
			pageNumber : 1,
			singleSelect : true,
			toolbar : '#forecastDiv',
			columns : [ [ {
				field : 'id',
				width : 500,
				checkbox : true,
			}, {
				field : 'title',
				title : '预测标题',
				width : 500,
			}, {
				field : 'vdate',
				title : '预测月份',
				width : 500,
			}, {
				field : 'type',
				title : '状态',
				width : 500,
			}, {
				field : 'startDate',
				title : '生成时间',
				width : 500,
			}, {
				field : 'handleUserName',
				title : '操作人',
				width : 500,
			}, ] ],
		});
	})

	function oldSelect() {
		$('#forecastManager').datagrid('load', {
			forecast : $("#forecast").val(),
		});
	}

	function forecastClose() {
		$('#forecastVote').window('close');
	}
</script>