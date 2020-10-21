package com.tledu.zrz.servlet.unqualified;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.ForwardUtil;

@WebServlet("/unqualified/addInput")
public class UnqualifiedAddInputServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO ���벿��֮��,Ӧ�ðѶ�Ӧ�Ĳ��Ŵ��ݵ�ҳ��
		
		// ��ת�����ҳ��
		ForwardUtil.forward(request, response, "unqualified/add");
		
	}
}
