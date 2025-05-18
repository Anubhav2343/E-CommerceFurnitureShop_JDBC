<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Furniture Shop</title>
    <link rel="stylesheet" href="css/login.css">
</head>
<body>
    <div class="login-container">
        <div class="login-box">
            <h2>Login</h2>
            <form action="UserLogInController" method="post">
                <div class="textbox">
                    <input type="text" placeholder="Username" name="username" required>
                </div>
                <div class="textbox"><br>
                    <input type="password" placeholder="Password" name="password" required>
                </div><br>
                <button type="submit" class="btn">Login</button>
                <div class="links">
                	<p>Not registered? <a href="userregister.jsp">Register here</a></p>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
    