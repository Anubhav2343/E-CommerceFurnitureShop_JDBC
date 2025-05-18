<%@page import="com.furniture.dao.ProductShowDAO"%>
<%@page import="com.furniture.bean.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Products</title>
    <style>
        .product-container {
            display: flex;
            gap: 20px;
            flex-wrap: wrap;
        }
        .product-card {
            text-align: center;
            border: 1px solid #ccc;
            padding: 10px;
            width: 250px;
            box-shadow: 2px 2px 5px rgba(0, 0, 0, 0.1);
            border-radius: 5px;
        }
        .product-card img {
            width: 200px;
            height: 150px;
            /* object-fit: cover; */
        }
        .product-card input[type="number"] {
            width: 60px;
            padding: 5px;
            margin: 10px 0;
            text-align: center;
        }
        .product-card button {
            padding: 8px 12px;
            margin: 5px;
            border: none;
            background-color: #4CAF50;
            color: white;
            border-radius: 4px;
            cursor: pointer;
        }
        .product-card button:hover {
            background-color: #45a049;
        }
        .price {
            font-weight: bold;
            color: #333;
            font-size: 1.1em;
        }
    </style>
</head>
<body>
    <h3>Products</h3>
    <div class="product-container">
        <% 
        ProductShowDAO pd=new ProductShowDAO();
        ArrayList<Product> list = pd.showProduct();
        for (Product p : list) { %>
            <div class="product-card">
                <img src="img/<%= p.getImage() %>"  alt="<%= p.getProductName() %>">
                <p><%= p.getProductName() %></p>
                <p class="price">Rs. <%= p.getPrice() %></p>
				
				<label>Quantity:</label>
				<input type="number" name="quantity" value="1" min="1" max="10">
				
				
                <!-- Form for Add to Cart -->
                <form action="AddToCartController" method="post">
                    <input type="hidden" name="productId" value="<%= p.getProductId() %>">
                    <!-- <label>Qty:</label> -->
                    <input type="hidden" name="productName" value="<%= p.getProductName() %>">
                    <input type="hidden" name="image" value="<%= p.getImage() %>">
                    <input type="hidden" name="price" value="<%= p.getPrice()%>">
                   
                    <!-- <input type="number" name="quantity" value="1" min="1" max="10"> -->
                    <button type="submit">Add to Cart</button>
                </form>

                <!-- Form for Buy Now -->
                <form action="BuyNowController" method="post">
                    <input type="hidden" name="productId" value="<%= p.getProductId() %>">
                   <!-- <label>Qty:</label> -->
                    <!-- <input type="number" name="quantity" value="1" min="1" max="10"> -->
                    <button type="submit">Buy Now</button>
                </form>
            </div>
        <% } %>
    </div><br><br>
    <a href="addToCartList.jsp">Add to Cart Products</a>
</body>
</html>