package com.tledu.zrz.servlet.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Dept;
import com.tledu.zrz.model.User;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/user/updateInput")
public class UserUpdateInputServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		User user = ObjectFactory.getUserService().load(id);
		request.setAttribute("user", user);
		
		List<Dept> depts = ObjectFactory.getDeptService().list();
		request.setAttribute("depts", depts);
		// 跳转到添加页面
		ForwardUtil.forward(request, response, "user/update");
		
	}
}
