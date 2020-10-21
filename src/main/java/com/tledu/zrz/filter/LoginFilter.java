package com.tledu.zrz.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tledu.zrz.model.User;
import com.tledu.zrz.util.HttpFilter;

@WebFilter("/*")
public class LoginFilter extends HttpFilter {

	// 保存每一个不需要拦截的请求
	private List<String> paths = null;

	@Override
	public void init() throws ServletException {
		// 获取不需要拦截的请求
		String filterPath = getServletContext().getInitParameter("filterPath");
		// 如果不为空 就以逗号分割 ,得到字符串数组(数组中是每一个不需要进行登陆校验的路由)
		if (filterPath != null) {
			// 数组
			String[] pathS = filterPath.split(",");
			// 转换为list
			paths = Arrays.asList(pathS);
		}
	}

	@Override
	protected void doFilter(HttpServletRequest request,
			HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		/**
		 * 获取当前请求的路由,判断是否在不需要拦截的集合中,如果在,直接放行
		 * 
		 * 如果不在,就判断session中是否已经登陆,如果未登陆,返回登陆页面,如果已登陆,放行
		 */
		// System.out.println(request.getServletPath());
		// 获取当前请求的路由
		String path = request.getServletPath();
		// 判断集合中是否包含当前请求的路由,不包含就需要进行登陆认证
		// path中 如果是以 /resources 打头 说明我们要请求的是 css或者js 直接放行
		// startsWith 判断一个字符串中是否以指定字符串打头
		if (!paths.contains(path) && !path.startsWith("/resources")) {
			// /login /login.jsp /resources
			// 到这里说明需要进行登陆验证
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("loginUser");
			if (user == null) {
				// getContextPath : /项目名
				// 因为重定向的绝对定位默认到 8080 (webapps)
				// response.sendRedirect(request.getContextPath()+"/");
				response.sendRedirect(request.getContextPath() + "/login.jsp");
				return;
			}
		}
		// 能执行到这里,说明,要么不用拦截就可以访问,要么就是登陆了
		chain.doFilter(request, response);

	}
}
