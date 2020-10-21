package com.tledu.zrz.servlet.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Dept;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/user/addInput")
public class UserAddInputServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			
		// 获取所有部门
		List<Dept> depts = ObjectFactory.getDeptService().list();
		request.setAttribute("depts", depts);
		// 跳转到添加页面
		ForwardUtil.forward(request, response, "user/add");
		
	}
}
