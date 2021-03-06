package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class ReadQuery {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test"); // here it will give the same name as <persistence-unit> like test //
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		ProductInfo productDetail=entityManager.find(ProductInfo.class,102);
		System.out.println("ID: "+productDetail.getPid());
		System.out.println("Name: "+productDetail.getPname());
		System.out.println("Quantity: "+productDetail.getQuantity());
	} // end of the main method	
}// end of the ReadQuery class
