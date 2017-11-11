package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.User;
import utility.DriverAccessor;

public class RegistDAO extends DriverAccessor{


	public void registUser(User user,Connection connection){
		try{
			String sql = "insert into user_table values(?,?,?)";

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1,user.getUser_id());
			stmt.setString(2,user.getUser_password());
			stmt.setInt(3,0);
			stmt.executeUpdate();

		}catch(SQLException e){

			e.printStackTrace();
		}finally{
		}
	}

}
