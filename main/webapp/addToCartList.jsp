<%@page import="com.furniture.bean.AddToCart"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%ArrayList<AddToCart> list=(ArrayList<AddToCart>)session.getAttribute("AddToCartList");
    
       if(list==null){
           response.sendRedirect("AdminProductShowController");
       }else{
           list=(ArrayList<AddToCart>)session.getAttribute("AddToCartList");
       }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/admin.css">
<title>Added to Cart</title>
</head>
<body>
	<div class="header">
        <h1>Welcome to the AddToCart Dashboard</h1>
        <nav>
            <ul>
                <li><a href="logout.jsp">Logout</a></li>
            </ul>
        </nav>
    </div>
	<div class="addToCart-management">
        <h3>Add To Cart List</h3>
        <table border="1">
            <thead>
                <tr>
                    <th>Product ID</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Image<th>
                    Actions
                </tr>
            </thead>
            <tbody>
                <% for(AddToCart p:list){ %>
                <tr>
                    <td><%=p.getProductId()%></td>
                    <td><%=p.getProductName()%></td>
                    <td><%=p.getPrice()%></td>
                    <td><img src=img/<%=p.getImage()%> width="100" height="100"></td>
                    <%-- <td>
                    	<form action="ProductDeleteController" method="post" style="display:inline;">
                            <input type="hidden" name="productId" value="<%=p.getProductId()%>">
                            <input type="submit" value="Delete">
                        </form>
                        <form action="ProductUpdateController" method="post" style="display:inline;">
                            <input type="hidden" name="productId" value="<%=p.getProductId()%>">
                            <input type="submit" value="Update">
                        </form>
                    </td> --%>
                </tr>
                <% } %>
            </tbody>
        </table>
        <!-- <p><a href="addProduct.jsp">Add New Product</a></p> -->
    </div>

    <!-- <footer>
        <p>&copy; 2025 Online Furniture Shopping</p>
    </footer> -->
</body>
</html>