package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Question;
import control.QuestionManager;

//@WebServlet("/jsp/QuestionRegistServlet")
public class QuestionRegistServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		String question_content=request.getParameter("question_content");
		int question_answer=Integer.parseInt(request.getParameter("question_answer"));
		String choice_1=request.getParameter("choice_1");
		String choice_2=request.getParameter("choice_2");
		String choice_3=request.getParameter("choice_3");
		String choice_4=request.getParameter("choice_4");
		int question_subject=Integer.parseInt(request.getParameter("question_subject"));




		Question question =new Question(0,question_content,question_answer,choice_1,choice_2,choice_3,choice_4,question_subject);

		QuestionManager manager = new QuestionManager();

		manager.questionregist(question);

		response.sendRedirect(response.encodeRedirectURL("./regist_question_success.jsp"));
	}


}

