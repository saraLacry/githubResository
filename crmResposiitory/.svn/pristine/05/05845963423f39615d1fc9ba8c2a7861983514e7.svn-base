$(function() {
	var wayc = $("#way").val();
	var sousuoc = $("#sousuo").val();
	// DataGrid数据表格
	$('#replaceindent').datagrid({// 创建数据表格
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
		pageList : [ 5,10,15,20],
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
	$("#type").combobox({
		width:"80px",
		url:"clientStates?str=CLIENT_TYPE",  
         valueField:'dectionarycodingId',    
         textField:'dictionaryvalue',    
         panelHeight:'auto', 
	})
});

function queryreplaceTwo(){
	
	var rows = $('#replaceindent').datagrid('getSelections');// 得到选中的对象
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
					$("#adress").html(result.adress);
					$("#clientBrithday").html(result.clientBrithday);
					$("#remark").html(result.remark);
					$('#manager_queryTwo').dialog('open');
				}else{
					$.messager.alert('警告操作', '似乎出错了。。。', 'warning');
				}
				
			},
		});
	} else if (rows.length == 0) {
		$.messager.alert('警告操作', '编辑纪录必须要选择一条', 'warning');// warning:显示警告窗口
	}
	
}
		function queryreplace(){
			var wayc = $("#way").val();
			var sousuoc = $("#sousuo").val();
			
			// DataGrid数据表格
			$('#replaceindent').datagrid({// 创建数据表格
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
		}
		
	 function  nextOne() {
		var rows = $('#replaceindent').datagrid('getSelections');// 得到选中的对象
		
		if (rows.length > 1) {
			$.messager.alert('警告操作', '编辑记录只能选定一条数据~', 'warning');// warning:显示警告窗口
		} else if (rows.length == 1) {
			if(rows[0].clientState=="流失"||rows[0].clientState=="禁用"){
				$.messager.alert('警告操作', '客户已经流失，或者已经禁用，无法代替下单', 'warning');// warning:显示警告窗口
			}else{
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
						 $('#manager_queryThere').dialog('open');
					}else{
						$.messager.alert('警告操作', '似乎出错了。。。', 'warning');
					}
					
				},
			});
			}
		} else if (rows.length == 0) {
			$.messager.alert('警告操作', '编辑纪录必须要选择一条', 'warning');// warning:显示警告窗口
		}
		//location.href="indentmanage";
	
}

$('#manager_queryTwo').dialog({
	height:550,
	width : 750,
	title : '客户信息查看',
	iconCls : 'icon-edit',
	modal : true,// 不可编辑
	closed : true,// 默认情况下是关闭状态
	buttons : [ {
		text : '取消',
		iconCls : 'icon-redo',
		handler : function() {
			$('#manager_queryTwo').dialog('close').form('reset');// 重置
		},
	} ],

});
function mustDigit(input) {//只能输入数字
	$("#telephone").show();
	if(event.keyCode < 48 || event.keyCode > 57) {
		event.returnValue = false;
	}
	if(event.keyCode == 46) {
		event.returnValue = true;
		if(!input.value)
			event.returnValue = false;
		if(input.value.indexOf('.') != -1) 
			event.returnValue = false;
	}
	if(input.value != ""  || input.value != null) {
		var arrs = input.value.split('.');
		if(arrs[1]) {
			if(arrs[1].length == 2) {
				event.returnValue = false;
			}
		}
		if(input.value.indexOf("0") == 0 && event.keyCode == 48) {
			event.returnValue = false;
		}
	}
}
$('#manager_queryThere').dialog({
	width : 700,
	title : '下单',
	height:750,
	iconCls : 'icon-edit',
	modal : true,// 不可编辑
	closed : true,// 默认情况下是关闭状态
	onBeforeOpen:function(){//在面板展开之前触发，返回false可以终止展开操作。
		$('#manager_querytable').datagrid({// 创建数据表格
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
					var one = '<img src="img/taobao_minus.jpg" alt="minus"onclick="minus('+row.goodsId+')"/>&nbsp;';
					one += '<input type="text" name="number'+row.goodsId+'" id="number'+row.goodsId+'" value="'+value+'" style="height: 16px; width: 26px;padding-left: 24px;" onkeydown="mustDigit(this)" onchange="bian('+row.goodsId+','+row.goodsReserve+')"> ';
					one+='&nbsp;<img src="img/taobao_adding.jpg" alt="add"  onclick="add('+row.goodsId+','+row.goodsReserve+')"/>';
					return one;
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
			var rows = $('#manager_querytable').datagrid('getSelections');// 得到选中的对象
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
										$('#manager_querytotal').dialog('open');
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
			$('#manager_queryThere').dialog('close').form('reset');// 重置
		},
	}],

});

function bian(r,s){
	var num=$("#number"+r).val();
	if(num>=s){
		$.messager.confirm('提醒', '库存不够了哦仓库只有     '+s+' 件商品，请重新输入,商品默认一件', function(flag){
			$("#number"+r).val("1");
		})
	}
}
function minus(r){
	var num=$("#number"+r).val();
	if(parseInt(num)<=1){//判断数量不能低于1
		alert("数量不能低于1！");
		return;	
	}
	$("#number"+r).val(parseInt(num)-1);//就让输入框的值减1
}
function add(r,goodsReserve){
	var num=$("#number"+r).val();
	if(parseInt(num)==parseInt(goodsReserve)){
		$.messager.confirm('提醒', '库存不够了哦', function(flag){
			return;
		})
			return;
	}
	$("#number"+r).val(parseInt(num)+1);//就让输入框的值加1
}

var goodsMoney ="";
var moneyTwo=0;
var suml= 0;
$('#manager_querytotal').dialog({
	width : 700,
	height:750,
	title : '订单结算',
	iconCls : 'icon-ok',
	modal : true,// 不可编辑
	closed : true,// 默认情况下是关闭状态
	onBeforeOpen:function(){//在面板展开之前触发，返回false可以终止展开操作。
		$('#manager_querytotaltable').datagrid({// 创建数据表格
			url : 'total',
			width:500,
			border :true,// 边框是否取得
			fitColumns : true,// 自适应
			pagination : true,// 是否启用分页
			pageSize : 10,// 分页每页显示多少条
			//pageList : [ 10, 20, 30, 40, 50 ],// 分页列表选择显示10，20。。条
			pageList : [ 5,10,15,20],
			pageNumber : 1,// 默认第一页
			//singleSelect:true,
			sortName : 'date',// 默认以什么字段排序
			sortOrdr : 'desc',// 默认倒叙，还是证 
			columns : [ [// 显示数据的单元格
			
	        {
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
				formatter : function(value, row, index) {
					goodsMoney = parseFloat(row.goodsMoney);
					return row.goodsMoney;
				}
			}, {
				field : 'number',
				title : '数量',
				width : 100,
				formatter : function(value, row, index) {
					var one = parseFloat(goodsMoney*(parseFloat(row.number)));//单个总价
					moneyTwo = parseFloat(moneyTwo) + parseFloat(one);
					suml += parseFloat(row.number);
					return row.number;
				}
			},{
				field:'goodsReserve',
				title:'库存',
				width:100,
			}
			] ], 
			onLoadSuccess:function(){//data 在数据加载成功的时候触发。
				//moneyTwo = Math.ceil(moneyTwo);
				$("#allmoneyOne").html(moneyTwo.toFixed(2));
				
				if($("#delivery").val()=="邮寄"){//运费
					$("#yunfei").html("10.00");
					$("#allmoneyTwo").html((parseFloat(moneyTwo)+10).toFixed(2));				
					$("#allmoneyThere").html((parseFloat(moneyTwo)+10).toFixed(2));	
					$("#suml").html(suml);
				}else{
					$("#allmoneyTwo").html(moneyTwo.toFixed(2));				
					$("#allmoneyThere").html(moneyTwo.toFixed(2));
					$("#suml").html(suml);
				}
			}
	
		});
	},
	buttons : [  {
		text : '提交',
		iconCls : 'icon-ok',
		handler : function() {
			if($("#sub").val()=="修改"){
				$.messager.confirm('正确操作', '开始结算', function(flag){
					if(flag){
							$.ajax({
								url : 'addIndent',
								type : 'post',
								data : {
									pay:$("#pay").val(),
									delivery:$("#delivery").val(),
									clientName:$("#clientNameThere").html(),
									workPhone:$("#workPhoneThere").html(),
									adress:$("#adressThere").html(),
								},
								// success:成功后 data:数据 response:响应 status:状态
								success : function(result, status) {
									if(result){
										$('#replaceindent').datagrid('load');
										$('#replaceindent').datagrid('unselectAll');
										$('#manager_querytotal').dialog('close').form('reset');// 重置
										$('#manager_queryThere').dialog('close').form('reset');// 重置
										$.messager.show({
											title : '提示',
											msg :'下单结算成功！！',
										});
									}
								},
							});
						
					}
				});
			}else{
				$.messager.confirm('提示', '请确认用户信息！！');
			}
				
				
			
		},
	}, {
		text : '取消',
		iconCls : 'icon-redo',
		handler : function() {
			$('#manager_querytotal').dialog('close').form('reset');// 重置
			goodsMoney ="";
			moneyTwo=0;
		},
	}],


	
});

$("#delivery").change(function(){
	if($("#delivery").val()=="邮寄"){//运费
		$("#yunfei").html("10.00");
		$("#allmoneyTwo").html((parseFloat(moneyTwo)+10).toFixed(2));				
		$("#allmoneyThere").html((parseFloat(moneyTwo)+10).toFixed(2));			
	}else{
		$("#yunfei").html("0.00");
		$("#allmoneyTwo").html(moneyTwo.toFixed(2));				
		$("#allmoneyThere").html(moneyTwo.toFixed(2));
	}
})
function fanhui(){
	$('#manager_querytotal').dialog('close').form('reset');// 重置
}

function udpateOne(){
	if($("#sub").val()=="修改"){
		var name = $("#clientNameThere").html();
		var phone = $("#workPhoneThere").html();
		var address = $("#adressThere").html();
		$("#name").html('<input type = "text" id="one" value="'+name+'" size = "10" >')
		$("#phone").html('<input type = "text" id="two"  value="'+phone+'" size = "10"onkeydown="mustDigit(this)"> ')
		$("#address").html('<input type = "text" id="there"  value="'+address+'" size = "10">')
		$("#sub").val("确认");
	}else{
		if($("#one").val()==""||$("#two").val()==""||$("#there").val()==""){
			$.messager.confirm('提示', '用户信息不能为空！！');
		}else{
			$("#name").html('<span id="clientNameThere">'+$("#one").val()+'</span>')
			$("#phone").html('<span id="workPhoneThere">'+$("#two").val()+'</span>')
			$("#address").html('<span id="adressThere">'+$("#there").val()+'</span>')
			$("#sub").val("修改");
		}
	}
	
}
