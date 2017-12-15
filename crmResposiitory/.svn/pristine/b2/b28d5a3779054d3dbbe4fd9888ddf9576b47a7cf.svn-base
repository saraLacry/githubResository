$(function() {
	// var row = $("#roleManage").datagrid('getSelected');//单行
	// if (row != null){
	// alert(row);
	// }
	// var rows = $("#roleManage").datagrid('getSelections');//多行
	$('#roleManage').datagrid({
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
		url : 'roleSelect',
		singleSelect : true,
		columns : [ [ {
			field : 'userId',
			title : 'id',
			width : 75,
			checkbox : true
		}, {
			field : 'states',
			title : '角色名称',
			width : 75
		}, {
			field : 'sexs',
			title : '所属部门',
			width : 75
		}, {
			field : 'lastTime',
			title : '最后修改时间',
			width : 50
		}, {
			field : 'userName',
			title : '操作人',
			width : 75
		}, {
			field : 'remark',
			title : '备注说明',
			width : 75
		}, ] ]
	});
	// 工具栏
	$('#roleManage').datagrid({
		toolbar : '#tb'
	})

	// 点击出修改页面
	$("#compactUpdate").click(function() {
		$("#roleManageUpdates").dialog({
			iconCls : "icon-newadd",
			title : '角色修改',
			width : 1000,
			height : 600,
			closed : false,
			cache : false,
			href : 'roleManageUpdate',
			modal : true
		});
	});

	// 点击出增加页面
	$("#compactAdd").click(function() {
		$("#roleManageAdd").dialog({
			iconCls : "icon-newadd",
			title : '角色添加',
			width : 1000,
			height : 600,
			closed : false,
			cache : false,
			href : 'roleManageAdd',
			modal : true
		});
	});

	// 点击出授权页面
	$("#compactShou").click(function() {
		$("#roleManageShouquan").dialog({
			iconCls : "icon-newadd",
			title : '角色授权',
			width : 1000,
			height : 600,
			closed : false,
			cache : false,
			href : 'roleManageShouquan',
			modal : true
		});
	});

	// 点击删除
	$("#compactDel").click(function() {
		var row = $("#roleManage").datagrid('getSelected');// 单行
		if (row != null) {
			$.ajax({
				url : 'roleManagerDel',
				type : 'post',
				data : {
					userId : row.userId,
				},
				success : function(result) {
					alert("删除成功!");
					$('#roleManage').datagrid("reload");
				}
			});
		} else {
			alert("请选择要删除的行列!");
		}
	});
});