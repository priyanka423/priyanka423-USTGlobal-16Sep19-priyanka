package com.ustglobal.stockmanagement.service;

import java.util.List;

import com.ustglobal.stockmanagement.dto.Products_Info;

public interface ProductService {

	public List<Products_Info> getProductByCompany(String company);
	public Products_Info getProductByName(String name);
	public List<Products_Info> getProductByCategory(String category);
	public boolean addProduct(Products_Info bean);
	public boolean modifyProduct(Products_Info bean);

}
