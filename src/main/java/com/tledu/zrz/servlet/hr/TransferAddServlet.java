package com.tledu.zrz.servlet.hr;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Dept;
import com.tledu.zrz.model.User;
import com.tledu.zrz.model.hr.Transfer;
import com.tledu.zrz.util.ObjectFactory;

@WebServlet("/hr/transfer/add")
public class TransferAddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取传递的数据
		int userid =Integer.parseInt(request.getParameter("userid"));
		String name = request.getParameter("name");
		String applyDate = request.getParameter("applyDate");
		String hopeDate = request.getParameter("hopeDate");
		String entryDate = request.getParameter("entryDate");
		String afterdeptname = request.getParameter("afterdeptname");
		String onPost = request.getParameter("onPost");
		String onRank = request.getParameter("onRank");
		String afterPost = request.getParameter("afterPost");
		String afterRank = request.getParameter("afterRank");
		String onWages = request.getParameter("onWages");
		String afterWages = request.getParameter("afterWages");
		String reasons = request.getParameter("reason");
		String type = request.getParameter("type");
		String ps = request.getParameter("ps");
		String onDeptName = request.getParameter("deptname");
		System.out.println(onDeptName);
		
		
		User user = new User(userid);
		Dept dept= ObjectFactory.getDeptService().loadByName(afterdeptname);
		Transfer transfer = new Transfer(user, name, applyDate, hopeDate, entryDate, dept, onPost, onRank, afterPost, afterRank, onWages, afterWages, type, reasons, ps, onDeptName);
		ObjectFactory.getTransferService().add(transfer);
		
		
	}
}
