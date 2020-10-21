package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.IRecordDao;
import com.tledu.zrz.model.Money;
import com.tledu.zrz.model.Record;
import com.tledu.zrz.util.DBUtil;

public class RecordDao implements IRecordDao {

	@Override
	public Record loadByRecordtitlename(String titlename) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_record where titlename = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, titlename);
			resultSet = preparedStatement.executeQuery();
			Record record = null;
			if (resultSet.next()) {
				record = new Record(resultSet.getInt("examnum"),
						resultSet.getString("titlename"),
						resultSet.getString("charge"),
						resultSet.getString("start"),
						resultSet.getString("end"),
						resultSet.getString("adr"),
						resultSet.getString("cdn"),
						resultSet.getInt("peonum")
						);
			}
//			System.out.println(111);
			return record;
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
	public List<Record> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_record ";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Record> records = new ArrayList<Record>();
			
			while (resultSet.next()) {
				Record record = new Record(resultSet.getInt("examnum"),
						resultSet.getString("titlename"),
						resultSet.getString("charge"),
						resultSet.getString("start"),
						resultSet.getString("end"),
						resultSet.getString("adr"),
						resultSet.getString("cdn"),
						resultSet.getInt("peonum")
						);
//				System.out.println(111);
				records.add(record);
//				System.out.println(record);
			}
			return records;
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
	public void delete(int examnum) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "delete from t_record where examnum=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, examnum);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	
	}

	

	@Override
	public Record load(int recordexamnum) {
		// TODO Auto-generated method stub
		return null;
	}


	





	@Override
	public void add(Record record) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_record (titlename,charge,start,end,adr,cdn,peonum,per,content,result,remarks) values (?,?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, record.getTitlename());
			preparedStatement.setString(2, record.getCharge());
			preparedStatement.setString(3, record.getStart());
			preparedStatement.setString(4, record.getEnd());
			preparedStatement.setString(5, record.getAdr());
			preparedStatement.setString(6, record.getCdn());
			preparedStatement.setInt(7,record.getPeonum());
			preparedStatement.setString(8, record.getPer());
			preparedStatement.setString(9, record.getContent());
			preparedStatement.setString(10, record.getResult());
			preparedStatement.setString(11, record.getRemarks());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	
	}
	@Override
	public List<Record> list(int examnum) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from t_record  where examnum=? ";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, examnum);
		
			resultSet = preparedStatement.executeQuery();
			List<Record> records = new ArrayList<Record>();
			while (resultSet.next()) {
				Record record = new Record(resultSet.getInt("examnum"),
						resultSet.getString("titlename"),
						resultSet.getString("charge"),
						resultSet.getString("start"),
						resultSet.getString("end"),
						resultSet.getString("adr"),
						resultSet.getString("cdn"),
						resultSet.getInt("peonum")
						);
				records.add(record);
			}
			return records;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(resultSet);
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
		return null;
	}

//	@Override
//	public Record load(String deparname) {
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





	
}
