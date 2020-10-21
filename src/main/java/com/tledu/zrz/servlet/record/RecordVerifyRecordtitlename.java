package com.tledu.zrz.servlet.record;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.AjaxObj;
import com.tledu.zrz.util.ObjectFactory;
@WebServlet("/record/verifyRecordtitlename")
public class RecordVerifyRecordtitlename extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String titlename = req.getParameter("titlename");
		boolean flag = ObjectFactory.getRecordService().verifyRecordtitlename(titlename);
		if (flag) {
			resp.getWriter().println(new AjaxObj(0, "主题已存在").toJSON());
		}else{
			resp.getWriter().println(new AjaxObj(1, "主题可使用").toJSON());
		}
	}
}
