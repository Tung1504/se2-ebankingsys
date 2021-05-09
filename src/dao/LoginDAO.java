package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import connect.DBConnect;
import model.User;




public class LoginDAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public User checkLogin(int phone, String password)
	{
		String query = "SELECT * FROM user WHERE phone = ? and password =?";
		try
		{
			
			conn = DBConnect.getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, phone);
			ps.setString(2, password);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				User a = new User(rs.getString(2), rs.getString(3), rs.getInt(10), rs.getString(11));
				return a;
			} 
		}
		
		catch (Exception e)
			{
				
			}
			return null;
			
		}
	}

