package com.furniture.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.furniture.bean.Product;
import com.furniture.bean.User;
import com.furniture.dao.UpdateDataProductDAO;
import com.furniture.dao.UpdateDataUserDAO;

/**
 * Servlet implementation class UpdateDataProductController
 */
@WebServlet("/UpdateDataProductController")
public class UpdateDataProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDataProductController() {
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
		int productId =Integer.parseInt(request.getParameter("productId"));
		String productName=request.getParameter("productName");
		Double price=Double.parseDouble(request.getParameter("price"));
		String image = request.getParameter("image");
		
		Product p = new Product();
		p.setProductId(productId);
		p.setProductName(productName);
		p.setPrice(price);
		p.setImage(image);
		
		UpdateDataProductDAO ud = new UpdateDataProductDAO();
		try {
			ud.updateData(p);
			response.sendRedirect("AdminProductShowController");
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
