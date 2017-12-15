$(function() {
	$('#basicsmessage').datagrid({
		// 自动适应浏览器
		fitColumns : true,
		// 单选
		singleSelect : true,
		// 显示行号
		rownumbers : true,
		// 显示分页
		pagination : true,
		// 定义分页的的显示的数据
		pageList : [ 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 ],

		// 初始化页面大小
		pageSize : 6,
		url : 'basicsmessageSelectAll',
		singleSelect : true,
		columns : [ [{
			field : 'baseId',
			title : 'id',
			width : 100,
			checkbox : true
		},{
			field : 'basedescribe',
			title : '参数描述',
			width : 100
		}, {
			field : 'baseKey',
			title : '参数关键字',
			width : 100
		}, {
			field : 'basevalue',
			title : '参数值',
			width : 100
		}, {
			field : 'userName',
			title : '添加人',
			width : 100
		},   ] ]
	});
	// 工具栏
	$('#announcement').datagrid({
		toolbar : '#tbbaseId_1'
	})
	
	// 点击打开添加
	$("#basicsmessageAdd").click(function() {
		$("#basicsmessageTAdd").dialog({
			iconCls : "icon-newadd",
			title : '基础信息增加',
			width : 700,
			height : 600,
			closed : false,
			cache : false,
			href : 'basicsmessageTAdd',
			modal : true
		});
	});

	// 点击打开修改
	$("#basicsmessageUpdate").click(function() {
		$("#basicsmessageTUpdate").dialog({
			iconCls : "icon-newadd",
			title : '基础信息修改',
			width : 700,
			height : 600,
			closed : false,
			cache : false,
			href : 'basicsmessageTUpdate',
			modal : true
		});
	});

	// 点击删除
	$("#basicsmessageDel").click(function() {
		var row = $("#basicsmessage").datagrid('getSelected');// 单行
		$.ajax({
			url : 'basicsmessageTDelCount',
			type : 'post',
			data : {
				baseId : row.baseId
			},
			success : function(result) {
				alert("删除成功!");
				$('#basicsmessage').datagrid("reload");
			}
		});
	});
});