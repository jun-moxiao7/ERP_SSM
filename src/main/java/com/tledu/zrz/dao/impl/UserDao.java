package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.IUserDao;
import com.tledu.zrz.model.Dept;
import com.tledu.zrz.model.User;
import com.tledu.zrz.util.DBUtil;

public class UserDao implements IUserDao {

	@Override
	public User loadByUsername(String username) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_user where username = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			resultSet = preparedStatement.executeQuery();
			User user = null;
			if (resultSet.next()) {
				user = new User(resultSet.getInt("id"),
						resultSet.getString("username"),
						resultSet.getString("password"),
						resultSet.getString("nickname"),
						resultSet.getInt("sex"), resultSet.getInt("age"));
			}
			return user;
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
	public List<User> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			// 如果多个表中,列名重复,注意使用别名来区别
			String sql = " select tu.*,td.name from t_user tu inner join t_dept td on tu.dept_id = td.id  order by tu.id asc";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<User> users = new ArrayList<User>();
			while (resultSet.next()) {
				User	user = new User(resultSet.getInt("id"),
						resultSet.getString("username"),
						resultSet.getString("password"),
						resultSet.getString("nickname"),
						resultSet.getInt("sex"), resultSet.getInt("age"));
				Dept  dept = new Dept();
				dept.setName(resultSet.getString("name"));
				dept.setId(resultSet.getInt("dept_id"));
				user.setDept(dept);
				
				users.add(user);
			}
			return users;
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
			String sql = "delete from t_user where id=?";
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
	public void add(User user) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_user (username,password,nickname,age,sex,dept_id) values (?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getNickname());
			preparedStatement.setInt(4, user.getAge());
			preparedStatement.setInt(5, user.getSex());
			preparedStatement.setInt(6, user.getDept().getId());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	
	}

	@Override
	public User load(int id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_user where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			User user = null;
			if (resultSet.next()) {
				user = new User(resultSet.getInt("id"),
						resultSet.getString("username"),
						resultSet.getString("password"),
						resultSet.getString("nickname"),
						resultSet.getInt("sex"), resultSet.getInt("age")
						,new Dept(resultSet.getInt("dept_id")));
			}
			return user;
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
	public void update(User user) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "update t_user set password=? , nickname=? ,age=?, sex=?,dept_id=?  where id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getPassword());
			preparedStatement.setString(2, user.getNickname());
			preparedStatement.setInt(3, user.getAge());
			preparedStatement.setInt(4, user.getSex());
			preparedStatement.setInt(5, user.getDept().getId());
			preparedStatement.setInt(6, user.getId());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	
	}

	@Override
	public int loadByDeptId(int deptId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select count(*) from t_user where dept_id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, deptId);
			resultSet = preparedStatement.executeQuery();
			// 因为只调用了count 方法,所以结果 肯定是一行一列
			resultSet.next();
			
			// 只有一列,所以获取第一列即可
			int count = resultSet.getInt(1);
			return count;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(resultSet);
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
		return 0;
	}
}
