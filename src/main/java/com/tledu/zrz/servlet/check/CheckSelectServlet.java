package com.tledu.zrz.servlet.check;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Check;
import com.tledu.zrz.model.Money;
import com.tledu.zrz.service.ICheckService;
import com.tledu.zrz.service.IMoneyService;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/**
 * 获取所有的用户并展示
 * 
 */
@WebServlet("/check/select")
public class CheckSelectServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取UserService对象
		int c_id = Integer.parseInt(request.getParameter("c_id"));
		System.out.println(c_id);
		ICheckService checkService = ObjectFactory.getCheckService();
		// 调用list方法 获取所有的用户数据
		List<Check> checks =checkService.list(c_id);
		System.out.println(checks);
		// 传递到页面
//		System.out.println(111);
		request.setAttribute("checks", checks);
		// 跳转对应的展示页面
		ForwardUtil.forward(request, response, "check/list");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
}
