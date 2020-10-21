<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html class="x-admin-sm">

<head>
<meta charset="UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/xadmin/css/font.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/xadmin/css/xadmin.css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/xadmin/lib/layui/layui.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/xadmin/js/xadmin.js"></script>
<style type="text/css">
input {
	border: 0px !important;
	outline: none !important;
}

body {
	background-color: #fff;
}

</style>
</head>
<body>
	<div class="layui-fluid">
		<div class="layui-row">
			<form class="layui-form" method="post" action="add" id='form'>
				<table border="1">
					<caption>新建离职申请单</caption>
					<thead>
						<tr>
							<th colspan="6" align="left">
					<button class="layui-btn" lay-filter="add" lay-submit="" align="left">增加</button>
							</th>
						</tr>
					</thead>
					<tbody>

						<tr>
							<th colspan="6" align="left">基本信息</th>
						</tr>
						<tr>
							<th align="left"><label for="L_id" class="layui-form-label">离职申请编号
									<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_id" name="id" required=""
								readonly="readonly" lay-verify="id" autocomplete="off"
								class="layui-input" value="(自动生成)"></th>
							<th><label for="L_deptname" class="layui-form-label">部门
									<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_deptname" name="deptname"
								required="" lay-verify="deptname" autocomplete="off"
								class="layui-input" value="${dept.name }" readonly="readonly"></th>
							<th><label for="L_name" class="layui-form-label">申请人
									<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_name" name="name" required=""
								lay-verify="name" autocomplete="off" class="layui-input"
								value="${loginUser.username }" readonly="readonly" ></th>
						</tr>
						<tr>
							<th align="left"><label for="L_entryDate"
								class="layui-form-label">入职日期<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_entryDate" name="entryDate"
								required="" lay-verify="date" autocomplete="off"
								class="layui-input" placeholder="格式2018-01-01" ></th>
							<th><label for="L_applyDate" class="layui-form-label">申请日期
									<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_applyDate" name="applyDate"
								required="" lay-verify="applyDate" autocomplete="off"
								class="layui-input" value="<fmt:formatDate value="${today }"/> " readonly="readonly" >
							</th>
							<th><label for="L_leaveDate" class="layui-form-label">到职日期
							</label></th>
							<th><input type="text" id="L_leaveDate" name="leaveDate"
								required="" lay-verify="date" autocomplete="off"
								class="layui-input" placeholder="格式2018-01-01"></th>
						</tr>
						<tr>
							<th align="left"><label for="L_validity"
								class="layui-form-label">合同有效期<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_validity" name="validity"
								required="" lay-verify="date" autocomplete="off"
								class="layui-input" placeholder="格式2018-01-01"></th>
							<th><label for="L_userid" class="layui-form-label">申请人id
									<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_userid" name="userid"
								required="" lay-verify="userid" autocomplete="off"
								class="layui-input" value="${loginUser.id}" readonly="readonly" ></th>
							<th><label for="L_type" class="layui-form-label">离职类型
							</label></th>
							<th><select name="type" lay-search>
									<option value="员工主动离职">员工主动离职</option>
									<option value="双方协商解除劳动合同">双方协商解除劳动合同</option>
									<option value="企业依法解除劳务合同">企业依法解除劳务合同</option>
							</select></th>
						</tr>

						<tr>
							<th align="left"><label for="L_reason"
								class="layui-form-label">事由 </label></th>
							<th colspan="5"><input type="text" id="L_reason"
								name="reason" required="" lay-verify="reason" autocomplete="off"
								class="layui-input"></th>
						</tr>
						<tr>
							<th align="left"><label for="L_records"
								class="layui-form-label">访谈纪录 </label></th>
							<th colspan="5"><input type="text" id="L_records"
								name="records" required="" lay-verify="records"
								autocomplete="off" class="layui-input"></th>
						</tr>
						<tr>
							<th align="left"><label for="L_ps" class="layui-form-label">备注
							</label></th>
							<th colspan="5"><input type="text" id="L_ps" name="ps"
								required="" lay-verify="ps" autocomplete="off"
								class="layui-input"></th>
						</tr>

					</tbody>

				</table>
			</form>
		</div>
	</div>
	<script>
		layui.use([ 'form', 'layer', 'jquery' ], function() {
			$ = layui.jquery;
			var form = layui.form, layer = layui.layer;

			//自定义验证规则
			form.verify({
				userid : function(value) {
					var  json;
					$.ajax({
						url:"verifyUserId",
						type:'post',
						async:false,
						data:{'userid':value},
						success:function(ajaxObj){
							  json = JSON.parse(ajaxObj);
						
						}
					});
					 if(json.result == 0){
							return json.msg;
						}
				},
			});

			//监听提交
				form.on('submit(add)', function(data) {
					$.post("add", data.field, function(data) {
						layer.alert("增加成功", {
							icon : 6
						}, function() {
							//关闭当前frame
							xadmin.close();
							xadmin.father_reload();
							
						});
					});
					return false;
				});
			});
	</script>

</body>

</html>