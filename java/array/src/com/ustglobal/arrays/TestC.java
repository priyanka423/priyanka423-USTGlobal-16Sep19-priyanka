package com.ustglobal.arrays;

public class TestC {
	public static void main(String[] args) {
		Student s=new Student(1,"pri",50.56);
		Student s1=new Student(2,"priya",70.55);
		Student s2=new Student(3,"priytanka",80.59);

		Student[] students=new Student[3];
		students[0]=s;
		students[1]=s1;
		students[2]=s2;

		for(Student s5:students) {
			System.out.println(s5);
		}
		receive(students);

	}
	static void receive(Student[] stu) {
		for(Student s5:stu) {
			System.out.println(s5);
		}
	}

}

