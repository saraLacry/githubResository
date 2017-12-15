$(function() {
	$('#staff').datagrid({
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
		url : 'staffSelect',
		singleSelect : true,
		columns : [ [  {
			field : 'userId',
			title : 'id',
			width : 75,
			checkbox : true
		}, {
			field : 'userName',
			title : '员工姓名',
			width : 75
		}, {
			field : 'sexs',
			title : '性别',
			width : 75
		}, {
			field : 'deptIds',
			title : '所在部门',
			width : 50
		}, {
			field : 'roleIds',
			title : '角色',
			width : 75
		}, {
			field : 'states',
			title : '状态',
			width : 75
		}, {
			field : 'lastTime',
			title : '最后修改时间',
			width : 75
		}, {
			field : 'lastUserName',
			title : '操作人',
			width : 75
		} ] ]
	});
	// 工具栏
	$('#staff').datagrid({
		toolbar : '#tbs'
	})

	// 点击打开修改
	$("#compactStaffUpdate").click(function() {
		$("#div_staffUpdate").dialog({
			iconCls : "icon-newadd",
			title : '员工修改',
			width : 700,
			height : 600,
			closed : false,
			cache : false,
			href : 'staffManagerUpdate',
			modal : true
		});
	});

	// 点击打开添加
	$("#compactAdd").click(function() {
		$("#div_staffAdd").dialog({
			iconCls : "icon-newadd",
			title : '员工增加',
			width : 700,
			height : 600,
			closed : false,
			cache : false,
			href : 'staffManagerAdd',
			modal : true
		});
	});

	// 点击删除
	$("#compactStaffDel").click(function() {
		var row = $("#staff").datagrid('getSelected');// 单行
		if ("" != row || null != row) {
			$.ajax({
				url : 'staffManagerDelSpan',
				type : 'post',
				data : {
					userId : row.userId
				},
				success : function(result) {
					alert("删除成功!");
					$('#staff').datagrid("reload");
				}
			});
		} else {
			alert("请选择一行进行操作!");
		}
	});

	// 点击进行状态修改
	$("#compactStaffSaveInsert").click(function() {
		var row = $("#staff").datagrid('getSelected');// 单行
		if ("" != row || null != row) {
			$.ajax({
				url : 'staffManagerSaveInsert',
				type : 'post',
				data : {
					userId : row.userId,
					states : row.states
				},
				success : function(result) {
					alert("状态更改成功!");
					$('#staff').datagrid("reload");
				}
			});
		} else {
			alert("请选择一行进行操作!");
		}
	});

	// 点击查看
	$("#compactStafflook").click(function() {
		$("#div_staffLook").dialog({
			iconCls : "icon-newadd",
			title : '员工查看',
			width : 700,
			height : 600,
			closed : false,
			cache : false,
			href : 'staffManagerLook',
			modal : true
		});
	});
});