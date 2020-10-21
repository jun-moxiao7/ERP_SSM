package com.tledu.zrz.servlet.money;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Money;
import com.tledu.zrz.service.IMoneyService;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/*
 * 获取所有的用户并展示
 * 
 */
@WebServlet("/money/list")
public class MoneyListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取UserService对象
		IMoneyService moneyService = ObjectFactory.getMoneyService();
		// 调用list方法 获取所有的用户数据
		List<Money> moneys =moneyService.list();
		// 传递到页面
		request.setAttribute("moneys", moneys);
		// 跳转对应的展示页面
		ForwardUtil.forward(request, response, "money/list");
	}
}
