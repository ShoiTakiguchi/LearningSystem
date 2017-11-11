package control;

import java.sql.Connection;
import java.util.ArrayList;

import beans.Question;
import dao.GetQuestionDAO;

public class GetQuestionManager {

	private Connection connection = null;

	public ArrayList<Question> GetList(int question_subject) {
		GetQuestionDAO GetDAO = new GetQuestionDAO();

		this.connection = GetDAO.createConnection();

		ArrayList<Question> list = new ArrayList<>();
		list = GetDAO.GetList(question_subject, this.connection);

		GetDAO.closeConnection(this.connection);

		this.connection = null;

		return list;

	}

	public Question GetQuestion(int question_id) {
		// TODO 自動生成されたメソッド・スタブ
		GetQuestionDAO GetDAO = new GetQuestionDAO();
//		System.out.println(question_id);

		this.connection = GetDAO.createConnection();

		Question question = new Question();

		question = GetDAO.GetQuestion(question_id, this.connection);
		GetDAO.closeConnection(this.connection);

		this.connection = null;

		return question;
	}

}
