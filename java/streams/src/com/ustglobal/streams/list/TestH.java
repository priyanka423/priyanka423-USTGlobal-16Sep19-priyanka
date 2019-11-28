package com.ustglobal.streams.list;

import java.util.ArrayList;

public class TestH {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(5,"priya",80.55));
		al.add(new Student(4,"priyansi",35.55));
		al.add(new Student(9,"priyanka",37.55));
		al.add(new Student(2,"pri",70.55));
		al.add(new Student(1,"riya",30.55));

		Helper h=new Helper();
		//		h.displayAllStudent(al);
		//		h.displayFailedStudent(al);
		//		h.displayPassedStudent(al);
		h.displayTopperStudent(al);




	}
}
