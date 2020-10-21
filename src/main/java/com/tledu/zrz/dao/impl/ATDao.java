package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.IATDao;
import com.tledu.zrz.model.AT;
import com.tledu.zrz.model.Evalution;
import com.tledu.zrz.util.DBUtil;

public class ATDao implements IATDao {

	@Override
	public AT loadById(String Id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_AT where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, Id);
			resultSet = preparedStatement.executeQuery();
			AT at = null;
			if (resultSet.next()) {
				at = new AT(resultSet.getString("id"));
			}
			return at;
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
	public void add(AT at) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_AT (id, theme, dateType, year, date, startTime, endTime, ps, persons) values (?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, at.getId());
			preparedStatement.setString(2, at.getTheme());
			preparedStatement.setString(3, at.getDateType());
			preparedStatement.setString(4, at.getYear());
			preparedStatement.setString(5, at.getDate());
			preparedStatement.setString(6, at.getStartTime());
			preparedStatement.setString(7, at.getEndTime());
			preparedStatement.setString(8, at.getPs());
			preparedStatement.setString(9, at.getPersons());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}

	}

	@Override
	public List<AT> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_AT";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<AT> ats = new ArrayList<AT>();
			while (resultSet.next()) {
				AT at = new AT(resultSet.getString("id"),
						resultSet.getString("theme"),
						resultSet.getString("dateType"),
						resultSet.getString("year"),
						resultSet.getString("date"),
						resultSet.getString("startTime"),
						resultSet.getString("endTime"),
						resultSet.getString("ps"),
						resultSet.getString("persons"));
				ats.add(at);
			}
			return ats;
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
	public void delete(String id) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "delete from t_AT where id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	
	}
}
