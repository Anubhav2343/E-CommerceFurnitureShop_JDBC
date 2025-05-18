package com.furniture.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.furniture.bean.Product;
import com.furniture.dao.ProductRegisterDAO;

/**
 * Servlet implementation class ProductRegisterController
 */
@WebServlet("/ProductRegisterController")
public class ProductRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductRegisterController() {
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
		String productName = request.getParameter("productName");
		String price = request.getParameter("price");
		System.out.println(price);
		double p=Double.parseDouble(price);
		String image = request.getParameter("image");
		
		Product pd = new Product();
		pd.setProductName(productName);
		pd.setPrice(p);
		pd.setImage(image);
		
		ProductRegisterDAO pdd = new ProductRegisterDAO();
		try {
			boolean status = pdd.insert(pd);
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		doGet(request, response);
	}

}
