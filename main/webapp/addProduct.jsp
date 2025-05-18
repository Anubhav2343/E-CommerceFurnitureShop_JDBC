<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Product</title>
</head>
<body>
	<div class="container">
        <h2>Add New Product</h2>

        <form action="AddProductController" method="POST">
            <table>
                <tr>
                    <td><label for="productName">Product Name:</label></td>
                    <td><input type="text" id="productName" name="productName" required/></td>
                </tr>
                <tr>
                    <td><label for="price">Price:</label></td>
                    <td><input type="text" id="price" name="price" required/></td>
                </tr>
                <tr>
                    <td><label for="image">Image:</label></td>
                    <td><input type="file" id="image" name="image" accept="image/*" required/></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align:center;">
                        <button type="submit">Add Product</button>
                    </td>
                </tr>
            </table>
        </form>

        <br>
        <a href="admin.jsp">Back to Admin Dashboard</a>
    </div>
</body>
</html>