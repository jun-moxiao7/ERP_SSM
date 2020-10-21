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
	<div class="layui-fluid">
		<div class="layui-row">
			<form class="layui-form" method="post" action="add" id='form'>
				 <p id="header">新建培训</p>
		        <div id="headone">
		        <label for="L_repass" class="layui-form-label "></label>
				<button class="layui-btn bt" lay-filter="add" lay-submit=""  id = "hold">保存</button>
				<button class="bt" id = "print">打印</button>
		        </div> 
		        <p id="headtwo">培训基本信息</p>
		        <table   cellspacing = 0 style="border-collapse:collapse">
		            <tr>
		                <td class="title">
			                <label for="L_id" class="layui-form-label">  
			           			     培训编号<span class="xingxing">*</span>
							</label>
		               </td>
		                <td id="number"><select name="" id="" >
		                    <option value="培训单编号">培训单编号</option>
		                </select>
		                <input class="keep layui-input" type="text" placeholder="保存时自动生成" 
		                id="L_id" name="id" required=""
							lay-verify="id" autocomplete="off"></td>
		                <td class="title">培训名称<span class="xingxing">*</span></td>
		                 <td id="choose">
		                <select id="L_trainname" name="trainname" required=""
							lay-verify="trainname" autocomplete="off" class="layui-input">
		                    <option value="培训ERP">培训ERP</option>
		                    <option value="新员工拓展培训">新员工拓展培训</option>
		                    <option value="安全生产会议">安全生产会议</option>
		                    <option value="c的培训">c的培训</option>
		                     <option value="2020新员工培训">2020新员工培训</option>
		                </select></td>
		                <td class="title">发起时间</td>
		                <td><input type="text" class="ib layui-input"
		                id="L_examiner" name="examiner" required=""
							lay-verify="examiner" autocomplete="off"></td>
		            </tr>
		            <tr>
		               <td class="title">发起人</td>
		                <td><input type="text" class="ib layui-input"
		                id="L_examiner" name="examiner" required=""
							lay-verify="examiner" autocomplete="off"></td>
		                <td class="title">项目编号</td>
		                <td><input type="text" class="ib layui-input"
		                id="L_examiner" name="examiner" required=""
							lay-verify="examiner" autocomplete="off"></td>
		                 <td class="title">项目名称</td>
		                <td><input type="text" class="ib layui-input"
		                id="L_examiner" name="examiner" required=""
							lay-verify="examiner" autocomplete="off"></td>
		            </tr>
		            <tr>
		            	 <td class="title">培训机构</td>
		                <td><input type="text" class="ib layui-input"
		                id="L_examiner" name="examiner" required=""
							lay-verify="examiner" autocomplete="off"></td>     
							 <td class="title">预算费用</td>
		                <td><input type="text" class="ib layui-input"
		                id="L_examiner" name="examiner" required=""
							lay-verify="examiner" autocomplete="off"></td>
							 <td class="title">培训天数</td>
		                <td><input type="text" class="ib layui-input"
		                id="L_examiner" name="examiner" required=""
							lay-verify="examiner" autocomplete="off"></td>
		            </tr>
		            <tr>
		            	 <td class="title">培训地点</td>
		                <td><input type="text" class="ib layui-input"
		                id="L_addr" name="addr" required=""
							lay-verify="addr" autocomplete="off"></td>
						<td class="title">培训方式<span class="xingxing">*</span></td>
		                 <td id="choose">
		                <select id="L_fashion" name="fashion" required=""
							lay-verify="fashion" autocomplete="off" class="layui-input">
		                    <option value="实践培训">实践培训</option>
		                    <option value="课程培训">课程培训</option>
		                </select></td>
						<td class="title">培训老师</td>
		                <td><input type="text" class="ib layui-input"
		                id="L_teacher" name="teacher" required=""
							lay-verify="teacher" autocomplete="off"></td>
		            </tr>
		             <tr>
		            	 <td class="title">开始时间</td>
		                <td><input type="text" class="ib layui-input"
		                id="L_startTime" name="startTime" required=""
							lay-verify="startTime" autocomplete="off"></td>
						<td class="title">结束时间</td>
		                <td><input type="text" class="ib layui-input"
		                id="L_endTime" name="endTime" required=""
							lay-verify="endTime" autocomplete="off"></td>
						<td class="title">考核人</td>
		                <td><input type="text" class="ib layui-input"
		                id="L_teacr" name="teacr" required=""
							lay-verify="teacr" autocomplete="off"></td>
		            </tr>
		            <tr>
		                 <td rowspan="2" class="title">参与人员<span class="xingxing">*</span></td>
		                <td colspan="5"><textarea name="" id="" cols="140" rows="2"></textarea></td>
		            </tr>
		            <tr></tr>
		            <tr>
		                <td class="title">培训备注<span class="xingxing">*</span></td>
		                <td colspan="5"><textarea name="" id="" cols="140" rows="2"></textarea></td>
		            </tr>
		        </table>   
		</div>
	</div>
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