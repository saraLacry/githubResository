$(function() {
	$('#file').datagrid({
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
		url : 'feedbackQueryServiceindex',
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
	$('#file').datagrid({
		toolbar : '#fl'
	})

	$("#pigeonholeService").click(function() {
		var row = $("#file").datagrid('getSelections');// 单行
		if (row.length != 0) {

			var userId = $("#userId").val();
			var userName = $("#userName").val();
			if (userName == row[0].disposeidName||userName == row[0].operationidName) {
				if (row[0].serviceState != "已归档") {
					$.ajax({
						url : "pigeonhole",
						type : "post",
						data : {
							opid : userId,
							serviceId : row[0].serviceId,
						},
						success : function() {
							$('#file').datagrid("reload");
						}
					});
					
				} else {
					alert("这条数据已归档");
				}

			} else {
				alert("你没有权限操作这条数据");
			}

		} else {
			alert("请选中一条数据");
		}
	});

	$("#pigeonholequeryqr").click(function() {
		var row = $("#file").datagrid('getSelections');// 单行
		if (row.length != 0) {

			var userId = $("#userId").val();
			var userName = $("#userName").val();
			if (userName == row[0].disposeidName) {

				$.ajax({
					url : "phquery",
					type : "post",
					data : {
						serviceId : row[0].serviceId
					}

				});

				$('#pigeonholequery').dialog({
					title : '归档服务',
					width : 1000,
					height : 600,
					closed : false,
					cache : false,
					href : 'FileQuery',
					modal : true
				});

			} else {
				alert("你没有权限查询看这一条数据");
			}

		} else {
			alert("请选中一条数据");
		}
	});

});