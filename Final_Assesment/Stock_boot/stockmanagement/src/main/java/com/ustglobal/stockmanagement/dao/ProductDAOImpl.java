package com.ustglobal.stockmanagement.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagement.dto.Products_Info;

@Repository
public class ProductDAOImpl implements ProductDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public Products_Info getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql ="from Products_Info where name=:name";
			TypedQuery<Products_Info> typedQuery = manager.createQuery(jpql, Products_Info.class);
			typedQuery.setParameter("name", name);
			Products_Info product = typedQuery.getSingleResult();
			return product;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Products_Info> getProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		String jpql ="from Products_Info where category=:category";
		TypedQuery<Products_Info> typedQuery = manager.createQuery(jpql,Products_Info.class);
		typedQuery.setParameter("category", category);
		return typedQuery.getResultList();
	}
	
	@Override
	public List<Products_Info> getProductByCompany(String company) {
		
		EntityManager manager = factory.createEntityManager();
		String jpql ="from Products_Info where company=:company";
		TypedQuery<Products_Info> typedQuery = manager.createQuery(jpql,Products_Info.class);
		typedQuery.setParameter("company", company);
		return typedQuery.getResultList();
	}

	@Override
	public boolean addProduct(Products_Info bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	

	@Override
	public boolean modifyProduct(Products_Info bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Products_Info p = manager.find(Products_Info.class,bean.getPid());
			p.setCategory(bean.getCategory());
			p.setName(bean.getName());
			p.setQuantity(bean.getQuantity());
			p.setPrice(bean.getPrice());
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	

}