package com.tledu.zrz.servlet.dept;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Dept;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/dept/update")
public class DeptUpdateServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取传递的数据
		String name = request.getParameter("name");
		String desc = request.getParameter("desc");
		int id = Integer.parseInt(request.getParameter("id"));
		Dept dept = new Dept(id, name, desc);
		// System.out.println(user);
		ObjectFactory.getDeptService().update(dept);
	}
}
