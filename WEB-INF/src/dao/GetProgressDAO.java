package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Progress;
import utility.DriverAccessor;

public class GetProgressDAO extends DriverAccessor {

	public ArrayList<Progress> getList(String user_id, Connection connection) {
		try {
			String sql = "select * from progress_table where respondent_id=?";

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, user_id);
			ResultSet rs = stmt.executeQuery();
			ArrayList<Progress> list = new ArrayList<>();
			while (rs.next()) {
				Progress progress = new Progress();
				progress.setDate(rs.getString("date_of_time"));
				progress.setUser_id(rs.getString("respondent_id"));
				progress.setQuestion_id(rs.getInt("question_num"));
				progress.setUser_answer(rs.getInt("user_answer"));
				progress.setCorrect_answer(rs.getInt("correct_answer"));
				list.add(progress);
			}

			stmt.close();
			rs.close();
			return list;
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
	}

}
