$(function() {
	var wayc = $("#way").val();
	var sousuoc = $("#sousuo").val();
	// DataGrid数据表格
	$('#credit').datagrid({// 创建数据表格
		url : 'getclientindent',
		queryParams: {
			way:wayc,
			sousuo:sousuoc
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
		columns : [ [// 显示数据的单元格
		
         {
 			field : 'id',
 			title : '自动编号',
 			width : 100,
 			checkbox : true,
 		},{
 			field : 'clientName',
			title : '客户姓名',
			width : 100,
			
		}, {
			field : 'clientSex',
			title : '性别',
			width : 100,
		}, {
			field : 'dictionaryvalue',
			title : '类型',
			width : 100,
		}, {
			field:'num',
			title:'已消费次数',
			width:100,
		},{
			field : 'grade',
			title : '信誉等级',
			width : 100,
			formatter : function(value, row, index) {
				return 'A'
			}
		}
		] ]
	});
});

indent_tool = {
		query:function(){
			var wayc = $("#way").val();
			var sousuoc = $("#sousuo").val();
			
			// DataGrid数据表格
			$('#credit').datagrid({// 创建数据表格
				url : 'getclientindent',
				queryParams: {
					way:wayc,
					sousuo:sousuoc
				},
				border :true,// 边框是否取得
				fitColumns : true,// 自适应
				pagination : true,// 是否启用分页
				pageSize : 10,// 分页每页显示多少条
				//pageList : [ 10, 20, 30, 40, 50 ],// 分页列表选择显示10，20。。条
				pageList : [ 10,15,20,25],
				pageNumber : 1,// 默认第一页
				//sortName : 'date',// 默认以什么字段排序
				sortOrdr : 'desc',// 默认倒叙，还是证 
				
				columns : [ [// 显示数据的单元格
				
		             {
		      			field : 'id',
		      			title : '自动编号',
		      			width : 100,
		      			checkbox : true,
		      		},{
		      			field : 'clientName',
		     			title : '客户姓名',
		     			width : 100,
		     			
		     		}, {
		     			field : 'clientSex',
		     			title : '性别',
		     			width : 100,
		     		}, {
		     			field : 'dictionaryvalue',
		     			title : '类型',
		     			width : 100,
		     		}, {
		     			field : 'clientState',
		     			title : '状态',
		     			width : 100,
		     		},{
		     			field:'num',
		     			title:'已消费次数',
		     			width:100,
		     		},{
		     			field : 'money',
		     			title : '消费总额（单位：万元）',
		     			width : 100,
		     		}, {
		     			field : 'userName',
		     			title : '服务代表',
		     			width : 100,
		     		}
				] ]
			});
		},
		queryTwo:function(){
			
			var rows = $('#credit').datagrid('getSelections');// 得到选中的对象
			if (rows.length > 1) {
				$.messager.alert('警告操作', '编辑记录只能选定一条数据~', 'warning');// warning:显示警告窗口
			} else if (rows.length == 1) {
				$.ajax({
					url : 'details',
					type : 'post',
					data : {
						id : rows[0].id,// 获取选中的id号
					},
					beforeSend : function() {// 发送前触发
						$.messager.progress({// progress ：进度条显示
							text : '正在获取中。。。',
						});
					},
					// success:成功后 data:数据 response:响应 status:状态
					success : function(result, status) {
						$.messager.progress('close');// 进度条关闭
						if(result!=null){
							$("#clientName").html(result.clientName);
							$("#clientSex").html(result.clientSex);
							$("#clientType").html(result.dictionaryvalue);
							$("#clientCode").html(result.clientCode);
							$("#workPhone").html(result.workPhone);
							$("#userId").html(result.userName);
							$("#num").html(result.num);
							$("#clientState").html(result.clientState);
							$("#email").html(result.email);
							 $('#credit_queryTwo').dialog('open');
						}else{
							$.messager.alert('警告操作', '似乎出错了。。。', 'warning');
						}
						
					},
				});
			} else if (rows.length == 0) {
				$.messager.alert('警告操作', '编辑纪录必须要选择一条', 'warning');// warning:显示警告窗口
			}
			
		},
		next : function() {
			var rows = $('#credit').datagrid('getSelections');// 得到选中的对象
			if (rows.length > 1) {
				$.messager.alert('警告操作', '编辑记录只能选定一条数据~', 'warning');// warning:显示警告窗口
			} else if (rows.length == 1) {
				$.ajax({
					url : 'details',
					type : 'post',
					data : {
						id : rows[0].id,// 获取选中的id号
					},
					beforeSend : function() {// 发送前触发
						$.messager.progress({// progress ：进度条显示
							text : '正在获取中。。。',
						});
					},
					// success:成功后 data:数据 response:响应 status:状态
					success : function(result, status) {
						$.messager.progress('close');// 进度条关闭
						if(result!=null){
							$("#clientNameTwo").html(result.clientName);
							$("#clientSexTwo").html(result.clientSex);
							$("#clientTypeTwo").html(result.dictionaryvalue);
							$("#clientStateTwo").html(result.clientState);
							$("#workPhoneTwo").html(result.workPhone);
							$("#userIdTwo").html(result.userName);
							$("#numTwo").html(result.num);
							//$("#money").html(result.money);
							 $('#credit_queryThere').dialog('open');
						}else{
							$.messager.alert('警告操作', '似乎出错了。。。', 'warning');
						}
						
					},
				});
			} else if (rows.length == 0) {
				$.messager.alert('警告操作', '编辑纪录必须要选择一条', 'warning');// warning:显示警告窗口
			}
			//location.href="indentmanage";
		
	}
}
$('#credit_queryTwo').dialog({
	width : 550,
	title : '客户信息查看',
	iconCls : 'icon-edit',
	modal : true,// 不可编辑
	closed : true,// 默认情况下是关闭状态
	buttons : [ {
		text : '取消',
		iconCls : 'icon-redo',
		handler : function() {
			$('#credit_queryTwo').dialog('close').form('reset');// 重置
		},
	} ],

});

$('#credit_queryThere').dialog({
	width : 800,
	title : '下单',
	iconCls : 'icon-edit',
	modal : true,// 不可编辑
	closed : true,// 默认情况下是关闭状态
	onBeforeOpen:function(){//在面板展开之前触发，返回false可以终止展开操作。
		$('#credit_querytable').datagrid({// 创建数据表格
			url : 'getGoodslist',
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
			columns : [ [// 显示数据的单元格
			
	         {
	 			field : 'goodsId',
	 			title : '自动编号',
	 			width : 100,
	 			checkbox : true,
	 		},{
	 			field : 'goodsName',
				title : '商品名称',
				width : 100,
				
			}, {
				field : 'goodsModel',
				title : '型号',
				width : 100,
			}, {
				field : 'goodsMoney',
				title : '单价（单位：万元）',
				width : 100,
			}, {
				field : 'number',
				title : '数量',
				width : 100,
				formatter : function(value, row, index) {
					//alert("dddd"+row.goodsId)//商品的id号（行记录数据）
					return '<input type="text" name="number'+row.goodsId+'" id="number'+row.goodsId+'" value="'+value+'" style="height: 16px; width: 40px;padding-left: 30px;">';
				},
			},{
				field:'goodsReserve',
				title:'库存',
				width:100,
			}
			] ]
	
		});
	},
	buttons : [  {
		text : '提交',
		iconCls : 'icon-ok',
		handler : function() {
			var rows = $('#credit_querytable').datagrid('getSelections');// 得到选中的对象
			if (rows.length > 0) {
				$.messager.confirm('正确操作', '开始下单', function(flag){
					if(flag){
						var options = "";
						var ids = [];
						for(var i = 0;i<rows.length;i++){
							//alert($("#number"+rows[i].goodsId+"").val())//选择商品的数量
							options+=(rows[i].goodsId+",");
							options+=($("#number"+rows[i].goodsId).val()+",");
						}
							$.ajax({
								url : 'totalQian',
								type : 'post',
								data : {
									voptions:options,
								},
								// success:成功后 data:数据 response:响应 status:状态
								success : function(result, status) {
									if(result){
										//$('#user').datagrid('load');
										//$('#user').datagrid('unselectAll');
										$('#credit_querytotal').dialog('open');
										$('#clientNameThere').html(result.clientName);
										$('#workPhoneThere').html(result.workPhone);
										$('#adressThere').html(result.adress);
										$.messager.show({
											title : '提示',
											msg :'订单生成成功！',
										});
									}
								},
							});
						
					}
				});
				
			} else{
				$.messager.alert('提示', '请选择要下单的商品！', 'info');// warning:显示警告窗口
			}
		},
	}, {
		text : '取消',
		iconCls : 'icon-redo',
		handler : function() {
			$('#credit_queryThere').dialog('close').form('reset');// 重置
		},
	}],

});
