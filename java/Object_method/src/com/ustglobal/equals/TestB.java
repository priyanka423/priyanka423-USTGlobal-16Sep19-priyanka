package com.ustglobal.equals;

public class TestB {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"pri",1000);
		Employee e2=new Employee(2,"anu",2000);
		Employee e3=new Employee(3,"pri",1000);

		Employee e4=e3;
		boolean isEqual=e1.equals(e2);
		String s=e1.toString();
		System.out.println(s);
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println(isEqual);

	}
}
