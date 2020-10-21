package com.tledu.zrz.servlet.hr;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.AjaxObj;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/hr/inform/verifyUserId")
public class InformverifyUserId extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int userId = Integer.parseInt(req.getParameter("userid"));
		boolean flag = ObjectFactory.getInformService().verifyUserId(userId);
		System.out.println(flag);
		if (flag) {
			resp.getWriter().println(new AjaxObj(0, "申请表已存在，不能申请").toJSON());
		} else {
			resp.getWriter().println(new AjaxObj(1, "可以申请").toJSON());
		}
	}
}
