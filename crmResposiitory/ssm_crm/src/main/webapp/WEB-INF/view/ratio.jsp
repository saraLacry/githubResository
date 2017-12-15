<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<div style="padding: 0 0 0 300px; color: #333;" id="ratioDiv">
	<a id="btn" href="#" class="easyui-linkbutton"
		data-options="iconCls:'icon-add'" onclick="ratioAddItem()">添加</a>&nbsp;&nbsp;&nbsp;&nbsp;

	<a id="btn" href="#" class="easyui-linkbutton"
		data-options="iconCls:'icon-edit'" onclick="ratioUpdate()">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;

	<a id="btn" href="#" class="easyui-linkbutton"
		data-options="iconCls:'icon-remove'" onclick="ratioEdit()">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;

	<a id="btn" href="#" class="easyui-linkbutton"
		data-options="iconCls:'icon-search'" onclick="ratioQuery()">查看</a>&nbsp;&nbsp;&nbsp;&nbsp;

	联系人:<input id="ratio" type=text class="easyui-validatebox"
		required="required" /><a id="ratioaid" href="#"
		class="easyui-linkbutton" iconCls="icon-search" onclick="oldSelect()">查询</a>
</div>
<table id="ratioManager">
</table>
<div id="ratioVote"></div>

<script type="text/javascript">
	function ratioQuery() {
		var select = $("#ratioManager").datagrid("getSelected");
		if (select != null) {
			$('#ratioVote').dialog({
				title : '查看绩效',
				width : 800,
				height : 600,
				inline : true,
				href : 'ratioQuery?id=' + select.id,
				modal : true,
				buttons : [ {
					text : '关闭',
					iconCls : 'icon-no',
					handler : function() {
						$('#ratioVote').window('close');
					},
				} ],

			});
		} else {
			alert("请选择一行数据")
		}
	}

	function ratioEdit() {
		var select = $("#ratioManager").datagrid("getSelected");
		if (select != null) {
				$.ajax({
					url : 'deleteRatio',
					data : "id=" + select.id,
					type : "post",
					dataType : 'json',
					success : function(result) {
						if (result == true) {
							$.messager.show({
								title : '提示',
								msg : '删除成功!',
							});
							$("#ratioManager").datagrid('reload');
						} else {
							$.messager.show({
								title : '提示',
								msg : '删除失败!',
							});
						}
					}

				})

		} else {
			alert("请选择一行数据!")
		}
	}
	function ratioUpdate() {
		var select = $("#ratioManager").datagrid("getSelected");
		if (select != null) {
				$('#ratioVote').dialog({
					title : '修改绩效',
					width : 800,
					height : 600,
					inline : true,
					method : 'post',
					href : 'ratio_update_add?id=' + select.id,
					modal : true,
					buttons : [ {
						text : '关闭',
						iconCls : 'icon-no',
						handler : function() {
							$('#ratioVote').window('close');
						},
					} ],

				});

		} else {
			alert("请选择一行数据")
		}
	}

	function ratioAddItem() {
		$('#ratioVote').dialog({
			title : '添加绩效',
			width : 800,
			height : 600,
			inline : true,
			href : 'ratio_update_add',
			modal : true,
			buttons : [ {
				text : '关闭',
				iconCls : 'icon-no',
				handler : function() {
					$('#ratioVote').window('close');
				},
			} ],

		});
	}

	$(function() {
		$("#ratioManager").datagrid({
			fit : true,
			url : 'ratioPager',
			fitColumns : true,
			striped : true,
			rownumbers : true,
			border : false,
			pagination : true,
			pageSize : 10,
			pageList : [ 5, 10, 15, 20 ],
			pageNumber : 1,
			singleSelect : true,
			toolbar : '#ratioDiv',
			columns : [ [ {
				field : 'id',
				width : 500,
				checkbox : true,
			}, {
				field : 'userName',
				title : '姓名',
				width : 500,
			}, {
				field : 'deptName',
				title : '部门',
				width : 500,
			}, {
				field : 'rank',
				title : '绩效等级',
				width : 500,
			}, {
				field : 'lastDate',
				title : '最后修改时间',
				width : 500,
			}, {
				field : 'lastUserName',
				title : '操作人',
				width : 500,
			}, ] ],
		});
	})

	function oldSelect() {
		$('#ratioManager').datagrid('load', {
			ratio : $("#ratio").val(),
		});
	}

	function ratioClose() {
		$('#ratioVote').window('close');
	}
</script>
