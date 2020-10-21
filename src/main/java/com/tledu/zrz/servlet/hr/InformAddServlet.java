package com.tledu.zrz.servlet.hr;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.hr.Inform;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/hr/inform/add")
public class InformAddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取传递的数据
		int userId =Integer.parseInt(request.getParameter("userid"));
		String userName = request.getParameter("userName");
		String reasons = request.getParameter("reasons");
		String onDeptName = request.getParameter("onDeptName");
		String onPost = request.getParameter("onPost");
		String onRank = request.getParameter("onRank");
		String afterDeptName = request.getParameter("afterDeptName");
		String afterPost = request.getParameter("afterPost");
		String afterRank = request.getParameter("afterRank");
		String inTime = request.getParameter("inTime");
		String outTime = request.getParameter("outTime");
		String name = request.getParameter("name");
		String date = request.getParameter("date1");
		String cName = request.getParameter("cName");
		String ps = request.getParameter("ps");
		String cdate = request.getParameter("cdate");
		System.out.println(userId);
		
		
		Inform inform = new Inform(userId, userName, reasons, onDeptName, onPost, onRank, afterDeptName, afterPost, afterRank, inTime, outTime, name, date, cName, cdate, ps);
		ObjectFactory.getInformService().add(inform);
		
		
	}
}
