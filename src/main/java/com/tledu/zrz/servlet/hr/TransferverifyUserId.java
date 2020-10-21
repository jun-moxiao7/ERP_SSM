package com.tledu.zrz.servlet.hr;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.AjaxObj;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/hr/transfer/verifyUserId")
public class TransferverifyUserId extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int userid = Integer.parseInt(req.getParameter("userid"));
//		System.out.println(userid);
		boolean flag = ObjectFactory.getTransferService().verifyUserId(userid);
		if (flag) {
			resp.getWriter().println(new AjaxObj(0, "申请表已存在，不能申请").toJSON());
		} else {
			resp.getWriter().println(new AjaxObj(1, "可以申请").toJSON());
		}
	}
}
