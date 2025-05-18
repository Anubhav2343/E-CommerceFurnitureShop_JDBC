<%@page import="com.furniture.bean.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%ArrayList<User> list=(ArrayList<User>)session.getAttribute("UserList");
    
       if(list==null){
           response.sendRedirect("AdminUserShowController");
       }else{
           list=(ArrayList<User>)session.getAttribute("UserList");
       }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/admin.css">
<title>User Details</title>
</head>
<body>
	<div class="header">
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
    
    <footer>
        <p>&copy; 2025 Online Furniture Shopping</p>
    </footer>
    
</body>
</html>