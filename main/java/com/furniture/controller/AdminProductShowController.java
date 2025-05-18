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
import com.furniture.dao.AdminProductShowDAO;

/**
 * Servlet implementation class AdminProductShowController
 */
@WebServlet("/AdminProductShowController")
public class AdminProductShowController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminProductShowController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminProductShowDAO asd = new AdminProductShowDAO();
		
		try {
			ArrayList<Product> arr = asd.show();
			for(Product s:arr) {
				System.out.println(s.getProductId());
				System.out.println(s.getProductName());
				System.out.println(s.getPrice());
				System.out.println(s.getImage());
			}
			HttpSession session = request.getSession();
			session.setAttribute("ProductList", arr);
			
			RequestDispatcher rd= request.getRequestDispatcher("productList.jsp");
			rd.forward(request, response);
			response.sendRedirect("productList.jsp");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		doGet(request, response);
	}

}
