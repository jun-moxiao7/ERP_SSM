package com.tledu.zrz.servlet.dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.AjaxObj;
import com.tledu.zrz.util.ERPException;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/dept/delete")
public class DeptDeleteServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取要删除的ID
		int id = Integer.parseInt(request.getParameter("id"));
		PrintWriter pw = response.getWriter();
		// 删除
		try {
			ObjectFactory.getDeptService().delete(id);
			// 返回AjaxObj
			pw.println(new AjaxObj(1, "删除成功").toJSON());
		} catch (ERPException e) {
			pw.println(new AjaxObj(0, e.getMessage()).toJSON());
		}

	}
}
