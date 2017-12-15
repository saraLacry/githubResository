$(function() {
	var developMonth=$("#month").val()
	$('#develop').datagrid({
		url : 'developList',
		queryParams: {
			developMonth:developMonth,
		},
		border :true,// 边框是否取得
		fitColumns : true,// 自适应
		pagination : true,// 是否启用分页
		pageSize : 10,// 分页每页显示多少条
		//pageList : [ 10, 20, 30, 40, 50 ],// 分页列表选择显示10，20。。条
		pageList : [ 10,15,20,25],
		pageNumber : 1,// 默认第一页
		//singleSelect:true,
		sortName : 'date',// 默认以什么字段排序
		sortOrdr : 'desc',// 默认倒叙，还是证
		toolbar : '#develop_tool',
		columns : [ [ {
			field : 'id',
			title : '自动编号',
			width : 10,
			checkbox : true
		},
		{
			field : 'planName',
			title : '姓名',
			width : 10,
		}, 
		{
			field : 'developMonth',
			title : '月份',
			width : 10,
		},
		{
			field : 'createdate',
			title : '创建时间',
			width : 10,
		},
		{
			field : 'lastOperateTime',
			title : '最后操作时间',
			width : 10,
		},
		{
			field : 'loginId',
			title : '操作人',
			width : 10,
		}, ] ],

	})
	$('#develop_add')
			.dialog(
			{
				width : 600,
				title : '新增用户',
				modal : true,
				closed : true,
				buttons : [
				{
					text : '提交',
					iconCls : 'icon-newadd',
					handler : function() {
						/* if ($('#develop_add').form('validate')) { */
							$.ajax({
								url : 'fortifyPlan',
								type : 'post',
								data : {
									developCode : $('input[name=developCode]').val(),
									developMonth : $('input[name=developMonth]').val(),
									planName : $('input[name=planName]').val(),
									planContent : $('textarea[name=planContent]').val(),
								},
								beforeSend : function() {
									$.messager.progress({
												text : '正在新增中.....',
											});
								},
	
								success : function(data, response,status) {
									$.messager.progress('close');
									if (data !=null) {
										$.messager.show({
												title : '提示',
												msg : '新增管理成功',
											})
										$('#develop_add').dialog('close').form('reset');
										$('#develop').datagrid('reload');
									} else {
										$.messager.alert('新增失败，未知错误导致失败，请重试','warning');
										$('#pass').select();
									}
								}
							})
						/* } */
					}
				},
				{
					text : '取消',
					iconCls : 'icon-redo',
					handler : function() {
						$('#develop_add').dialog('close').form(
								'reset');
					}
				} ]
			});
	$('#develop_edit').dialog({
		width : 600,
		title : '编辑用户',
		modal : true,
		closed : true,
		buttons : [ {
			text : '提交',
			iconCls : 'icon-newadd',
			handler : function() {
				$.ajax({
					url : 'modifyPlan',
					data : {
						id:$('#id_edit').val(),
						planContent : $('textarea[name=planContent_edit]').val(),
					}, 
					beforeSend : function() {
						$.messager.progress({
							text : '正在提交中.....',
						});
					},
					success : function(data, response, status) {
						$.messager.progress('close');
						// alert(data);
						if (data > 0) {
							$.messager.show({
								title : '提示',
								msg : '修改管理成功',
							})
							$('#develop_edit').dialog('close').form('reset');
							$('#develop').datagrid('reload');
						} else {
							$.messager.alert('修改失败，未知错误导致失败，请重试', 'warning');
						}
					}
				})
			}
		}, {
			text : '取消',
			iconCls : 'icon-redo',
			handler : function() {
				$('#develop_edit').dialog('close').form('reset');
			}
		} ]
	})

	// 修改密码验证
	$("input[name=pass_edit]").validatebox({
		required : true,
		missingMessage : '请输入管理密码',
		invlidMessage : '管理密码不得少于6，20位',
		validType : 'length[6,20]',

	});
	// 管理员后台账号验证
	$("input[name=username]").validatebox({
		required : true,
		validType : 'length[2,10]',
		missingMessage : '请输入管理名称',
		invlidMessage : '管理名称不得少于5，10位',
	});
	// 管理员后台密码验证
	$("input[name=pass]").validatebox({
		required : true,
		missingMessage : '请输入管理密码',
		invlidMessage : '管理密码不得少于6，20位',
		validType : 'length[6,20]',

	});
	
	develop_tool = {
		reload : function() {
			$('#develop').datagrid('reload');
		},
		redo : function() {
			$('#develop').datagrid('unselectAll');
		},
		add : function() {
			$('#develop_add').dialog('open');
		},
		edit : function() {
			var rows = $('#develop').datagrid('getSelections');
			if (rows.length > 1) {
				$.messager.alert('警告操作', '编辑记录只能选定一条数据', 'warning');
			} else if (rows.length == 1) {
				$.ajax({
					url : 'getPlan',
					data : {
						id : rows[0].id,
					},
					beforeSend : function() {
						$.messager.progress({
							text : '正在获取中.....',
						});
					},
				success : function(data, response, status) {
					$.messager.progress('close');
					if (data) {
						$('#develop_edit').form('load', {
							id_edit : data.id,
							developCode_edit : data.developCode,
							planName_edit : data.planName,
							developMonth_edit : data.developMonth,
							planState_edit:data.planState,
						}).dialog('open');
						
						} else {
							$.messager.alert('获取失败，未知错误导致失败，请重试',
									'warning');
							$('#pass').select();
						}
					}
				})
			} else if (rows.length == 0) {
				$.messager.alert('警告操作', '编辑记录至少选定一条数据', 'warning');
			}
		},
		query : function() {
			var rows = $('#develop').datagrid('getSelections');
			if (rows.length > 1) {
				$.messager.alert('警告操作', '编辑记录只能选定一条数据', 'warning');
			} else if (rows.length == 1) {
				$.ajax({
					url : 'getPlan',
					data : {
						id : rows[0].id,
					},
					beforeSend : function() {
						$.messager.progress({
							text : '正在获取中.....',
						});
					},
				success : function(data, response, status) {
					$.messager.progress('close');
					if (data) {
						$('#develop_edit').form('load', {
							id_edit : data.id,
							developCode_edit : data.developCode,
							planName_edit : data.planName,
							developMonth_edit : data.developMonth,
							planState_edit:data.planState,
							planContent_edit : data.planContent,
						}).dialog('open');
						
						} else {
							$.messager.alert('获取失败，未知错误导致失败，请重试',
									'warning');
							$('#pass').select();
						}
					}
				})
			} else if (rows.length == 0) {
				$.messager.alert('警告操作', '编辑记录至少选定一条数据', 'warning');
			}
		},
		search:function(){
			$('#develop').datagrid({
				url : 'developList',
				queryParams: {
					developMonth:developMonth,
				},
				border :true,// 边框是否取得
				fitColumns : true,// 自适应
				pagination : true,// 是否启用分页
				pageSize : 10,// 分页每页显示多少条
				//pageList : [ 10, 20, 30, 40, 50 ],// 分页列表选择显示10，20。。条
				pageList : [ 10,15,20,25],
				pageNumber : 1,// 默认第一页
				//singleSelect:true,
				sortName : 'date',// 默认以什么字段排序
				sortOrdr : 'desc',// 默认倒叙，还是证
				toolbar : '#develop_tool',
				columns : [ [ {
					field : 'id',
					title : '自动编号',
					width : 10,
					checkbox : true
				},
				{
					field : 'planName',
					title : '姓名',
					width : 10,
				}, 
				{
					field : 'developMonth',
					title : '月份',
					width : 10,
				},
				{
					field : 'createdate',
					title : '创建时间',
					width : 10,
				},
				{
					field : 'lastOperateTime',
					title : '最后操作时间',
					width : 10,
				},
				{
					field : 'loginId',
					title : '操作人',
					width : 10,
				}, ] ],

			})
		},
		remove : function() {
			var rows = $('#develop').datagrid('getSelections');
			if (rows.length > 0) {
				$.messager.confirm('确定操作', '你正在删除所选的记录吗？', function(flag) {
					if (flag) {
						var ids;
						var count = 0;
						for (var i = 0; i < rows.length; i++) {
							ids = rows[i].id;
							count++;
							$.ajax({
								url : 'delPlan',
								data : "id=" + ids,
								beforeSend : function() {
									$('#develop').datagrid('loading');
								},
								success : function(data) {
									if (data) {
										/*
										 * $('#develop').datagrid('loaded');
										 * $('#develop').datagrid('load');
										 */
										$('#develop').datagrid('unselectAll');
										$.messager.show({
											title : '提示',
											msg : count + '个用户被删除成功!',
										})
									}
								}
							});
						}
					}
				});
			} /*
				 * else if (rows.length > 1) { $.messager.alert('提示',
				 * '请选择要删除一条的记录', 'info'); }
				 */else {
				$.messager.alert('提示', '请选择要删除的记录', 'info');
			}
		}
	}
	$("#month").datebox({
		height:"20px",
	    current:new Date()    
	});
	$("#developMonth").datebox({
		height:"20px",
	    current:new Date()    
	});
	$("#developMonth_edit").datebox({
		height:"20px",
	    current:new Date()    
	});
})