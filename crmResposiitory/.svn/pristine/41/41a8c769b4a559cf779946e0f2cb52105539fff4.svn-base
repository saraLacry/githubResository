$(function() {
	$('#indentstatisticstable').datagrid({// 创建数据表格
		url : 'getListstatistics',
		border : true,// 边框是否取得
		fitColumns : true,// 自适应
		pagination : true,// 是否启用分页
		pageSize : 10,// 分页每页显示多少条
		// pageList : [ 10, 20, 30, 40, 50 ],// 分页列表选择显示10，20。。条
		pageList : [ 10, 15, 20, 25 ],
		pageNumber : 1,// 默认第一页
		// singleSelect:true,
		// sortName : 'date',// 默认以什么字段排序
		sortOrdr : 'desc',// 默认倒叙，还是证
		columns : [ [// 显示数据的单元格

            {
 				field : 'id',
 				title : '自动编号',
 				width : 100,
 				checkbox : true,
 			},{
			field : 'data',
			title : '月份',
			width : 100,
		}, {
			field : 'count',
			title : '订单数量',
			width : 100,

		}, {
			field : 'allMoney',
			title : '总金额(万元)',
			width : 100,
		}, {
			field : 'forecast',
			title : '本月目标(万元)',
			width : 100,
			formatter : function(value, row, index) {
				if(value==null){
					return 0;
				}
				return value;
			},
		}, {
			field : 'sss',
			title : '完成率',
			width : 100,
			formatter : function(value, row, index) {
				var a = (parseFloat(row.allMoney)/parseFloat(row.forecast)*100).toFixed(2);
				if(row.forecast==null){
					return "0%";
				}
				
				return a+"%";
			},
		}  ] ]
	});
});
function data2change(){//第二次日历判断
	if($("#data2").val()<$("#data2").val()){
		alert("no")
	}
}

	 function statisticeQuery() {
		var data1 = $("#data1").val();
		var data2= $("#data2").val();
		// DataGrid数据表格
		$('#indentstatisticstable').datagrid({// 创建数据表格
			url : 'getListstatistics',
			queryParams : {
				data1 : data1,
				data2 : data2
			},
			border : true,// 边框是否取得
			fitColumns : true,// 自适应
			pagination : true,// 是否启用分页
			pageSize : 10,// 分页每页显示多少条
			// pageList : [ 10, 20, 30, 40, 50 ],// 分页列表选择显示10，20。。条
			pageList : [ 10, 15, 20, 25 ],
			pageNumber : 1,// 默认第一页
			// sortName : 'date',// 默认以什么字段排序
			sortOrdr : 'desc',// 默认倒叙，还是证

			columns : [ [// 显示数据的单元格

			             {
			  				field : 'id',
			  				title : '自动编号',
			  				width : 100,
			  				checkbox : true,
			  			},{
			 			field : 'data',
			 			title : '月份',
			 			width : 100,
			 		}, {
			 			field : 'count',
			 			title : '订单数量',
			 			width : 100,

			 		}, {
			 			field : 'allMoney',
			 			title : '总金额(万元)',
			 			width : 100,
			 		}, {
			 			field : 'forecast',
			 			title : '本月目标(万元)',
			 			width : 100,
			 			formatter : function(value, row, index) {
			 				if(value==null){
			 					return 0;
			 				}
			 				return value;
			 			},
			 		}, {
			 			field : 'sss',
			 			title : '完成率',
			 			width : 100,
			 			formatter : function(value, row, index) {
			 				var a = (parseFloat(row.allMoney)/parseFloat(row.forecast)*100).toFixed(2);
			 				if(row.forecast==null){
			 					return "0%";
			 				}
			 				
			 				return a+"%";
			 			},
			 		}  ] ]
		});
	 }
	 function statisticeQueryTwo() {
			
			var rows = $('#indentstatisticstable').datagrid('getSelections');// 得到选中的对象
			if (rows.length > 1) {
				$.messager.alert('警告操作', '编辑记录只能选定一条数据~', 'warning');// warning:显示警告窗口
			} else if (rows.length == 1) {
				 $('#indentstatisticsXiangqin').dialog('open');
				 $("#data").html(rows[0].data);
				 $("#count").html(rows[0].count);
				 $("#allMoney").html(rows[0].allMoney);
				 $("#mMoney").html(rows[0].forecast);
				 $("#sss").html((parseFloat(rows[0].allMoney)/parseFloat(rows[0].forecast)*100).toFixed(2));
			} else if (rows.length == 0) {
				$.messager.alert('警告操作', '编辑纪录必须要选择一条', 'warning');// warning:显示警告窗口
			}

		
	}
	$('#indentstatisticsXiangqin').dialog({
		width : 750,
		title : '订单信息列表',
		iconCls : 'icon-edit',
		modal : true,// 不可编辑
		closed : true,// 默认情况下是关闭状态
		buttons : [ {
			text : '取消',
			iconCls : 'icon-redo',
			handler : function() {
				$('#indentstatisticsXiangqin').dialog('close').form('reset');// 重置
			},
		} ],

	});