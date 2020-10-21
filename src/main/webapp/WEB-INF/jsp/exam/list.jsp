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
</head>
<body>
	<div class="x-nav">
		<span class="layui-breadcrumb"> <a href="">首页</a> <a href="">培训管理</a>
			<a> <cite>培训考核列表</cite></a>
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
						<form class="layui-form layui-col-space5" action='select' method="post">
								<p id="headtwo">检索条件</p>
						        <table   cellspacing = 0 style="border-collapse:collapse">
						            <tr>
						                <td class="title">
							                <label for="L_id" class="layui-form-label">  
							           			     考核编号<span class="xingxing">*</span>
											</label>
						               </td>
						                <td><input type="text" class="ib layui-input"
						                	id="L_id" name="id" required=""
												lay-verify="trainid" autocomplete="off"></td>
						               <td class="title">培训编号<span class="xingxing">*</span></td>
						                <td><input type="text" class="ib layui-input"
						                	id="L_trainid" name="trainid" required=""
												lay-verify="trainid" autocomplete="off"></td>
						                <td class="title">培训名称<span class="xingxing">*</span></td>
						                <td><input type="text" class="ib layui-input"
						                	id="L_trainname" name="trainname" required=""
												lay-verify="trainname" autocomplete="off"></td>
						                 
						            </tr>
						            <tr class="option">
						            	<td class="title">培训方式</td>
							                <td id="choose">
							                <select id="L_fashion" name="fashion" required=""
												lay-verify="fashion" autocomplete="off" class="layui-input">
							                    <option value="--请选择--">--请选择--</option>
							                    <option value="实践培训">实践培训</option>
							                    <option value="课程培训">课程培训</option>
							                    <option value=" "> </option>
							                </select></td>
							            <td class="title">考评人<span class="xingxing">*</span></td>
						                <td><input type="text" class="ib layui-input"
						                	id="L_examiner" name="examiner" required=""
												lay-verify="examiner" autocomplete="off"></td>
							             
						            </tr>
						        </table>   
						        <div id="headone">
								        <label for="L_repass" class="layui-form-label "></label>
										<button class="layui-btn bt" lay-filter="select" lay-submit="">检索</button>
								        </div> 
						</form>
						
					</div>
					<div class="layui-card-header">
							<button class="layui-btn"
							onclick="xadmin.open('添加培训','addInput',1700,900)">
							<i class="layui-icon"></i>添加
						<button class="layui-btn layui-btn-danger" onclick="delAll()">
						<i class="layui-icon"></i>批量删除
						</button>
					</div>
					<div class="layui-card-body layui-table-body layui-table-main">
						<table class="layui-table layui-form">
							<thead >
								<tr >
									<th>选择<input type="checkbox" style="margin: 10px" id = "allChooseBox" name = "id"></th>
									<th>考核编号</th>
									<th>培训编号</th>
									<th>培训名称 </th>
									<th>培训方式 </th>
									<th>培训老师</th>
									<th>考评人</th>
									<th>考核方式</th>
									<th>考评时间</th>
							   </tr>
							</thead>
							<tbody>
								<c:forEach items="${exams}" var="exam">
									<tr style="text-align: center">
										<td><input type="checkbox"  class="chooseBox" value="${exam.id}" name="class"></td>
										<td>${exam.id}</td>
										<td>${exam.train.id}</td>
										<td>${exam.trainname }</td>
										<td>${exam.train.fashion}</td>
										<td>${exam.train.teacher}</td>
										<td>${exam.examiner}</td>
										<td>${exam.fashion }</td>
										<td>${exam.time }</td>
										
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
	form.on('submit(select)', function(data) {
		//			console.log(data.field);
				//发异步，把数据提交给php
				$.post("select",data.field,function(data){
					layer.alert("检索成功", {
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
			
	
		function delAll () {
	        layer.confirm('确认要删除吗？',function(index){
	            //捉到所有被选中的，发异步进行删除
	            var option = $(":checked");
	            for(var i =0 ;i<option.length;i++){
	            	$.post('delete', {"id":option[i].value}, function(ajaxObj) {
						// 把返回的json格式的字符串转换的json对象
						var json = JSON.parse(ajaxObj);
						// 1是成功
						if (json.result == 1) {
							// 在页面中删除这个数据
							var allChooseBox = document.getElementById('allChooseBox');
							if(allChooseBox.checked == true){
								allChooseBox.checked = false;
							}
							layer.msg('删除成功', {icon: 1});
							$(":checked").parents("tr").not(".option").remove();
							// 提示信息
							layer.msg(json.msg,{
								  icon: 1,
								  time: 1000 //2秒关闭（如果不配置，默认是3秒）
							});
						}else {
								layer.msg("删除失败",{
									 icon: 2,
									  time: 1000
								});
							
						}
	            	
					});
	            }
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

</script>
</html>