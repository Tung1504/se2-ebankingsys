package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDAO;
import dao.ReportDAO;
import dao.UserDAO;
import dao.AccDAO;
import model.Account;
import model.Report;
import model.User;

/**
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 */

@WebServlet("/")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;
	private LoginDAO loginDAO;
	private ReportDAO reportDAO;
	private AccDAO accDAO;
	
	
	public void init() {
		userDAO = new UserDAO();
		loginDAO = new LoginDAO();
		reportDAO = new ReportDAO();
		accDAO = new AccDAO();
		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// TO-DO: Implement switch-case structure for page navigation with
		// request-response
		String action = request.getServletPath();
		try {
			switch (action) {
			case "/logout":
				logout(request, response);
				break;
			case "/login":
				login(request, response);
				break;
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertUser(request, response);
				break;
			case "/delete":
				deleteUser(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
//			case "/update":
//				updateUser(request, response);
//				break;
			case "/list":
				listUser(request, response);
				break;
			case "/balance":
				listUser1(request, response);
				break;
			case "/report":
				listReport(request, response);
				break;
			
				
				
			default:
				listUser1(request, response);
				break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	private void login(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		try {
			int phone = Integer.parseInt(request.getParameter("phone"));
			String password = request.getParameter("password");
			
			LoginDAO loginDAO = new LoginDAO();
			User a = loginDAO.checkLogin(phone, password);
			if (a == null)
			{
				request.setAttribute("mess", "Wrong user or pass");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else
			{
				HttpSession session = request.getSession();
				session.setAttribute("acc", a);
				response.sendRedirect("accountBalance.jsp");
					
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private void logout(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		HttpSession s = request.getSession();
		s.removeAttribute("acc");
		response.sendRedirect("login.jsp");
	}
	
	
	
	
	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<User> listUser = userDAO.selectAllUsers();
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("manageUser.jsp");
		dispatcher.forward(request, response);
	}
	
	private void listUser1(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<User> listUser = userDAO.selectAllUsers();
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("accountBalance.jsp");
		dispatcher.forward(request, response);
	}
	
//	private void listAcc(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//		
//	
//		List<Account> listAcc = accDAO.selectAllAccount();
//		
//		request.setAttribute("listAccount", listAcc);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("accountBalance.jsp");
//		dispatcher.forward(request, response);
//	}
	
	
	private void listReport(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Report> listReport = reportDAO.selectAllReports();
		request.setAttribute("listReport", listReport);
		RequestDispatcher dispatcher = request.getRequestDispatcher("manageReport.jsp");
		dispatcher.forward(request, response);
	}
	
	

	// TO-DO: Implement showNewForm() method which navigates to ADD USER view
	// (add-user.jsp)
	
	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("addUser.jsp");
		dispatcher.forward(request, response);
	}

	// TO-DO: Implement showEditForm() method which navigates to UPDATE USER view
	// (edit-user.jsp)
	
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("editUser.jsp");
		dispatcher.forward(request, response);
	}
	
	
	
	

	// TO-DO: Implement insertUser() method for adding new user
	
	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String address = request.getParameter("add");
		String email = request.getParameter("email");
		int amount = Integer.parseInt(request.getParameter("amount"));
		String acc_type = request.getParameter("acc_type");
		int zip = Integer.parseInt(request.getParameter("zip"));
		String branch = request.getParameter("branch");
		int phone = Integer.parseInt(request.getParameter("phone"));
		String role = request.getParameter("role");
		String country = request.getParameter("country");
		String city = request.getParameter("city");
		int accno = Integer.parseInt(request.getParameter("accno"));
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		User newUser = new User(name, password, address, email, amount, acc_type, zip, branch, phone, role, country, city, accno, gender, dob);
		userDAO.insertUser(newUser);
		response.sendRedirect("list");
	}

	// TO-DO: Implement updateUser() method for updating existing user
	
	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id  = Integer.parseInt(request.getParameter("id"));
		String acc_type = request.getParameter("acc_type");
		int amount = Integer.parseInt(request.getParameter("amount"));
		String role = request.getParameter("role");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		int zip= Integer.parseInt(request.getParameter("zip"));
		String country = request.getParameter("country");
		User editUser = new User(id,acc_type, role, city, country, address, amount);
		userDAO.updateUser(editUser);
		response.sendRedirect("list");
	}

	// TO-DO: Implement deleteUser() method for deleting existing user
	
	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id  = Integer.parseInt(request.getParameter("id"));
		
		
		userDAO.deleteUser(id);
		response.sendRedirect("list");
	}
}
