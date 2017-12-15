$(function() {
	$('#Found').datagrid({
		url : 'datagrid_data.json',
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
		url : 'ListService',
		columns : [ [ {
			field : 'serviceId',
			title : 'id',
			hidden : 'true'
		}, {
			field : 'serviceName',
			title : '服务名称',
			width : 75,
			checkbox : true
		}, {
			field : 'serviceType',
			title : '服务类型',
			width : 75
		}, {
			field : 'serviceState',
			title : '状态',
			width : 50
		}, {
			field : 'servicelastDate',
			title : '最后操作时间',
			width : 75
		}, {
			field : 'operationidName',
			title : '操作人',
			width : 75
		}, {
			field : 'disposeidName',
			title : '代处理人',
			width : 75
		}, ] ]
	});
	// 工具栏
	$('#Found').datagrid({
		toolbar : '#tb'
	})

	// 点击出增加页面
	$("#ServicefoundAdd").click(function() {
		$('#foundService').dialog({
			title : '添加服务',
			width : 1000,
			height : 600,
			closed : false,
			cache : false,
			href : 'serviceInsertfound',
			modal : true
		});
	});

	// 删除页面
	$("#serviceFoundDel").click(function() {
		var userName = $("#userName").val();
		var row = $("#Found").datagrid('getSelections');// 单行
		if (row.length != 0) {
			if (row[0].serviceState != "已提交") {
				
                if(row[0].disposeidName==userName||row[0].operationidName==userName){
                	$.ajax({
    					url : "serviceFoundDel",
    					type : "post",
    					data : {
    						serviceId : row[0].serviceId
    					},
    					success : function() {
    						$('#Found').datagrid("reload");
    					}

    				});
                }else{
                	alert("你没有权限操作这条数据");
                }
			} else {
				alert("这条数据已经提交无法删除或修改");
			}

		} else {
			alert("请点击一条数据");
		}
	});

	// 修改页面
	$("#ServicefoundUpdate").click(function() {
		var row = $("#Found").datagrid('getSelections');// 单行

		if (row.length != 0) {
			$.ajax({
				url : "UpdatequeryServiceUpdate",
				type : "post",
				data : {
					serviceId : row[0].serviceId
				},

			});

			$('#ServiceUpdate').dialog({
				title : '修改服务',
				width : 1000,
				height : 600,
				closed : false,
				cache : false,
				href : 'ServiceUpdate',
				modal : true
			});
		} else {
			alert("请点击一条数据");
		}

	});

	// 点击查询页面
	$("#queryService").click(function() {
		var row = $("#Found").datagrid('getSelections');// 单行

		if (row.length != 0) {

			$.ajax({
				url : "queryServicequery",
				type : "post",
				data : {
					serviceId : row[0].serviceId
				}
			});

			$('#servicequery').dialog({
				title : '查询服务',
				width : 1000,
				height : 600,
				closed : false,
				cache : false,
				href : 'queryService',
				modal : true
			});
		} else {
			alert("请点击一条数据");
		}

	});

	// 提交
	$("#submitService").click(function() {
		var row = $("#Found").datagrid('getSelections');// 单行
		if (row.length != 0) {
			if (row[0].serviceState != "已提交") {
				$.ajax({
					url : "submitService",
					type : "post",
					data : {
						serviceId : row[0].serviceId
					},
					success : function() {
						$('#Found').datagrid("reload");
					}
				});
			} else {
				alert("这条数据已提交");
			}
		} else {
			alert("请点击一条数据");
		}

	});

})