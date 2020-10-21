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
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources//js/jquery-1.11.1.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources//js/threeLink.js"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/xadmin/css/font.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/xadmin/css/xadmin.css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/xadmin/lib/layui/layui.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/xadmin/js/xadmin.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/xadmin/js/jquery.min.js"></script>

<style type="text/css">
input, select {
	border: 0px !important;
	outline: none !important;
}

body {
	background-color: #fff;
}

.layui-unselect {
	display: none;
}

select {
	display: inline-block !important;
}

.title {
	text-align: center;
	background-color: #dddddd;
	color: blue;
	font-weight: bold;
}

.weizhi {
	padding:10px !important;
	border: 1px solid #999999;
}
</style>

</head>
<body>
	<div class="layui-fluid">
		<div class="layui-row">
			<form class="layui-form" method="post" action="add" id='form'>
				<table border="1" align="center">
					<caption>
						<h2>新建自我评价</h2>
					</caption>
					<thead>
						<tr>
							<td colspan="4" align="left">
								<button class="layui-btn" lay-filter="add" lay-submit=""
									align="left">确定</button>
								<button class="layui-btn" lay-submit="" align="left">
									<a href="addinput">返回</a>
								</button>
							</td>
						</tr>
					</thead>
					<tbody>

						<tr>
							<td align="left"><label for="L_id" class="layui-form-label">考核任务编号
									<span class="x-red">*</span>
							</label></td>
							<td><input type="text" id="L_id" name="id" required=""
								lay-verify="id" autocomplete="off" class="layui-input">
							</th>
							<td><label for="L_theme" class="layui-form-label">考核任务主题
									<span class="x-red">*</span>
							</label></td>
							<td><input type="text" id="L_theme" name="theme" required=""
								lay-verify="theme" autocomplete="off" class="layui-input"
								value="${mould.theme}"></td>
						</tr>

						<tr>

							<td align="left"><label for="L_dateType"
								class="layui-form-label">考核周期分类<span class="x-red">*</span>
							</label></td>
							<td><select name="dateType" id="type">
							
									<option value="${mould.dateType}" id="1">${mould.dateType}</option>


							</select></td>
							<td align="left"><label for="L_date"
								class="layui-form-label">考核周期<span class="x-red">*</span>
							</label></td>
							<td><select name="year">
									<option value="2017">2017</option>
									<option value="2018">2018</option>
									<option value="2019">2019</option>
									<option value="2020">2020</option>
									<option value="2021">2021</option>
									<option value="2022">2022</option>
									<option value="2023">2023</option>
									<option value="2024">2024</option>

							</select> <select name="date" id="date">
									<option value="${mould.date}" id="2">${mould.date}</option>
							</select></td>
						</tr>

						<tr>
							<td><label for="L_startTime" class="layui-form-label">考核开始日期
									<span class="x-red">*</span>
							</label></td>
							<td><input type="text" id="L_startTime" name="startTime"
								required="" lay-verify="date" autocomplete="off"
								class="layui-input" value="${mould.startTime }"></td>
							<td><label for="L_endTime" class="layui-form-label">考核结束日期
									<span class="x-red">*</span>
							</label></td>
							<td><input type="text" id="L_endTime" name="endTime"
								required="" lay-verify="date" autocomplete="off"
								class="layui-input" value="${mould.endTime }"></td>

						</tr>

						<tr>
							<td><label for="L_ps" class="layui-form-label">备注 <span
									class="x-red">*</span>
							</label></td>
							<td colspan="3"><input type="text" id="L_ps" name="ps"
								required="" lay-verify="ps" autocomplete="off"
								class="layui-input"></td>

						</tr>
						<tr>
							<td colspan="2" class="title">模板</td>
							<td colspan="2" class="title">被考核人员</td>
						</tr>
						<tr>
							<td colspan="2" align="center">
								<table >
									<c:forEach items="${moulds}" var="mould1">
										<tr >
											<td class="weizhi"><a href="addinput?id=${mould1.id }">${mould1.name}</a></td>
										</tr>
									</c:forEach>

								</table>
							</td>
							<td colspan="2" >
							<input type="text" id="L_persons" name="persons"
								required="" lay-verify="persons" autocomplete="off"
								class="layui-input">
							</td>
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
				id : function(value) {
					var json;
					$.ajax({
						url : "verifyId",
						type : 'post',
						async : false,
						data : {
							'id' : value
						},
						success : function(ajaxObj) {
							json = JSON.parse(ajaxObj);

						}
					});
					if (json.result == 0) {
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