package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.IPmceDao;
import com.tledu.zrz.model.Pmce;
import com.tledu.zrz.util.DBUtil;

public class PmceDao implements IPmceDao {

	@Override
	public Pmce loadByPmcetitle(String Pmcetitle) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_pmce where title = ?";
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, Pmcetitle);
			resultSet = preparedStatement.executeQuery();
			Pmce pmce = null;
			if (resultSet.next()) {
				pmce = new Pmce(resultSet.getInt("id"),
						resultSet.getString("title"),
						resultSet.getString("name"),
						resultSet.getString("date")
					);
			}
			return pmce;
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
	public List<Pmce> list(int id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_pmce  where id=? ";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			List<Pmce> pmces = new ArrayList<Pmce>();
			while (resultSet.next()) {
				Pmce pmce = new Pmce(resultSet.getInt("id"),
						resultSet.getString("title"),
						resultSet.getString("name"),
						resultSet.getString("date")
					);
				pmces.add(pmce);
			}
			return pmces;
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
	public List<Pmce> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_pmce ";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Pmce> pmces = new ArrayList<Pmce>();
			while (resultSet.next()) {
				Pmce	pmce = new Pmce(resultSet.getInt("id"),
						resultSet.getString("title"),
						resultSet.getString("name"),
						resultSet.getString("date")
					);

				
				pmces.add(pmce);
			}
			return pmces;
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
			String sql = "delete from t_pmce where id=?";
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
	public void add(Pmce pmce) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_pmce (title,name,date,nick) values (?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, pmce.getTitle());
			preparedStatement.setString(2, pmce.getName());
			preparedStatement.setString(3, pmce.getDate());
			preparedStatement.setString(4, pmce.getNick());
			System.out.println(sql);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	
	}

	@Override
	public Pmce load(int id) {
		// TODO Auto-generated method stub
		return null;
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