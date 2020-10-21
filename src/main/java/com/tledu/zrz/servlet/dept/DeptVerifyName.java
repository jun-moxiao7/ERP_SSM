package com.tledu.zrz.servlet.dept;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.AjaxObj;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/dept/verifyName")
public class DeptVerifyName extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("name");
		boolean flag = ObjectFactory.getDeptService().verifyName(name);
		if (flag) {
			resp.getWriter().println(new AjaxObj(0, "部门名称已存在").toJSON());
		}else{
			resp.getWriter().println(new AjaxObj(1, "部门名称可以使用").toJSON());
		}
	}
}
