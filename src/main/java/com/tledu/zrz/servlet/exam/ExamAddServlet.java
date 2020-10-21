package com.tledu.zrz.servlet.exam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Exam;
import com.tledu.zrz.model.Train;
import com.tledu.zrz.model.User;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/exam/add")
public class ExamAddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��ȡ���ݵ�����
		String trainname = request.getParameter("trainname");
		String examiner = request.getParameter("examiner");
		String examinee = request.getParameter("examinee");
		String fashion = request.getParameter("fashion");
		String time = request.getParameter("time");
		String grade = request.getParameter("grade");
		String exam_name = request.getParameter("trainname");
		Train train = null;
			train = new Train();
			train.setTrainname(exam_name);
		Exam exam = new Exam(trainname,examiner,examinee,fashion,time,grade);
		// System.out.println(user);
		System.out.println(2);
		System.out.println(exam);
		System.out.println(1);
		ObjectFactory.getExamService().add(exam);
	}
}
