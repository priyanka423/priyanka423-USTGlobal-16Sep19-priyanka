package com.ustglobal.assignment2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.assignment2.dto.Student;

public class ReadQuery {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test1"); // here it will give the same name as <persistence-unit> like test //
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student productDetail=entityManager.find(Student.class,1);
		System.out.println("ID: "+productDetail.getSid());
		System.out.println("Age: "+productDetail.getAge());
		System.out.println("Name: "+productDetail.getSname());
	}
}
