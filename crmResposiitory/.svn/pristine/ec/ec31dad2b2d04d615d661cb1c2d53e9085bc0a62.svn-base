<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色增加</title>
</head>
<body id="bodyids">
	<div style="margin-left: 400px;">
		服务管理>> 服务处理>> 查询操作<br> <br> <br>
		<table>
			<tr>
				<td><input type="hidden" id="FoundId"
					value="${user.userName }"> 
					<input type="hidden" id="CommonIssueId"
					value="${common.commonIssueId }"> 
					问题标题：<input type="text"  disabled="disabled"   id="IssueName" value="${common.issueName}">
			</tr>



			<input type="text"  disabled="disabled"   value="${common.issueType}">
		
				
			

			<TR>
				
				<TD>答复要点：<TEXTAREA id="IssueAnswer">${common.issueAnswer}</TEXTAREA></TD>
				<TD>备注信息：<TEXTAREA id="remark">${common.remark}</TEXTAREA></TD>
			</TR>
		</table>
		<br> <input type="button" id="update" value="保存"><br>
	</div>
	<center></center>
	<script type="text/javascript">
          $(function(){
        	
        	 $("#update").click(function(){
                  var IssueAnswer =$("#IssueAnswer").val();
                  var remark = $("#remark").val();
                  var CommonIssueId = $("#CommonIssueId").val();
                  $.ajax({
                	  url:"CommonUpdateJsp",
                	  type:"post",
                	  data:{
                		  IssueAnswer:IssueAnswer,
                		  remark:remark,
                		  CommonIssueId:CommonIssueId
                	  }
                  })
        	 });
          });
	</script>
</body>
</html>