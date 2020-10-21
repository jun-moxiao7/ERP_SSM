package com.tledu.zrz.servlet.exam;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Exam;
import com.tledu.zrz.service.IExamService;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/**
 * ��ȡ���е���ѵ��չʾ
 * 
 * @Date 2020��9��10��
 */
@WebServlet("/exam/list")
public class ExamListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// ��ȡTrainService����
		IExamService examService = ObjectFactory.getExamService();
		// ����list���� ��ȡ���е���ѵ����
		List<Exam> exams = examService.list();
		// ���ݵ�ҳ��
		request.setAttribute("exams", exams);
		// ��ת��Ӧ��չʾҳ��
		ForwardUtil.forward(request, response, "exam/list");
	}
}
