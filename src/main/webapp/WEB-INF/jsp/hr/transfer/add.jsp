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
					<caption>新建调职申请单</caption>
					<thead>
						<tr>
							<th colspan="6" align="left">
					<button class="layui-btn" lay-filter="add" lay-submit="" align="left">确定</button>
							</th>
						</tr>
					</thead>
					<tbody>

						<tr>
							<th colspan="6" align="left">基本信息</th>
						</tr>
						<tr>
							<th align="left"><label for="L_id" class="layui-form-label">调职申请编号
									<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_id" name="id" required=""
								readonly="readonly" lay-verify="id" autocomplete="off"
								class="layui-input" value="(自动生成)"></th>
							<th><label for="L_userid" class="layui-form-label">申请人id
									<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_userid" name="userid"
								required="" lay-verify="userid" autocomplete="off"
								class="layui-input" value="${loginUser.id}" readonly="readonly" ></th>
								
							<th><label for="L_name" class="layui-form-label">申请人
									<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_name" name="name" required=""
								lay-verify="name" autocomplete="off" class="layui-input"
								value="${loginUser.username }" readonly="readonly" ></th>
						</tr>

						<tr>
						<th><label for="L_applyDate" class="layui-form-label">申请日期
									<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_applyDate" name="applyDate"
								required="" lay-verify="applyDate" autocomplete="off"
								class="layui-input" value="<fmt:formatDate value="${today }"/> " readonly="readonly" >
							</th>
							
							<th><label for="L_hopeDate" class="layui-form-label">希望日期
							</label></th>
							<th><input type="text" id="L_hopeDate" name="hopeDate"
								required="" lay-verify="date" autocomplete="off"
								class="layui-input"  placeholder="格式2018-01-01"></th>
								
							<th align="left"><label for="L_entryDate"
								class="layui-form-label">入职日期<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_entryDate" name="entryDate"
								required="" lay-verify="date" autocomplete="off"
								class="layui-input"  placeholder="格式2018-01-01"></th>
							
						</tr>
						
						<tr>
						<th><label for="L_deptname" class="layui-form-label">当前部门
									<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_deptname" name="deptname"
								required="" lay-verify="deptname" autocomplete="off"
								class="layui-input" value="${dept.name }" readonly="readonly"></th>
						
							<th align="left"><label for="L_onPosty"
								class="layui-form-label">当前职位<span class="x-red">*</span>
							</label></th>
							<th><select name="onPost" lay-search>
									<option value="总经理">总经理</option>
									<option value="人事主管">人事主管</option>
									<option value="人事小组长">人事小组长</option>
									<option value="董事长">董事长</option>
							</select></th>
								
							<th><label for="L_onRank" class="layui-form-label">当前职等
									<span class="x-red">*</span>
							</label></th>
							<th><select name="onRank" lay-search>
									<option value="初级职等">初级职等</option>
									<option value="中级职等">中级职等</option>
									<option value="高级职等">高级职等</option>
									<option value="特级职等">特级职等</option>
							</select></th>
						</tr>
						
						<tr>
						<th><label for="L_afterdeptname" class="layui-form-label">调至部门
									<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_afterdeptname" name="afterdeptname"
								required="" lay-verify="afterdeptname" autocomplete="off"
								class="layui-input" ></th>
						
							<th align="left"><label for="L_afterPost"
								class="layui-form-label">调至职位<span class="x-red">*</span>
							</label></th>
							<th><select name="afterPost" lay-search>
									<option value="总经理">总经理</option>
									<option value="人事主管">人事主管</option>
									<option value="人事小组长">人事小组长</option>
									<option value="董事长">董事长</option>
							</select></th>
								
							<th><label for="L_afterRank" class="layui-form-label">调至职等
									<span class="x-red">*</span>
							</label></th>
							<th><select name="afterRank" lay-search>
									<option value="初级职等">初级职等</option>
									<option value="中级职等">中级职等</option>
									<option value="高级职等">高级职等</option>
									<option value="特级职等">特级职等</option>
							</select></th>
						</tr>
						
						<tr>
						<th><label for="L_onWages" class="layui-form-label">当前薪资
									<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_onWages" name="onWages"
								required="" lay-verify="onWages" autocomplete="off"
								class="layui-input" ></th>
						
							<th align="left"><label for="L_afterWages"
								class="layui-form-label">调至薪资<span class="x-red">*</span>
							</label></th>
							<th><input type="text" id="L_afterWages" name="afterWages"
								required="" lay-verify="afterWages" autocomplete="off"
								class="layui-input" ></th>
								
							<th><label for="L_type" class="layui-form-label">申请类别
							</label></th>
							<th><select name="type" lay-search>
									<option value="-----">-----</option>
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
							<th align="left"><label for="L_ps" class="layui-form-label">备注
							</label></th>
							<th colspan="5"><input type="text" id="L_ps" name="ps"
								required="" lay-verify="ps" autocomplete="off"
								class="layui-input" value="无"></th>
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