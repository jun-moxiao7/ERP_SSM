package com.tledu.zrz.servlet.quality_testing;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.ForwardUtil;

@WebServlet("/quality_testing/addInput")
public class Quality_testingAddInputServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO ���벿��֮��,Ӧ�ðѶ�Ӧ�Ĳ��Ŵ��ݵ�ҳ��
		
		// ��ת�����ҳ��
		ForwardUtil.forward(request, response, "quality_testing/add");
		
	}
}
