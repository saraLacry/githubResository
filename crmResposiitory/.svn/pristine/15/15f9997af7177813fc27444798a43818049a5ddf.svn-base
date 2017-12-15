<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<table id="analyzeQuery"></table>
<script type="text/javascript">

$(function() {
	var  data= "${analyze.date}";
	var  deptId = "${analyze.name}"
		$("#analyzeQuery").datagrid({
			fit : true,
			url : 'queryAnalyze?analyze='+data+'&deptId='+deptId,
			fitColumns:true,
			striped:true,
			rownumbers:true,
			border:false,
			pagination:true,
			pageSize:10,
			pageList:[5,10,15,20],
			pageNumber:1,
			singleSelect:true,
			//toolbar:'#analyzeDiv',
			columns : [ [ {
				field:'id',
				width : 400,
				checkbox:true,
			},{
				field : 'name',
				title : '名字',
				width : 350,
			}, {
				field : 'money',
				title : '销售金额(单位:万元)',
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
</script>