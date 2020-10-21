package com.tledu.zrz.servlet.exam;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Exam;
import com.tledu.zrz.model.Train;
import com.tledu.zrz.service.IExamService;
import com.tledu.zrz.service.ITrainService;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/**
 * ��ȡ���е���ѵ��չʾ
 * 
 * @Date 2020��9��10��
 */
@WebServlet("/exam/select")
public class ExamSelectServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String trainname = request.getParameter("trainname");
		String examiner = request.getParameter("examiner");
		// ��ȡTrainService����
		IExamService examService = ObjectFactory.getExamService();
		// ����list���� ��ȡ���е���ѵ����
		List<Exam> exams = examService.list(id,trainname,examiner);
		System.out.println(exams);
		// ���ݵ�ҳ��
		request.setAttribute("exams", exams);
		// ��ת��Ӧ��չʾҳ��
		ForwardUtil.forward(request, response, "exam/list");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
