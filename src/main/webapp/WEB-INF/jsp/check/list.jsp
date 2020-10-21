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
	href="<%=request.getContextPath()%>/resources/xadmin/css/xadmin3.css">
<script
	src="<%=request.getContextPath()%>/resources/xadmin/lib/layui/layui.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/xadmin/js/xadmin.js"></script>
		<style>
	#tdd1 {
	position:relative;
	}
	#allChooseBox2{
	display:block;
	position:absolute;
	top:12px;
	right:30px;
	
	}
	#inty{
	display:block;
	position:absolute;
	top:12px;
	right:30px;
	
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
						<form class="layui-form layui-col-space5">
							<div class="layui-inline layui-show-xs-block">
								<input type="text" name="deparname" placeholder="请输入用户名"
									autocomplete="off" class="layui-input">
							</div>
							<div class="layui-inline layui-show-xs-block">
								<button class="layui-btn" lay-submit="" lay-filter="sreach">
									<i class="layui-icon">&#xe615;</i>
								</button>
							</div>
						</form>
					</div>
					<div class="layui-card-body ">
						<form class="layui-form layui-col-space5" method="post"
							action="select" id='form'>
							<table border="1">
								<caption>质检申请单</caption>
								<tr>
									<th><label for="L_c_id" class="layui-form-label">申请单编号
											<span class="x-red">*</span>
									</label></th>
									<th><input type="text" id="L_c_id" name="c_id"
										required="" lay-verify="c_id" autocomplete="off"
										class="layui-input" value=""></th>
								
								</tr>
								<tr>
									<th colspan="4" align="center">
										<button class="layui-btn" lay-filter="select" lay-submit="">搜索</button>
									</th>
								</tr>
							</table>
						</form>
					</div>

					<div class="layui-card-header">
						<button class="layui-btn"
							onclick="xadmin.open('添加工资报表','addInput',1200,600)">
							<i class="layui-icon"></i>添加
						</button>
						<button class="layui-btn" onclick="delAll()"
											href="javascript:;">
							<i class="layui-icon"></i>删除
						</button>
					
					</div>
					<div class="layui-card-body layui-table-body layui-table-main">
						<table class="layui-table layui-form">
							<thead>
								<tr>
								<td id="tdd1">选择<input type="checkbox" id="allChooseBox2" ></td> 
									<td>质检申请单编号</td>
									<td>质检申请单主题</td>
									<td>源单类型</td>
									<td>往来单位</td>
									<td>往来单位大类</td>
									<td>检验方式</td>
									<td>报检人员</td>
									<td>报险部门</td>
									<td>报检日期</td>
									<td>报表状态</td>
									<td>审批状态</td>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${checks}" var="check">
									<tr>
									<td id="td1"><input type="checkbox" id="inty" class="chooseBox2" value="${check.c_id }" ></td> 
										<td>${check.c_id }</td>
										<td>${check.c_title }</td>
										<td>${check.c_type }</td>
										<td>${check.c_adr }</td>
										<td>${check.c_adrs }</td>
										<td>${check.c_way }</td>
										<td>${check.c_names }</td>
										<td>${check.c_deps }</td>
										<td>${check.c_date }</td>
									
										<td>执行</td>
										<td>审批通过</td>
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
window.onload = function () {
    var allChoose = document.getElementById("allChooseBox2");
    var choose = document.getElementsByClassName('chooseBox2');
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
function delAll () {
    layer.confirm('确认要删除吗？',function(index){
        //捉到所有被选中的，发异步进行删除
         var option = $(":checked");
        for(var i =0 ;i<option.length;i++){
        	$.post('delete', {"c_id":option[i].value}, function(ajaxObj) {
				// 把返回的json格式的字符串转换的json对象
				var json = JSON.parse(ajaxObj);
				// 1是成功
				if (json.result == 1) {
					// 在页面中删除这个数据
					var allChooseBox = document.getElementById('allChooseBox2');
					if(allChooseBox.checked==true){
						allChooseBox.checked=false;
					}
					layer.msg('删除成功', {icon: 1});
					
					$(":checked").parents("tr").remove();
					// 提示信息
					layer.msg(json.msg,{
						  icon: 1,
						  time: 1000 //2秒关闭（如果不配置，默认是3秒）
						});
				} else {
					layer.msg("删除失败",{
						 icon: 2,
						  time: 1000
					});
				}
			});
        }

    });
  }
layui.use([ 'form', 'layer', 'jquery' ], function() {
	$ = layui.jquery;
	var form = layui.form, layer = layui.layer;
	
});
//监听提交
form.on('submit(select)', function(data) {
	$.post("select", data.field, function(data) {
		layer.alert("搜索成功", {
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