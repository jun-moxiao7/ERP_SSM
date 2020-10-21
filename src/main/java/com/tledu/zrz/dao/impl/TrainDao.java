package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.ITrainDao;
import com.tledu.zrz.model.Train;
import com.tledu.zrz.util.DBUtil;

public class TrainDao implements ITrainDao{

	@Override
	public Train loadByTrainname(String trainname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Train> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_train ";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Train> trains = new ArrayList<Train>();
			while (resultSet.next()) {
				Train train = new Train(resultSet.getInt("id"),
						resultSet.getString("trainname"),
						resultSet.getString("fashion"),
						resultSet.getString("teacher"),
						resultSet.getString("startTime"),
						resultSet.getString("endTime"),
						resultSet.getString("addr"));
				
				trains.add(train);
			}
			return trains;
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
	public List<Train> list(int id,String trainname , String fashion) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_train where id=? and trainname=? and fashion=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, trainname);
			preparedStatement.setString(3, fashion);
			resultSet = preparedStatement.executeQuery();
			List<Train> trains = new ArrayList<Train>();
			while (resultSet.next()) {
				Train train = new Train(resultSet.getInt("id"),
						resultSet.getString("trainname"),
						resultSet.getString("fashion"),
						resultSet.getString("teacher"),
						resultSet.getString("startTime"),
						resultSet.getString("endTime"),
						resultSet.getString("addr"));
				trains.add(train);
			}
			return trains;
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
	public void delete(int id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "delete from t_train where id=?";
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

	@Override
	public void add(Train train) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_train (trainname,fashion,teacher,startTime,endTime,addr) values (?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, train.getTrainname());
			preparedStatement.setString(2, train.getFashion());
			preparedStatement.setString(3, train.getTeacher());
			preparedStatement.setString(4, train.getStartTime());
			preparedStatement.setString(5, train.getEndTime());
			preparedStatement.setString(6, train.getAddr());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	
		
	}

	@Override
	public Train load(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Train train) {

		
	}

}
