package com.tledu.zrz.servlet.unqualified;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.AjaxObj;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/unqualified/delete")
public class UnqualifiedDeleteServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��ȡҪɾ����ID
		String number = request.getParameter("number");
		// ɾ��
		ObjectFactory.getUnqualifiedService().delete(number);
		
		// ����AjaxObj
		PrintWriter pw = response.getWriter();
		pw.println(new AjaxObj(1, "删除成功").toJSON());
	}
}
