package com.ustglobal.beanobject.bean1;

public class TestA {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(10);
		e.setDept(102);
		e.setName("priyanka");
		e.setDesignation("Software_developer");
		e.setSalary(100000);

		Database d=new Database();
		d.receive(e);
	}
}
