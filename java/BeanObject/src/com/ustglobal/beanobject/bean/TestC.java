package com.ustglobal.beanobject.bean;

public class TestC {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(10);
		s1.setName("priyanka");
		s1.setRollno(20);

		Database d=new Database();
		d.receive(s1);
	}
}
