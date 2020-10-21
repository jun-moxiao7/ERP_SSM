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
				 <p id="header">新建编号规则</p>
		        <div id="headone">
		        <label for="L_repass" class="layui-form-label "></label>
				<button class="layui-btn bt" lay-filter="add" lay-submit=""  id = "hold">保存</button>
				<button class="bt" id = "print">打印</button>
		        </div> 
		        <p id="headtwo">编号规则基本信息</p>
		        <table   cellspacing = 0 style="border-collapse:collapse">
		            <tr>
		                 <td class="title">编号规则名称<span class="xingxing">*</span></td>
		                <td><input type="text" class="ib layui-input"
		                	id="L_rule_name" name="rule_name" required=""
								lay-verify="rule_name" autocomplete="off"></td>
						 <td class="title">单据名称<span class="xingxing">*</span></td>
		                <td><input type="text" class="ib layui-input"
		                	id="L_goods_name" name="goods_name" required=""
								lay-verify="goods_name" autocomplete="off"></td>
						 <td class="title">编号前缀<span class="xingxing">*</span></td>
		                <td><input type="text" class="ib layui-input"
		                	id="L_number_head" name="number_head" required=""
								lay-verify="number_head" autocomplete="off"></td>
		            </tr>
		            <tr>
		            	 <td class="title">日期类型<span class="xingxing">*</span></td>
		                <td><input type="text" class="ib layui-input"
		                	id="L_dateformat" name="dateformat" required=""
								lay-verify="dateformat" autocomplete="off"></td>
						 <td class="title">流水号长度<span class="xingxing">*</span></td>
		                <td><input type="text" class="ib layui-input"
		                	id="L_"length"" name="length" required=""
								lay-verify=""length"" autocomplete="off"></td>
						 <td class="title">编号示例<span class="xingxing">*</span></td>
		                <td><input type="text" class="ib layui-input"
		                	id="L_example" name="example" required=""
								lay-verify="example" autocomplete="off"></td>
		            </tr>
		            <tr>
		            	<td class="title">是否为缺省规则<span class="xingxing">*</span></td>
		            	 <td id="choose">
		                <select id="L_rule" name="rule" required=""
							lay-verify="rule" autocomplete="off" class="layui-input">
		                    <option value="是">是</option>
		                    <option value="否">否</option>
		                </select></td>
		                <td class="title">启用状态<span class="xingxing">*</span></td>
		                 <td id="choose">
		                <select id="L_status" name="status" required=""
							lay-verify="status" autocomplete="off" class="layui-input">
		                    <option value="启用">启用</option>
		                    <option value="未启用">未启用</option>
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