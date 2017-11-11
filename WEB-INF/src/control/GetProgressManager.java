package control;

import java.sql.Connection;
import java.util.ArrayList;

import beans.Progress;
import dao.GetProgressDAO;

public class GetProgressManager {
	private Connection connection = null;

	public ArrayList<Progress> getList(String user_id) {
		GetProgressDAO progressDAO = new GetProgressDAO();
		this.connection = progressDAO.createConnection();
		ArrayList<Progress> list = new ArrayList<Progress>();
		list = progressDAO.getList(user_id, this.connection);

		progressDAO.closeConnection(this.connection);
		this.connection = null;

		return list;
	}

}
