package com.tledu.zrz.servlet.report;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Report;
import com.tledu.zrz.service.IReportService;
import com.tledu.zrz.service.ITrainService;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/**
 * ��ȡ���е���ѵ��չʾ
 * 
 * @Date 2020��9��10��
 */
@WebServlet("/report/select")
public class ReportSelectServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String number = request.getParameter("number");
		String main_title = request.getParameter("main_title");
		String source_class = request.getParameter("source_class");
		String check_class = request.getParameter("check_class");
		String fashion = request.getParameter("fashion");
		String person = request.getParameter("person");
		String dept = request.getParameter("dept");
		String bill_state = request.getParameter("bill_state");
		String verify_state = request.getParameter("verify_state");
		// ��ȡTrainService����
		IReportService reportService = ObjectFactory.getReportService();
		// ����list���� ��ȡ���е���ѵ����
		List<Report> reports = reportService.list(number,  main_title,  source_class,  check_class,  fashion,
				 person,  dept,  bill_state,  verify_state);
		System.out.println(reports);
		// ���ݵ�ҳ��
		request.setAttribute("reports", reports);
		// ��ת��Ӧ��չʾҳ��
		ForwardUtil.forward(request, response, "report/list");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
