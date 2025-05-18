package com.furniture.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.furniture.bean.Product;
import com.furniture.bean.User;
import com.furniture.dao.AdminUserShowDAO;

/**
 * Servlet implementation class AdminShowController
 */
@WebServlet("/AdminUserShowController")
public class AdminUserShowController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminUserShowController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AdminUserShowDAO asd = new AdminUserShowDAO();
		
		try {
			ArrayList<User> arr = asd.show();
			for(User s:arr) {
				System.out.println(s.getUserId());
				System.out.println(s.getUsername());
				System.out.println(s.getPassword());
			}
			HttpSession session = request.getSession();
			session.setAttribute("UserList", arr);
			
//			RequestDispatcher rd= request.getRequestDispatcher("admin.jsp");
//			rd.forward(request, response);
			response.sendRedirect("userList.jsp");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		AdminShowDAO asd1 = new AdminShowDAO();
//		
//		try {
//			ArrayList<Product> arr = asd1.show();
//			for(Product s:arr) {
//				System.out.println(s.getProductId());
//				System.out.println(s.getProductName());
//				System.out.println(s.getPrice());
//				System.out.println(s.getImage());
//			}
//			HttpSession session = request.getSession();
//			session.setAttribute("ProductList", arr);
//			
////			RequestDispatcher rd= request.getRequestDispatcher("admin.jsp");
////			rd.forward(request, response);
//			response.sendRedirect("admin.jsp");
//			
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AdminUserShowDAO asd = new AdminUserShowDAO();
		
		try {
			ArrayList<User> arr = asd.show();
			for(User s:arr) {
				System.out.println(s.getUserId());
				System.out.println(s.getUsername());
				System.out.println(s.getPassword());
			}
			HttpSession session = request.getSession();
			session.setAttribute("UserList", arr);
			
			RequestDispatcher rd= request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		AdminUserShowDAO asd1 = new AdminUserShowDAO();
//		
//		try {
//			ArrayList<Product> arr = asd1.show();
//			for(Product s:arr) {
//				System.out.println(s.getProductId());
//				System.out.println(s.getProductName());
//				System.out.println(s.getPrice());
//				System.out.println(s.getImage());
//			}
//			HttpSession session = request.getSession();
//			session.setAttribute("ProductList", arr);
			
//			RequestDispatcher rd= request.getRequestDispatcher("admin.jsp");
//			rd.forward(request, response);
//			response.sendRedirect("admin.jsp");
//			
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		doGet(request, response);
	}

}
