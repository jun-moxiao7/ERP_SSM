package com.tledu.zrz.servlet.evalution;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.AjaxObj;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/evalution/verifyId")
public class EvalutionverifyId extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("id");
		boolean flag = ObjectFactory.getEvalutionService().verifyId(id);
		if (flag) {
			resp.getWriter().println(new AjaxObj(0, "该编号已存在，建议6为字母加6位数字").toJSON());
		} else {
			resp.getWriter().println(new AjaxObj(1, "成功").toJSON());
		}
	}
}
