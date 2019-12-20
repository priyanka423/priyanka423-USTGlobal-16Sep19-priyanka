package com.ustglobal.stockmanagement.dto;

import java.util.List;

public class ProductInfoResponse {

	private int statusCode;
	private String message;
	private String description;
	private List<Products_Info> productsBean;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Products_Info> getProductsBean() {
		return productsBean;
	}
	public void setProductsBean(List<Products_Info> productsBean) {
		this.productsBean = productsBean;
	}
	
}
