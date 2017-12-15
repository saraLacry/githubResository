<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<div style="padding: 0 0 0 300px; color: #333;" id="analyzeDiv">
	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="analyzeQuery()">查看</a>&nbsp;&nbsp;&nbsp;&nbsp;   
	联系人:<input id="analyze" type=text  class="easyui-validatebox"  required="required" /><a id="analyzeaid" href="#"
		class="easyui-linkbutton" iconCls="icon-search" onclick="analyzeSelect()">查询</a>
</div>
<table id="analyzeManager">
</table>
<div id="analyzeVote"></div>

<script type="text/javascript">

function analyzeQuery(){
	var select = $("#analyzeManager").datagrid("getSelected");
	if(select!=null){
		var data=''
		if(select.name!=null){
			 data = 'analyzeQuery?name='+select.name+'&date='+select.date;
		}else{
			data = 'analyzeQuery?date='+select.date;
		}
		$('#analyzeVote').dialog({    
		    title: '查看机会',    
		    width: 800,    
		    height: 600,  
		    inline:true,
		    href:data,
		    modal: true,
		    buttons:[{
				text:'关闭',
				iconCls:'icon-no',
				handler:function(){
					$('#analyzeVote').window('close');
				},
			}],

		});
	}else{
		alert("请选择一行数据")
	}
}
	$(function() {
		$("#analyzeManager").datagrid({
			fit : true,
			url : 'analyzePager',
			fitColumns:true,
			striped:true,
			rownumbers:true,
			border:false,
			pagination:true,
			pageSize:10,
			pageList:[5,10,15,20],
			pageNumber:1,
			singleSelect:true,
			toolbar:'#analyzeDiv',
			columns : [ [ {
				field:'id',
				width : 400,
				checkbox:true,
			}, {
				field : 'money',
				title : '销售金额(单位:万元)',
				width : 350,
			}, {
				field : 'date',
				title : '月份',
				width : 350,
			}, {
				field : 'together',
				title : '同比',
				width : 350,
			},{
				field : 'loopWith',
				title : '环比',
				width : 400,
			}] ],
		});
	})
	
	function analyzeSelect(){
		$('#analyzeManager').datagrid('load',{
			analyze:$("#analyze").val(),
		}); 
	}
	
	function analyzeClose(){
		$('#analyzeVote').window('close');
	}
</script>