package com.furniture.bean;

public class AddToCart {
	private int productId;
	private String productName;
	private Double price;
	private String image;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public AddToCart(int productId, String productName, Double price, String image) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.image = image;
	}
	public AddToCart() {
		
	}
	@Override
	public String toString() {
		return "AddToCart [productId=" + productId + ", productName=" + productName + ", price=" + price + ", image="
				+ image + "]";
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
