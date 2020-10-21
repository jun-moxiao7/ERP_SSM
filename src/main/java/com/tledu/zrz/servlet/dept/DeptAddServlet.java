package com.tledu.zrz.servlet.dept;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Dept;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/dept/add")
public class DeptAddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取传递的数据
		String name = request.getParameter("name");
		String desc = request.getParameter("desc");
		Dept dept = new Dept(name, desc);
		ObjectFactory.getDeptService().add(dept);
	}
}
