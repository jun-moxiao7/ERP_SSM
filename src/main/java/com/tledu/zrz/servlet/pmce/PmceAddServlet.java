package com.tledu.zrz.servlet.pmce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Pmce;
import com.tledu.zrz.model.Record;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/pmce/add")
public class PmceAddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取传递的数据
//		int examnum = Integer.parseInt(request.getParameter("examnum"));
		String title = request.getParameter("title");
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		String nick = request.getParameter("nick");
		
		Pmce pmce = new Pmce(title, name, date, nick);
		 System.out.println(pmce);
		ObjectFactory.getPmceService().add(pmce);
	
		
	}
}
