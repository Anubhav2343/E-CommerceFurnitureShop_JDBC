package com.furniture.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.furniture.bean.Product;
import com.furniture.dao.ProductDeleteDAO;



/**
 * Servlet implementation class ProductDeleteController
 */
@WebServlet("/ProductDeleteController")
public class ProductDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("productId"));
		
		Product p = new Product();
		p.setProductId(id);
		
		ProductDeleteDAO ud = new ProductDeleteDAO();
		
		boolean status;
		try {
			status = ud.delete(p);
			if (status) {
		         response.sendRedirect("AdminProductShowController");  // Redirect if deletion is successful
		        } else {
		            RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
		            rd.forward(request, response);  // Forward if deletion fails
		        }
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
