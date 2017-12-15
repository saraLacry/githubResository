<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<div style="padding-left: 100px;">
		<form:form  commandName="linkman" id="linkmanSave">
		<table border="1px">
		<form:hidden path="id"/>
			<tr>
				<td width="100px;">联系人编码:</td>
				<td><form:input path="linkmannumber"/></td>
				<td width="100px;">联系人姓名:</td>
				<td><form:input path="linkmanName"/></td>
			</tr>
			<tr>
				<td width="100px;">性别:</td>
				<td><form:radiobuttons path="linkmansex" items="${list}" itemValue="dectionarycodingId" itemLabel="dictionaryvalue"/></td>
				<td width="100px;">生日:</td>
				<td><input  type=text name="linkmanbirth" value="${linkman.linkmanbirth }" class="easyui-datebox" editable=false required="required" /></td>
			</tr>
			<tr>
				<td width="100px;">手机:</td>
				<td><form:input path="linkmanphone"/></td>
				<td width="100px;">办公电话:</td>
				<td><form:input path="linkmanworkphone"/></td>
			</tr>
			<tr>
				<td>电子邮箱:</td>
				<td><form:input path="linkmanemail"/></td>
				<td>家庭电话:</td>
				<td><form:input path="linakmanhousephone"/></td>
			</tr>
			
			<tr>
				<td>联系地址:</td>
				<td colspan="3" ><form:textarea path="linkmanaddress" rows="5" cols="60"  /></td>
			</tr>

			<tr>
				<td >备注信息:</td>
				<td colspan="3"><form:textarea path="linkmanremoek" rows="5" cols="60" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: right" ><input type="button" value="保存" onclick="linkmanSave()" /></td>
				<td colspan="2"><input type="button" value="返回" onclick="linkmanClose()"/></td>
			</tr>
		</table>
		</form:form>
	</div>
	
	<script type="text/javascript">
		function linkmanSave(){
			var id = "${linkman.id}"
			var url = '';
			var succeed='';
			var defeated='';
			if(id>0){
				url='updateLinkman'
				succeed='修改成功!'
				defeated='修改失败!'
			}else{
				url='saveLinkman'
				succeed='保存成功!'
				defeated='保存失败!'
			}
			$.messager.progress();	
			$('#linkmanSave').form('submit',{    
			    url:url,      
			    success:function(data){
			    	$.messager.progress('close');
			    	if(data=="true"){
			    		$('#linkmanSave').form('reset');
			    		$.messager.show({
							title:'提示',
							msg:succeed,
			    		});
			    		$('#linkmanVote').window('close');
			    		$("#linkmanManager").datagrid('reload');
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