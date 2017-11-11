package control;

import java.sql.Connection;

import beans.User;
import dao.RegistDAO;

public class UserManager {
	private Connection connection = null;

	public UserManager(){
	}

	public void registUser(User user){
		RegistDAO registDAO = new RegistDAO();

		this.connection = registDAO.createConnection();

		registDAO.registUser(user,this.connection);
		registDAO.closeConnection(this.connection);

		this.connection = null;

	}

}
