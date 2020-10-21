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
		<span class="layui-breadcrumb"> <a href="">首页</a> <a href="">质检管理</a>
			<a> <cite>编号规则展示</cite></a>
		</span> <a class="layui-btn layui-btn-small"
			style="line-height: 1.6em; margin-top: 3px; float: right"
			onclick="location.reload()" title="刷新"> <i
			class="layui-icon layui-icon-refresh" style="line-height: 30px"></i></a>
	</div>
	 <p id="header">编号规则设置</p>
	<div class="layui-fluid">
		<div class="layui-row layui-col-space15">
			<div class="layui-col-md12">
				<div class="layui-card">
					<div class="layui-card-body ">
						
					</div>
					<div class="layui-card-header">
						<button class="layui-btn"
							onclick="xadmin.open('添加编号规则','addInput',1700,900)">
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
									<th>选择<input type="checkbox" style="margin: 10px" id = "allChooseBox" name = "id"></th>
									<th>编号规则名称 </th>
									<th>单据名称</th>
									<th>编号前缀</th>
									<th>日期类型 </th>
									<th>流水号长度</th>
									<th>编号示例</th>
									<th>是否为缺省规则 </th>
									<th>启用状态</th>
									
							   </tr>
							</thead>
							<tbody>
								<c:forEach items="${quality_testings}" var="quality_testing">
									<tr>
										<td><input type="checkbox"  class="chooseBox" value="${quality_testing.rule_name}" name="class"></td>
										<td>${quality_testing.rule_name}</td>
										<td>${quality_testing.goods_name}</td>
										<td>${quality_testing.number_head}</td>
										<td>${quality_testing.dateformat}</td>
										<td>${quality_testing.length}</td>
										<td>${quality_testing.example}</td>
										<td>${quality_testing.rule}</td>
										<td>${quality_testing.status}</td>
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
	function delAll () {
        layer.confirm('确认要删除吗？',function(index){
            //捉到所有被选中的，发异步进行删除
            var option = $(":checked");
            for(var i =0 ;i<option.length;i++){
            	$.post('delete', {"rule_name":option[i].value}, function(ajaxObj) {
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
						$(":checked").parents("tr").remove();
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