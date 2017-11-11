package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utility.DriverAccessor;

public class AnswerRegistDAO extends DriverAccessor {
	public void answer(String user_id, int question_id, int choice, int correct_answer,
			Connection connection){
		try{

			String sql ="insert into progress_table (respondent_id, question_num, user_answer, correct_answer, progress_id) values (?,?,?,?,?)";

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, user_id);
			stmt.setInt(2,question_id);
			stmt.setInt(3,choice);
			stmt.setInt(4,correct_answer);
			stmt.setInt(5,0);
			stmt.executeUpdate();

			stmt.close();
		}catch(SQLException e){
			e.printStackTrace();
			}finally{
			}
	}
}
