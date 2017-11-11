package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Progress;
import beans.User;
import control.GetProgressManager;

public class ViewHistoryServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		String user_id = user.getUser_id();
		System.out.println(user_id);
		System.out.println("aiueo");
		GetProgressManager manager = new GetProgressManager();
		ArrayList<Progress> list = manager.getList(user_id);

		request.setAttribute("progress_list", list);
		request.getRequestDispatcher("./ViewHistory.jsp").forward(request, response);

	}

}
