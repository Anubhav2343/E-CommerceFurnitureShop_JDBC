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

import com.furniture.bean.AddToCart;
import com.furniture.bean.Product;
import com.furniture.dao.AddToCartDAO;
import com.furniture.dao.AdminProductShowDAO;

/**
 * Servlet implementation class AddToCartController
 */
@WebServlet("/AddToCartController")
public class AddToCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCartController() {
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
		// TODO Auto-generated method stub
		int productId = Integer.parseInt(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		System.out.println(request.getParameter("price"));
		Double price = Double.parseDouble(request.getParameter("price"));
		String image = request.getParameter("image");
		
		AddToCart a = new AddToCart();
		a.setProductId(productId);
		a.setProductName(productName);
		a.setPrice(price);
		a.setImage(image);
		
		AddToCartDAO atc = new AddToCartDAO();
		try {
			boolean status = atc.addTocart(a);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ArrayList<AddToCart> arr = atc.showAddToCart();
			for(AddToCart s:arr) {
				System.out.println(s.getProductId());
				System.out.println(s.getProductName());
				System.out.println(s.getPrice());
				System.out.println(s.getImage());
			}
			HttpSession session = request.getSession();
			session.setAttribute("AddToCartList", arr);
			
			RequestDispatcher rd= request.getRequestDispatcher("addToCartList.jsp");
			rd.forward(request, response);
			response.sendRedirect("addToCartList.jsp");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		doGet(request, response);
	}

}
