<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<script type="text/javascript">
	//$('#manager_querytotal').dialog('open');
	$(function() {
		sss();
	});
	function sss() {
		var wayc = $("#wayWorth").val();
		var sousuoc = $("#sousuoWorth").val();
		// DataGrid数据表格
		$('#replaceindentWorth').datagrid({// 创建数据表格
			url : 'getclientindent',
			queryParams : {
				way : wayc,
				sousuo : sousuoc
			},
			border : true,// 边框是否取得
			fitColumns : true,// 自适应
			pagination : true,// 是否启用分页
			pageSize : 10,// 分页每页显示多少条
			//pageList : [ 10, 20, 30, 40, 50 ],// 分页列表选择显示10，20。。条
			pageList : [ 5, 10, 15, 20 ],
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
			}, {
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
			}, {
				field : 'num',
				title : '已消费次数',
				width : 100,
			}, {
				field : 'money',
				title : '消费总额（单位：万元）',
				width : 100,
			}, {
				field : 'userName',
				title : '服务代表',
				width : 100,
			} ] ]
		});
		$("#type").combobox({
			 url:"clientStates?str=CLIENT_TYPE", 
			 width:"80px",
	        valueField:'dectionarycodingId',    
	        textField:'dictionaryvalue',    
	        panelHeight:'auto', 
		})
	}
	function queryworth() {
		sss();
	}
	$('#manager_queryWorth').dialog({
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
				$('#manager_queryWorth').dialog('close').form('reset');// 重置
			},
		} ],

	});
	
	function queryworthTwo(){
		
		var rows = $('#replaceindentWorth').datagrid('getSelections');// 得到选中的对象
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
						$("#clientNamea").html(result.clientName);
						$("#clientSexa").html(result.clientSex);
						$("#clientTypea").html(result.dictionaryvalue);
						$("#clientCodea").html(result.clientCode);
						$("#workPhonea").html(result.workPhone);
						$("#userIda").html(result.userName);
						$("#numa").html(result.num);
						$("#clientStatea").html(result.clientState);
						$("#emaila").html(result.email);
						$('#manager_queryWorth').dialog('open');
					}else{
						$.messager.alert('警告操作', '似乎出错了。。。', 'warning');
					}
					
				},
			});
		} else if (rows.length == 0) {
			$.messager.alert('警告操作', '编辑纪录必须要选择一条', 'warning');// warning:显示警告窗口
		}
		
	}
</script>
<style type="text/css">
.onea {
	float: left;
	font-size: 12px;
	padding-top: 6px;
}

.twoa {
	padding-left: 600px;
}

.contenta {
	padding: 10px 35px;
}

pa {
	padding-left: 60px;
}

.tableindenta {
	padding: 20px;
	font-size: 16px;
	width: 500px;
	height: 300px;
}

.tableindenta td {
	width: 350px;
}

.contentTwoa {
	padding: 10px 35px;
}

.tableindentTwoa {
	padding-left: 120px;
}

.tableindentTwoa td {
	width: 350px;
}

.td1a {
	padding-top: 16px;
	font-weight: bold;
}

.td2a {
	padding-left: 60px;
	color: green;
}
/* .td3{
	padding-left:600px;
} */
.tablesssa {
	border: 1px;
}

.tablesssa tr {
	font-size: 14px;
}

.jesua p {
	padding-left: 350px;
}

span {
	/* color:red; */
	font-weight: bold;
}
</style>

<div id="tabs">
	<div title="返回列表"
		style="padding: 0 10px; display: block; background: #F3F3F3;">
		<br>

		<div class="contenta">
			<div style="font-size: 12px;">订单管理>> 代下订单</div>
			<br>
			<p>
				<select id="wayWorth" class="easyui-combobox" name="wayWorth"
					style="width: 100px; height: 26px;">
					<option value="客户姓名">客户姓名</option>
					<option value="联系电话">联系电话</option>
				</select> <input type="text" name="sousuoWorth" id="sousuoWorth"
					style="height: 20px; width: 200px;">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 类型：<select id="type"></select>
				&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton"
					iconCls="icon-search" onclick="queryworth();">点击查询</a>
			<div style="border-bottom: 2px solid #ccc;"></div>
			<br>
			<div class="onea">客户信息列表</div>
			<div class="twoa">
				<a href="#" class="easyui-linkbutton" iconCls="icon-search"
					onclick="queryworthTwo();">查看详情</a>

			</div>
			<br>
			<table id="replaceindentWorth"></table>
		</div>

	</div>
</div>

<form id="manager_queryWorth"
	style="margin: 0; padding: 5px 0 0 25px; color: #333;">
	<input type="hidden" id="id" name="id" class="textbox"
		style="width: 200px">
	<table class="tableindenta">
		<tr>
			<td>客户姓名：<span id="clientNamea"></span>
			</td>
			<td>性别：<span id="clientSexa"></span>
			</td>
		</tr>
		<tr>
			<td>客户类型：<span id="clientTypea"></span></td>
			<td>客户编号：<span id="clientCodea"></span></td>
		</tr>
		<tr>
			<td>联系电话：<span id="workPhonea"></span></td>
			<td>服务代表：<span id="userIda"></span></td>
		</tr>
		<tr>
			<td>已消费次数：<span id="numa"></span></td>
			<td>客户状态：<span id="clientStatea"></span></td>
		</tr>
		<tr>
			<td>电子邮件：<span id="emaila"></span></td>
			<!-- <td>消费总额：<span id="money"></span></td> -->
		</tr>
	</table>
</form>

