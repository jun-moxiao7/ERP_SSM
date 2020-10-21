package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.IResignDao;
import com.tledu.zrz.model.User;
import com.tledu.zrz.model.hr.Resign;
import com.tledu.zrz.util.DBUtil;

public class ResignDao implements IResignDao {

	@Override
	public void add(Resign resign) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_resign (user_id,applyDate,type,reason,records,ps) values (?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, resign.getUser().getId());
			preparedStatement.setString(2, resign.getApplyDate());
			preparedStatement.setString(3, resign.getType());
			preparedStatement.setString(4, resign.getReason());
			preparedStatement.setString(5, resign.getRecords());
			preparedStatement.setString(6, resign.getPs());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}

	}

	@Override
	public Resign loadByUserId(int userid) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Resign resign = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_resign where user_id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, userid);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				resign = new Resign(resultSet.getInt("id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(resultSet);
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
		return resign;
	}

	@Override
	public List<Resign> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_resign tr inner join t_user tu on  tr.user_id=tu.id";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Resign> resigns = new ArrayList<Resign>();
			while (resultSet.next()) {
				User user = new User(resultSet.getString("username"));
				Resign resign = new Resign(resultSet.getInt("id"), resultSet.getString("applyDate"),
						resultSet.getString("type"), resultSet.getString("reason"), resultSet.getString("records"), resultSet.getString("ps"), user);
				resigns.add(resign);
			}
			return resigns;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(resultSet);
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
		return null;
	}

	@Override
	public List<Resign> list(int userid ,String name) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_resign tr inner join t_user tu on  tr.user_id=tu.id where user_id=? and tu.username = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, userid);
			preparedStatement.setString(2, name);
			resultSet = preparedStatement.executeQuery();
			List<Resign> resigns = new ArrayList<Resign>();
			while (resultSet.next()) {
				User user = new User(resultSet.getString("username"));
				Resign resign = new Resign(resultSet.getInt("id"), resultSet.getString("applyDate"),
						resultSet.getString("type"), resultSet.getString("reason"), resultSet.getString("records"), resultSet.getString("ps"), user);
				resigns.add(resign);
			}
			return resigns;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(resultSet);
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
		return null;
	}

	@Override
	public void delete(int id) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "delete from t_resign where id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	
	}
}
