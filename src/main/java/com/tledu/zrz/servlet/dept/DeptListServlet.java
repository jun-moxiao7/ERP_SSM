package com.tledu.zrz.servlet.dept;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Dept;
import com.tledu.zrz.service.IDeptService;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/**
 * 获取所有的部门并展示
 * 
 * @author 天亮教育-帅气多汁你泽哥
 * @Date 2020年9月10日
 */
@WebServlet("/dept/list")
public class DeptListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取DeptService对象
		IDeptService deptService = ObjectFactory.getDeptService();
		// 调用list方法 获取所有的部门数据
		List<Dept> depts = deptService.list();
		// 传递到页面
		request.setAttribute("depts", depts);
		// 跳转对应的展示页面
		// request.getRequestDispatcher("/WEB-INF/jsp/user/list.jsp").forward(request,
		// response);
		ForwardUtil.forward(request, response, "dept/list");
	}
}
