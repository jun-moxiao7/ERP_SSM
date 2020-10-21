package com.tledu.zrz.servlet.unqualified;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Unqualified;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/unqualified/add")
public class UnqualifiedAddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��ȡ���ݵ�����
		String number = request.getParameter("number");
		String main_title = request.getParameter("main_title");
		String source_class = request.getParameter("source_class");
		String report_list = request.getParameter("report_list");
		String good_number = request.getParameter("good_number");
		String name = request.getParameter("name");
		String person = request.getParameter("person");
		String date = request.getParameter("date");
		String bill_state = request.getParameter("bill_state");
		String verify_state = request.getParameter("verify_state");
		Unqualified unqualified = new Unqualified(
				number,main_title,source_class,report_list,good_number,name,person,date,bill_state,verify_state);
		 System.out.println(unqualified);
		
		ObjectFactory.getUnqualifiedService().add(unqualified);
	}
}
