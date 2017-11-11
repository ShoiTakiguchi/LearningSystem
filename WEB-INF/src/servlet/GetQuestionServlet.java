package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Question;
import control.GetQuestionManager;

public class GetQuestionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		int question_subject=Integer.parseInt(request.getParameter("question_subject"));

		GetQuestionManager manager = new GetQuestionManager();

		ArrayList<Question> list=manager.GetList(question_subject);


		request.setAttribute("question_list",list);
		request.getRequestDispatcher("./selectquestion.jsp").forward(request, response);
	}
}