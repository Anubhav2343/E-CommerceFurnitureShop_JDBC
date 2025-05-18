package com.furniture.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.furniture.bean.User;
import com.furniture.dao.UpdateDataUserDAO;

/**
 * Servlet implementation class UpdateDataController
 */
@WebServlet("/UpdateDataUserController")
public class UpdateDataUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDataUserController() {
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
		int userId =Integer.parseInt(request.getParameter("userId"));
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		User u = new User();
		u.setUserId(userId);
		u.setUsername(username);
		u.setPassword(password);
		
		UpdateDataUserDAO ud = new UpdateDataUserDAO();
		try {
			ud.updateData(u);
			response.sendRedirect("AdminUserShowController");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		doGet(request, response);
	}

}
