$(function() {
	$('#roleManage').datagrid({
		url : "",
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
		pageSize : 2,
		url : 'CommonMap',
		columns : [ [ {
			field : 'issueName',
			title : '标题',
			width : 100,
			checkbox : true
		}, {
			field : 'commonIssueId',
			title : 'id',
			width : 100,
			hidden : true
		}, {
			field : 'issueType',
			title : '类型',
			width : 75
		}, {
			field : 'lastDate',
			title : '最后 操作时间',
			width : 75
		}, {
			field : 'foundId',
			title : '创建人',
			width : 100
		}, {
			field : 'lastUpdateDate',
			title : '最后更新时间',
			width : 75
		}, ] ]
	});
	// 工具栏
	$('#roleManage').datagrid({
		toolbar : '#tbd'
	})

	$("#muhu").click(function() {
		var row = $("#roleManage").datagrid('getSelections');// 单行
		var issueName = $("#issueName").val();
		var issueType = $("#issueType").val();
		$.ajax({
			url : "CommonMap",
			type : "post",
			data : {
				IssueName : issueName,
				IssueType : issueType
			}
		});
	});

	$("#commonInsert").click(function() {
		$('#CommorissuecommonInsert').dialog({
			title : '添加服务',
			width : 1000,
			height : 600,
			closed : false,
			cache : false,
			href : 'commonInsertcm',
			modal : true
		});
	});

	
	$("#commonUpdatedelete").click(function(){
		var row = $("#roleManage").datagrid('getSelections');// 单行
		if (row[0].length != 0) {
			$.ajax({
				url:"commondelete",
				type:"post",
				data:{
					commonIssueId : row[0].commonIssueId
				},success:function(){
					$('#roleManage').datagrid("reload");
				}
			});
		}else{
			alert("请选中一条数据");
		}
	});
	
	
	$("#commonqueryc").click(function(){
		var row = $("#roleManage").datagrid('getSelections');// 单行
		if (row[0].length != 0) {
			$.ajax({
				url : "commonquery",
				type : "post",
				data : {
					commonIssueId : row[0].commonIssueId
				}
			});
			
			$("#Commorissuecommonquery").dialog({
				title : '查询服务',
				width : 1000,
				height : 600,
				closed : false,
				cache : false,
				href : 'commonQueryqu',
				modal : true
			});
			
		}else{
			alert("请选中一条数据");
		}
	});
	
	
	
	
	
	$("#commonUpdate").click(function() {
		var row = $("#roleManage").datagrid('getSelections');// 单行
		if (row[0].length != 0) {
			$.ajax({
				url : "commonquery",
				type : "post",
				data : {
					commonIssueId : row[0].commonIssueId
				}
			,success:function(){
				$('#roleManage').datagrid("reload");
			}
			});

			$("#CommorissuecommonUpdate").dialog({
				title : '修改服务',
				width : 1000,
				height : 600,
				closed : false,
				cache : false,
				href : 'commonUpdate',
				modal : true
			});

		} else {
			alert("请选中一条数据");
		}

	});

});