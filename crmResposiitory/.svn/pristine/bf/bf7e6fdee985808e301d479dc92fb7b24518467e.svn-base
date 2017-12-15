$(function() {
	$('#announcement').datagrid({
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
		url : 'announcementSelectAll',
		singleSelect : true,
		columns : [ [ {
			field : 'noticenotIds',
			title : 'id',
			width : 100,
			checkbox : true
		}, {
			field : 'noticetitle',
			title : '标题',
			width : 100
		}, {
			field : 'createTime',
			title : '发布时间',
			width : 100
		}, {
			field : 'releaseName',
			title : '发布人',
			width : 100
		}, {
			field : 'noticecontent',
			title : '内容',
			width : 100
		}, ] ]
	});

	// 工具栏
	$('#announcement').datagrid({
		toolbar : '#tbannouncement'
	})

	// 点击出增加页面
	$("#announcementAdd").click(function() {
		$("#announcementSpanAdd").dialog({
			iconCls : "icon-newadd",
			title : '公告增加',
			width : 1000,
			height : 600,
			closed : false,
			cache : false,
			href : 'announcementSpanAdd',
			modal : true
		});
	});

	// 点击出查看页面
	$("#announcementLook").click(function() {
		$("#announcementSpanLook").dialog({
			iconCls : "icon-newadd",
			title : '公告查看',
			width : 1000,
			height : 600,
			closed : false,
			cache : false,
			href : 'announcementSpanLook',
			modal : true
		});
	});

	// 点击出修改页面
	$("#announcementUpdate").click(function() {
		$("#announcementSpanUpdate").dialog({
			iconCls : "icon-newadd",
			title : '公告修改',
			width : 1000,
			height : 600,
			closed : false,
			cache : false,
			href : 'announcementSpanUpdate',
			modal : true
		});
	});

	// 点击删除
	$("#announcementDel").click(function() {
		var row = $("#announcement").datagrid('getSelected');// 单行
		$.ajax({
			url : 'announcementDelAnnend',
			type : 'post',
			data : {
				noticenotIds : row.noticenotIds
			},
			success : function(result) {
				$('#announcement').datagrid("reload");
			}
		});
	});
});