package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.IEvalutionDao;
import com.tledu.zrz.model.Evalution;
import com.tledu.zrz.util.DBUtil;

public class EvalutionDao implements IEvalutionDao {

	@Override
	public Evalution loadById(String id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_evalution where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			resultSet = preparedStatement.executeQuery();
			Evalution evalution = null;
			if (resultSet.next()) {
				evalution = new Evalution(resultSet.getString("id"));
			}
			return evalution;
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
	public void add(Evalution evalution) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_evalution (id, theme, dateType, year, date, startTime, endTime, work, achieve, followUp, insufficient, hard, suggest, ps) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, evalution.getId());
			preparedStatement.setString(2, evalution.getTheme());
			preparedStatement.setString(3, evalution.getDateType());
			preparedStatement.setString(4, evalution.getYear());
			preparedStatement.setString(5, evalution.getDate());
			preparedStatement.setString(6, evalution.getStartTime());
			preparedStatement.setString(7, evalution.getEndTime());
			preparedStatement.setString(8, evalution.getWork());
			preparedStatement.setString(9, evalution.getAchieve());
			preparedStatement.setString(10, evalution.getFollowUp());
			preparedStatement.setString(11, evalution.getInsufficient());
			preparedStatement.setString(12, evalution.getHard());
			preparedStatement.setString(13, evalution.getSuggest());
			preparedStatement.setString(14, evalution.getPs());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}

	}

	@Override
	public List<Evalution> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_evalution";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Evalution> evalutions = new ArrayList<Evalution>();
			while (resultSet.next()) {
				Evalution evalution = new Evalution(resultSet.getString("id"),
						resultSet.getString("theme"),
						resultSet.getString("dateType"),
						resultSet.getString("year"),
						resultSet.getString("date"),
						resultSet.getString("startTime"),
						resultSet.getString("endTime"));
				evalutions.add(evalution);
			}
			return evalutions;
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
	public List<Evalution> list(Evalution evalution) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_evalution where id=? and theme=? and dateType=? and `year`=? and date = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, evalution.getId());
			preparedStatement.setString(2, evalution.getTheme());
			preparedStatement.setString(3, evalution.getDateType());
			preparedStatement.setString(4, evalution.getYear());
			preparedStatement.setString(5, evalution.getDate());
			resultSet = preparedStatement.executeQuery();
			List<Evalution> evalutions = new ArrayList<Evalution>();
			while (resultSet.next()) {
				Evalution evalution1 = new Evalution(resultSet.getString("id"),
						resultSet.getString("theme"),
						resultSet.getString("dateType"),
						resultSet.getString("year"),
						resultSet.getString("date"),
						resultSet.getString("startTime"),
						resultSet.getString("endTime"));
				evalutions.add(evalution1);
			}
			return evalutions;
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
			String sql = "delete from t_evalution where id=?";
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
