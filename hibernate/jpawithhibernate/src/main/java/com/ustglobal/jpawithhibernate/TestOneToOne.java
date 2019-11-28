package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibrnate.onetoone.Person;
import com.ustglobal.jpawithhibrnate.onetoone.VoterCard;

public class TestOneToOne {
	public static void main(String[] args) {
		VoterCard vc=new VoterCard();
		vc.setVid(10);
		vc.setVname("Ram");

		Person p=new Person();
		p.setId(1);
		p.setPname("Ram");
		p.setVotercard(vc);

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;

		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			VoterCard vCard=entityManager.find(VoterCard.class, 10); // bidirectional
			System.out.println(vCard.getPerson().getId()); // bidirectional
			System.out.println(vCard.getPerson().getPname());
			//		entityManager.persist(p); // unidirectional
			System.out.println("Record Saved");
			entityTransaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
