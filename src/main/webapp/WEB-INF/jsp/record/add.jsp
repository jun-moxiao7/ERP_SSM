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
	</style>
</head>
<body>
	<div class="layui-fluid">
		<div class="layui-row">
	
			<div class="layui-card-body layui-table-body layui-table-main">
				<form class="layui-form" method="post" action="add" id='form'>
						<table class="layui-table layui-form">
							
									<tr>
									<td>考试编号<span class="x-red">*</span></td>
									<td>
									 <select>
    									<option>考试记录单编号</option>
  									</select>
									<input type="text" placeholder="保存时自动生成" disabled=false>
									</td>
									<td>主题<span class="x-red">*</span></td>
									<td><input type="text" class="tex  layui-input" id="L_titlename" name="titlename" required=""
							lay-verify="titlename" autocomplete="off"></td>
									<td>考试负责人<span class="x-red">*</span></td>
									<td><input type="text" class="tex layui-input"  id="L_charge" name="charge" required=""
							lay-verify="charge" autocomplete="off"></td>
								</tr>
								<tr>
									<td>开始时间<span class="x-red">*</span></td>
									<td><input type="text" class="tex  layui-input" id="L_start" name="start" required=""
							lay-verify="start" autocomplete="off" placeholder="格式2018-01-01"></td>
									<td>结束时间<span class="x-red">*</span></td>
									<td><input type="text" class="tex  layui-input" id="L_end" name="end" required=""
							lay-verify="end" autocomplete="off" placeholder="格式2018-01-01"></td>
									<td>考试地点<span class="x-red">*</span></td>
									<td><input type="text" class="tex  layui-input" id="L_adr" name="adr" required=""
							lay-verify="adr" autocomplete="off"></td>
								</tr>
								<tr>
									<td>考试状态<span class="x-red">*</span></td>
									<td>
									<select  class="layui-input" id="L_cdn" name="cdn" required=""
							lay-verify="cdn" autocomplete="off">
    									<option>未开始</option>
										<option>已结束</option>
  									</select>
									</td>
									<td>附件</td>
									<td><a href="#">上传附件</a> </td>
									<td>缺考人数<span class="x-red">*</span></td>
									<td><input type="text" class="tex  layui-input" id="L_peonum" name="peonum" required=""
							lay-verify="peonum" autocomplete="off"></td>
								</tr>
								<tr>
									<td>参与人员<span class="x-red">*</span></td>
									<td  colspan="5"><input type="text" class="tex2  layui-input" id="L_per" name="per" required=""
							lay-verify="per" autocomplete="off"></td>
									
								</tr>
								<tr>
									<td>考试内容摘要</td>
									<td colspan="5"><input type="text" class="tex2  layui-input" id="L_content" name="content" required=""
							lay-verify="content" autocomplete="off"></td>
									
								</tr>
								<tr>
									<td>考试结果</td>
									<td colspan="5"><input type="text" class="tex2  layui-input" id="L_result" name="result" required=""
							lay-verify="result" autocomplete="off"></td>
									
								</tr>
								<tr>
									<td>备注</td>
									<td colspan="5"><input type="text" class="tex2  layui-input" id="L_remarks" name="remarks" required=""
							lay-verify="remarks" autocomplete="off"></td>
									
								</tr>
						</table>
							<div class="layui-form-item">
					<label for="L_repass" class="layui-form-label"></label>
					<button class="layui-btn" lay-filter="add" lay-submit="">增加</button>
				</div>
						</form>
					
					</div>
		</div>
	</div>
	


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