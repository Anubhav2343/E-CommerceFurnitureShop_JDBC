package com.furniture.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.furniture.bean.User;
import com.furniture.dao.UserLogInDAO;

/**
 * Servlet implementation class UserLogInController
 */
@WebServlet("/UserLogInController")
public class UserLogInController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLogInController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        
        if(username.equals("Admin Name") && password.equals("Admin@123")) {
        	response.sendRedirect("admin.jsp");
        }
        else {
        User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		
		UserLogInDAO usd = new UserLogInDAO();
		try {
			boolean status = usd.login(u);
			if(status) {
				HttpSession session = request.getSession();
				session.setAttribute("username",u.getUsername());
//				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//				rd.forward(request, response);
				response.sendRedirect("index.jsp");
			}else {
				//request.setAttribute("errorMessage", "Invalid username or password");
                RequestDispatcher rd = request.getRequestDispatcher("userregister.jsp");
                rd.forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        }
		doGet(request, response);
	}

}
