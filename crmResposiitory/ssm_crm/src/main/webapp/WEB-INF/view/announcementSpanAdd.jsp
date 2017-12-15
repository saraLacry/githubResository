<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公告增加</title>
</head>
<body>
	系统管理>> 公告管理>> 增加公告信息
	<input type="hidden" value="${user.userId}" id="announcementAdd_4"/>
	<div id="announcementDiv_SpanIds" style="margin-left: 35%;">
		<table>
			<tr>
				<td>公告编码:</td>
				<td></td>
				<td><input type="text" value="" id="announcementAdd_1" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>公告标题:</td>
				<td></td>
				<td><input type="text" value="" id="announcementAdd_2" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>公告类型:</td>
				<td></td>
				<td><select id="announcementAdd_3">
						<option value="">无</option>
				</select></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>公告内容:</td>
				<td></td>
				<td><input type="text" value="" id="announcementAdd_5" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><input type="button" value="增加" id="announcementAdd_6" /></td>
				<td></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
		</table>
	</div>
	<script type="text/javascript">
		$(function(){
			$("#announcementAdd_6").click(function(){
				$.ajax({
					url:'announcementSpanAdds',
					type:'post',
					data:{
						noticenotId:$("#announcementAdd_1").val(),
						noticetitle:$("#announcementAdd_2").val(),
						typeName:$("#announcementAdd_3").val(),
						releaseName:$("#announcementAdd_4").val(),
						noticecontent:$("#announcementAdd_5").val(),
					},
					success:function(result){
						alert("增加成功!");
						$('#announcement').datagrid("reload");
					}
				});
			});
			
			/* 查询公告类型 */
			$.ajax({
				url : 'announcementSpanDictType',
				type : 'post',
				success : function(result) {
					var htmls = "";
					if ("" != result || null != result) {
						for(var i = 0 ; i < result.length ; i ++){
							htmls += "<option value="+result[i].dectionarycodingId+">"
							+ result[i].dictionaryvalue + "</option>";
						}
						$("#announcementAdd_3").html(htmls);
					}
				}
			});
		});
	</script>
</body>
</html>