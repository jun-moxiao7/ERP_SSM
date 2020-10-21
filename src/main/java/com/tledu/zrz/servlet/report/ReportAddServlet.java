package com.tledu.zrz.servlet.report;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Report;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/report/add")
public class ReportAddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��ȡ���ݵ�����
		String number = request.getParameter("number");
		String main_title = request.getParameter("main_title");
		String source_class = request.getParameter("source_class");
		String unit = request.getParameter("unit");
		String unit_class = request.getParameter("unit_class");
		String check_class = request.getParameter("check_class");
		String fashion = request.getParameter("fashion");
		String person = request.getParameter("person");
		String dept = request.getParameter("dept");
		String date = request.getParameter("date");
		String bill_state = request.getParameter("bill_state");
		String verify_state = request.getParameter("verify_state");
		Report report = new Report(
				number,main_title,source_class,unit,unit_class,check_class,fashion,person,dept,date,bill_state,verify_state);
		// System.out.println(user);
		ObjectFactory.getReportService().add(report);
	}
}
