package com.tledu.zrz.servlet.dept;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.ForwardUtil;

@WebServlet("/dept/addInput")
public class DeptAddInputServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		// 跳转到添加页面
		ForwardUtil.forward(request, response, "dept/add");
		
	}
}
