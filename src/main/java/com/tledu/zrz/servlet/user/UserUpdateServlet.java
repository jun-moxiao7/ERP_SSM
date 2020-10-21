package com.tledu.zrz.servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Dept;
import com.tledu.zrz.model.User;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/user/update")
public class UserUpdateServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取传递的数据
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String nickname = request.getParameter("nickname");
		int age = Integer.parseInt(request.getParameter("age"));
		int sex = Integer.parseInt(request.getParameter("sex"));
		int id = Integer.parseInt(request.getParameter("id"));
		int dept_id = Integer.parseInt(request.getParameter("dept_id"));
		Dept dept = null;
		// 如果为0 说明没有部门
		if (dept_id != 0) {
			dept = new Dept();
			dept.setId(dept_id);
		}
		User user = new User(id,username, password, nickname, sex, age);
		user.setDept(dept);
		// System.out.println(user);
		ObjectFactory.getUserService().update(user);
	}
}
