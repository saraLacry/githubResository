$(function() {
	$("#INDEN_TSTATE").combobox({
		url : "clientStates?str=INDEN_TSTATE",
		width : "80px",
		valueField : 'dectionarycodingId',
		textField : 'dictionaryvalue',
		panelHeight : 'auto',
	})
	ajaxone();
});
function ajaxone(){
	var like = $("#likeIndentquery").val();
	var sousuo = $("#sousuoIndentQuery").val();
	var ddone = $("#ddone").val();
	var ddTwo = $("#ddTwo").val();
	var INDEN_TSTATE = $("#INDEN_TSTATE").val();
	/* var options = "";
	 options += (like + "," + sousuoIndentQuery + "," + ddone + "," + ddTwo + "," +INDEN_TSTATE);
	 alert(options)*/
	// DataGrid数据表格
	$('#indentquery').datagrid({// 创建数据表格
		url : 'indentquerytable',
		queryParams : {
			// voptions : options,
			like : like,
			sousuo : sousuo,
			ddone : ddone,
			ddTwo : ddTwo,
			INDEN_TSTATE : INDEN_TSTATE
		},
		border : true,// 边框是否取得
		fitColumns : true,// 自适应
		pagination : true,// 是否启用分页
		pageSize : 10,// 分页每页显示多少条
		// pageList : [ 10, 20, 30, 40, 50 ],// 分页列表选择显示10，20。。条
		pageList : [ 5,10, 15, 20, 25 ],
		pageNumber : 1,// 默认第一页
		// singleSelect:true,
		// sortName : 'date',// 默认以什么字段排序
		sortOrdr : 'desc',// 默认倒叙，还是证
		columns : [ [// 显示数据的单元格

		{
			field : 'indentid',
			title : 'a',
			width : 100,
			checkbox : true,
		}, {
			field : 'indentNumber',
			title : '订单类型/订单号',
			width : 100,

		}, {
			field : 'goodsNameall',
			title : '商品',
			width : 150,
		}, {
			field : 'clientresourceName',
			title : '收货人',
			width : 100,
		}, {
			field : 'goodsIndentallmoney',
			title : '订单金额',
			width : 100,
		}, {
			field : 'indentTime',
			title : '时间',
			width : 100,
		}, {
			field : 'indentState',
			title : '状态',
			width : 100,
		} ] ]
	});
}

	function queryIndentQuery() {
		ajaxone();
	}


function queryIndentQueryTwo() {
	
	var rows = $('#indentquery').datagrid('getSelections');// 得到选中的对象
	if (rows.length > 1) {
		$.messager.alert('警告操作', '编辑记录只能选定一条数据~', 'warning');// warning:显示警告窗口
	} else if (rows.length == 1) {
		$.ajax({
			url : 'queryindentxixi',
			type : 'post',
			data : {
				id : rows[0].indentid,// 获取选中的id号
			},
			beforeSend : function() {// 发送前触发
				$.messager.progress({// progress ：进度条显示
					text : '正在获取中。。。',
				});
			},
			// success:成功后 data:数据 response:响应 status:状态
			success : function(result) {
				$.messager.progress('close');// 进度条关闭
				if (result != null) {
					$("#indentnumber").html(result.indent.indentNumber);
					$("#clientresourceid").html(result.indent.clientresourceName);
					$("#goods").html(result.indent.goodsNameall);
					//$("#money").html(result.indent.goodsIndentallmoney);
					if(result.indent.paymentId==1){
						$("#paymentid").html("在线支付");
					}else{
						$("#paymentid").html("线下支付");
					}
					if(result.indent.indentdelivery==1){
						$("#indentdelivery").html("邮寄");
					}else{
						$("#indentdelivery").html("自取");
					}
					$("#indenttime").html(result.indent.indentTime);
					$("#indentstate").html(result.indent.indentState);
					$("#indentuserId").html(result.indent.userName);
					$("#app").html("");
					var app = "";
					app+='<div style="font-size:18px;font-weight: bold;padding-top: 20px">订单商品详细信息</div>';
					app+='<table class="tableindent">';
					for(var i =0;i<result.indentgoodslist.length;i++){
						app+='<tr>';
						app+='	<td>商品名：<span>'+result.indentgoodslist[i].goods.goodsName+'</span></td>';
						app+='	<td>价格：<span>'+result.indentgoodslist[i].indentGoodsMoney+'万</span></td>';
						app+='</tr>';
						app+='<tr>';
						app+='	<td  colspan="2">购买数量：<span>'+result.indentgoodslist[i].indentGoodsNumber+'件</span></td>';
						app+='</tr>';
					}
					app+='<tr>';
					app+='	<td colspan="2">订单总金额：<span>'+result.indent.goodsIndentallmoney+'</span></td>';
					app+='</tr>';
					app+='<tr>';
					app+='	<td colspan="2"><span>》》》》》》》》》》》》》》》》》》》》》》》《《《《《《《《《《《《《《《《《《《《《《《</span></td>';
					app+='</tr>';
					app+='</table>';
					$("#app").append(app);
					$('#queryindent').dialog('open');
					
				} else {
					$.messager.alert('警告操作', '似乎出错了。。。', 'warning');
				}

			},
		});
	} else if (rows.length == 0) {
		$.messager.alert('警告操作', '编辑纪录必须要选择一条', 'warning');// warning:显示警告窗口
	}

}
$('#queryindent').dialog({
	height:650,
	width : 750,
	title : '订单信息列表',
	iconCls : 'icon-edit',
	modal : true,// 不可编辑
	closed : true,// 默认情况下是关闭状态
	buttons : [ {
		text : '取消',
		iconCls : 'icon-redo',
		handler : function() {
			$('#queryindent').dialog('close').form('reset');// 重置
		},
	} ],

});