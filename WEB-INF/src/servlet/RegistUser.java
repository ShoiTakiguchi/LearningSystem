package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.User;
import control.UserManager;


 public class RegistUser extends HttpServlet{
		private static final long serialVersionUID = 1L;

		public void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException{
			doPost(request, response);
		}

		public void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException{

		request.setCharacterEncoding("UTF-8");

		String user_id = request.getParameter("user_id");
		String user_password = request.getParameter("user_password");
		int user_role=0;
		System.out.println("あなたのIDは"+user_id+"です！");
		System.out.println("パスワードは"+user_password+"です！");
		System.out.println("あなたは生徒です");

		User user = new User(user_id,user_password,user_role);

		UserManager manager = new UserManager();

		manager.registUser(user);

		response.sendRedirect(response.encodeRedirectURL("./SignUpSuccess.jsp"));
	}


}
