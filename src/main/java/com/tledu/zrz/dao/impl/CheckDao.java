package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.ICheckDao;
import com.tledu.zrz.model.Check;
import com.tledu.zrz.util.DBUtil;

public class CheckDao implements ICheckDao {



	@Override
	public List<Check> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_check ";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Check> checks = new ArrayList<Check>();
			while (resultSet.next()) {
				Check check = new Check(resultSet.getInt("c_id"),
						resultSet.getString("c_title"),
						resultSet.getString("c_type"),
						resultSet.getString("c_adr"),
						resultSet.getString("c_adrs"),
						resultSet.getString("c_way"),
						resultSet.getString("c_names"),
						resultSet.getString("c_deps"),
						resultSet.getString("c_date")
						);
				
				checks.add(check);
			}
			return checks;
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
	public void delete(int c_id) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "delete from t_check where c_id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, c_id);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	
	}

	@Override
	public void add(Check check) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_check (c_title,c_type,c_adr,c_adrs,c_types,c_name,c_dep,c_way,c_names,c_deps,c_date) values (?,?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, check.getC_title());
			preparedStatement.setString(2, check.getC_type());
			preparedStatement.setString(3, check.getC_adr());
			preparedStatement.setString(4, check.getC_adrs());
			preparedStatement.setString(5, check.getC_types());
			preparedStatement.setString(6, check.getC_name());
			preparedStatement.setString(7, check.getC_dep());
			preparedStatement.setString(8, check.getC_way());
			preparedStatement.setString(9, check.getC_names());
			preparedStatement.setString(10, check.getC_deps());
			preparedStatement.setString(11, check.getC_date ());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	
	}

	@Override
	public Check load(int c_id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_check where c_id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, c_id);
			resultSet = preparedStatement.executeQuery();
			Check check = null;
			if (resultSet.next()) {
				check = new Check(resultSet.getInt("c_id"),
						resultSet.getString("c_title"),
						resultSet.getString("c_type"),
						resultSet.getString("c_adr"),
						resultSet.getString("c_adrs"),
						resultSet.getString("c_way"),
						resultSet.getString("c_names"),
						resultSet.getString("c_deps"),
						resultSet.getString("c_date"));
			}
			return check;
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
	public List<Check> list(int c_id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_check where c_id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, c_id);
			resultSet = preparedStatement.executeQuery();
			List<Check> checks = new ArrayList<Check>();
			while (resultSet.next()) {
			
				Check check = new Check(resultSet.getInt("c_id"),
						resultSet.getString("c_title"),
						resultSet.getString("c_type"),
						resultSet.getString("c_adr"),
						resultSet.getString("c_adrs"),
						resultSet.getString("c_way"),
						resultSet.getString("c_names"),
						resultSet.getString("c_deps"),
						resultSet.getString("c_date")
						);
				checks.add(check);
			}
			return checks;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(resultSet);
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
		return null;
	}


	
	
	}

