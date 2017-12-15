$(function() {
	var sousuo_1 = $("#sousuo_2").val();
	alert(sousuo_1)
	$('#care').datagrid({
		url : 'getclientindent2',
		queryParams: {
			sousuo_1:sousuo_1
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
		toolbar : '#care_tool',
		columns : [ [ {
			field : 'indentid',
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
			title : '性别',
			width : 10,
		},
		{
			field : 'dictionaryvalue',
			title : '类型',
			width : 10,
		},
		{
			field : 'num',
			title : '价值等级',
			width : 10,
		},
		{
			field : 'quality',
			title : '质量满意度',
			width : 10,
		},
		{
			field : 'serve',
			title : '信誉等级',
			width : 10,
		},{
			field : 'sum',
			title : '关怀方案',
			width : 10,
		}, ] ],

	})
	$('#care_add')
			.dialog(
			{
				width : 700,
				height:500,
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
								url : 'fortifyCare',
								type : 'post',
								data : {
									remindName:$('input[name=remindName]').val(),
									remindTime:$('input[name=remindTime]').val(),
									remindType:$('input[name=remindType]').val(),
									remindDay:$('[name=remindDay]:checked').val(),
									remindRate:$('#remindRate').val(),
									sumSatisfied:$('input[name=sumSatisfied]').val(),
									remark:$('textarea[name=remark]').val(),
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
										$('#care_add').dialog('close').form('reset');
										$('#care_edit_total').datagrid('reload');
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
						$('#care_add').dialog('close').form(
								'reset');
					}
				} ]
			});
	$('#care_edit').dialog({
		
		width : 700,
		height:500,
		title : '编辑用户',
		modal : true,
		closed : true,
		buttons : [ {
			text : '提交',
			iconCls : 'icon-newadd',
			handler : function() {
				$.ajax({
					url : 'modifyCare',
					data : {
						id:$('input[name=id_edit]').val(),
						remindName:$('input[name=remindName_edit]').val(),
						remindTime:$('input[name=remindTime_edit]').val(),
						remindType:$('input[name=remindType_edit]').val(),
						remindDay:$('[name=remindDay_edit]:checked').val(),
						remindRate:$('#remindRate_edit').val(),
						remark:$('textarea[name=remark_edit]').val(),
					}, 
					beforeSend : function() {
						$.messager.progress({
							text : '正在提交中.....',
						});
					},
					success : function(data, response, status) {
						$.messager.progress('close');
						// alert(data);
						if (data !=null) {
							$.messager.show({
								title : '提示',
								msg : '修改管理成功',
							})
							$('#care_edit').dialog('close').form('reset');
							$('#care_edit_tool').datagrid('reload');
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
				$('#care_edit').dialog('close').form('reset');
			}
		} ]
	})
	
	$('#scheme_add')
			.dialog(
			{
				width : 700,
				height:500,
				title : '新增用户',
				modal : true,
				closed : true,
				buttons : [
				{
					text : '提交',
					iconCls : 'icon-newadd',
					handler : function() {
							$.ajax({
								url : 'fortifyScheme',
								type : 'post',
								data : {
									remindName:$('input[name=remindNames]').val(),
									executedate:$('input[name=executedate]').val(),
									executeScheme:$('input[name=executeScheme]').val(),
									remark:$('textarea[name=remarks]').val(),
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
										$('#scheme_add').dialog('close').form('reset');
										$('#care_edit_total2').datagrid('reload');
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
						$('#satisfied_add').dialog('close').form(
								'reset');
					}
				} ]
			});
	$('#scheme_edit').dialog({
		width : 700,
		height: 500,
		title : '编辑用户',
		modal : true,
		closed : true,
		buttons : [ {
			text : '提交',
			iconCls : 'icon-newadd',
			handler : function() {
				$.ajax({
					url : 'modifyScheme',
					data : {
						id:$('#id_edit2').val(),
						remindName:$('input[name=remindNames_edit]').val(),
						executedate:$('input[name=executedate_edit]').val(),
						executeScheme:$('input[name=executeScheme_edit]').val(),
						executeResult:$('input[name=executeResult_edit]').val(),
						remark:$('textarea[name=remarks_edit]').val(),
					}, 
					beforeSend : function() {
						$.messager.progress({
							text : '正在提交中.....',
						});
					},
					success : function(data, response, status) {
						$.messager.progress('close');
						// alert(data);
						if (data !=null) {
							$.messager.show({
								title : '提示',
								msg : '修改管理成功',
							})
							$('#scheme_edit').dialog('close').form('reset');
							$('#care_edit_total2').datagrid('reload');
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
				$('#scheme_edit').dialog('close').form('reset');
			}
		} ]
	})
	$('#total_edit').dialog({
		width : 700,
		height: 500,
		title : '设置提醒',
		modal : true,
		closed : true,
		onBeforeOpen:function(){
			$('#care_edit_tool').datagrid({
				url : 'careList',
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
				toolbar : '#total_edit_tool',
				columns : [ [ {
					field : 'id',
					title : '开启提醒',
					width : 10,
					checkbox : true
				},
				{
					field : 'remindName',
					title : '提醒名称',
					width : 10,
				}, 
				{
					field : 'remindTime',
					title : '提醒时间',
					width : 10,
				},
				{
					field : 'dictionaryvalue',
					title : '提醒类型',
					width : 10,
				},
				{
					field : 'remindRate',
					title : '提醒频率',
					width : 10,
				}, ] ],
				

			})
		}
	
	})
	$('#total_edit2').dialog({
		width : 700,
		height: 500,
		title : '关怀详情',
		modal : true,
		closed : true,	
		onBeforeOpen:function(){
			$('#care_edit_tool2').datagrid({
				url : 'schemeList',
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
				toolbar : '#total_edit_tool2',
				columns : [ [ {
					field : 'id',
					title : '开启提醒',
					width : 10,
					checkbox : true
				},
				{
					field : 'remindName',
					title : '关怀名称',
					width : 10,
				}, 
				{
					field : 'executedate',
					title : '执行时间',
					width : 10,
				},
				{
					field : 'dictionaryvalue',
					title : '执行方案',
					width : 10,
				},
				{
					field : 'executeResult',
					title : '执行结果',
					width : 10,
				},
				 ] ],

			})
		}
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
	
	care_tool = {
		back:function(){
			$('#total_edit').dialog('close').form('reset');
		},
		add : function(){
			$('#care_add').dialog('open');
		},
		edit : function() {
			var rows = $('#care_edit_tool').datagrid('getSelections');
			if (rows.length > 1) {
				$.messager.alert('警告操作', '编辑记录只能选定一条数据', 'warning');
			} else if (rows.length == 1) {
				$.ajax({
					url : 'getCare',
					data : {
						id : rows[0].indentid,
					},
					beforeSend : function() {
						$.messager.progress({
							text : '正在获取中.....',
						});
					},
				success : function(data, response, status) {
					$.messager.progress('close');
					if (data!=null) {
						$('#care_edit').form('load', {
							id_edit:data.id,
							remindName_edit:data.remindName,
							remindTime_edit:data.remindTime,
							remindType_edit:data.dictionaryvalue,
							remindDay_edit:data.remindDay,
							remindRate_edit:data.remindRate,
							remark_edit:data.remark,
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
			var rows = $('#care').datagrid('getSelections');
			if (rows.length > 1) {
				$.messager.alert('警告操作', '编辑记录只能选定一条数据', 'warning');
			} else if (rows.length == 1) {
				$.ajax({
					url : 'details2',
					data : {
						id : rows[0].indentid,
					},
					beforeSend : function() {
						$.messager.progress({
							text : '正在获取中.....',
						});
					},
				success : function(data, response, status) {
					$.messager.progress('close');
					if (data!=null) {	
						$("#clientName_edit").html(data.clientName)
						$("#clientSex_edit").html(data.clientSex)
						$("#clientType_edit").html(data.dictionaryvalue)
						$("#clientState_edit").html(data.clientState)
						$("#clientBrithday_edit").html(data.clientBrithday)
						$("#num_edit").html(data.num);
						$("#qualitySatisfied_edit").html(data.quality);
						$("#priceSatisfied_edit").html(1);
						$("#sumSatisfied_edit").html(data.sum);
						$('#total_edit').form('load', {
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
		search:function(){
			var sousuo_1 = $("#sousuo_1").val();
			$('#satisfied').datagrid({
				url : 'getclientindent2',
				queryParams: {
					sousuo_1:sousuo_1
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
				toolbar : '#satisfied_tool',
				columns : [ [ {
					field : 'id',
					title : '自动编号',
					width : 10,
					checkbox : true
				},
				{
					field : 'name',
					title : '客户姓名',
					width : 10,
				}, 
				{
					field : 'dictionaryvalue',
					title : '类型',
					width : 10,
				},
				{
					field : 'surveyTime',
					title : '调查时间',
					width : 10,
				},
				{
					field : 'qualitySatisfied',
					title : '质量满意度',
					width : 10,
				},
				{
					field : 'serveSatisfied',
					title : '服务满意度',
					width : 10,
				},{
					field : 'sumSatisfied',
					title : '总体满意度',
					width : 10,
				}, ] ],

			})
		},
		remove : function() {
			var rows = $('#care_edit_tool').datagrid('getSelections');
			if (rows.length > 0) {
				$.messager.confirm('确定操作', '你正在删除所选的记录吗？', function(flag) {
					if (flag) {
						var ids;
						var count = 0;
						for (var i = 0; i < rows.length; i++) {
							ids = rows[i].id;
							count++;
							$.ajax({
								url : 'delCare',
								data : "id=" + ids,
								beforeSend : function() {
									$('#total_edit_tool').datagrid('loading');
								},
								success : function(data) {
									if (data) {
										/*
										 * $('#satisfied').datagrid('loaded');
										 * $('#satisfied').datagrid('load');
										 */
										$('#total_edit_tool').datagrid('unselectAll');
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
	
	//方案
	scheme_tool = {
			add : function(){
				$('#scheme_add').dialog('open');
			},
			back:function(){
				$('#total_edit2').dialog('close').form('reset');
			},
			edit : function() {
				var rows = $('#care_edit_tool2').datagrid('getSelections');
				if (rows.length > 1) {
					$.messager.alert('警告操作', '编辑记录只能选定一条数据', 'warning');
				} else if (rows.length == 1) {
					$.ajax({
						url : 'getScheme',
						data : {
							id : rows[0].indentid,
						},
						beforeSend : function() {
							$.messager.progress({
								text : '正在获取中.....',
							});
						},
					success : function(data, response, status) {
						$.messager.progress('close');
						if (data!=null) {
							$('#scheme_edit').form('load', {
                                id_edit2:data.id,
								remindNames_edit:data.remindName,
								executedate_edit:data.executedate,
								executeScheme_edit:data.executeScheme,
								executeResult_edit:data.executeResult,
								remarks_edit:data.remark,
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
			query : function() {
				var rows = $('#care').datagrid('getSelections');
				if (rows.length > 1) {
					$.messager.alert('警告操作', '编辑记录只能选定一条数据', 'warning');
				} else if (rows.length == 1) {
					$.ajax({
						url : 'details2',
						data : {
							id : rows[0].indentid,
						},
						beforeSend : function() {
							$.messager.progress({
								text : '正在获取中.....',
							});
						},
					success : function(data, response, status) {
						$.messager.progress('close');
						if (data!=null) {	
							$("#clientName_edit2").html(data.clientName)
							$("#clientSex_edit2").html(data.clientSex)
							$("#clientType_edit2").html(data.dictionaryvalue)
							$("#clientState_edit2").html(data.clientState)
							$("#num_edit2").html(data.num);
							$("#qualitySatisfied_edit2").html(data.quality);
							$("#priceSatisfied_edit2").html(1);
							$("#sumSatisfied_edit2").html(data.sum);
							$('#total_edit2').form('load', {
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
				var sousuo_1 = $("#sousuo_2").val();
				alert(sousuo_1)
				$('#care').datagrid({
					url : 'getclientindent2',
					queryParams: {
						sousuo_1:sousuo_1
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
					toolbar : '#care_tool',
					columns : [ [ {
						field : 'indentid',
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
						title : '性别',
						width : 10,
					},
					{
						field : 'dictionaryvalue',
						title : '类型',
						width : 10,
					},
					{
						field : 'num',
						title : '价值等级',
						width : 10,
					},
					{
						field : 'quality',
						title : '质量满意度',
						width : 10,
					},
					{
						field : 'serve',
						title : '信誉等级',
						width : 10,
					},{
						field : 'sum',
						title : '关怀方案',
						width : 10,
					}, ] ],

				})
			},
			remove : function() {
				var rows = $('#care_edit_tool2').datagrid('getSelections');
				if (rows.length > 0) {
					$.messager.confirm('确定操作', '你正在删除所选的记录吗？', function(flag) {
						if (flag) {
							var ids;
							var count = 0;
							for (var i = 0; i < rows.length; i++) {
								ids = rows[i].id;
								count++;
								$.ajax({
									url : 'delScheme',
									data : "id=" + ids,
									beforeSend : function() {
										$('#care_edit_tool2').datagrid('loading');
									},
									success : function(data) {
										if (data) {
											/*
											 * $('#satisfied').datagrid('loaded');
											 * $('#satisfied').datagrid('load');
											 */
											$('#care_edit_tool2').datagrid('unselectAll');
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
	$("#remindType").combobox({
	   url:"clientStates?str=REMIND_TYPE", 
	   width:"80px",
       valueField:'dectionarycodingId',    
       textField:'dictionaryvalue',    
       panelHeight:'auto', 
	})
	$("#remindType_edit").combobox({
		 url:"clientStates?str=REMIND_TYPE", 
		 width:"80px",
        valueField:'dectionarycodingId',    
        textField:'dictionaryvalue',    
        panelHeight:'auto', 
	})
	$("#executeScheme").combobox({
		 url:"clientStates?str=EXECUTE_SCHEME", 
		 width:"80px",
       valueField:'dectionarycodingId',    
       textField:'dictionaryvalue',    
       panelHeight:'auto', 
	})
	$("#executeScheme_edit").combobox({
		 url:"clientStates?str=EXECUTE_SCHEME", 
		 width:"80px",
        valueField:'dectionarycodingId',    
        textField:'dictionaryvalue',    
        panelHeight:'auto', 
	})
	
	/*$("#remindTime").datebox({
		height:"20px",
	    current:new Date()    
	});
	$("#remindTime_edit").datebox({
		height:"20px",
	    current:new Date()    
	});*/
	/*$("#executedate").datebox({
		height:"20px",
	    current:new Date()    
	});
	$("#executedate_edit").datebox({
		height:"20px",
	    current:new Date()    
	});*/
	$("#shareState_1").combobox({
		 url:"clientStates?str=SHARE_STATE", 
		 width:"80px",
         valueField:'dectionarycodingId',    
         textField:'dictionaryvalue',    
         panelHeight:'auto', 
	})
	
})