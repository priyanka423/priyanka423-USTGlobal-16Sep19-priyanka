package com.ustglobal.java8features;

import java.util.function.Consumer;

public class TestA {
	public static void main(String[] args) {

		Consumer<Student> c=s->{
			System.out.println("Id is "+s.id);
			System.out.println(" name is "+s.name);
			System.out.println(" percentage is "+s.percentage);
		};
		Student s1=new Student(1,"priya",70.88);
		c.accept(s1);
	}
}
