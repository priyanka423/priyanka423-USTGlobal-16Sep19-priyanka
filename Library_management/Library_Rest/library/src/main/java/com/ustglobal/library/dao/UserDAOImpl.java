package com.ustglobal.library.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.library.dto.BookInventoryBean;
import com.ustglobal.library.dto.BookIssuedBean;
import com.ustglobal.library.dto.UserBean;

@Repository
public class UserDAOImpl implements UserDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean registerUser(UserBean bean) {
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
			entityTransaction.begin();
			entityManager.persist(bean);
			entityTransaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public UserBean login(String email, String password) {
		String jpql="from UserBean where email=:email and password=:pass";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<UserBean> query=manager.createQuery(jpql,UserBean.class);
		query.setParameter("email", email);
		query.setParameter("pass", password);
		try {
			UserBean bean=query.getSingleResult();
			return bean;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
			
		}

	}

	@Override
	public boolean updatePage(UserBean bean) {

		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		UserBean userBean=manager.find(UserBean.class,bean.getUser_id());
		userBean.setName(bean.getName());
		userBean.setPhone(bean.getPhone());
		transaction.commit();
		return true;
	}
//
	@Override
	public BookIssuedBean requestBook(int user_id,BookIssuedBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		BookIssuedBean bean1=manager.find(BookIssuedBean.class,bean.getBook_issued_id());
		transaction.commit();
		return bean;
	}

	@Override
	public UserBean getUserData(int user_id) {
		EntityManager entityManager=factory.createEntityManager();
		UserBean bean=entityManager.find(UserBean.class,user_id);
		return bean;
	}


	@Override
	public BookInventoryBean searchBook(int book_inventory_id) {
		EntityManager manager=factory.createEntityManager();
		BookInventoryBean bean=manager.find(BookInventoryBean.class,book_inventory_id);
		return bean;
	}

	public boolean chnagePassword(UserBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		UserBean bean1=manager.find(UserBean.class,bean.getUser_id());
		bean1.setPassword(bean.getPassword());
		transaction.commit();
		return true;
			
		}
	

	@Override
	public boolean deleteRecord(int user_id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		UserBean bean=manager.find(UserBean.class,user_id);
		manager.remove(bean);
		transaction.commit();
		return true;
	}


}
