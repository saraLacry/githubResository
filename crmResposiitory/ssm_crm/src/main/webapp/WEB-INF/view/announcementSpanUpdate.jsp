<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公告修改</title>
</head>
<body>
	系统管理>> 公告管理>> 修改公告信息
	<div id="announcementDiv_UpdateIds" style="margin-left: 35%;">
		<table>
			<tr>
				<td>公告编码:</td>
				<td></td>
				<td><input type="text" value="${annLooks.noticenotId }" id="announcementUpdate_1" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>公告标题:</td>
				<td></td>
				<td><input type="text" value="${annLooks.noticetitle }" id="announcementUpdate_2" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td>公告类型:</td>
				<td></td>
				<td><select id="announcementUpdate_3">
						<option value="">无</option>
				</select></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
<!-- 			<tr> -->
<!-- 				<td>发布人:</td> -->
<!-- 				<td></td> -->
<%-- 				<td><span id="announcementUpdate_4">${annLooks.releaseName }</span></td> --%>
<!-- 			</tr> -->
<!-- 			<tr></tr> -->
<!-- 			<tr></tr> -->
<!-- 			<tr></tr> -->
<!-- 			<tr></tr> -->
			<tr>
				<td>公告内容:</td>
				<td></td>
				<td><input type="text" value="${annLooks.noticecontent }" id="announcementUpdate_5" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><input type="button" value="修改" id="announcementUpdate_6" /></td>
				<td></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
			<tr></tr>
		</table>
	</div>
	<script type="text/javascript">
		$(function() {
			var row = $("#announcement").datagrid('getSelected');// 单行
			$("#announcementUpdate_6").click(function() {
				$.ajax({
					url : 'announcementSpanUpdates',
					type : 'post',
					data : {
						noticenotIds : row.noticenotIds,
						noticenotId : $("#announcementUpdate_1").val(),
						noticetitle : $("#announcementUpdate_2").val(),
						typeName : $("#announcementUpdate_3").val(),
// 						releaseName : $("#announcementUpdate_4").val(),
						noticecontent : $("#announcementUpdate_5").val(),
					},
					success : function(result) {
						alert("修改成功!");
						$('#announcement').datagrid("reload");
					}
				});
			});

			/*查询指定数据内容 */
			$.ajax({
				url : 'announcementSpanLooks',
				type : 'post',
				data : {
					noticenotIds : row.noticenotIds,
					noticenotId : row.noticenotId,
					noticetitle : row.noticetitle,
					releaseName : row.releaseName,
					noticecontent : row.noticecontent,
					createTime : row.createTime
				}
			});

			/* 查询指定公告类型 */
			$.ajax({
				url : 'announcementSpanLooksType',
				type : 'post',
				data : {
					typeName : row.typeName
				},
				success : function(result) {
					var htmls = "";
					if ("" != result || null != result) {
						htmls += "<option value="+result.dectionarycodingId+">"
								+ result.dictionaryvalue + "</option>";
					}
					$("#announcementUpdate_3").html(htmls);
				}
			});
		});
	</script>
</body>
</html>