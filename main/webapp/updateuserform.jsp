<%@page import="com.furniture.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User Information</title>
<link rel="stylesheet" href="css/updateform.css">
</head>
<body>
	<div class="container">
        <form action="UpdateDataUserController" method="POST" class="register-form">
            <h2>Update</h2>
            <%User u=(User)session.getAttribute("User"); %>
            <div class="input-group">
             <input type="hidden" value="<%=u.getUserId()%>" id="userId" name="userId">
             </div>
             <div class="input-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" value="<%=u.getUsername()%>"required>
            </div><br>
            <div class="input-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" value="<%=u.getPassword()%>"required>
            </div>
   
            <button type="submit">Update</button>
        </form>
    </div>
</body>
</html>