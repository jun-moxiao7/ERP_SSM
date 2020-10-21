package com.tledu.zrz.servlet.AT;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Mould;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;


@WebServlet("/AT/addinput")
public class MouldAddInputServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Mould> moulds = ObjectFactory.getMouldService().listMould();
		request.setAttribute("moulds", moulds);
		
		String id =request.getParameter("id");
		
		 if(id==null){
			 id="0";
		 }
		Mould mould = ObjectFactory.getMouldService().listMould(id);
		request.setAttribute("mould", mould);
		
		
		
		ForwardUtil.forward(request, response, "AT/add");
	}
}
