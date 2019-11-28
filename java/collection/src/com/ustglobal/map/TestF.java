package com.ustglobal.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {

		Student s1=new Student(2,"divya",67.89);
		Student s2=new Student(4,"priya",70.44);
		Student s3=new Student(7,"ambika",39.66);
		Student s4=new Student(56,"Priyanka",89.66);
		Student s5=new Student(34,"rahul",49.33);
		Student s6=new Student(23,"manish",32.00);
		Student s7=new Student(45,"priyansi",90.33);
		Student s8=new Student(11,"ankit",39.32);
		Student s9=new Student(8,"janvi",67.56);

		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);

		ArrayList<Student> al1=new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);

		ArrayList<Student> al2=new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);

		HashMap<String, ArrayList<Student>> hm=new HashMap<>();
		hm.put("first",al);
		hm.put("second",al1);
		hm.put("third",al2);

		ArrayList<Student> first=hm.get("second");
		Iterator<Student> it=first.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(" id is "+s.id);
			System.out.println(" name is "+s.name);
			System.out.println("percentage is "+s.percentage);
			System.out.println(".....................");
		}
	}

}
