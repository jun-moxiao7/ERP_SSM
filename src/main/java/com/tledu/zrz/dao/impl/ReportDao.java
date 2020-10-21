package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.IReportDao;
import com.tledu.zrz.model.Report;
import com.tledu.zrz.util.DBUtil;

public class ReportDao implements IReportDao{

	@Override
	public List<Report> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
		String sql = "select * from t_report";

			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Report> reports = new ArrayList<Report>();
			while (resultSet.next()) {
				Report report = new Report(
						resultSet.getString("number"),
						resultSet.getString("main_title"),
						resultSet.getString("source_class"),
						resultSet.getString("unit"),
						resultSet.getString("unit_class"),
						resultSet.getString("check_class"),
						resultSet.getString("fashion"),
						resultSet.getString("person"),
						resultSet.getString("dept"),
						resultSet.getString("date"),
						resultSet.getString("bill_state"),
						resultSet.getString("verify_state"));
				
				reports.add(report);
			}
			return reports;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(resultSet);
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
		return null;
	}

	@Override
	public List<Report> list(String number, String main_title, String source_class, String check_class, String fashion,
			String person, String dept, String bill_state, String verify_state) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
		String sql = "select * from t_report	where number=? and main_title=? and	source_class=? and	check_class=?"
				+ "and fashion=? and person=? and dept=? and bill_state=? and verify_state=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, number);
			preparedStatement.setString(2, main_title);
			preparedStatement.setString(3, source_class);
			preparedStatement.setString(4, check_class);
			preparedStatement.setString(5, fashion);
			preparedStatement.setString(6, person);
			preparedStatement.setString(7, dept);
			preparedStatement.setString(8, bill_state);
			preparedStatement.setString(9, verify_state);
			resultSet = preparedStatement.executeQuery();
			List<Report> reports = new ArrayList<Report>();
			while (resultSet.next()) {
				Report report = new Report(
						resultSet.getString("number"),
						resultSet.getString("main_title"),
						resultSet.getString("source_class"),
						resultSet.getString("unit"),
						resultSet.getString("unit_class"),
						resultSet.getString("check_class"),
						resultSet.getString("fashion"),
						resultSet.getString("person"),
						resultSet.getString("dept"),
						resultSet.getString("date"),
						resultSet.getString("bill_state"),
						resultSet.getString("verify_state"));
				
				reports.add(report);
			}
			return reports;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(resultSet);
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
		return null;
	}
	
	@Override
	public void delete(String number) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "delete from t_report where number=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, number);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
		
	}

	@Override
	public void add(Report report) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_report ("
	+ "number,main_title,source_class,unit,unit_class,check_class,fashion,person,dept,date,bill_state,verify_state) "
					+ "values (?,?,?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, report.getNumber());
			preparedStatement.setString(2, report.getMain_title());
			preparedStatement.setString(3, report.getSource_class());
			preparedStatement.setString(4, report.getUnit());
			preparedStatement.setString(5, report.getUnit_class());
			preparedStatement.setString(6, report.getCheck_class());
			preparedStatement.setString(7, report.getFashion());
			preparedStatement.setString(8, report.getPerson());
			preparedStatement.setString(9, report.getDept());
			preparedStatement.setString(10, report.getDate());
			preparedStatement.setString(11, report.getBill_state());
			preparedStatement.setString(12, report.getVerify_state());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	
		
	}

	
	
}
