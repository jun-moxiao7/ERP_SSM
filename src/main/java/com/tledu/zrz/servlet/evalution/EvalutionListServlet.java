package com.tledu.zrz.servlet.evalution;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Evalution;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/*
 * 获取所有的用户并展示
 * 
 */
@WebServlet("/evalution/list")
public class EvalutionListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		List<Evalution> evalutions = ObjectFactory.getEvalutionService().list();
		// 传递到页面
		request.setAttribute("evalutions", evalutions);
		// 跳转对应的展示页面
		ForwardUtil.forward(request, response, "evalution/list");
	}
}
