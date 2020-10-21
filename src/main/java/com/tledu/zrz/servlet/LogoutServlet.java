package com.tledu.zrz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 删除session中登陆信息 并返回到登陆页面
		req.getSession().invalidate();
		// 登陆页面
		resp.sendRedirect(req.getContextPath() + "/login.jsp");
	}
}
