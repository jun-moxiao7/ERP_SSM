package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.IDeptDao;
import com.tledu.zrz.model.Dept;
import com.tledu.zrz.util.DBUtil;

public class DeptDao implements IDeptDao {

	@Override
	public List<Dept> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_dept order by id asc ";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Dept> depts = new ArrayList<Dept>();
			while (resultSet.next()) {
				Dept dept = new Dept(resultSet.getInt("id"),
						resultSet.getString("name"),
						resultSet.getString("desc"));

				depts.add(dept);
			}
			return depts;
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
			String sql = "delete from t_dept where id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}

	}

	@Override
	public void add(Dept dept) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_dept (name,`desc`) values (?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, dept.getName());
			preparedStatement.setString(2, dept.getDesc());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}

	}

	@Override
	public Dept loadByName(String name) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_dept where name = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			Dept dept = null;
			if (resultSet.next()) {
				dept = new Dept(resultSet.getInt("id"),
						resultSet.getString("name"),
						resultSet.getString("desc"));
			}
			return dept;
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
	public Dept load(int id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_dept where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			Dept dept = null;
			if (resultSet.next()) {
				dept = new Dept(resultSet.getInt("id"),
						resultSet.getString("name"),
						resultSet.getString("desc"));
			}
			return dept;
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
	public void update(Dept dept) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "update t_dept set  `desc`=?  where id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, dept.getDesc());
			preparedStatement.setInt(2, dept.getId());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	}
}
