package com.tledu.zrz.servlet.money;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Money;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/money/add")
public class MoneyAddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取传递的数据
//		int examnum = Integer.parseInt(request.getParameter("examnum"));
		String title = request.getParameter("title");
		String con = request.getParameter("con");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		String nickname = request.getParameter("nickname");
		String date = request.getParameter("date");
		String cons = request.getParameter("cons");
				Money money = new Money(title,con,year,month,start,end,nickname,date,cons);
		ObjectFactory.getMoneyService().add(money);
	}
}
