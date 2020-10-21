package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.IMoneyDao;
import com.tledu.zrz.model.Money;
import com.tledu.zrz.util.DBUtil;

public class MoneyDao implements IMoneyDao {

	@Override
	public Money loadByMoneytitle(String title) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_money where title = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, title);
			resultSet = preparedStatement.executeQuery();
			Money money = null;
			if (resultSet.next()) {
				money = new Money(resultSet.getInt("id"),
						resultSet.getString("title"),
						resultSet.getString("year"),
						resultSet.getString("month"),
						resultSet.getString("start"),
						resultSet.getString("end"),
						resultSet.getString("nickname"),
						resultSet.getString("date"),
						resultSet.getString("con"),
						resultSet.getString("cons"));
			}
			return money;
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
	public List<Money> list(int id ,String title) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_money  where id=? and title=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, title);
			resultSet = preparedStatement.executeQuery();
			List<Money> moneys = new ArrayList<Money>();
			while (resultSet.next()) {
				Money money = new Money(resultSet.getInt("id"),
						resultSet.getString("title"),
						resultSet.getString("year"),
						resultSet.getString("month"),
						resultSet.getString("start"),
						resultSet.getString("end"),
						resultSet.getString("nickname"),
						resultSet.getString("date"),
						resultSet.getString("con"),
						resultSet.getString("cons"));
				moneys.add(money);
			}
			return moneys;
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
	public List<Money> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_money ";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Money> moneys = new ArrayList<Money>();
			while (resultSet.next()) {
				Money	money = new Money(resultSet.getInt("id"),
						resultSet.getString("title"),
						resultSet.getString("year"),
						resultSet.getString("month"),
						resultSet.getString("start"),
						resultSet.getString("end"),
						resultSet.getString("nickname"),
						resultSet.getString("date"),
						resultSet.getString("con"),
						resultSet.getString("cons"));

				
				moneys.add(money);
			}
			return moneys;
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
			String sql = "delete from t_money where id=?";
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
	public void add(Money money) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_money (id,title,year,month,start,end,nickname,date,con,cons) values (?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, money.getId());
			preparedStatement.setString(2, money.getTitle());
			preparedStatement.setString(3, money.getYear());
			preparedStatement.setString(4, money.getMonth());
			preparedStatement.setString(5, money.getStart());
			preparedStatement.setString(6, money.getEnd());
			preparedStatement.setString(7, money.getNickname());
			preparedStatement.setString(8, money.getDate());
			preparedStatement.setString(9, money.getCon());
			preparedStatement.setString(10 , money.getCons());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	
	}

//	@Override
//	public Depar load(String deparname) {
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		ResultSet resultSet = null;
//		try {
//			connection = DBUtil.getConnection();
//			String sql = "select * from t_depar where deparnum = ?";
//			preparedStatement = connection.prepareStatement(sql);
//			preparedStatement.setString(1, deparname);
//			resultSet = preparedStatement.executeQuery();
//			Depar depar = null;
//			if (resultSet.next()) {
//				depar = new Depar(
//						resultSet.getString("deparnum"),
//						resultSet.getString("deparname"),
//						resultSet.getString("nick"));
//			}
//			return depar;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally{
//			DBUtil.close(resultSet);
//			DBUtil.close(preparedStatement);
//			DBUtil.close(connection);
//		}
//		return null;
//	}
//
//	@Override
//	public void update(Depar depar) {
//
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		try {
//			connection = DBUtil.getConnection();
//			String sql = "update t_depar set deparname=? ,nick=? where deparnum=?";
//			preparedStatement = connection.prepareStatement(sql);
//			preparedStatement.setString(3, depar.getDeparnum());
//			preparedStatement.setString(1, depar.getDeparname());
//			preparedStatement.setString(2, depar.getNick());
//			
//			preparedStatement.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally{
//			DBUtil.close(preparedStatement);
//			DBUtil.close(connection);
//		}
//	
//	}

	
}