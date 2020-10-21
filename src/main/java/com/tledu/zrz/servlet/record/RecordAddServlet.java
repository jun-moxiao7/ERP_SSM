package com.tledu.zrz.servlet.record;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Record;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/record/add")
public class RecordAddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取传递的数据
//		int examnum = Integer.parseInt(request.getParameter("examnum"));
		String titlename = request.getParameter("titlename");
		String charge = request.getParameter("charge");
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		String adr = request.getParameter("adr");
		String cdn = request.getParameter("cdn");
		int peonum = Integer.parseInt(request.getParameter("peonum"));
		String per = request.getParameter("per");
		String content = request.getParameter("content");
		String result = request.getParameter("result");
		String remarks = request.getParameter("remarks");
		Record record = new Record(titlename, charge, start, end, adr,cdn,peonum,per,content,result,remarks);
		// System.out.println(user);
		ObjectFactory.getRecordService().add(record);
	
		
	}
}
