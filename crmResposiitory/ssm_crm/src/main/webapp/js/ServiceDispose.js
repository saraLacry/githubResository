$(function() {
	$('#dispose').datagrid({
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
		url : 'allocationQueryServiceaindex',
		columns : [ [ {
			field : 'serviceId',
			title : 'id',
			hidden : 'true'
		}, {
			field : 'Disposeceresult',
			title : '提交',
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
	$('#dispose').datagrid({
		toolbar : '#di'
	})

	$("#ServiceDisposeDs").click(function() {
		var row = $("#dispose").datagrid('getSelections');// 单行
		if (row.length != 0) {

			if (row[0].Disposeceresult != "已处理") {

				var userName = $("#userName").val();
				if (userName == row[0].disposeidName) {

					$.ajax({
						url : "ServiceDispose",
						type : "post",
						data : {
							serviceId : row[0].serviceId
						}
					});

					$('#ServiceDisposeDsds').dialog({
						title : '处理服务',
						width : 1000,
						height : 600,
						closed : false,
						cache : false,
						href : 'ServiceDisposeDs',
						modal : true
					});
				} else {
					alert("改用户没有权限操作这条数据");
				}

			} else {
				alert("这条记录已处理过了");
			}

		} else {
			alert("请选中一条数据");
		}

	});

	$("#disposedsqssa").click(function() {
		var row = $("#dispose").datagrid('getSelections');// 单行
		if (row.length != 0) {
			var userName = $("#userName").val();
			if (userName == row[0].disposeidName) {
				$.ajax({
					url : "disposecequery",
					type : "post",
					data : {
						serviceId : row[0].serviceId
					}
				    
				    
				});

				$('#queryquerydispsedas').dialog({
					title : '处理服务',
					width : 1000,
					height : 600,
					closed : false,
					cache : false,
					href : 'queryDisposeService',
					modal : true
				});
			} else {
				alert("你没有权限查询");
			}
		} else {
			alert("请点击一条记录");
		}

	});

});