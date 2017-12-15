$(function() {
	$('#dictionaries').datagrid({
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
		url : 'dictionariesSelectAll',
		singleSelect : true,
		columns : [ [ {
			field : 'dectionarycodingId',
			title : 'id',
			width : 100,
			checkbox : true
		}, {
			field : 'dictionaryName',
			title : '名称',
			width : 100
		}, {
			field : 'dictionarycoding',
			title : '代码',
			width : 100
		}, {
			field : 'dictionaryvalue',
			title : '数据值',
			width : 100
		}, {
			field : 'lastTime',
			title : '最后修改时间',
			width : 100
		}, {
			field : 'userName',
			title : '操作人',
			width : 100
		}, ] ]
	});
	// 工具栏
	$('#announcement').datagrid({
		toolbar : '#tbs_123'
	})

	// 点击打开添加
	$("#dictionaAdd").click(function() {
		$("#dictionaPopupAdd").dialog({
			iconCls : "icon-newadd",
			title : '数据字典增加',
			width : 700,
			height : 600,
			closed : false,
			cache : false,
			href : 'dictionaPopupAdd',
			modal : true
		});
	});

	// 点击打开修改
	$("#dictionaUpdate").click(function() {
		$("#dictionaPopupUpdate").dialog({
			iconCls : "icon-newadd",
			title : '数据字典修改',
			width : 700,
			height : 600,
			closed : false,
			cache : false,
			href : 'dictionaPopupUpdate',
			modal : true
		});
	});

	// 点击删除
	$("#dictionaDel").click(function() {
		var row = $("#dictionaries").datagrid('getSelected');// 单行
		$.ajax({
			url : 'dictionaDelDisc',
			type : 'post',
			data : {
				dectionarycodingId : row.dectionarycodingId
			},
			success : function(result) {
				alert("删除成功!");
				$('#dictionaries').datagrid("reload");
			}
		});
	});
});