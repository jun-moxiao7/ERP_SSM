package com.tledu.zrz.servlet.train;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.util.AjaxObj;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/train/delete")
public class TrainDeleteServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取要删除的ID
		int id = Integer.parseInt(request.getParameter("id"));
		// 删除
		ObjectFactory.getTrainService().delete(id);
		
		// 返回AjaxObj
		PrintWriter pw = response.getWriter();
		pw.println(new AjaxObj(1, "删除成功").toJSON());
	}
}
