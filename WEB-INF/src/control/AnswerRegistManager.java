package control;

import java.sql.Connection;

import dao.AnswerRegistDAO;

public class AnswerRegistManager {
	private Connection connection = null;

	public void AnswerRegistManager(String user_id, int question_id, int choice, int correct_answer) {

		AnswerRegistDAO answerDAO = new AnswerRegistDAO();
		this.connection=answerDAO.createConnection();

		answerDAO.answer(user_id,question_id,choice, correct_answer,this.connection);
		answerDAO.closeConnection(this.connection);
		this.connection=null;

	}

}
