package com.tledu.zrz.servlet.train;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Train;
import com.tledu.zrz.service.ITrainService;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/**
 * 获取所有的培训并展示
 * 
 * @Date 2020年9月10日
 */
@WebServlet("/train/list")
public class TrainListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取TrainService对象
		ITrainService trainService = ObjectFactory.getTrainService();
		// 调用list方法 获取所有的培训数据
		List<Train> trains = trainService.list();
		// 传递到页面
		request.setAttribute("trains", trains);
		// 跳转对应的展示页面
		ForwardUtil.forward(request, response, "train/list");
	}
}
