package com.tledu.zrz.servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.AjaxObj;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/user/verifyUsername")
public class UserVerifyUsername extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String username = req.getParameter("username");
		boolean flag = ObjectFactory.getUserService().verifyUsername(username);
		if (flag) {
			resp.getWriter().println(new AjaxObj(0, "用户名已存在").toJSON());
		}else{
			resp.getWriter().println(new AjaxObj(1, "用户名可以使用").toJSON());
		}
	}
}
