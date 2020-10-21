<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<script
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
	<div class="x-nav">
		<span class="layui-breadcrumb"> <a href="">首页</a> <a href="">部门管理</a>
			<a> <cite>部门展示</cite></a>
		</span> <a class="layui-btn layui-btn-small"
			style="line-height: 1.6em; margin-top: 3px; float: right"
			onclick="location.reload()" title="刷新"> <i
			class="layui-icon layui-icon-refresh" style="line-height: 30px"></i></a>
	</div>
	<div class="layui-fluid">
		<div class="layui-row layui-col-space15">
			<div class="layui-col-md12">
				<div class="layui-card">
					<div class="layui-card-body ">
						<form class="layui-form layui-col-space5" method="post"
							action="select" id='form'>
							<table border="1">
								<caption>新建调职申请单</caption>
								<tr>
								<th><label for="L_id" class="layui-form-label">申请编号
											<span class="x-red">*</span>
									</label></th>
									<th><input type="text" id="L_id" name="id"
										required="" lay-verify="id" autocomplete="off"
										class="layui-input" value=""></th>
									<th><label for="L_userid" class="layui-form-label">申请人Id
											<span class="x-red">*</span>
									</label></th>
									<th><input type="text" id="L_userid" name="userid"
										required="" lay-verify="userid" autocomplete="off"
										class="layui-input" value=""></th>
									<th><label for="L_name" class="layui-form-label">申请人
											<span class="x-red">*</span>
									</label></th>
									<th><input type="text" id="L_name" name="name" required=""
										lay-verify="name" autocomplete="off" class="layui-input"
										value=""></th>
								</tr>
								<tr>
									<th colspan="6" align="center">
										<button class="layui-btn" lay-filter="select" lay-submit="">搜索</button>
									</th>
								</tr>
							</table>
						</form>
					</div>
					<h2 align="center">调职申请单列表</h2>
					<div class="layui-card-header">
						<button class="layui-btn layui-btn-danger" onclick="delAll()">
							<i class="layui-icon"></i>批量删除
						</button>
						<button class="layui-btn"
							onclick="xadmin.open('添加申请单','addinput',800,600)">
							<i class="layui-icon"></i><cite>添加</cite>
						</button>
					</div>
					<div class="layui-card-body layui-table-body layui-table-main">
						<table class="layui-table layui-form">
							<thead>
								<tr>
									<th>选择</th>
									<th>申请编号</th>
									<th>申请人</th>
									<th>申请时间</th>
									<th>目前部门</th>
									<th>目前岗位</th>
									<th>目前岗位职等</th>
									<th>希望日期</th>
									<th>调至部门</th>
									<th>调至岗位</th>
									<th>调至岗位职等</th>
									<th>审批状态</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${transfers}" var="transfer">
									<tr>
										<td><input type="checkbox" name="" lay-skin="primary"
											value="${transfer.id }"></td>
										<td>${transfer.id}</td>
										<td>${transfer.name}</td>
										<td>${transfer.applyDate }</td>
										<td>${transfer.onDeptName }</td>
										<td>${transfer.onPost }</td>
										<td>${transfer.onRank }</td>
										<td>${transfer.hopeDate }</td>
										<td>${transfer.dept.name }</td>
										<td>${transfer.afterPost }</td>
										<td>${transfer.afterRank }</td>
										<td>缺少数据</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script>
	layui.use([ 'laydate', 'form' ], function() {
		var laydate = layui.laydate;
		var form = layui.form;
	});
	
	function delAll() {
		layer.confirm('确认要删除吗？', function(index) {
			var option = $(":checked");
			/* var arr = []; */
			for (var i = 0; i < option.length; i++) {
				$.post('delete', {
					"id":option[i].value
				});
			};
			layer.msg('删除成功', {
				icon : 1
			});
			$(":checked").parents("tr").remove();
		});
	}
		//监听提交
		form.on('submit(select)', function(data) {
			$.post("select", data.field, function(data) {
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
</script>
</html>