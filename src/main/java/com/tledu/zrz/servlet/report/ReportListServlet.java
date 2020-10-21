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
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/**
 * ��ȡ���е���ѵ��չʾ
 * 
 * @Date 2020��9��10��
 */
@WebServlet("/report/list")
public class ReportListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��ȡTrainService����
		IReportService reportService = ObjectFactory.getReportService();
		// ����list���� ��ȡ���е���ѵ����
		List<Report> reports = reportService.list();
		// ���ݵ�ҳ��
		request.setAttribute("reports", reports);
		// ��ת��Ӧ��չʾҳ��
		ForwardUtil.forward(request, response, "report/list");
	}
}
