package com.mouritech.criteriaqueryexample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private Long productId;
	private String productName;
	private float productPrice;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Long productId, String productName, float  productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	

}
