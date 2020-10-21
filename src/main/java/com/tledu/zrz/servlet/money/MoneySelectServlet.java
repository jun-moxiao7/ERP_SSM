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

/**
 * 获取所有的用户并展示
 * 
 * @author 天亮教育-帅气多汁你泽哥
 * @Date 2020年9月10日
 */
@WebServlet("/money/select")
public class MoneySelectServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取UserService对象
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		IMoneyService moneyService = ObjectFactory.getMoneyService();
		// 调用list方法 获取所有的用户数据
		List<Money> moneys =moneyService.list(id,title);
		// 传递到页面
//		System.out.println(111);
		request.setAttribute("moneys", moneys);
		// 跳转对应的展示页面
		ForwardUtil.forward(request, response, "money/list");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
}
