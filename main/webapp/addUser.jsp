<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add New User</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f9;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .container {
        background-color: #ffffff;
        padding: 30px;
        border-radius: 8px;
        box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
        width: 100%;
        max-width: 600px;
    }

    h2 {
        color: #333;
        text-align: center;
        margin-bottom: 20px;
        font-size: 28px;
    }

    table {
        width: 100%;
        margin-bottom: 20px;
    }

    td {
        padding: 8px;
        font-size: 16px;
    }

    label {
        font-weight: bold;
        color: #333;
    }

    /*input[type="text"], input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-top: 5px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
        font-size: 16px;
        background-color: #fafafa;
    }*/

    /*input[type="text"]:focus, input[type="password"]:focus {
        border-color: #5cb85c;
        outline: none;
    }*/

    button {
        background-color: #5cb85c;
        color: white;
        padding: 12px 20px;
        border: none;
        border-radius: 4px;
        font-size: 16px;
        cursor: pointer;
        width: 100%;
        transition: background-color 0.3s;
    }

    button:hover {
        background-color: #4cae4c;
    }

    a {
        display: inline-block;
        margin-top: 15px;
        text-align: center;
        color: #007bff;
        text-decoration: none;
    }

    a:hover {
        text-decoration: underline;
    }
</style>

</head>
<body>

    <div class="container">
        <h2>Add New User</h2>

        <form action="AddUserController" method="POST">
            <table>
                <tr>
                    <td><label for="username">Username:</label></td>
                    <td><input type="text" id="username" name="username" required/></td>
                </tr>
                <tr>
                    <td><label for="password">Password:</label></td>
                    <td><input type="password" id="password" name="password" required/></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align:center;">
                        <button type="submit">Add User</button>
                    </td>
                </tr>
            </table>
        </form>

        <br>
        <a href="admin.jsp">Back to Admin Dashboard</a>
    </div>

</body>
</html>
