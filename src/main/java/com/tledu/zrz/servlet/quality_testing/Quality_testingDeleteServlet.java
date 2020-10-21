package com.tledu.zrz.servlet.quality_testing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.AjaxObj;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/quality_testing/delete")
public class Quality_testingDeleteServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��ȡҪɾ����ID
		String rule_name = request.getParameter("rule_name");
		// ɾ��
		ObjectFactory.getQuality_testingService().delete(rule_name);
		
		// ����AjaxObj
		PrintWriter pw = response.getWriter();
		pw.println(new AjaxObj(1, "ɾ���ɹ�").toJSON());
	}
}
