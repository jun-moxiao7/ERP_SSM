package com.tledu.zrz.servlet.record;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tledu.zrz.model.Record;
import com.tledu.zrz.service.IRecordService;
import com.tledu.zrz.util.ForwardUtil;
import com.tledu.zrz.util.ObjectFactory;

/**
 * 获取所有的用户并展示
 * 
 * @author 天亮教育-帅气多汁你泽哥
 * @Date 2020年9月10日
 */
@WebServlet("/record/list")
public class RecordListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 获取UserService对象
		IRecordService recordService = ObjectFactory.getRecordService();
		// 调用list方法 获取所有的用户数据
		List<Record> records =recordService.list();
		// 传递到页面
		request.setAttribute("records", records);
		// 跳转对应的展示页面
		ForwardUtil.forward(request, response, "record/list");
	}
}
