package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.User;
import utility.DriverAccessor;

public class LoginDAO extends DriverAccessor{
	public User certifyUser(String user_id,Connection connection){

		try{
			String sql="select *from user_table where user_id = ?";

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1,user_id);

			ResultSet rs= stmt.executeQuery();

			rs.first();

			User user = new User();
			user.setUser_id(rs.getString("user_id"));
			user.setUser_password(rs.getString("user_password"));
			user.setUser_role(rs.getInt("user_role"));
			stmt.close();
			rs.close();
			System.out.println(user.getUser_id());
			return user;
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}finally{
		}
	}
}

