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

 select,input {
	display: inline-block !important;
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
					<h2 align="center">调职申请单列表</h2>
					<div class="layui-card-header">
					<button class="layui-btn"
							onclick="xadmin.open('添加申请单','addinput',800,600)">
							<i class="layui-icon"></i><cite>添加</cite>
						</button>
						<button class="layui-btn layui-btn-danger" onclick="del()">
							<i class="layui-icon"></i>删除
						</button>
						<button class="layui-btn layui-btn-danger" onclick="delAll()">
							<i class="layui-icon"></i>撤销任务
						</button>
					</div>
					<div class="layui-card-body layui-table-body layui-table-main">
						<table class="layui-table layui-form">
							<thead>
								<tr>
									<th>选择</th>
									<th>任务编号</th>
									<th>任务主题</th>
									<th>考核期间分类</th>
									<th>考核周期</th>
									<th>开始日期</th>
									<th>结束日期</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${ats}" var="at">
									<tr>
										<td><input type="checkbox" name="" lay-skin="primary"
											value="${at.id }"></td>
										<td>${at.id}</td>
										<td>${at.theme}</td>
										<td>${at.dateType}</td>
										<td>${at.year}${at.date}</td>
										<td>${at.startTime }</td>
										<td>${at.endTime }</td>
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
		layer.confirm('确认要撤销任务吗？', function(index) {
			var option = $(":checked");
			/* var arr = []; */
			for (var i = 0; i < option.length; i++) {
				$.post('delete', {
					"id" : option[i].value
				});
			}
			;
			layer.msg('操作成功', {
				icon : 1
			});
			//上面搜索里面的option也会被删除
			$(":checked").parents("tr").not(".sels").remove();
			
		});
	}
	function del() {
		layer.confirm('确认要删除吗？', function(index) {
			//上面搜索里面的option也会被删除
			$(":checked").parents("tr").not(".sels").remove();
			layer.msg('删除成功', {
				icon : 1
			});
		});
	}
</script>
</html>