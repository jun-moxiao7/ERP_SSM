package com.tledu.zrz.servlet.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.User;
import com.tledu.zrz.service.IUserService;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/**
 * 获取所有的用户并展示
 * 
 * @author 天亮教育-帅气多汁你泽哥
 * @Date 2020年9月10日
 */
@WebServlet("/user/list")
public class UserListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取UserService对象
		IUserService userService = ObjectFactory.getUserService();
		// 调用list方法 获取所有的用户数据
		List<User> users = userService.list();
		// 传递到页面
		request.setAttribute("users", users);
		// 跳转对应的展示页面
		// request.getRequestDispatcher("/WEB-INF/jsp/user/list.jsp").forward(request,
		// response);
		ForwardUtil.forward(request, response, "user/list");
	}
}
