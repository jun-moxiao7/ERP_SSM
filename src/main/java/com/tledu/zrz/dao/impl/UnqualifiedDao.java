package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.IUnqualifiedDao;
import com.tledu.zrz.model.Unqualified;
import com.tledu.zrz.util.DBUtil;

public class UnqualifiedDao implements IUnqualifiedDao{

	@Override
	public List<Unqualified> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
		String sql = "select * from t_unqualified";

			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Unqualified> unqualifieds = new ArrayList<Unqualified>();
			while (resultSet.next()) {
				Unqualified unqualified = new Unqualified(
						resultSet.getString("number"),
						resultSet.getString("main_title"),
						resultSet.getString("source_class"),
						resultSet.getString("report_list"),
						resultSet.getString("good_number"),
						resultSet.getString("name"),
						resultSet.getString("person"),
						resultSet.getString("date"),
						resultSet.getString("bill_state"),
						resultSet.getString("verify_state"));
				
				unqualifieds.add(unqualified);
			}
			return unqualifieds;
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
	public List<Unqualified> list(String number, String main_title, String report_list, String name, String bill_state,
			String verify_state) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
		String sql = "select * from t_unqualified where number=? and main_title=? and report_list=? and name=? "
				+ "and bill_state=? and verify_state=?";

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, number);
			preparedStatement.setString(2, main_title);
			preparedStatement.setString(3, report_list);
			preparedStatement.setString(4, name);
			preparedStatement.setString(5, bill_state);
			preparedStatement.setString(6, verify_state);
			resultSet = preparedStatement.executeQuery();
			List<Unqualified> unqualifieds = new ArrayList<Unqualified>();
			while (resultSet.next()) {
				Unqualified unqualified = new Unqualified(
						resultSet.getString("number"),
						resultSet.getString("main_title"),
						resultSet.getString("source_class"),
						resultSet.getString("report_list"),
						resultSet.getString("good_number"),
						resultSet.getString("name"),
						resultSet.getString("person"),
						resultSet.getString("date"),
						resultSet.getString("bill_state"),
						resultSet.getString("verify_state"));
				
				unqualifieds.add(unqualified);
			}
			return unqualifieds;
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
			String sql = "delete from t_unqualified where number=?";
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
	public void add(Unqualified unqualified) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_unqualified ("
	+ "number,main_title,source_class,report_list,good_number,name,person,date,bill_state,verify_state) "
					+ "values (?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, unqualified.getNumber());
			preparedStatement.setString(2, unqualified.getMain_title());
			preparedStatement.setString(3, unqualified.getSource_class());
			preparedStatement.setString(4, unqualified.getReport_list());
			preparedStatement.setString(5, unqualified.getGood_number());
			preparedStatement.setString(6, unqualified.getName());
			preparedStatement.setString(7, unqualified.getPerson());
			preparedStatement.setString(8, unqualified.getDate());
			preparedStatement.setString(9, unqualified.getBill_state());
			preparedStatement.setString(10, unqualified.getVerify_state());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	
		
	}



	
}
