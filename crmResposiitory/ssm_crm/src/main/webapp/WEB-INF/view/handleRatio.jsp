
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div style="padding-left: 200px;">
	<form:form commandName="ratio" id="ratioSave">
		<table>
		<form:hidden path="id"/>
			<tr> 
				<td>绩效编码:</td>
				<td><form:input  path="ratioNumber"/></td>
			</tr>
			<tr>
				<td>员工姓名:</td>
		 		<td>
		 			<form:select path="userName" >
		 				<form:options items="${list}" itemValue="userId" itemLabel="userName"/>
		 			</form:select>
		 		</td>
			</tr>
			<tr>
				<td>绩效等级:</td>
		 		<td><input type="button" height="3px;" width="3px;" value="-" onclick="jian()" /><input  type="text"  id="rank"  name="rank" value="${ratio.rank }"   size="3" /><input type="button" height="3px;" width="3px;" onclick="jia()" value="+" /></td>
			</tr>
			<tr>
				<td>备注信息:</td>
		 		<td><form:textarea path="text" cols="30"  rows="5"/></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center"><input type="button" value="保存" onclick="rationSave()" /><input type="button" value="返回" onclick="ratioClose()"  /></td>
			</tr>
		</table>
	</form:form>
</div>
<script type="text/javascript">
	function jian(){
		var rank = $("#rank").val()
		 if(rank==''){
			$("#rank").val("-1");
		}else{
			rank = parseInt(rank);
			$("#rank").val(rank-1);
		}
	}
	
	function jia(){
		var rank = $("#rank").val()
		if(rank==''){
			$("#rank").val("1");
		}else{
			rank = parseInt(rank)
			$("#rank").val(rank+1);
		}
	}
	function rationSave(){
		var id = "${ratio.id}"
		var url = '';
		var succeed='';
		var defeated='';
		if(id>0){
			url='updateRatio'
			succeed='修改成功!'
			defeated='修改失败!'
		}else{
			url='saveRatio'
			succeed='保存成功!'
			defeated='保存失败!'
		}
		$.messager.progress();	
		$('#ratioSave').form('submit',{    
		    url:url, 
		    success:function(data){
		    	$.messager.progress('close');
		    	if(data=="true"){
		    		$('#ratioSave').form('reset');
		    		$.messager.show({
						title:'提示',
						msg:succeed,
		    		});
		    		$('#ratioVote').window('close');
		    		$("#ratioManager").datagrid('reload');
		    	}else{
		    		$.messager.show({
						title:'提示',
						msg:defeated,
		    		});
		    	}
		    },   
		});
	}
	
</script>
