package com.tledu.zrz.servlet.train;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Train;
import com.tledu.zrz.model.User;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/train/add")
public class TrainAddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取传递的数据
		String trainname = request.getParameter("trainname");
		String fashion = request.getParameter("fashion");
		String teacher = request.getParameter("teacher");
		String startTime = request.getParameter("startTime");
		String endTime = request.getParameter("endTime");
		String addr = request.getParameter("addr");
		Train train = new Train(trainname,fashion,teacher,startTime,endTime,addr);
		// System.out.println(user);
		ObjectFactory.getTrainService().add(train);
	}
}
