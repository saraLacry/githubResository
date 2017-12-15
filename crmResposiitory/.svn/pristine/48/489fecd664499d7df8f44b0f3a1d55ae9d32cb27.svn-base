<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<div style="padding: 0 0 0 300px; color: #333;" id="contendDiv">
	<a id="btn" href="#" class="easyui-linkbutton"
		data-options="iconCls:'icon-add'" onclick="contendAddItem()">添加</a>&nbsp;&nbsp;&nbsp;&nbsp;

	<a id="btn" href="#" class="easyui-linkbutton"
		data-options="iconCls:'icon-edit'" onclick="contendUpdate()">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;

	<a id="btn" href="#" class="easyui-linkbutton"
		data-options="iconCls:'icon-remove'" onclick="contendEdit()">归档</a>&nbsp;&nbsp;&nbsp;&nbsp;

	<a id="btn" href="#" class="easyui-linkbutton"
		data-options="iconCls:'icon-search'" onclick="contendQuery()">查看</a>&nbsp;&nbsp;&nbsp;&nbsp;

	联系人:<input id="contend" type=text class="easyui-validatebox"
		required="required" /><a id="contendaid" href="#"
		class="easyui-linkbutton" iconCls="icon-search" onclick="oldSelect()">查询</a>
</div>
<table id="contendManager">
</table>
<div id="contendVote"></div>

<script type="text/javascript">
	function contendQuery() {
		var select = $("#contendManager").datagrid("getSelected");
		if (select != null) {
			$('#contendVote').dialog({
				title : '查看联系人',
				width : 800,
				height : 600,
				inline : true,
				href : 'contendQuery?id=' + select.id,
				modal : true,
				buttons : [ {
					text : '关闭',
					iconCls : 'icon-no',
					handler : function() {
						$('#contendVote').window('close');
					},
				} ],

			});
		} else {
			alert("请选择一行数据")
		}
	}

	function contendEdit() {
		var select = $("#contendManager").datagrid("getSelected");
		if (select != null) {
			if (select.state != "已归档") {
				$.ajax({
					url : 'updatecontend',
					data : "id=" + select.id + "&state=62",
					type : "post",
					dataType : 'json',
					success : function(result) {
						if (result == true) {
							$.messager.show({
								title : '提示',
								msg : '归档成功!',
							});
							$("#contendManager").datagrid('reload');
						} else {
							$.messager.show({
								title : '提示',
								msg : '归档失败!',
							});
						}
					}

				})
			}else{
				alert("该数据已经被归档!")
			}
		} else {
			alert("请选择一行数据!")
		}
	}
	function contendUpdate() {
		var select = $("#contendManager").datagrid("getSelected");
		if (select != null) {
			if (select.state != "已归档") {
				$('#contendVote').dialog({
					title : '修改联系人',
					width : 800,
					height : 600,
					inline : true,
					method : 'post',
					href : 'contend_update_add?id=' + select.id,
					modal : true,
					buttons : [ {
						text : '关闭',
						iconCls : 'icon-no',
						handler : function() {
							$('#contendVote').window('close');
						},
					} ],

				});
			} else {
				alert("已经归档不可再修改!")
			}

		} else {
			alert("请选择一行数据")
		}
	}

	function contendAddItem() {
		$('#contendVote').dialog({
			title : '添加联系人',
			width : 800,
			height : 600,
			inline : true,
			href : 'contend_update_add',
			modal : true,
			buttons : [ {
				text : '关闭',
				iconCls : 'icon-no',
				handler : function() {
					$('#contendVote').window('close');
				},
			} ],

		});
	}

	$(function() {
		$("#contendManager").datagrid({
			fit : true,
			url : 'contendPager',
			fitColumns : true,
			striped : true,
			rownumbers : true,
			border : false,
			pagination : true,
			pageSize : 10,
			pageList : [ 5, 10, 15, 20 ],
			pageNumber : 1,
			singleSelect : true,
			toolbar : '#contendDiv',
			columns : [ [ {
				field : 'id',
				width : 500,
				checkbox : true,
			}, {
				field : 'contendTitle',
				title : '分析结果标题',
				width : 500,
			}, {
				field : 'type',
				title : '类型',
				width : 500,
			}, {
				field : 'state',
				title : '状态',
				width : 500,
			}, {
				field : 'startDate',
				title : '生成时间',
				width : 500,
			}, {
				field : 'userName',
				title : '操作人',
				width : 500,
			}, ] ],
		});
	})

	function oldSelect() {
		$('#contendManager').datagrid('load', {
			contend : $("#contend").val(),
		});
	}

	function contendClose() {
		$('#contendVote').window('close');
	}
</script>