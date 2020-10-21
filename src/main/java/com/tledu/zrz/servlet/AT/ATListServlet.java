package com.tledu.zrz.servlet.AT;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.AT;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/*
 * 获取所有的用户并展示
 * 
 */
@WebServlet("/AT/list")
public class ATListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		List<AT> ats = ObjectFactory.getATService().list();
		// 传递到页面
		request.setAttribute("ats", ats);
		// 跳转对应的展示页面
		ForwardUtil.forward(request, response, "AT/list");
	}
}
