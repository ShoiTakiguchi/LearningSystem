package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Question;
import beans.User;
import control.AnswerRegistManager;

public class ToAnswerServlet extends HttpServlet {

	private static final long serialVersion = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		int choice = Integer.parseInt(request.getParameter("choice"));

		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		String user_id = user.getUser_id();

		Question question = (Question) session.getAttribute("question");
		int question_id = question.getQuestion_id();
		int correct_answer = question.getQuestion_answer();

		AnswerRegistManager manager = new AnswerRegistManager();

		manager.AnswerRegistManager(user_id, question_id, choice, correct_answer);

		if(choice==correct_answer){
			response.sendRedirect(response.encodeRedirectURL("./correct.jsp"));
		}
		else{
			response.sendRedirect(response.encodeRedirectURL("./incorrect.jsp"));
		}

	}

}
