package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class Reattaching {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;	
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			ProductInfo productInfo=entityManager.find(ProductInfo.class, 102);
			System.out.println(entityManager.contains(productInfo));
			entityManager.detach(productInfo);
			System.out.println(entityManager.contains(productInfo));
			ProductInfo productInfo2=entityManager.merge(productInfo);
			productInfo2.setPname("Laptop-");
			System.out.println("Updated record");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	} // end of the main method
} // end of the ReAttaching class
