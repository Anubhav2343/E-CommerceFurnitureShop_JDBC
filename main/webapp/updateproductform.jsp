<%@page import="com.furniture.bean.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product Information</title>
</head>
<body>
	<div class="container">
        <form action="UpdateDataProductController" method="POST">
            <h2>Update</h2>
            <%Product p=(Product)session.getAttribute("Product"); %>
            <div class="input-group">
             <input type="hidden" value="<%=p.getProductId()%>" id="productId" name="productId">
             </div>
             <div class="input-group">
                <label for="productName">Product Name</label>
                <input type="text" id="productName" name="productName" value="<%=p.getProductName()%>"required>
            </div><br>
            <div class="input-group">
                <label for="price">Price</label>
                <input type="text" id="price" name="price" value="<%=p.getPrice()%>"required>
            </div><br>
            <div class="input-group">
                <label for="image">Image</label>
                <input type="file" id="image" name="image" accept="image/*" value="<%=p.getImage()%>"required>
            </div>
            
            <button type="submit">Update</button>
        </form>
    </div>
</body>
</html>