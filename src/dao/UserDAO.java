package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnect;
import model.User;

/**
 * This is a DAO (DATA ACCESS OBJECT) class which provides CRUD (CREATE - READ -
 * UPDATE - DELETE) database operations for the table user in the database
 */
public class UserDAO {

	// Step 1: Establishing a Connection
	Connection connection = DBConnect.getConnection();
	
	
	
	public UserDAO() {
	}

	public List<User> selectAllUsers() {
		List<User> users = new ArrayList<>();
		
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_USERS = "SELECT * FROM user";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String password = rs.getString("password");
				String address = rs.getString("address");
				String email = rs.getString("email");
				int amount = rs.getInt("amount");
				String acc_type = rs.getString("acc_type");
				int zip = rs.getInt("zip");
				String branch = rs.getString("branch");
				int phone = rs.getInt("phone");
				String role = rs.getString("role");
				String country = rs.getString("country");
				String city = rs.getString("city");
				int accno = rs.getInt("accno");
				String gender = rs.getString("gender");
				String dob = rs.getString("dob");
				users.add(new User(id, name, password, address, email, amount, acc_type, zip, branch, phone, role, country, city, accno, gender, dob));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	
	
	
	
	// TO-DO: Implement selectUser() method to select user by ID (use in UPDATE function)
	public User selectUser(int id) throws SQLException {
		User user = null;
		
		String SELECT_USER_BY_ID = "SELECT * FROM user WHERE id = ?";
		PreparedStatement ps = connection.prepareStatement(SELECT_USER_BY_ID);
		ps.setInt(1, id);
		System.out.println(user);
		return user;
	}
	
	// TO-DO: Implement insertUser() method to add new record to table User  
	public void insertUser(User user) throws SQLException {
		try {
		String INSERT_USER = "INSERT INTO `user` (`name`, `password`, `address`, `email`, `amount`, `acc_type`, `zip`, `branch`, `phone`, `role`, `country`, `city`, `accno`, `gender`, `dob`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(INSERT_USER);
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getAddress());
		ps.setString(4, user.getEmail());
		ps.setInt(5, user.getAmount());
		ps.setString(6, user.getAcc_type());
		ps.setInt(7, user.getZip());
		ps.setString(8, user.getBranch());
		ps.setInt(9, user.getPhone());
		ps.setString(10, user.getRole());
		ps.setString(11, user.getCountry());
		ps.setString(12, user.getCity());
		ps.setInt(13, user.getAccno());
		ps.setString(14, user.getGender());
		ps.setString(15, user.getDob());
		ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}

	// TO-DO: Implement updateUser() method to update record in table User  
	public boolean updateUser(User user) throws SQLException {
		boolean rowUpdated = false;
			String UPDATE_USER = "UPDATE user SET acc_type = ?, role = ?, city = ?, address= ?, country = ?, amount = ? WHERE id = ?";
			PreparedStatement ps = connection.prepareStatement(UPDATE_USER);
			
			ps.setString(1, user.getAcc_type());
			ps.setString(2, user.getRole());
			ps.setString(3, user.getCity());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getCountry());
			ps.setInt(6, user.getAmount());
			ps.setInt(7, user.getId());
					
			rowUpdated = ps.executeUpdate() > 0 ;
		return rowUpdated;	
		
		
	}

	// TO-DO: Implement deleteUser() method to delete record in table User  
	public boolean deleteUser(int id) throws SQLException {
		
			String DELETE_USER = "DELETE FROM user WHERE id = ?";
			
			boolean rowDeleted = false;
				PreparedStatement ps = connection.prepareStatement(DELETE_USER);
				ps.setInt(1, id);
				
				rowDeleted = ps.executeUpdate() > 0;
			
			return rowDeleted;
		
	}

	
}
