package com.tledu.zrz.servlet.check;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Check;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/check/add")
public class CheckAddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取传递的数据
//		int examnum = Integer.parseInt(request.getParameter("examnum"));
		String c_title = request.getParameter("c_title");
		String c_type = request.getParameter("c_type");
		String c_adr = request.getParameter("c_adr");
		String c_adrs = request.getParameter("c_adrs");
		String c_types = request.getParameter("c_types");
		String c_name = request.getParameter("c_name");
		String c_dep = request.getParameter("c_dep");
		String c_way = request.getParameter("c_way");
		String c_names = request.getParameter("c_names");
		String c_deps = request.getParameter("c_deps");
		String c_date = request.getParameter("c_date");
				Check check = new Check(c_title,c_type,c_adr,c_adrs,c_types,c_name,c_dep,c_way,c_names,c_deps,c_date);
				System.out.println(check);
		ObjectFactory.getCheckService().add(check);
	}
}
