package control;

import java.sql.Connection;

import beans.Question;
import dao.QuestionDAO;

public class QuestionManager {

	private Connection connection = null;

	public QuestionManager(){
	}

	public void questionregist(Question question){
		QuestionDAO questionDAO = new QuestionDAO();

		this.connection  = questionDAO.createConnection();

		questionDAO.questionregist(question,this.connection);
		questionDAO.closeConnection(this.connection);
		this.connection = null;
	}

}

