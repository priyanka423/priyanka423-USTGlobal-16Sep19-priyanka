package com.ustglobal.beanobject.bean1;

public class Database {
	void receive(Employee e) {
		System.out.println("id is "+e.getId());
		System.out.println("name is "+e.getName());
		System.out.println("designation is "+e.getDesignation());
		System.out.println("salar is "+e.getSalary());
		System.out.println("dept is "+e.getDept());
	}

}
