<%@page import="com.furniture.dao.ProductRegisterDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.furniture.bean.Product"%>
<%@page import="com.furniture.bean.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- <%ArrayList<User> list=(ArrayList<User>)session.getAttribute("UserList");
    
       if(list==null){
           response.sendRedirect("AdminShowController");
       }else{
           list=(ArrayList<User>)session.getAttribute("UserList");
       }
    %>
    <%ArrayList<Product> list1=(ArrayList<Product>)session.getAttribute("ProductList");
    
       if(list1==null){
           response.sendRedirect("AdminShowController");
       }else{
           list1=(ArrayList<Product>)session.getAttribute("ProductList");
       }
    %> --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<link rel="stylesheet" href="css/admin.css">
</head>
<body>
    <%-- <div class="header">
        <h1>Welcome to the Admin Dashboard</h1>
        <nav>
            <ul>
                <li><a href="logout.jsp">Logout</a></li>
            </ul>
        </nav>
    </div>

    <div class="user-management">
        <h3>User List</h3>
        <table border="1">
            <thead>
                <tr>
                    <th>User ID</th>
                    <th>Name</th>
                    <th>Password</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <% for(User s:list){ %>
                <tr>
                    <td><%=s.getUserId()%></td>
                    <td><%=s.getUsername()%></td>
                    <td><%=s.getPassword()%></td>
                    <td>
                    	<form action="UserDeleteController" method="post" style="display:inline;">
                            <input type="hidden" name="userId" value="<%=s.getUserId()%>">
                            <input type="submit" value="Delete">
                        </form>
                        <form action="UserUpdateController" method="post" style="display:inline;">
                            <input type="hidden" name="userId" value="<%=s.getUserId()%>">
                            <input type="submit" value="Update">
                        </form>
                    </td>
                </tr>
                <% } %>
            </tbody>
        </table>
        <p><a href="addUser.jsp">Add New User</a></p>
    </div><br>
    
    <div class="product-management">
        <h3>Product List</h3>
        <table border="1">
            <thead>
                <tr>
                    <th>Product Design ID</th>
                    <th>Price</th>
                    <th>Image</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <% for(Product p:list1){ %>
                <tr>
                    <td><%=p.getProductId()%></td>
                    <td><%=p.getProductName()%></td>
                    <td><%=p.getPrice()%></td>
                    <td><%=p.getImage()%></td>
                    <td>
                    	<form action="ProductDeleteController" method="post" style="display:inline;">
                            <input type="hidden" name="productId" value="<%=p.getProductId()%>">
                            <input type="submit" value="Delete">
                        </form>
                        <form action="ProductUpdateController" method="post" style="display:inline;">
                            <input type="hidden" name="productId" value="<%=p.getProductId()%>">
                            <input type="submit" value="Update">
                        </form>
                    </td>
                </tr>
                <% } %>
            </tbody>
        </table>
        <p><a href="addProduct.jsp">Add New Product</a></p>
    </div>

    <footer>
        <p>&copy; 2025 Online Furniture Shopping</p>
    </footer> --%>
    <div class="header">
        <h1>Welcome to the Admin Dashboard</h1>
        <nav>
            <ul>
                <li><a href="logout.jsp">Logout</a></li>
            </ul>
        </nav>
    </div>
    <h2>Welcome Admin!</h2>
    <ul>
        <li><a href="AdminUserShowController">User List</a></li>
        <li><a href="AdminProductShowController">Product List</a></li>
    </ul>
    
    
</body>
</html>
