<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<div style="padding: 0 0 0 300px; color: #333;" id="linkmanDiv">
	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="linkmanAddItem()">添加</a>&nbsp;&nbsp;&nbsp;&nbsp; 

	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit'"  onclick="linkmanUpdate()">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;

	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove'" onclick="linkmanEdit()">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;
		
	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="linkmanQuery()">查看</a>&nbsp;&nbsp;&nbsp;&nbsp;   
	
	联系人:<input id="linkman" type=text  class="easyui-validatebox"  required="required" /><a id="linkmanaid" href="#"
		class="easyui-linkbutton" iconCls="icon-search" onclick="oldSelect()">查询</a>
</div>
<table id="linkmanManager">
</table>
<div id="linkmanVote"></div>

<script type="text/javascript">

function linkmanQuery(){
	var select = $("#linkmanManager").datagrid("getSelected");
	if(select!=null){
		$('#linkmanVote').dialog({    
		    title: '查看联系人',    
		    width: 800,    
		    height: 600,  
		    inline:true,
		    href:'linkmanQuery?id='+select.id,
		    modal: true,
		    buttons:[{
				text:'关闭',
				iconCls:'icon-no',
				handler:function(){
					$('#linkmanVote').window('close');
				},
			}],

		});
	}else{
		alert("请选择一行数据")
	}
}






function linkmanEdit(){
	var select = $("#linkmanManager").datagrid("getSelected");
	console.log(select)
	alert(select.id)
	if(select!=null){
			$.ajax({
				url:'deleteLinkman',
				data:"id="+select.id,
				type:"post",
				dataType:'json',
				success:function(result){
					if(result==true){
						$.messager.show({
							title:'提示',
							msg:'删除成功!',
			    		});
						$("#linkmanManager").datagrid('reload');
					}else{
						$.messager.show({
							title:'提示',
							msg:'删除失败!',
			    		});
					}
				}
				
			})
	}else{
		alert("请选择一行数据")
	}
}
function linkmanUpdate(){
	var select = $("#linkmanManager").datagrid("getSelected");
	if(select!=null){
		$('#linkmanVote').dialog({    
		    title: '修改联系人',    
		    width: 800,    
		    height: 600,  
		    inline:true,
		    method:'post',
		    href:'linkman_update_add?id='+select.id,   
		    modal: true,
		    buttons:[{
				text:'关闭',
				iconCls:'icon-no',
				handler:function(){
					$('#linkmanVote').window('close');
				},
			}],

		});
	}else{
		alert("请选择一行数据")
	}
}

function linkmanAddItem(){
	$('#linkmanVote').dialog({    
	    title: '添加联系人',    
	    width: 800,    
	    height: 600,  
	    inline:true,
	    href:'linkman_update_add',    
	    modal: true,
	    buttons:[{
			text:'关闭',
			iconCls:'icon-no',
			handler:function(){
				$('#linkmanVote').window('close');
			},
		}],

	});
} 

	$(function() {
		$("#linkmanManager").datagrid({
			fit : true,
			url : 'linkmanPager',
			fitColumns:true,
			striped:true,
			rownumbers:true,
			border:false,
			pagination:true,
			pageSize:10,
			pageList:[5,10,15,20],
			pageNumber:1,
			singleSelect:true,
			toolbar:'#linkmanDiv',
			columns : [ [ {
				field : 'id',
				width : 500,
				checkbox:true,
			}, {
				field : 'linkmanName',
				title : '联系人',
				width : 500,
			}, {
				field : 'linkmansex',
				title : '性别',
				width : 500,
			}, {
				field : 'linkmanphone',
				title : '联系电话',
				width : 500,
			},{
				field : 'startDate',
				title : '录入时间',
				width : 500,
			},{
				field : 'linkmanremoek',
				title : '备注',
				width : 500,
			}, ] ],
		});
	})
	
	function oldSelect(){
		$('#linkmanManager').datagrid('load',{
			linkman:$("#linkman").val(),
		}); 
	}
	
	function linkmanClose(){
		$('#linkmanVote').window('close');
	}
</script>