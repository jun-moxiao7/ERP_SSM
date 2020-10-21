package com.tledu.zrz.servlet.hr;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Dept;
import com.tledu.zrz.model.User;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;


@WebServlet("/hr/inform/addinput")
public class InformAddInputServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User loginUser = (User) request.getSession().getAttribute("loginUser");
		Dept dept = ObjectFactory.getDeptService().load(loginUser.getId());
		request.setAttribute("loginUser", loginUser);
		request.setAttribute("dept", dept);
		request.setAttribute("today", new Date());
		ForwardUtil.forward(request, response, "hr/inform/add");
	}
}
