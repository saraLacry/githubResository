<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<div style="padding: 0 0 0 300px; color: #333;" id="sellDiv">
	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="sellAddItem()">添加</a>&nbsp;&nbsp;&nbsp;&nbsp; 

	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit'"  onclick="sellUpdate()">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;

	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove'" onclick="sellEdit()">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;
	
	<%-- <c:if test="${user.role.roleName == 销售代表}"> --%>
		<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="sellSubmit()">提交</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<%-- </c:if> --%>
	
	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="sellQuery()">查看</a>&nbsp;&nbsp;&nbsp;&nbsp;   
	
	月份:<input id="sellQuery" type=text  class="easyui-datebox" editable=false required="required" /><a id="sellAid" href="#"
		class="easyui-linkbutton" iconCls="icon-search" onclick="oldSelect()">查询</a>
</div>
<table id="sellManager">
</table>
<div id="sellVote"></div>

<script type="text/javascript">

function sellQuery(){
	var select = $("#sellManager").datagrid("getSelected");
	if(select!=null){
		$('#sellVote').dialog({    
		    title: '查看销售计划',    
		    width: 600,    
		    height: 500,  
		    inline:true,
		    href:'queryPlan?id='+select.id+'&planNumber='+select.planNumber+'&date='+select.date+'&state='+select.state+'&planText='+select.planText+'&createUser.userName='+select.createUser.userName+"&user.userId="+select.user.userId,   
		    modal: true,
		    buttons:[{
				text:'关闭',
				iconCls:'icon-no',
				handler:function(){
					$('#sellVote').window('close');
				},
			}],

		});
	}else{
		alert("请选择一行数据")
	}
}

function sellSubmit(){
	var select = $("#sellManager").datagrid("getSelected");
	if(select!=null){
		if(select.state=="已创建"){
			var lastUserId = "${user.userId}"
			var leaduserId = "${user.leaduserId}"
			$.ajax({ 
				url:'submitPlan',
				type:'post',
				dataType:'json',
				data:'id='+select.id+"&state=2&lastUserName="+lastUserId+"&manageUser="+leaduserId,
				success:function(result){
					if(result==true){
						$.messager.show({
							title:'提示',
							msg:'提交成功!',
			    		});
						$("#sellManager").datagrid('reload');
					}else{
						$.messager.show({
							title:'提示',
							msg:'提交失败!',
			    		});
					}
				}
			})
		}else{
			alert("该计划不需要提交")
		}
	}else{
		alert("请选择一行数据");
	}
}


function sellUpdate(){
	var select = $("#sellManager").datagrid("getSelected");
	if(select!=null){
		if(select.state=="已创建"){
		$('#sellVote').dialog({    
		    title: '修改销售计划',    
		    width: 600,    
		    height: 500,  
		    inline:true,
		    method:'post',
		    href:'updatePlan?id='+select.id+'&planNumber='+select.planNumber+'&date='+select.date+'&state='+select.state+'&planText='+select.planText+'&createUser.userName='+select.createUser.userName,   
		    modal: true,
		    buttons:[{
				text:'关闭',
				iconCls:'icon-no',
				handler:function(){
					$('#sellVote').window('close');
				},
			}],

		});
		}else{
			alert("该计划已经提交不能修改")
		}
	}else{
		alert("请选择一行数据")
	}
}

function sellEdit(){
	var select = $("#sellManager").datagrid("getSelected");
	if(select!=null){
		if(select.state=="已创建"){
			$.ajax({
				url:'deletePlan',
				data:"id="+select.id,
				type:"post",
				dataType:'json',
				success:function(result){
					if(result==true){
						$.messager.show({
							title:'提示',
							msg:'删除成功!',
			    		});
						$("#sellManager").datagrid('reload');
					}else{
						$.messager.show({
							title:'提示',
							msg:'删除失败!',
			    		});
					}
				}
				
			})
		}else{
			alert("该计划不能删除")
		}
	}else{
		alert("请选择一行数据")
	}
} 

function sellAddItem(){
	$('#sellVote').dialog({    
	    title: '添加销售计划',    
	    width: 600,    
	    height: 500,  
	    inline:true,
	    href:'addPlan',    
	    modal: true,
	    buttons:[{
			text:'关闭',
			iconCls:'icon-no',
			handler:function(){
				$('#sellVote').window('close');
			},
		}],

	});
}

	$(function() {
		$("#sellManager").datagrid({
			fit : true,
			url : 'sellQuery',
			fitColumns:true,
			striped:true,
			rownumbers:true,
			border:false,
			pagination:true,
			pageSize:10,
			pageList:[5,10,15,20],
			pageNumber:1,
			singleSelect:true,
			toolbar:'#sellDiv',
			columns : [ [ {
				field : 'id',
				width : 500,
				checkbox:true,
			}, {
				field : 'createName',
				title : '姓名',
				width : 500,
			}, {
				field : 'vdate',
				title : '月份',
				width : 500,
			}, {
				field : 'state',
				title : '状态',
				width : 500,
			},{
				field : 'lastDate',
				title : '最后操作时间',
				width : 500,
			},{
				field : 'lastUserName',
				title : '操作人',
				width : 500,
			},{
				field : 'manageUser',
				title : '待处理人',
				width : 500,
			}, ] ],
		});
	})
	
	function oldSelect(){
		$('#sellManager').datagrid('load',{
			query:$("#sellQuery").val(),
		}); 
	}
	function sellClose(){
		$('#sellVote').window('close');
	}
</script>