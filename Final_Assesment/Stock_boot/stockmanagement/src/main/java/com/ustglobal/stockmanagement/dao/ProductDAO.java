package com.ustglobal.stockmanagement.dao;

import java.util.List;

import com.ustglobal.stockmanagement.dto.Products_Info;

public interface ProductDAO {

	public List<Products_Info> getProductByCompany(String company);
	public Products_Info getProductByName(String name);
	public List<Products_Info> getProductByCategory(String category);
	public boolean addProduct(Products_Info bean);
	public boolean modifyProduct(Products_Info bean);
}
