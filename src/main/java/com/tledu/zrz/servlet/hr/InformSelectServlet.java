package com.tledu.zrz.servlet.hr;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.hr.Inform;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/*
 * 获取所有的用户并展示
 * 
 */
@WebServlet("/hr/inform/select")
public class InformSelectServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int userid = Integer.parseInt(request.getParameter("userid"));
		
		// 获取UserService对象
		List<Inform> informs = ObjectFactory.getInformService().list(userid);
		// 传递到页面
		request.setAttribute("informs", informs);
		// 跳转对应的展示页面
		ForwardUtil.forward(request, response, "hr/inform/list");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
