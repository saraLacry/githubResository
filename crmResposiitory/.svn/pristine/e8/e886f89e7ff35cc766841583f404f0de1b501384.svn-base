$(function() {
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
			field : 'quality',
			title : '质量满意度',
			width : 10,
		},
		{
			field : 'serve',
			title : '服务满意度',
			width : 10,
		},{
			field : 'sum',
			title : '总体满意度',
			width : 10,
		}, ] ],

	})
	$('#satisfied_add')
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
								url : 'fortifySatisfied',
								type : 'post',
								data : {
									id:$('input[name=indentid]').val(),
									indentid:$('input[name=indentid_edit]').val(),
									qualitySatisfied:$('input[name=qualitySatisfied]').val(),
									priceSatisfied:$('input[name=priceSatisfied]').val(),
									serveSatisfied:$('input[name=serveSatisfied]').val(),
									sumSatisfied:$('input[name=sumSatisfied]').val(),
									clientFeedback:$('textarea[name=clientFeedback]').val(),
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
										$('#satisfied_add').dialog('close').form('reset');
										$('#satisfied').datagrid('reload');
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
						$('#satisfied_add').dialog('close').form(
								'reset');
					}
				} ]
			});
	$('#satisfied_edit').dialog({
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
					url : 'modifySatisfied',
					data : {
						id:$('input[name=id_edit]').val(),
						qualitySatisfied:$('input[name=qualitySatisfied_edit]').val(),
						priceSatisfied:$('input[name=priceSatisfied_edit]').val(),
						serveSatisfied:$('input[name=serveSatisfied_edit]').val(),
						sumSatisfied:$('input[name=sumSatisfied_edit]').val(),
						clientFeedback:$('textarea[name=clientFeedback_edit]').val(),
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
							$('#satisfied_edit').dialog('close').form('reset');
							$('#satisfied').datagrid('reload');
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
				$('#satisfied_edit').dialog('close').form('reset');
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
	
	satisfied_tool = {
		reload : function() {
			$('#satisfied').datagrid('reload');
		},
		redo : function() {
			$('#satisfied').datagrid('unselectAll');
		},
		add : function() {
			var rows = $('#satisfied').datagrid('getSelections');
			if (rows.length > 1) {
				$.messager.alert('警告操作', '编辑记录只能选定一条数据', 'warning');
			} else if (rows.length == 1) {
				$.ajax({
					url : 'details2',
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
					if (data.quality==null) {
						$("#clientCode").html(data.clientCode)
						$("#clientName").html(data.clientName)
						$("#clientSex").html(data.clientSex)
						$("#clientType").html(data.dictionaryvalue)
						$("#clientState").html(data.clientState)
						$("#num").html(data.num);
						$('#satisfied_add').form('load', {
							clientId:data.id,
							id:data.csid,
							indentid:data.indentid,
						}).dialog('open');
						
						} else {
							$.messager.alert('获取失败，该用户已评论，请重试',
									'warning');
						}
					}
				})
			} else if (rows.length == 0) {
				$.messager.alert('警告操作', '编辑记录至少选定一条数据', 'warning');
			}
		},
		edit : function() {
			var rows = $('#satisfied').datagrid('getSelections');
			if (rows.length > 1) {
				$.messager.alert('警告操作', '编辑记录只能选定一条数据', 'warning');
			} else if (rows.length == 1) {
				$.ajax({
					url : 'details2',
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
					if (data!=null) {
						$("#clientCode_edit").html(data.clientCode)
						$("#clientName_edit").html(data.clientName)
						$("#clientSex_edit").html(data.clientSex)
						$("#clientType_edit").html(data.dictionaryvalue)
						$("#clientState_edit").html(data.clientState)
						$("#num_edit").html(data.num);
						$('#satisfied_edit').form('load', {
							clientId_edit:data.id,
							id_edit:data.csid,
							indentid_edit:data.indentid,
							qualitySatisfied_edit:data.quality,
							priceSatisfied_edit:data.price,
							serveSatisfied_edit:data.serve,
							sumSatisfied_edit:data.sum,
							clientFeedback_edit:data.Feedback,
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
			var rows = $('#satisfied').datagrid('getSelections');
			/*alert(rows[0].id)
			alert(rows[0].csid)
			alert(rows[0].indentid)*/
			
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
						$("#clientCode_edit").html(data.clientCode)
						$("#clientName_edit").html(data.clientName)
						$("#clientSex_edit").html(data.clientSex)
						$("#clientType_edit").html(data.dictionaryvalue)
						$("#clientState_edit").html(data.clientState)
						$("#num_edit").html(data.num);
						$('#satisfied_edit').form('load', {
							qualitySatisfied_edit:data.quality,
							priceSatisfied_edit:data.price,
							serveSatisfied_edit:data.serve,
							sumSatisfied_edit:data.sum,
							clientFeedback_edit:data.Feedback,
						}).dialog('open');
						
						} else {
							$.messager.alert('获取失败，未知错误导致失败，请重试',
									'该用户还没进行评价');
							$('#pass').select();
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
					field : 'clientName',
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
					field : 'quality',
					title : '质量满意度',
					width : 10,
				},
				{
					field : 'serve',
					title : '服务满意度',
					width : 10,
				},{
					field : 'sum',
					title : '总体满意度',
					width : 10,
				}, ] ],

			})
		},
		remove : function() {
			var rows = $('#satisfied').datagrid('getSelections');
			if (rows.length > 0) {
				$.messager.confirm('确定操作', '你正在删除所选的记录吗？', function(flag) {
					if (flag) {
						var ids;
						var count = 0;
						for (var i = 0; i < rows.length; i++) {
							ids = rows[i].id;
							count++;
							$.ajax({
								url : 'delSatisfied',
								data : "id=" + ids,
								beforeSend : function() {
									$('#satisfied').datagrid('loading');
								},
								success : function(data) {
									if (data) {
										/*
										 * $('#satisfied').datagrid('loaded');
										 * $('#satisfied').datagrid('load');
										 */
										$('#satisfied').datagrid('unselectAll');
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
})