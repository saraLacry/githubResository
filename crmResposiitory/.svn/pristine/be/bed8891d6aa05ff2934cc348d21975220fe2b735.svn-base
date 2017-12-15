<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<div style="padding: 0 0 0 300px; color: #333;" id="chanceDiv">
	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="chanceAddItem()">添加</a>&nbsp;&nbsp;&nbsp;&nbsp; 

	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit'"  onclick="chanceUpdate()">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;
		
	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="chanceQuery()">查看</a>&nbsp;&nbsp;&nbsp;&nbsp;   
	
	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove'" onclick="allotChance()">分配</a>&nbsp;&nbsp;&nbsp;&nbsp;

	
	联系人:<input id="chance" type=text  class="easyui-validatebox"  required="required" /><a id="chanceaid" href="#"
		class="easyui-linkbutton" iconCls="icon-search" onclick="chanceSelect()">查询</a>
</div>
<table id="chanceManager">
</table>
<div id="chanceVote"></div>

<script type="text/javascript">

function chanceQuery(){
	var select = $("#chanceManager").datagrid("getSelected");
	if(select!=null){
		$('#chanceVote').dialog({    
		    title: '查看机会',    
		    width: 800,    
		    height: 600,  
		    inline:true,
		    href:'chanceQuery?id='+select.id,
		    modal: true,
		    buttons:[{
				text:'关闭',
				iconCls:'icon-no',
				handler:function(){
					$('#chanceVote').window('close');
				},
			}],

		});
	}else{
		alert("请选择一行数据")
	}
}


function allotChance(){
	var select = $("#chanceManager").datagrid("getSelected");
	if(select!=null){
		$('#chanceVote').dialog({    
		    title: '分配机会',    
		    width: 800,    
		    height: 600,  
		    inline:true,
		    href:'chanceAllot?id='+select.id,
		    modal: true,
		    buttons:[{
				text:'关闭',
				iconCls:'icon-no',
				handler:function(){
					$('#chanceVote').window('close');
				},
			}],

		});
	}else{
		alert("请选择一行数据")
	}
}

 function chanceUpdate(){
	var select = $("#chanceManager").datagrid("getSelected");
	console.log(select)
	if(select!=null){
		$('#chanceVote').dialog({    
		    title: '修改联系人',    
		    width: 800,    
		    height: 600,  
		    inline:true,
		    method:'post',
		    href:'chance_update_add?id='+select.id,   
		    modal: true,
		    buttons:[{
				text:'关闭',
				iconCls:'icon-no',
				handler:function(){
					$('#chanceVote').window('close');
				},
			}],

		});
	}else{
		alert("请选择一行数据")
	}
} 

function chanceAddItem(){
	$('#chanceVote').dialog({    
	    title: '添加联系人',    
	    width: 800,    
	    height: 600,  
	    inline:true,
	    href:'chance_update_add',    
	    modal: true,
	    buttons:[{
			text:'关闭',
			iconCls:'icon-no',
			handler:function(){
				$('#chanceVote').window('close');
			},
		}],

	});
}

	$(function() {
		$("#chanceManager").datagrid({
			fit : true,
			url : 'chancePager',
			fitColumns:true,
			striped:true,
			rownumbers:true,
			border:false,
			pagination:true,
			pageSize:10,
			pageList:[5,10,15,20],
			pageNumber:1,
			singleSelect:true,
			toolbar:'#chanceDiv',
			columns : [ [ {
				field : 'id',
				width : 500,
				checkbox:true,
			}, {
				field : 'chanceName',
				title : '机会名称',
				width : 500,
			}, {
				field : 'chanceType',
				title : '机会类型',
				width : 500,
			}, {
				field : 'startDate',
				title : '录入时间',
				width : 500,
			},{
				field : 'userName',
				title : '录入人',
				width : 500,
			},{
				field : 'chanceallot',
				title : '分配人',
				width : 500,
			}] ],
		});
	})
	
	function chanceSelect(){
		$('#chanceManager').datagrid('load',{
			chance:$("#chance").val(),
		}); 
	}
	
	function chanceClose(){
		$('#chanceVote').window('close');
	}
</script>