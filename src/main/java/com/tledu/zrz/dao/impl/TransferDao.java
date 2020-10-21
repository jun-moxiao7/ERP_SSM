package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.ITransferDao;
import com.tledu.zrz.model.Dept;
import com.tledu.zrz.model.User;
import com.tledu.zrz.model.hr.Transfer;
import com.tledu.zrz.util.DBUtil;

public class TransferDao implements ITransferDao {

	@Override
	public void add(Transfer transfer) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_transfer (user_id,name, applyDate, hopeDate, entryDate, dept_id, onPost, onRank, afterPost, afterRank, onWages, afterWages, type, reasons, ps,onDeptName) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, transfer.getUser().getId());
			preparedStatement.setString(2, transfer.getName());
			preparedStatement.setString(3, transfer.getApplyDate());
			preparedStatement.setString(4, transfer.getHopeDate());
			preparedStatement.setString(5, transfer.getEntryDate());
			preparedStatement.setInt(6, transfer.getDept().getId());
			preparedStatement.setString(7, transfer.getOnPost());
			preparedStatement.setString(8, transfer.getOnRank());
			preparedStatement.setString(9, transfer.getAfterPost());
			preparedStatement.setString(10, transfer.getAfterRank());
			preparedStatement.setString(11, transfer.getOnWages());
			preparedStatement.setString(12, transfer.getAfterWages());
			preparedStatement.setString(13, transfer.getType());
			preparedStatement.setString(14, transfer.getReasons());
			preparedStatement.setString(15, transfer.getPs());
			preparedStatement.setString(16, transfer.getOnDeptName());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}

	}

	@Override
	public Transfer loadByUserId(int userid) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Transfer transfer = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_transfer where user_id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, userid);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				transfer = new Transfer(resultSet.getInt("id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(resultSet);
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
		return transfer;
	}

	@Override
	public List<Transfer> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select tt.*,td.`name` as tdname from t_transfer tt inner join t_dept td on  tt.dept_id = td.id";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Transfer> transfers = new ArrayList<Transfer>();
			while (resultSet.next()) {
				User user = new User(resultSet.getInt("user_id"));
				Dept dept = new Dept(resultSet.getString("tdname"));
				Transfer transfer = new Transfer(resultSet.getInt("id"), user,
						resultSet.getString("name"),
						resultSet.getString("applyDate"),
						resultSet.getString("hopeDate"),
						resultSet.getString("entryDate"), dept,
						resultSet.getString("onPost"),
						resultSet.getString("onRank"),
						resultSet.getString("afterPost"),
						resultSet.getString("afterRank"),
						resultSet.getString("onWages"),
						resultSet.getString("afterWages"),
						resultSet.getString("type"),
						resultSet.getString("reasons"),
						resultSet.getString("ps"),
						resultSet.getString("onDeptName"));
//				System.out.println(11111111);
//				System.out.println(transfer);
				transfers.add(transfer);
			}
			return transfers;
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
	public List<Transfer> list(Transfer transfer) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select tt.*,td.`name` as tdname from t_transfer tt inner join t_dept td on  tt.dept_id = td.id where user_id = ? and tt.id=? and tt.name=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, transfer.getUser().getId());
			preparedStatement.setInt(2, transfer.getId());
			preparedStatement.setString(3, transfer.getName());
			resultSet = preparedStatement.executeQuery();
			List<Transfer> transfers = new ArrayList<Transfer>();
			while (resultSet.next()) {
				User user = new User(resultSet.getInt("user_id"));
				Dept dept = new Dept(resultSet.getString("tdname"));
				Transfer transfer1 = new Transfer(resultSet.getInt("id"), user,
						resultSet.getString("name"),
						resultSet.getString("applyDate"),
						resultSet.getString("hopeDate"),
						resultSet.getString("entryDate"), dept,
						resultSet.getString("onPost"),
						resultSet.getString("onRank"),
						resultSet.getString("afterPost"),
						resultSet.getString("afterRank"),
						resultSet.getString("onWages"),
						resultSet.getString("afterWages"),
						resultSet.getString("type"),
						resultSet.getString("reasons"),
						resultSet.getString("ps"),
						resultSet.getString("onDeptName"));
//				System.out.println(11111111);
//				System.out.println(transfer);
				transfers.add(transfer1);
			}
			return transfers;
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
			String sql = "delete from t_transfer where id=?";
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
