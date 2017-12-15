$(function() {
	var name=$("#chaxun").val();
	var valu=$("#valu").val();
	var shareStatus=$("#shareState").val();
	alert(shareStatus)
	$('#resource').datagrid({
		url : 'resourceList',
		queryParams: {
			name:name,
			valu:valu,
			shareStatus:shareStatus,
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
		toolbar : '#resource_tool',
		columns : [ [ {
			field : 'id',
			title : '自动编号',
			width : 10,
			checkbox : true
		},
		{
			field : 'clientName',
			title : '客户姓名',
			width : 10,
		}, 
		{
			field : 'clientSex',
			title : '客户性别',
			width : 10,
		},
		{
			field : 'dictionaryvalue',
			title : '客户类型',
			width : 10,
		},
		{
			field : 'dictionaryvalue3',
			title : '客户状态',
			width : 10,
		},
		{
			field : 'dictionaryvalue2',
			title : '分配状态',
			width : 10,
		},{
			field : 'enteringTime',
			title : '录入日期',
			width : 10,
		}, {
			field : 'enteringName',
			title : '录入人',
			width : 10,
		}, ] ],

	})
	$('#resource_add').dialog({
		width : 750,
		title : '新增用户',
		modal : true,
		closed : true,
		buttons : [
				{
					text : '提交',
					iconCls : 'icon-newadd',
					handler : function() {
						/* if ($('#resource_add').form('validate')) { */
							$.ajax({
								url : 'insertResuource',
								type : 'post',
								data : {
									clientCode : $('input[name=clientCode]').val(),
									clientName : $('input[name=clientName]').val(),
									clientSex : $('[name=clientSex]:checked').val(),
									clientBrithday : $('input[name=clientBrithday]').val(),
									clientType:$('input[name=clientType]').val(),
									clientState:$('input[name=clientState]').val(),
									clientPhone:$('input[name=clientPhone]').val(),
									workPhone:$('input[name=workPhone]').val(),
									email:$('input[name=email]').val(),
									familyPhone:$('input[name=familyPhone]').val(),
									adress:$('textarea[name=adress]').val(),
									remark:$('textarea[name=remark]').val(),
								},
								 beforeSend : function() {
									$.messager.progress({
												text : '正在新增中.....',
											});
										}, 
										success : function(data, response,status) {
											$.messager.progress('close');
											if (data !=null ) {
												$.messager.show({
														title : '提示',
														msg : '新增管理成功',
													})
												$('#resource_add').dialog('close').form('reset');
												$('#resource').datagrid('reload');
											} else {
												$.messager.alert('新增失败，未知错误导致失败，请重试','warning');
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
								$('#resource_add').dialog('close').form(
										'reset');
							}
						} ]
					});
	$('#resource_edit').dialog({
		width : 750,
		title : '编辑用户',
		modal : true,
		closed : true,
		buttons : [ {
			text : '提交',
			iconCls : 'icon-newadd',
			handler : function() {
				$.ajax({
					url : 'updateResuource',
					type : 'post',
					data : {
						id : $('input[name=id_edit]').val(),
						clientCode : $('input[name=clientCode_edit]').val(),
						clientSex : $('[name=clientSex_edit]:checked').val(),
						clientBrithday : $('input[name=clientBrithday_edit]').val(),
						clientType:$('input[name=clientType_edit]').val(),
						clientState:$('input[name=clientState_edit]').val(),
						clientPhone:$('input[name=clientPhone_edit]').val(),
						workPhone:$('input[name=workPhone_edit]').val(),
						email:$('input[name=email_edit]').val(),
						familyPhone:$('input[name=familyPhone_edit]').val(),
						adress:$('textarea[name=adress_edit]').val(),
						remark:$('textarea[name=remark_edit]').val(),
						
					}, 
					beforeSend : function() {
						$.messager.progress({
							text : '正在提交中.....',
						});
					},
					success : function(data, response, status) {
						$.messager.progress('close');
						if (data !=null) {
							$.messager.show({
								title : '提示',
								msg : '修改管理成功',
							})
							$('#resource_edit').dialog('close').form('reset');
							$('#resource').datagrid('reload');
						} else {
							$.messager.alert('修改失败，未知错误导致失败，请重试', 'warning');
							$('#pass').select();
						}
					}
				})
			}
		}, {
			text : '取消',
			iconCls : 'icon-redo',
			handler : function() {
				$('#resource_edit').dialog('close').form('reset');
			}
		} ]
	})
	$('#resource_share').dialog({
		width : 750,
		height:350,
		title : '客户分配',
		modal : true,
		closed : true,
		buttons : [ {
			text : '提交',
			iconCls : 'icon-newadd',
			handler : function() {
				$.ajax({
					url : 'updateUser',
					type : 'post',
					data : {
						userId:$('input[name=userName_share]').val(),
						clientCode : $('input[name=clientCode_share]').val(),
					}, 
					beforeSend : function() {
						$.messager.progress({
							text : '正在提交中.....',
						});
					},
					success : function(data, response, status) {
						$.messager.progress('close');
						if (data !=null) {
							$.messager.show({
								title : '提示',
								msg : '修改管理成功',
							})
							$('#resource_share').dialog('close').form('reset');
							$('#resource').datagrid('reload');
						} else {
							$.messager.alert('修改失败，未知错误导致失败，请重试', 'warning');
							$('#pass').select();
						}
					}
				})
			}
		}, {
			text : '取消',
			iconCls : 'icon-redo',
			handler : function() {
				$('#resource_share').dialog('close').form('reset');
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
	
	
	 
	
	resource_tool = {
		reload : function() {
			$('#resource').datagrid('reload');
		},
		redo : function() {
			$('#resource').datagrid('unselectAll');
		},
		add : function() {
			$('#resource_add').dialog('open');
		},
		edit : function() {
			var rows = $('#resource').datagrid('getSelections');
			if (rows.length > 1) {
				$.messager.alert('警告操作', '编辑记录只能选定一条数据', 'warning');
			} else if (rows.length == 1) {
				$.ajax({
					url : 'clientQuery',
					type : 'post',
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
						$('#resource_edit').form('load', {
							id_edit : data.id,
							clientCode_edit : data.clientCode,
							clientName_edit : data.clientName,
							clientSex_edit : data.clientSex,
							clientBrithday_edit : data.clientBrithday,
							
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
		remove : function() {
			var rows = $('#resource').datagrid('getSelections');
			if (rows.length > 0) {
				$.messager.confirm('确定操作', '你正在删除所选的记录吗？', function(flag) {
					if (flag) {
						var ids;
						var count = 0;
						for (var i = 0; i < rows.length; i++) {
							ids = rows[i].id;
							count++;
							$.ajax({
								url : 'deleteResuource',
								type : 'post',
								data : "id=" + ids,
								beforeSend : function() {
									$('#resource').datagrid('loading');
								},
								success : function(data) {
									if (data) {
										/*
										 * $('#resource').datagrid('loaded');
										 * $('#resource').datagrid('load');
										 */
										$('#resource').datagrid('unselectAll');
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
		},
		query : function() {
			var rows = $('#resource').datagrid('getSelections');
			if (rows.length > 1) {
				$.messager.alert('警告操作', '编辑记录只能选定一条数据', 'warning');
			} else if (rows.length == 1) {
				$.ajax({
					url : 'clientQuery',
					type : 'post',
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
						data.id
						$('#resource_edit').form('load', {
							id : data.id,
							clientCode_edit : data.clientCode,
							clientName_edit : data.clientName,
							clientSex_edit : data.clientSex,
							clientBrithday_edit : data.clientBrithday,
							clientType_edit:data.dictionaryvalue,
							clientState_edit:data.dictionaryvalue2,
							clientPhone_edit:data.clientPhone,
							workPhone_edit:data.workPhone,
							email_edit:data.email,
							familyPhone_edit:data.familyPhone,
							adress_edit:data.adress,
							remark_edit:data.remark,
						}).dialog('open');
						
						} else {
							$.messager.alert('获取失败，未知错误导致失败，请重试',
									'warning');
						}
					}
				})
			} else if (rows.length == 0) {
				$.messager.alert('警告操作', '编辑记录至少选定一条数据', 'warning');
			}
		},
		share : function() {
			var rows = $('#resource').datagrid('getSelections');
			if (rows.length > 1) {
				$.messager.alert('警告操作', '编辑记录只能选定一条数据', 'warning');
			} else if (rows.length == 1) {
				$.ajax({
					url : 'clientQuery',
					type : 'post',
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
					alert(data.user.role);
					if (data.shareStatus==33) {
						$('#resource_share').form('load', {
							id_share : data.id,
							clientCode_share : data.clientCode,
							clientName_share : data.clientName,
							clientSex_share : data.clientSex,
							clientBrithday_share : data.clientBrithday,
							clientType_share:data.dictionaryvalue,
							clientState_share:data.dictionaryvalue2,
							clientPhone_share:data.clientPhone,
							workPhone_share:data.workPhone,
							email_share:data.email,
							familyPhone_share:data.familyPhone,
						}).dialog('open');
						
						} else {
							$.messager.alert('获取失败，该用户已被分配，请重试',
									'该用户已被分配');
							$('#pass').select();
						}
					}
				})
			} else if (rows.length == 0) {
				$.messager.alert('警告操作', '编辑记录至少选定一条数据', 'warning');
			}
		},
		search:function(){
			var name=$("#chaxun").val();
			var valu=$("#valu").val();
			var shareStatus=$("#shareState").val();
			alert(shareStatus)
			$('#resource').datagrid({
				url : 'resourceList',
				queryParams: {
					name:name,
					valu:valu,
					shareStatus:shareStatus
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
				toolbar : '#resource_tool',
				columns : [ [ {
					field : 'id',
					title : '自动编号',
					width : 10,
					checkbox : true
				},
				{
					field : 'clientName',
					title : '客户姓名',
					width : 10,
				}, 
				{
					field : 'clientSex',
					title : '客户性别',
					width : 10,
				},
				{
					field : 'dictionaryvalue',
					title : '客户类型',
					width : 10,
				},
				{
					field : 'dictionaryvalue3',
					title : '客户状态',
					width : 10,
				},
				{
					field : 'dictionaryvalue2',
					title : '分配状态',
					width : 10,
				},{
					field : 'enteringTime',
					title : '录入日期',
					width : 10,
				}, {
					field : 'userName',
					title : '录入人',
					width : 10,
				}, ] ],

			})
		}
	}
	$("#clientType").combobox({
		 url:"clientStates?str=CLIENT_TYPE",  
         valueField:'dectionarycodingId',    
         textField:'dictionaryvalue',    
         panelHeight:'auto', 
         
	}) 
	$("#clientState").combobox({
		url:"clientStates?str=CLIENT_STATE",  
         valueField:'dectionarycodingId',    
         textField:'dictionaryvalue',    
         panelHeight:'auto', 
	})
	$("#clientType_edit").combobox({
		 url:"clientStates?str=CLIENT_TYPE",  
         valueField:'dectionarycodingId',    
         textField:'dictionaryvalue',    
         panelHeight:'auto', 
         
	}) 
	$("#clientState_edit").combobox({
		url:"clientStates?str=CLIENT_STATE",  
         valueField:'dectionarycodingId',    
         textField:'dictionaryvalue',    
         panelHeight:'auto', 
	})
	$("#clientType_share").combobox({
		 url:"clientStates?str=CLIENT_TYPE",  
         valueField:'dectionarycodingId',    
         textField:'dictionaryvalue',    
         panelHeight:'auto', 
         
	}) 
	$("#clientState_share").combobox({
		 url:"clientStates?str=CLIENT_STATE",  
         valueField:'dectionarycodingId',    
         textField:'dictionaryvalue',    
         panelHeight:'auto', 
	})
	$("#userName_share").combobox({
		 url:"userRole?roleid=4",
		 width:"180px",
		 height:"80px",
         valueField:'userId',    
         textField:'userName',    
         panelHeight:'auto', 
	})
	
	$("#shareState").combobox({
		 url:"clientStates?str=SHARE_STATE", 
		 width:"80px",
         valueField:'dectionarycodingId',    
         textField:'dictionaryvalue',    
         panelHeight:'auto', 
	})
	$("#chaxun").combobox({
         valueField:'id',    
         textField:'text',    
         panelHeight:'auto', 
	})
	$("#clientBrithday").datebox({
		height:"20px",
	    current:new Date()    
	}); 
	
	$("#clientBrithday_edit").datebox({
		//height:"20px",
	    current:new Date()    
	});
	
})