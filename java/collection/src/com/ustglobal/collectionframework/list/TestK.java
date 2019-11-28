package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestK {
	public static void main(String[] args) {

		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(10,"priya",80.98);
		Student s2=new Student(20,"priyanka",60.78);
		Student s3=new Student(30,"Tiger",80.90);
		al.add(s1);
		al.add(s2);
		al.add(s3);

		for(int i=0;i<al.size();i++) {
			Student s=al.get(i);
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.percentage);
		}
		System.out.println("===========================");
	}
}
