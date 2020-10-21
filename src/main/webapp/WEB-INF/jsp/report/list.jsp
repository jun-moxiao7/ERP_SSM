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
	href="<%=request.getContextPath()%>/resources/xadmin/css/xadmin2.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/add.css">
<script
	src="<%=request.getContextPath()%>/resources/xadmin/lib/layui/layui.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/xadmin/js/xadmin.js"></script>
<style type="text/css">

</style>
</head>
<body>
	<div class="x-nav">
		<span class="layui-breadcrumb"> <a href="">首页</a> <a href="">质检报告</a>
			<a> <cite>质检列表</cite></a>
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
							<p id="headtwo">检索条件</p>
							<table cellspacing = 0 style="border-collapse:collapse">	
								<tr>
								<td class="title"><label for="L_number" class="layui-form-label">单据编号
											<span class="x-red">*</span>
									</label></td>
									<td><input type="text" id="L_number" name="number"
										required="" lay-verify="number" autocomplete="off"
										class="layui-input ib" value=""></<td>
									<td class="title"><label for="L_main_title" class="layui-form-label">单据主题
											<span class="x-red">*</span>
									</label></td>
									<td><input type="text" id="L_main_title" name="main_title"
										required="" lay-verify="main_title" autocomplete="off"
										class="layui-input ib" value=""></td>
									<td class="title"><label for="L_source_class" class="layui-form-label">源单类型
											<span class="x-red">*</span>
									</label></td>
									<td><select name="source_class" lay-search>
										<option value="质检申请单">质检申请单</option>
										<option value="双方协商解除劳动合同">生产任务单</option>
									</select></td>
								</tr>
								<tr>
									
									<td class="title"><label for="L_check_class" class="layui-form-label">质检类别
											<span class="x-red">*</span>
									</label></td>
									<td><select name="check_class" lay-search>
										<option value="进货检验">进货检验</option>
									</select></td>
									<td class="title"><label for="L_fashion" class="layui-form-label">检验方式
											<span class="x-red">*</span>
									</label></td>
									<td><select name="fashion" lay-search>
										<option value="抽检">抽检</option>
										<option value="全检">全检</option>
									</select></td>
									<td class="title"><label for="L_person" class="layui-form-label">报检人员
											<span class="x-red">*</span>
									</label></td>
									<td><input type="text" id="L_person" name="person"
										required="" lay-verify="person" autocomplete="off"
										class="layui-input ib" value=""></td>
								</tr>
								<tr>
									<td class="title"><label for="L_dept" class="layui-form-label">报检部门
											<span class="x-red">*</span>
									</label></td>
									<td><input type="text" id="L_dept" name="dept"
										required="" lay-verify="dept" autocomplete="off"
										class="layui-input ib" value=""></th>
									<td class="title"><label for="L_verify_state" class="layui-form-label">审批状态
											<span class="x-red">*</span>
									</label></td>
									<td><select name="verify_state" lay-search>
										<option value="审批通过">审批通过</option>
										<option value="待审批">待审批</option>
									</select>
									<div class="layui-form-select">
										<div class="layui-select-title">
											<input type="text" placeholder="请选择" value="审批通过" class="layui-input">
											<i class="layui-edge"></i>
											</div>
											<dl class="layui-anim layui-anim-upbit">
													<dd lay-value="审批通过" class="layui-this">审批通过</dd>
													<dd lay-value="待审批" class="">待审批</dd>
													</dl>
													</div>
									</td>
									<td class="title"><label for="L_bill_state" class="layui-form-label">单据状态
											<span class="x-red">*</span>
									</label></td>
									<td><select name="bill_state" lay-search>
										<option value="执行">执行</option>
										<option value="制单">制单</option>
										<option value="制单">手工结单</option>
									</select></td>
								</tr>
						
							</table>
							<div id="headone">
								        <label for="L_repass" class="layui-form-label "></label>
										<button class="layui-btn bt" lay-filter="select" lay-submit="">检索</button>
								        </div> 
						</form>
					</div>
					<h2 align="center">调职申请单列表</h2>
					<div class="layui-card-header">
					<button class="layui-btn"
							onclick="xadmin.open('添加培训','addInput',1700,900)">
							<i class="layui-icon"></i>添加
							</button>
						<button class="layui-btn layui-btn-danger" onclick="delAll()">
							<i class="layui-icon"></i>批量删除
						</button>
						
					</div>
					<div class="layui-card-body layui-table-body layui-table-main">
						<table class="layui-table layui-form">
							<thead>
								<tr>
									<th>选择<input type="checkbox" style="margin: 10px" id = "allChooseBox"></th>
									<th>单据编号</th>
									<th>单据主题</th>
									<th>源单类型</th>
									<th>往来单位</th>
									<th>往来单位类别</th>
									<th>质检类别</th>
									<th>检验方式</th>
									<th>报检人员</th>
									<th>报检部门</th>
									<th>报检日期</th>
									<th>单据状态</th>
									<th>审批状态</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${reports}" var="report">
									<tr>
										<td><input type="checkbox" name="" lay-skin="primary"
											value="${report.number}"></td>
										<td>${report.number}</td>
										<td>${report.main_title}</td>
										<td>${report.source_class }</td>
										<td>${report.unit }</td>
										<td>${report.unit_class }</td>
										<td>${report.check_class }</td>
										<td>${report.fashion }</td>
										<td>${report.person }</td>
										<td>${report.dept }</td>
										<td>${report.date }</td>
										<td>${report.bill_state }</td>
										<td>${report.verify_state }</td>
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
					"number":option[i].value
				});
			};
			layer.msg('删除成功', {
				icon : 1
			});
			$(":checked").parents("tr").optive();
		});
	}
	 window.onload = function () {
         var allChoose = document.getElementById("allChooseBox");
         var choose = document.getElementsByClassName('chooseBox');
         var chooseCount = 0;
         //全选框
         allChoose.onclick = function () {
             if(allChoose.checked == false){
                 for (var i = 0; i < choose.length; i++) {
                     choose[i].checked = false;
                 }
             }else{
                 for (var i = 0; i < choose.length; i++) {
                     choose[i].checked = true;
                 }
             }
             

         }
         //复选框
         for (var i = 0; i < choose.length; i++) {
             choose[i].onclick = function () {
                 for (var j = 0; j < choose.length; j++) {
                     if (choose[j].checked == true) {
                         chooseCount++;
                     }
                     if (chooseCount == choose.length) {
                         allChoose.checked = true;
                     } else {
                         allChoose.checked = false;
                     }
                 }
                 chooseCount = 0;
             }
            
         }
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