package com.tledu.zrz.servlet.hr;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.hr.Transfer;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/*
 * 获取所有的用户并展示
 * 
 */
@WebServlet("/hr/transfer/list")
public class TransferListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取UserService对象
		List<Transfer> transfers = ObjectFactory.getTransferService().list();
//		System.out.println("+++++++++");
//		System.out.println(transfers);
		// 传递到页面
		request.setAttribute("transfers", transfers);
		// 跳转对应的展示页面
		ForwardUtil.forward(request, response, "hr/transfer/list");
	}
}
