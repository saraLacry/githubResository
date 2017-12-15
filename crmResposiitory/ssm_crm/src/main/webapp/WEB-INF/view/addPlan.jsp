<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<script type="text/javascript">
function tijiao(){
	$.messager.progress();	
	$('#ff').form('submit',{    
	    url:'savePlan',      
	    success:function(data){
	    	$.messager.progress('close');
	    	if(data=="true"){
	    		$('#ff').form('reset');
	    		$.messager.show({
					title:'提示',
					msg:'发布成功!',
	    		});
	    		$('#sellVote').window('close');
// 	    		$('#managers').datagrid('reload'); 
	    		$("#sellManager").datagrid('reload');
	    	}else{
	    		$.messager.show({
					title:'提示',
					msg:'发布失败!',
	    		});
	    	}
	    },   
	});
}
</script>

<div style="text-align: center;">
	<form method="post" id="ff">
		<input type="hidden" name="state" value="1" /> <input type="hidden"
			name="createUser.userId" value="${user.userId}"> <input
			type="hidden" name="manageUser" value="${user.userId}"> <input
			type="hidden" name="lastUserName" value="${user.userId}">
		<p>
			计划编码:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="planNumber" />
		</p>
		<p>
			计划月份:&nbsp;&nbsp;&nbsp;&nbsp;<input  type=text name="date" class="easyui-datebox" editable=false required="required" />
		<p>
		<p>
			计划内容:&nbsp;&nbsp;&nbsp;&nbsp;
			<textarea rows="" cols="" name="planText"></textarea>
		</p>
		<input type="button" value="提交" onclick="tijiao();"/> &nbsp;&nbsp;<input type="button"
			value="返回" onclick="sellClose()">
	</form>
</div>