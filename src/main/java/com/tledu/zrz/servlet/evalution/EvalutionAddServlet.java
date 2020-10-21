package com.tledu.zrz.servlet.evalution;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Evalution;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/evalution/add")
public class EvalutionAddServlet extends HttpServlet {
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
		String work = request.getParameter("work");
		String achieve = request.getParameter("achieve");
		String followUp = request.getParameter("followUp");
		String insufficient = request.getParameter("insufficient");
		String hard = request.getParameter("hard");;
		String suggest = request.getParameter("suggestt");
		System.out.println(suggest);
		String ps = request.getParameter("ps");
		
		Evalution evalution = new Evalution(id, theme, dateType, year, date, startTime, endTime, work, achieve, followUp, insufficient, hard, suggest, ps);
		
		ObjectFactory.getEvalutionService().add(evalution);
		
		
	}
}
