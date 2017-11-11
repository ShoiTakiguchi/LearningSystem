package control;

import java.sql.Connection;

import beans.User;
import dao.LoginDAO;

public class LoginManager {

	private Connection connection = null;
	public User certifyUser(String user_id, String user_password) {
		LoginDAO dao = new LoginDAO();

		this.connection = dao.createConnection();

		User user = dao.certifyUser(user_id,this.connection);

		dao.closeConnection(this.connection);

		this.connection= null;

		if(user==null)
			return null;
		else if(user_password.equals(user.getUser_password()))
		{
			return user;
		}
		else
			return null;
	}

}
