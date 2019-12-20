package com.ustglobal.stockmanagement.service;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.dao.ProductDAO;
import com.ustglobal.stockmanagement.dto.Products_Info;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDAO dao;

	@Override
	public List<Products_Info> getProductByCompany(String company) {
		
		return dao.getProductByCompany(company);
	}

	@Override
	public Products_Info getProductByName(String name) {
		
		return dao.getProductByName(name);
	}

	@Override
	public List<Products_Info> getProductByCategory(String category) {
		
		return dao.getProductByCategory(category);
	}

	@Override
	public boolean addProduct(Products_Info bean) {
		return dao.addProduct(bean);
	}
	

	@Override
	public boolean modifyProduct(Products_Info bean) {
		
		return dao.modifyProduct(bean);
	}

	
	
}
