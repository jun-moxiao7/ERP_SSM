<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	href="<%=request.getContextPath()%>/resources/xadmin/css/xadmin3.css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/xadmin/lib/layui/layui.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/xadmin/js/xadmin.js"></script>
	<style >
	.layui-fluid .layui-row .layui-card-body .layui-table input{
	border:0px;
	
	}
	.layui-fluid .layui-row .layui-card-body .layui-table .tex{
	width:240px;
	height:30px;
	font-size:18px;
	}
	.layui-fluid .layui-row .layui-card-body .layui-table .tex2{
	width:1005px;
	height:30px;
	font-size:18px;
	}
	 .layui-fluid .layui-row .layui-card-body .layui-table .layui-input{
	
	 }
	</style>
</head>
<body>
	<div class="layui-fluid">
		<div class="layui-row">
	
			<div class="layui-card-body layui-table-body layui-table-main">
				<form class="layui-form" method="post" action="add" id='form'>
						<table class="layui-table layui-form">
							
									<tr>
									<td>质检申请单编号<span class="x-red">*</span></td>
									<td>
									 <select>
    									<option>工资报表编号</option>
  									</select>
									<input type="text" placeholder="保存时自动生成" disabled=false>
									</td>
									<td>质检申请单主题<span class="x-red">*</span></td>
									<td><input type="text" class="tex  layui-input" id="L_c_title" name="c_title" required=""
							lay-verify="c_title" autocomplete="off"></td>
									<td>源单类型</td>
										<td><select  class="layui-input" id="L_c_type" name="c_type" required=""
							lay-verify="c_type" autocomplete="off">
										<option>采购到货单</option>
    									<option>采购到其他</option>
  									</select>
									</td>
								</tr>
								<tr>
								<td>往来单位<span class="x-red">*</span></td>
									<td><input type="text" class="tex  layui-input" id="L_c_adr" name="c_adr" required=""
							lay-verify="c_adr" autocomplete="off" ></td>
									</td>
									<td>往来单位大类<span class="x-red">*</span></td>
									<td><input type="text" class="tex  layui-input" id="L_c_adrs" name="c_adrs" required=""
							lay-verify="c_adrs" autocomplete="off" ></td>
								
									<td>质检类别<span class="x-red">*</span><td><select  class="layui-input" id="L_c_types" name="c_types" required=""
							lay-verify="c_types" autocomplete="off">
										<option>进货检验</option>
    									<option>其他检验</option>
  									</select>
									</td>
								<tr>
									<td>生产负责人<span class="x-red">*</span></td>
									
									<td><input type="text" class="tex  layui-input" id="L_c_name" name="c_name" required=""
							lay-verify="c_name" autocomplete="off"></td>
									
									<td>生产部门<span class="x-red">*</span></td>
								
									<td><input type="text" class="tex  layui-input" id="L_c_dep" name="c_dep" required=""
							lay-verify="c_dep" autocomplete="off" ></td>
							<td>检验方式<td><select  class="layui-input" id="L_c_way" name="c_way" required=""
							lay-verify="c_way" autocomplete="off">
										<option>全检</option>
    									<option>随机检验</option>
  									</select>
									</td>
								</tr>
								
									<td>报险人员<span class="x-red">*</span></td>
									
									<td><input type="text" class="tex  layui-input" id="L_c_names" name="c_names" required=""
							lay-verify="c_names" autocomplete="off"></td>
							<td>报险部门<span class="x-red">*</span></td>
								
									<td><input type="text" class="tex  layui-input" id="L_c_deps" name="c_deps" required=""
							lay-verify="c_deps" autocomplete="off" ></td>
							<td>报险日期<span class="x-red">*</span></td>
								
									<td><input type="text" class="tex  layui-input" id="L_c_date" name="c_date" required=""
							lay-verify="c_date" autocomplete="off" ></td>
							
								
								
						</table>
							<div class="layui-form-item">
					<label for="L_repass" class="layui-form-label"></label>
					<button class="layui-btn" lay-filter="add" lay-submit="">增加</button>
				</div>
						</form>
					
					</div>
		</div>
	</div>
	

<!-- placeholder="格式2018-01-01" -->
</body>
	<script>
		layui.use([ 'form', 'layer', 'jquery' ], function() {
			$ = layui.jquery;
			var form = layui.form, layer = layui.layer;
			


			//监听提交
			form.on('submit(add)', function(data) {
				$.post("add",data.field,function(){
					console.log(data.field);
					//发异步，把数据提交给php
					layer.alert("增加成功", {
						icon : 6
				}
// 				
				, function() {
					//关闭当前frame
					xadmin.close();
					// 提交action
					
					// 可以对父窗口进行刷新 
					xadmin.father_reload();
				});
				
			});
				return false;

			});

		});
	</script>
</html>