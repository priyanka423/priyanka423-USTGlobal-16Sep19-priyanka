package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) {

		Predicate<Student> p=s1->{
			if(s1.percentage>=35) {
				return true;
			}else {
				return false;
			}
		};
		Student s1=new Student(1,"priya",40.56);
		boolean res=p.test(s1);
		System.out.println(" Result is "+res);
	}
}
