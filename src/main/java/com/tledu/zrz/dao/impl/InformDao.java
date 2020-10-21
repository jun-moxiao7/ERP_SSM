package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.IInformDao;
import com.tledu.zrz.model.Dept;
import com.tledu.zrz.model.User;
import com.tledu.zrz.model.hr.Inform;
import com.tledu.zrz.model.hr.Transfer;
import com.tledu.zrz.util.DBUtil;

public class InformDao implements IInformDao {

	@Override
	public void add(Inform inform) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_inform (userId, userName, reasons, onDeptName, onPost, onRank, afterDeptName, afterPost, afterRank, inTime, outTime, name, date, cName, cdate, ps) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, inform.getUserId());
			preparedStatement.setString(2, inform.getUserName());
			preparedStatement.setString(3, inform.getReasons());
			preparedStatement.setString(4, inform.getOnDeptName());
			preparedStatement.setString(5, inform.getOnPost());
			preparedStatement.setString(6, inform.getOnRank());
			preparedStatement.setString(7, inform.getAfterDeptName());
			preparedStatement.setString(8, inform.getAfterPost());
			preparedStatement.setString(9, inform.getAfterRank());
			preparedStatement.setString(10, inform.getInTime());
			preparedStatement.setString(11, inform.getOutTime());
			preparedStatement.setString(12, inform.getName());
			preparedStatement.setString(13, inform.getDate());
			preparedStatement.setString(14, inform.getcName());
			preparedStatement.setString(15, inform.getCdate());
			preparedStatement.setString(16, inform.getPs());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}

	}

	@Override
	public Inform loadByUserId(int userId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_inform where userId = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, userId);
			resultSet = preparedStatement.executeQuery();
			Inform inform = null;
			if (resultSet.next()) {
				inform = new Inform(resultSet.getInt("id"));
			}
			return inform;
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
	public List<Inform> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_inform ";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Inform> informs = new ArrayList<Inform>();
			while (resultSet.next()) {
				Inform inform = new Inform(resultSet.getInt("id"),
						resultSet.getInt("userId"),
						resultSet.getString("userName"),
						resultSet.getString("onDeptName"),
						resultSet.getString("onPost"),
						resultSet.getString("afterDeptName"),
						resultSet.getString("afterPost"),
						resultSet.getString("inTime"),
						resultSet.getString("outTime")
						);
				informs.add(inform);
			}
			return informs;
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
	public List<Inform> list(int userId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_inform where userId=? ";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, userId);
			resultSet = preparedStatement.executeQuery();
			List<Inform> informs = new ArrayList<Inform>();
			while (resultSet.next()) {
				Inform inform = new Inform(resultSet.getInt("id"),
						resultSet.getInt("userId"),
						resultSet.getString("userName"),
						resultSet.getString("onDeptName"),
						resultSet.getString("onPost"),
						resultSet.getString("afterDeptName"),
						resultSet.getString("afterPost"),
						resultSet.getString("inTime"),
						resultSet.getString("outTime")
						);
				informs.add(inform);
			}
			return informs;
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
			String sql = "delete from t_inform where id=?";
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
