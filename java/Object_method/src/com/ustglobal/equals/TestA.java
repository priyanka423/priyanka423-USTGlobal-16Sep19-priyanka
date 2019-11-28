package com.ustglobal.equals;

public class TestA {
	public static void main(String[] args) {
		Cow c1=new Cow(1,"ganga",1000);
		Cow c2=new Cow(2,"gowri",2000);
		Cow c3=new Cow(3,"ganga",1000);
		Cow c4=c3;
		//	System.out.println(c1.hashCode());
		//	System.out.println(c3.hashCode());
		//	System.out.println(c4.hashCode());

		boolean isEqual=c1.equals(c2);
		System.out.println(c1.equals(c3));
		System.out.println(c3.equals(c4));
		System.out.println(isEqual);
	}
}
