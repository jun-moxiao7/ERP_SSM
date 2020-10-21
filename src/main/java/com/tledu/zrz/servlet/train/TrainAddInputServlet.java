package com.tledu.zrz.servlet.train;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.ForwardUtil;

@WebServlet("/train/addInput")
public class TrainAddInputServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO 引入部门之后,应该把对应的部门传递到页面
		
		// 跳转到添加页面
		ForwardUtil.forward(request, response, "train/add");
		
	}
}
