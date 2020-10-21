package com.tledu.zrz.servlet.hr;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.User;
import com.tledu.zrz.model.hr.Resign;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/hr/resign/add")
public class ResignAddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取传递的数据
		int userid =Integer.parseInt(request.getParameter("userid"));
		String applyDate = request.getParameter("applyDate");
		String reason = request.getParameter("reason");
//		String validity = request.getParameter("validity");
		String type = request.getParameter("type");
		String records = request.getParameter("records");
		String ps = request.getParameter("ps");
		
		
		User user = new User(userid);
		Resign resign = new Resign( applyDate, type, reason, records, ps, user);
		ObjectFactory.getResignService().add(resign);
		
		
	}
}
