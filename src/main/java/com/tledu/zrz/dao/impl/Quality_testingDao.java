package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.IQuality_testingDao;
import com.tledu.zrz.model.Quality_testing;
import com.tledu.zrz.util.DBUtil;

public class Quality_testingDao implements IQuality_testingDao{

	@Override
	public List<Quality_testing> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_quality ";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Quality_testing> quality_testings = new ArrayList<Quality_testing>();
			while (resultSet.next()) {
				Quality_testing	quality_testing = new Quality_testing(
						resultSet.getString("rule_name"),
						resultSet.getString("goods_name"),
						resultSet.getString("number_head"),
						resultSet.getString("dateformat"),
						resultSet.getInt("length"),
						resultSet.getString("example"),
						resultSet.getString("rule"),
						resultSet.getString("status"));
				
				quality_testings.add(quality_testing);
			}
			return quality_testings;
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
	public void delete(String rule_name) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "delete from t_quality where rule_name=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, rule_name);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
		
	}

	@Override
	public void add(Quality_testing quality_testing) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_quality (rule_name,goods_name,number_head,dateformat,length,example,rule,status) values (?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, quality_testing.getRule_name());
			preparedStatement.setString(2, quality_testing.getGoods_name());
			preparedStatement.setString(3, quality_testing.getNumber_head());
			preparedStatement.setString(4, quality_testing.getDateformat());
			preparedStatement.setInt(5, quality_testing.getLength());
			preparedStatement.setString(6, quality_testing.getExample());
			preparedStatement.setString(7, quality_testing.getRule());
			preparedStatement.setString(8, quality_testing.getStatus());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
		
	}

}
