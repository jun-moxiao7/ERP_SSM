package com.tledu.zrz.servlet.quality_testing;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Quality_testing;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/quality_testing/add")
public class Quality_testingAddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��ȡ���ݵ�����
		String rule_name = request.getParameter("rule_name");
		String goods_name = request.getParameter("goods_name");
		String number_head = request.getParameter("number_head");
		String dateformat = request.getParameter("dateformat");
		int length = Integer.parseInt(request.getParameter("length"));
		String example = request.getParameter("example");
		String rule = request.getParameter("rule");
		String status = request.getParameter("status");
		Quality_testing quality_testing = new Quality_testing(rule_name, goods_name,number_head,dateformat,length,example,rule,status);
		// System.out.println(user);
		ObjectFactory.getQuality_testingService().add(quality_testing);
	}
}
