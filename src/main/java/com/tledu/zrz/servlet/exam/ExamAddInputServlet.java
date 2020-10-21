package com.tledu.zrz.servlet.exam;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.tledu.zrz.util.ObjectFactory;

import com.tledu.zrz.model.Train;
import com.tledu.zrz.util.ForwardUtil;

@WebServlet("/exam/addInput")
public class ExamAddInputServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO 引入部门之后,应该把对应的部门传递到页面
		List<Train> trains = ObjectFactory.getTrainService().list();
		request.setAttribute("trains", trains);
		// 跳转到添加页面
		ForwardUtil.forward(request, response, "exam/add");
		
	}
}