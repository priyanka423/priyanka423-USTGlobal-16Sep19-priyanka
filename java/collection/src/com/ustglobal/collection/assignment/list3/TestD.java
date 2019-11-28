package com.ustglobal.collection.assignment.list3;

import java.util.ArrayList;

public class TestD {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		Student t1=new Student (1,"priya",101,"MCA","kumari");
		Student t2=new Student(2,"priyanka",102,"BCA","singh");
		Student t3=new Student(3,"priyansi",103,"MCA","kumari");
		al.add(t1);
		al.add(t2);
		al.add(t3);

		System.out.println("....... for loop...........");
		for(int i=0;i<al.size();i++) {
			Student c=al.get(i);
			System.out.println("id is "+c.id);
			System.out.println("name is "+c.name);
			System.out.println(" rollno is "+c.rollno);
			System.out.println(" dept name is "+c.dept);
			System.out.println(" last name is "+c.lname);
		}
		System.out.println(".... for each loop........");

		for(Student c1:al) {
			System.out.println("id is "+c1.id);
			System.out.println("name is "+c1.name);
			System.out.println(" rollno is "+c1.rollno);
			System.out.println(" dept name is "+c1.dept);
			System.out.println(" last name is "+c1.lname);	
		}
	}
}
