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
 * ��ȡ���е���ѵ��չʾ
 * 
 * @Date 2020��9��10��
 */
@WebServlet("/train/list")
public class TrainListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��ȡTrainService����
		ITrainService trainService = ObjectFactory.getTrainService();
		// ����list���� ��ȡ���е���ѵ����
		List<Train> trains = trainService.list();
		// ���ݵ�ҳ��
		request.setAttribute("trains", trains);
		// ��ת��Ӧ��չʾҳ��
		ForwardUtil.forward(request, response, "train/list");
	}
}
