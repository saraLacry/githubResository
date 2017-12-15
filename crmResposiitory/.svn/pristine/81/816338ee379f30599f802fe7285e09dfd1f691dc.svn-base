<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<style>
</style>
<div style="padding-left: 100px;">
		<form:form  commandName="chance" id="chanceSave">
		<table >
		<input type="hidden" name="userName"  value="${user.userId }"/>
		<input  type="hidden" name="lastName" value="${user.userId }"/>
		<form:hidden path="id"/>
		
			<tr>
				<td width="100px;">机会编码:</td>
				<td><form:input path="chanceNumber"/></td>
			</tr>
			<tr>
				<td width="100px;">机会姓名:</td>
				<td><form:input path="chanceName"/></td>
			</tr>
			<tr>
				<td width="100px;">机会类型:</td>
				<td> <form:select path="chanceType">
						<form:options items="${list }" itemValue="dectionarycodingId" itemLabel="dictionaryvalue"/>
					</form:select></td>
			</tr>
			<tr>
				<td>机会内容:</td>
				<td><form:textarea path="chanceContext" rows="5" cols="60" /></td>
			</tr>

			<tr>
				<td >备注信息:</td>
				<td colspan="3"><form:textarea path="remark" rows="5" cols="60" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center" ><input type="button" value="保存" onclick="chanceSave()" /><input type="button" value="返回" onclick="chanceClose()"/></td>
			</tr>
		</table>
		</form:form>
	</div>
	
	<script type="text/javascript">
		function chanceSave(){
			var id = "${chance.id}"
			var url = '';
			var succeed='';
			var defeated='';
			if(id>0){
				url='updateChance'
				succeed='修改成功!'
				defeated='修改失败!'
			}else{
				url='saveChance'
				succeed='保存成功!'
				defeated='保存失败!'
			}
			$.messager.progress();	
			$('#chanceSave').form('submit',{    
			    url:url,      
			    success:function(data){
			    	$.messager.progress('close');
			    	if(data=="true"){
			    		$('#chanceSave').form('reset');
			    		$.messager.show({
							title:'提示',
							msg:succeed,
			    		});
			    		$('#chanceVote').window('close');
			    		$("#chanceManager").datagrid('reload');
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