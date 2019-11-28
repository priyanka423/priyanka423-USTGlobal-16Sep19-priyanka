package com.ustglobal.tostring;

public class TestA {
	public static void main(String[] args) {
		Student s=new Student(10,"priya",70.98);
		int hash=s.hashCode();
		System.out.println("Overriden hashcode is"+hash);
		System.out.println(s);
	}
}
