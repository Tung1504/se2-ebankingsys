package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnect;
import model.Report;
import model.User;

public class ReportDAO {
Connection connection = DBConnect.getConnection();
	
	
	
	public ReportDAO() {
	}

	public List<Report> selectAllReports() {
		List<Report> report = new ArrayList<>();
		
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_REPORT = "SELECT * FROM report";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_REPORT);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				int id = rs.getInt("id");
				String f_acc = rs.getString("f_acc");
				String t_acc = rs.getString("t_acc");
				String context = rs.getString("context");
				int amount = rs.getInt("amount");
				
				report.add(new Report(id, f_acc, t_acc, context, amount));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return report;
	}
	
	
	
	
}
