package com.tledu.zrz.servlet.unqualified;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Report;
import com.tledu.zrz.model.Unqualified;
import com.tledu.zrz.service.IReportService;
import com.tledu.zrz.service.IUnqualifiedService;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/**
 * ��ȡ���е���ѵ��չʾ
 * 
 * @Date 2020��9��10��
 */
@WebServlet("/unqualified/list")
public class UnqualifiedListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��ȡTrainService����
		IUnqualifiedService unqualifiedService = ObjectFactory.getUnqualifiedService();
		// ����list���� ��ȡ���е���ѵ����
		List<Unqualified> unqualifieds = unqualifiedService.list();
		// ���ݵ�ҳ��
		request.setAttribute("unqualifieds", unqualifieds);
		// ��ת��Ӧ��չʾҳ��
		ForwardUtil.forward(request, response, "unqualified/list");
	}
}
