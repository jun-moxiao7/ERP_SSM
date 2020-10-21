package com.tledu.zrz.servlet.quality_testing;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Quality_testing;
import com.tledu.zrz.service.IQuality_testingService;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/**
 * 获取所有的用户并展示
 * 
 * @Date 2020年9月10日
 */
@WebServlet("/quality_testing/list")
public class Quality_testingListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取UserService对象
		IQuality_testingService quality_testingService = ObjectFactory.getQuality_testingService();
		// 调用list方法 获取所有的用户数据
		List<Quality_testing> quality_testings = quality_testingService.list();
		// 传递到页面
		request.setAttribute("quality_testings", quality_testings);
		// 跳转对应的展示页面
		// request.getRequestDispatcher("/WEB-INF/jsp/user/list.jsp").forward(request,
		// response);
		ForwardUtil.forward(request, response, "quality_testing/list");
	}
}
