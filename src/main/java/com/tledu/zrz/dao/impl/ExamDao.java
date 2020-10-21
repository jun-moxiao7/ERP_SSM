package com.tledu.zrz.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.dao.IExamDao;
import com.tledu.zrz.model.Exam;
import com.tledu.zrz.model.Train;
import com.tledu.zrz.util.DBUtil;

public class ExamDao implements IExamDao{
	@Override
	public Exam loadByTrainname(String trainname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exam> list() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
		String sql = "select te.id,tt.id,te.trainname,tt.fashion,tt.teacher,te.examiner,te.examinee,te.fashion,te.exam_name,te.time \r\n" + 
					"				from t_exam te inner join t_train tt on te.exam_name = tt.trainname";

			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			List<Exam> exams = new ArrayList<Exam>();
			while (resultSet.next()) {
				Exam exam = new Exam(resultSet.getInt("id"),
						resultSet.getString("trainname"),
						resultSet.getString("examiner"),
						resultSet.getString("examinee"),
						resultSet.getString("fashion"),
						resultSet.getString("time"));
				Train train = new Train();
				train.setId(resultSet.getInt("id"));
				train.setFashion(resultSet.getString("fashion"));
				train.setTeacher(resultSet.getString("teacher"));
				train.setTrainname(resultSet.getString("exam_name"));
				exam.setTrain(train);
				exams.add(exam);
			}
			return exams;
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
	public List<Exam> list(int id,  String trainname,  String examiner) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConnection();
		String sql = "select te.id,tt.id,te.trainname,tt.fashion,tt.teacher,te.examiner,te.examinee,te.fashion,te.exam_name,te.time \r\n" + 
					"				from t_exam te inner join t_train tt on te.exam_name = tt.trainname"
					+ "where te.id=? and  te.trainname=? and te.examiner=?";

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, trainname);
			preparedStatement.setString(3, examiner);
			resultSet = preparedStatement.executeQuery();
			List<Exam> exams = new ArrayList<Exam>();
			while (resultSet.next()) {
				Exam exam = new Exam(resultSet.getInt("id"),
						resultSet.getString("trainname"),
						resultSet.getString("examiner"),
						resultSet.getString("examinee"),
						resultSet.getString("fashion"),
						resultSet.getString("time"));
				Train train = new Train();
				train.setId(resultSet.getInt("id"));
				train.setFashion(resultSet.getString("fashion"));
				train.setTeacher(resultSet.getString("teacher"));
				train.setTrainname(resultSet.getString("exam_name"));
				exam.setTrain(train);
				exams.add(exam);
				System.out.println(sql);
			}
			return exams;
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
			String sql = "delete from t_Exam where id=?";
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
	public void add(Exam exam) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into t_exam (trainname,examiner,examinee,fashion,time,grade,exam_name) values (?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, exam.getTrainname());
			preparedStatement.setString(2, exam.getExaminer());
			preparedStatement.setString(3, exam.getExaminee());
			preparedStatement.setString(4, exam.getFashion());
			preparedStatement.setString(5, exam.getTime());
			preparedStatement.setString(6, exam.getGrade());
			preparedStatement.setString(7, exam.getTrain().getTrainname());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
	
		
	}

	@Override
	public Exam load(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Exam exam) {

		
	}

	
}
