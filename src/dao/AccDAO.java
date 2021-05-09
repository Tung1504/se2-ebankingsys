package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnect;
import model.Account;
import model.User;


public class AccDAO {

	Connection connection = DBConnect.getConnection();
	
	
	
	public AccDAO() {
	}
	
	public List<Account> selectAllAccount() {
		List<Account> acc = new ArrayList<>();
		
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_ACCOUNT = "SELECT * FROM user";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ACCOUNT);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				String name = rs.getString("name");
				String address = rs.getString("address");
				int amount = rs.getInt("amount");
				String acc_type = rs.getString("acc_type");
				String branch = rs.getString("branch");
				int accno = rs.getInt("accno");
				int phone = rs.getInt("phone");
				
				
				acc.add(new Account(accno, amount, branch, name, acc_type, address, phone));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return acc;
	}
	
	
	
	
}	
	
	

