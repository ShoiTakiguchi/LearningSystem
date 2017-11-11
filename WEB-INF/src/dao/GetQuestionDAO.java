
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Question;
import utility.DriverAccessor;

public class GetQuestionDAO extends DriverAccessor {

	public ArrayList<Question> GetList(int question_subject, Connection connection) {

		try {
			String sql = "select * from question_table where question_subject=?";

			System.out.println(question_subject);
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, question_subject);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Question> list = new ArrayList<>();
			while (rs.next()) {
				Question question = new Question();
				question.setQuestion_id(rs.getInt("question_id"));
				question.setQuestion_content(rs.getString("question"));
				question.setQuestion_answer(rs.getInt("answer"));
				question.setChoice_1(rs.getString("choice_1"));
				question.setChoice_2(rs.getString("choice_2"));
				question.setChoice_3(rs.getString("choice_3"));
				question.setChoice_4(rs.getString("choice_4"));
				list.add(question);
			}

			stmt.close();
			rs.close();
			return list;

		} catch (SQLException e) {

			e.printStackTrace();
			return null;

		}
	}

	public Question GetQuestion(int question_id, Connection connection) {
		// TODO 自動生成されたメソッド・スタブ{
		try {

			String sql = "select * from question_table where question_id = '" + question_id + "'";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);
			Question question = new Question();


			rs.first();
			question.setQuestion_id(rs.getInt("question_id"));
			question.setQuestion_content(rs.getString("question"));
			question.setQuestion_answer(rs.getInt("answer"));
			question.setChoice_1(rs.getString("choice_1"));
			question.setChoice_2(rs.getString("choice_2"));
			question.setChoice_3(rs.getString("choice_3"));
			question.setChoice_4(rs.getString("choice_4"));
			stmt.close();

			return question;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("null");
			return null;

		}
	}

}
