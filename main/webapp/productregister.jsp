<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Registration</title>
</head>
<body>
	<h2>Register Product</h2>
  	<form action="ProductRegisterController" method="POST" >
    	<label for="productName">Product Name:</label><br>
    	<input type="text" id="productName" name="productName" required><br><br>

    	<label for="price">Prices($):</label><br>
    	<input type="number" id="price" name="price" required><br><br>

    	<label for="image">Product Image:</label><br>
    	<input type="file" id="image" name="image" accept="image/*" required><br><br>

    	<button type="submit">Submit</button>
  </form>
</body>
</html>