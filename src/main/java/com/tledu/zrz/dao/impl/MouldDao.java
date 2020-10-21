package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.IMouldDao;
import com.tledu.zrz.model.Mould;
import com.tledu.zrz.util.DBUtil;

public class MouldDao implements IMouldDao {

	@Override
	public List<Mould> listMould() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_mould where id != 0";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Mould> moulds = new ArrayList<Mould>();
			while (resultSet.next()) {
				Mould mould = new Mould(resultSet.getString("id"),
						resultSet.getString("name"));
				moulds.add(mould);
			}
			return moulds;
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
	public Mould listMould(String id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_mould where id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			resultSet = preparedStatement.executeQuery();
			Mould mould = null;
			while (resultSet.next()) {
				mould = new Mould(resultSet.getString("id"),
						resultSet.getString("name"),
						resultSet.getString("theme"),
						resultSet.getString("dateType"),
						resultSet.getString("date"),
						resultSet.getString("startTime"),
						resultSet.getString("endTime"));
			}
			
			return mould;
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
