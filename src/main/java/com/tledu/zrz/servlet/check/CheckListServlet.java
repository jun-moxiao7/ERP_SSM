package com.tledu.zrz.servlet.check;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Check;
import com.tledu.zrz.service.ICheckService;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/**
 * 获取所有的用户并展示
 * 
 */
@WebServlet("/check/list")
public class CheckListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取UserService对象
		ICheckService checkService = ObjectFactory.getCheckService();
		// 调用list方法 获取所有的用户数据
		List<Check> checks = checkService.list();
		// 传递到页面
		request.setAttribute("checks", checks);
		// 跳转对应的展示页面
		// request.getRequestDispatcher("/WEB-INF/jsp/user/list.jsp").forward(request,
		// response);
		ForwardUtil.forward(request, response, "check/list");
	}
}
