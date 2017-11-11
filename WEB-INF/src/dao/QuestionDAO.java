package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.Question;
import utility.DriverAccessor;

public class QuestionDAO extends DriverAccessor {

	public void questionregist(Question question, Connection connection) {

		try{
			String sql = "insert into question_table values(?,?,?,?,?,?,?,?)";

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setInt(1,0);
			stmt.setString(2,question.getQuestion_content());
			stmt.setInt(3,question.getQuestion_answer());
			stmt.setString(4,question.getChoice_1());
			stmt.setString(5,question.getChoice_2());
			stmt.setString(6,question.getChoice_3());
			stmt.setString(7,question.getChoice_4());
			stmt.setInt(8,question.getQuestion_subject());
			stmt.executeUpdate();

			stmt.close();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
		}

	}
}

