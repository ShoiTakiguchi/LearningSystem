package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Question;
import control.GetQuestionManager;

public class SelectQuestionServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		int question_id = Integer.parseInt(request.getParameter("question_id"));

		//System.out.println(question_id);

		GetQuestionManager manager = new GetQuestionManager();

		Question question = new Question();
		question = manager.GetQuestion(question_id);
		request.setAttribute("question", question);
		request.getRequestDispatcher("./ToAnswer.jsp").forward(request, response);
		HttpSession session = request.getSession();
		session.setAttribute("question", question);
	}
}
