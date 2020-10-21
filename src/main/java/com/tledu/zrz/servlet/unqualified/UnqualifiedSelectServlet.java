package com.tledu.zrz.servlet.unqualified;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Train;
import com.tledu.zrz.model.Unqualified;
import com.tledu.zrz.service.ITrainService;
import com.tledu.zrz.service.IUnqualifiedService;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/**
 * ��ȡ���е���ѵ��չʾ
 * 
 * @Date 2020��9��10��
 */
@WebServlet("/unqualified/select")
public class UnqualifiedSelectServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String number = request.getParameter("number");
		String main_title = request.getParameter("main_title");
		String report_list = request.getParameter("report_list");
		String name = request.getParameter("name");
		String bill_state = request.getParameter("bill_state");
		String verify_state = request.getParameter("verify_state");
		// ��ȡTrainService����
		IUnqualifiedService unqualifiedService = ObjectFactory.getUnqualifiedService();
		// ����list���� ��ȡ���е���ѵ����
		List<Unqualified> unqualifieds = unqualifiedService.list(number,main_title,report_list,name,bill_state,verify_state);
		System.out.println(unqualifieds);
		// ���ݵ�ҳ��
		request.setAttribute("unqualifieds", unqualifieds);
		// ��ת��Ӧ��չʾҳ��
		ForwardUtil.forward(request, response, "unqualified/list");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
