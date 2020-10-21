<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html class="x-admin-sm">
<head>
<meta charset="UTF-8">
<title>后台管理</title>
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/xadmin/css/font.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/xadmin/css/xadmin.css">
<script
	src="<%=request.getContextPath()%>/resources/xadmin/lib/layui/layui.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/xadmin/js/xadmin.js"></script>

</head>
<body class="index">
	<!-- 顶部开始 -->
	<div class="container">
		<div class="logo">
			<a href="./index.jsp">尘染</a>
		</div>
		<div class="left_open">
			<a><i title="展开左侧栏" class="iconfont">&#xe699;</i></a>
		</div>

		<ul class="layui-nav right" lay-filter="">
			<li class="layui-nav-item"><a href="javascript:;">${loginUser.nickname }</a>
				<dl class="layui-nav-child">
					<!-- 二级菜单 -->
					<dd>
						<a onclick="xadmin.open('个人信息','http://www.baidu.com')">个人信息</a>
					</dd>
					<dd>
						<a onclick="xadmin.open('切换帐号','http://www.baidu.com')">切换帐号</a>
					</dd>
					<dd>
						<a href="logout">退出</a>
					</dd>
				</dl></li>
			<li class="layui-nav-item to-index"><a href="/">前台首页</a></li>
		</ul>
	</div>
	<!-- 顶部结束 -->
	<!-- 中部开始 -->
	<!-- 左侧菜单开始 -->
	<div class="left-nav">
		<div id="side-nav">
			<ul id="nav">
				<!-- 用户模块 -->
				<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="用户管理">&#xe6b8;</i> <cite>用户管理</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
						<!-- 一个li就是一个模块下的分支 -->
						<li><a onclick="xadmin.add_tab('用户列表','user/list')"> <i
								class="iconfont">&#xe6a7;</i> <cite>用户列表</cite></a></li>
					</ul></li>
					
				<!-- 部门管理模块 -->
				<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="部门管理">&#xe6b8;</i> <cite>部门管理</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
						<!-- 一个li就是一个模块下的分支 -->
						<li><a onclick="xadmin.add_tab('部门列表','dept/list')"> <i
								class="iconfont">&#xe6a7;</i> <cite>部门列表</cite></a></li>
					</ul></li>
					
					
				<!-- 培训管理模块 -->
				<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="培训管理">&#xe6b8;</i> <cite>培训管理</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
						<ul class="sub-menu">
					<li><a
							onclick="xadmin.add_tab('培训列表','train/list')"> <i
								class="iconfont">&#xe6a7;</i> <cite>培训列表</cite></a></li>
						<li><a
							onclick="xadmin.add_tab('培训考核列表','exam/list')"> <i
								class="iconfont">&#xe6a7;</i> <cite>培训考核列表</cite></a></li>
					</ul></li>
					
					
				<!-- 人事管理模块 -->
				<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="人事管理">&#xe6b8;</i> <cite>人事管理</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
						<!-- 一个li就是一个模块下的分支 -->
						<li><a
							onclick="xadmin.add_tab('新建调职申请单','hr/transfer/addinput')"> <i
								class="iconfont">&#xe6a7;</i> <cite>新建调职申请单</cite></a></li>
						<li><a onclick="xadmin.add_tab('调职申请单列表','hr/transfer/list')">
								<i class="iconfont">&#xe6a7;</i> <cite>调职申请单列表</cite>
						</a></li>
						<li><a
							onclick="xadmin.add_tab('新建离职申请单','hr/resign/addinput')"> <i
								class="iconfont">&#xe6a7;</i> <cite>新建离职申请单</cite></a></li>
						<li><a onclick="xadmin.add_tab('离职申请单列表','hr/resign/list')">
								<i class="iconfont">&#xe6a7;</i> <cite>离职申请单列表</cite>
						</a></li>
						<li><a
							onclick="xadmin.add_tab('新建调职通知单','hr/inform/addinput')"> <i
								class="iconfont">&#xe6a7;</i> <cite>新建调职通知单</cite></a></li>
						<li><a onclick="xadmin.add_tab('调职通知单列表','hr/inform/list')">
								<i class="iconfont">&#xe6a7;</i> <cite>调职通知单列表</cite>
						</a></li>

					</ul></li>
					
					<!-- 考试管理模块 -->
					<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="考试管理">&#xe6b8;</i> <cite>考试管理</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
						<!-- 一个li就是一个模块下的分支 -->
						<li><a onclick="xadmin.add_tab('考试记录列表','record/list')">
								<i class="iconfont">&#xe6a7;</i> <cite>考试记录列表</cite>
						</a></li>
					</ul></li>
					
					
					
					<!-- 薪酬管理模块 -->
					<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="薪酬管理">&#xe6b8;</i> <cite>薪酬管理</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
						<!-- 一个li就是一个模块下的分支 -->
						<li><a onclick="xadmin.add_tab('考试记录列表','money/list')"> <i
								class="iconfont">&#xe6a7;</i> <cite>工资报表</cite></a></li>
					</ul></li>
					

				<!-- 考核任务模块 -->
				<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="考核任务">&#xe6b8;</i> <cite>考核任务</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
						<!-- 一个li就是一个模块下的分支 -->
						<li><a onclick="xadmin.add_tab('新建考核任务','AT/addinput')">
								<i class="iconfont">&#xe6a7;</i> <cite>新建考核任务</cite>
						</a></li>
						<li><a onclick="xadmin.add_tab('考核任务列表','AT/list')"> <i
								class="iconfont">&#xe6a7;</i> <cite>考核任务列表</cite></a></li>
					</ul></li>


				<!-- 自我评价模块 -->
				<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="自我评价">&#xe6b8;</i> <cite>自我评价</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
						<!-- 一个li就是一个模块下的分支 -->
						<li><a
							onclick="xadmin.add_tab('新建自我评价','evalution/addinput')"> <i
								class="iconfont">&#xe6a7;</i> <cite>新建自我评价</cite></a></li>
						<li><a onclick="xadmin.add_tab('自我评价列表','evalution/list')">
								<i class="iconfont">&#xe6a7;</i> <cite>自我评价列表</cite>
						</a></li>
					</ul></li>

				<!-- 绩效管理模块 -->
				<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="绩效管理">&#xe6b8;</i> <cite>绩效管理</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
						<!-- 一个li就是一个模块下的分支 -->
						<li><a onclick="xadmin.add_tab('考试记录列表','pmce/list')"> <i
								class="iconfont">&#xe6a7;</i> <cite>绩效改进列表</cite></a></li>
					</ul></li>
				<!-- 质检管理模块 -->
				<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="培训管理">&#xe6b8;</i> <cite>质检管理——基本设置</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
					<!-- 一个li就是一个模块下的分支 -->
						<li><a
							onclick="xadmin.add_tab('编号规则列表','quality_testing/list')"> <i
								class="iconfont">&#xe6a7;</i> <cite>编号规则列表</cite></a></li>
					</ul></li>
				
				
				
				<!-- 质检申请模块 -->
				<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="质检申请单">&#xe6b8;</i> <cite>质检申请单</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
						<!-- 一个li就是一个模块下的分支 -->
						<li><a onclick="xadmin.add_tab('质检申请单列表','check/list')">
								<i class="iconfont">&#xe6a7;</i> <cite>质检申请单列表</cite>
						</a></li>
					</ul></li>	
					
					
				<!-- 质检报告模块	 -->
				<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="培训管理">&#xe6b8;</i> <cite>质检报告</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
					<!-- 一个li就是一个模块下的分支 -->
						<li><a
							onclick="xadmin.add_tab('质检列表','report/list')"> <i
								class="iconfont">&#xe6a7;</i> <cite>质检列表</cite></a></li>
					</ul></li>
					
					
				<!-- 不合格品处置 -->
				<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="培训管理">&#xe6b8;</i> <cite>不合格品处置</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
					<!-- 一个li就是一个模块下的分支 -->
						<li><a
							onclick="xadmin.add_tab('不合格品列表','unqualified/list')"> <i
								class="iconfont">&#xe6a7;</i> <cite>不合格品列表</cite></a></li>
					</ul></li>
					
			</ul>
		</div>
	</div>
	<!-- <div class="x-slide_left"></div> -->
	<!-- 左侧菜单结束 -->
	<!-- 右侧主体开始 -->
	<div class="page-content">
		<div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
			<ul class="layui-tab-title">
				<li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
			</ul>
			<div class="layui-unselect layui-form-select layui-form-selected"
				id="tab_right">
				<dl>
					<dd data-type="this">关闭当前</dd>
					<dd data-type="other">关闭其它</dd>
					<dd data-type="all">关闭全部</dd>
				</dl>
			</div>
			<div class="layui-tab-content">
				<div class="layui-tab-item layui-show">
					<iframe src='./welcome.jsp' frameborder="0" scrolling="yes"
						class="x-iframe"></iframe>
				</div>
			</div>
			<div id="tab_show"></div>
		</div>
	</div>
	<div class="page-content-bg"></div>
	<style id="theme_style"></style>
</body>

</html>