package com.tledu.zrz.servlet.dept;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Dept;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/dept/updateInput")
public class DeptUpdateInputServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Dept dept = ObjectFactory.getDeptService().load(id);
		request.setAttribute("dept", dept);
		// 跳转到添加页面
		ForwardUtil.forward(request, response, "dept/update");
		
	}
}
