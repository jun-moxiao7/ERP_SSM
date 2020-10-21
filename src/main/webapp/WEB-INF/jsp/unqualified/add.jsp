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
	href="<%=request.getContextPath()%>/resources/xadmin/css/xadmin2.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/add.css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/xadmin/lib/layui/layui.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/xadmin/js/xadmin.js"></script>
</head>
<body>

			<form class="layui-form" method="post" action="add" id='form'>
				 <p id="header">不合格品处置单</p>
		        <div id="headone">
		        <label for="L_repass" class="layui-form-label "></label>
				<button class="layui-btn bt" lay-filter="add" lay-submit=""  id = "hold">保存</button>
				<button class="bt" id = "print">打印</button>
		        </div> 
		        <p id="headtwo">基本信息</p>
		        <table   cellspacing = 0 style="border-collapse:collapse">
		            <tr>
		                 <td class="title">单据编号<span class="xingxing">*</span></td>
		                <td><input type="text" class="ib layui-input"
		                	id="L_number" name="number" required=""
								lay-verify="number" autocomplete="off"></td>
						 <td class="title">单据主题<span class="xingxing">*</span></td>
		                <td><input type="text" class="ib layui-input"
		                	id="L_main_title" name="main_title" required=""
								lay-verify="main_title" autocomplete="off"></td>
						 <td class="title">源单类型<span class="xingxing">*</span></td>
		                <td><input type="text" class="ib layui-input"
		                	id="L_source_class" name="source_class" required=""
								lay-verify="source_class" autocomplete="off"></td>
		            </tr>
		            <tr>
		            	 <td class="title">质检报告单<span class="xingxing">*</span></td>
		                <td><input type="text" class="ib layui-input"
		                	id="L_report_list" name="report_list" required=""
								lay-verify="report_list" autocomplete="off"></td>
						 <td class="title">物品编号<span class="xingxing">*</span></td>
		                <td><input type="text" class="ib layui-input"
		                	id="L_good_number" name="good_number" required=""
								lay-verify="good_number" autocomplete="off"></td>
						 <td class="title">物品名称<span class="xingxing">*</span></td>
		                <td><input type="text" class="ib layui-input"
		                	id="L_name" name="name" required=""
								lay-verify="name" autocomplete="off"></td>
		            </tr>
		            <tr>
		            	 <td class="title">处理负责人<span class="xingxing">*</span></td>
		                <td><input type="text" class="ib layui-input"
		                	id="L_person" name="person" required=""
								lay-verify="person" autocomplete="off"></td>
						 <td class="title">处理日期<span class="xingxing">*</span></td>
		                <td><input type="text" class="ib layui-input"
		                	id="L_date" name="date" required=""
								lay-verify="date" autocomplete="off"></td>
						<td class="title">单据状态<span class="xingxing">*</span></td>
		            	 <td id="choose">
		                <select id="L_bill_state" name="bill_state" required=""
							lay-verify="bill_state" autocomplete="off" class="layui-input">
		                    <option value="执行" >执行</option>
										<option value="制单" >制单</option>
										<option value="手工结单" >手工结单</option>
		                </select></td>
		            </tr>
		            <tr>
		            	<td class="title">审批状态</td>
		                <td id="choose">
		                <select id="L_verify_state" name="verify_state" required=""
							lay-verify="verify_state" autocomplete="off" class="layui-input">
		                    <option value="审批通过">审批通过</option>
		                   <option value="待审批">待审批</option>
		                </select></td>
		            </tr>
		            
		        </table>    
			</form>
	<script>
		layui.use([ 'form', 'layer', 'jquery' ], function() {
			$ = layui.jquery;
			var form = layui.form, layer = layui.layer;
			//监听提交
			form.on('submit(add)', function(data) {
// 				console.log(data.field);
				//发异步，把数据提交给php
				$.post("add",data.field,function(){
					layer.alert("增加成功", {
						icon : 6
					}, function() {
						//关闭当前frame
						xadmin.close();
						// 提交action
						//$("#form").submit();
						// 可以对父窗口进行刷新 
						xadmin.father_reload();
					});
				});
				return false;
			});
				
		});
	</script>

</body>

</html>