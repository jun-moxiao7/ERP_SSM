package com.tledu.zrz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.User;
import com.tledu.zrz.service.IUserService;
import com.tledu.zrz.util.AjaxObj;
import com.tledu.zrz.util.ERPException;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(username, password);

		IUserService userService = ObjectFactory.getUserService();
		PrintWriter pw = response.getWriter();
		try {
			// 登陆成功 返回对象
			User loginUser = userService.login(user);
			// 保存到session中
			request.getSession().setAttribute("loginUser", loginUser);
//			pw.println( "{'id':1,'msg':'登陆成功'}");
			pw.println(new AjaxObj(1, "登陆成功").toJSON());
		} catch (ERPException e) {
			// 到这里 说明登陆失败
			String msg = e.getMessage();
			pw.println(new AjaxObj(0, msg).toJSON());
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
