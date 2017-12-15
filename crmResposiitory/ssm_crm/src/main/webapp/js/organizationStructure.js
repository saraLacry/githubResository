$(function() {
	$('#organizationStructure').datagrid({
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
		url : 'organizationSelectAll',
		singleSelect : true,
		columns : [ [ {
			field : 'deptId',
			width : 75,
			checkbox : true
		}, {
			field : 'deptName',
			title : '名称',
			width : 75
		}, {	
			field : 'lasttime',
			title : '最后修改时间',
			width : 75
		}, {
			field : 'lastuser',
			title : '操作人',
			width : 50
		}, {
			field : 'deptRemark',
			title : '备注说名',
			width : 75
		}, ] ]
	});
	// 工具栏
	$('#organizationStructure').datagrid({
		toolbar : '#tb_ids_1'
	})

	// 点击出增加页面
	$("#organzationAdd").click(function() {
		$("#organzationDiragedAdd").dialog({
			iconCls : "icon-newadd",
			title : '角色修改',
			width : 1000,
			height : 600,
			closed : false,
			cache : false,
			href : 'organzationsAdd',
			modal : true
		});
	});

	// 点击出修改页面
	$("#organzationUpdate").click(function() {
		$("#organzationDiragedUpdat").dialog({
			iconCls : "icon-newadd",
			title : '角色修改',
			width : 1000,
			height : 600,
			closed : false,
			cache : false,
			href : 'organzationsUpdate',
			modal : true
		});
	});

	// 点击删除
	$("#organzationDel").click(function() {
		var row = $("#organizationStructure").datagrid('getSelected');// 单行
		$.ajax({
			url:'organzationDelDept',
			type:'post',
			data:{
				deptId:row.deptId
			},
			success:function(result){
				alert("删除成功!");
				$('#organizationStructure').datagrid("reload");
			}
		});
	});
});