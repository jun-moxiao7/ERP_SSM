package com.tledu.zrz.servlet.AT;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.AT;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/AT/add")
public class ATAddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取传递的数据
		String id =request.getParameter("id");
		String theme = request.getParameter("theme");
		String dateType = request.getParameter("dateType");
		String year = request.getParameter("year");
		String date = request.getParameter("date");
		String startTime = request.getParameter("startTime");
		String endTime = request.getParameter("endTime");
		String persons = request.getParameter("persons");
		String ps = request.getParameter("ps");
		AT at = new AT(id, theme, dateType, year, date, startTime, endTime, ps, persons);
		
		ObjectFactory.getATService().add(at);
		
		
	}
}
