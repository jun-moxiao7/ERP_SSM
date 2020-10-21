package com.tledu.zrz.servlet.quality_testing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.AjaxObj;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/quality_testing/delete")
public class Quality_testingDeleteServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取要删除的ID
		String rule_name = request.getParameter("rule_name");
		// 删除
		ObjectFactory.getQuality_testingService().delete(rule_name);
		
		// 返回AjaxObj
		PrintWriter pw = response.getWriter();
		pw.println(new AjaxObj(1, "删除成功").toJSON());
	}
}
