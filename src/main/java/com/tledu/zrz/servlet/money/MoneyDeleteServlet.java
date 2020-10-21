package com.tledu.zrz.servlet.money;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.AjaxObj;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/money/delete")
public class MoneyDeleteServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��ȡҪɾ����ID
		int id= Integer.parseInt(request.getParameter("id"));
		// ɾ��
		ObjectFactory.getMoneyService().delete(id);
		
		// ����AjaxObj
		PrintWriter pw = response.getWriter();
		pw.println(new AjaxObj(1, "删除成功").toJSON());
	}
}
