<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<div class="easyui-panel" title="文件上传">
	<form id="_upload" method="post" enctype="multipart/form-data">
		<input type="hidden" name="userId" value="${user.userId }" />
		<table align="center">
			<tr>
				<td align="right">资源类型：</td>
				<!-- select里地name必须与upload action里的变量名一致， data-options里的field名必须与findResType.action一致 -->
				<td><select id="cc" class="easyui-combobox" name="resTypeId"
					style="width:155px;"
					data-options="valueField:'resTypeId',
  	 						textField:'resTypeName',
  	 						url:'../findResType.action'">
				</select></td>
			</tr>
			<!-- 		<tr>
  	 				<td align="right">文件等级：</td>
  	 				<td>
  	 					<select id="cc" class="easyui-combobox" name="accessRightId" style="width:155px;" data-options="valueField:'accessRightId',
  	 						textField:'accessRightName',
  	 						url:'findAccessRight.action'">  
						</select>  
  	 				</td>
  	 			</tr> -->
			<tr>
				<td align="right">上传文件：</td>
				<td><input type="file" name="upload" /></td>
			</tr>

			<tr>
				<td align="right">描述：</td>
				<td><textarea rows="6" cols="20" name="resDescription"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><a
					class="easyui-linkbutton upload_submit " href="javascript:void(0)">文件上传</a>
				</td>
			</tr>
		</table>
	</form>
</div>
<script type="text/javascript">
	$('.upload_submit').click(function() {

		$('#_upload').form('submit', {
			//表单提交的目标  action或servlet
			url : '../upload.action',

			//表单提交时的验证信息，返回的true或false
			onSubmit : function() {
				return $('#_upload').form('validate');
			},
			//表单提交成功后执行的操作
			success : function(data) {
				//根据data返回的数据进行判断
				var dd = $.parseJSON(data);
				// if(dd.msg==null){
				// 	window.location='back_main.jsp';
				// }else{
				// 	window.location='back_login.jsp';
				// }

				alert(data);
			}

		});

	});
</script>

