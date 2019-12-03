package com.ustglobal.retailer.service;

import com.ustglobal.retailer.dto.OrderBean;
import com.ustglobal.retailer.dto.ProductBean;
import com.ustglobal.retailer.dto.RetailerBean;

public interface RetailerService {

	public int createProfile(RetailerBean Bean);
	public RetailerBean login(int rid,String password);
	public ProductBean searchProduct(int pid);
	public boolean updatePassword(int rid,String password);
	public double sumAmount(int rid);
	public OrderBean retrieveOrder(int rid);

}
