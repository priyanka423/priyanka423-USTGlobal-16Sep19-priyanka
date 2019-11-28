package com.ustglobal.typecasting.primitive;

public class TestA {
	public static void main(String[] args) {

		byte a=10;
		int b=a; //implicit type casting
		System.out.println("b is "+b);
		int p=20;
		double q=p;
		System.out.println("q is "+q);

		System.out.println("***********");

		double x=100.43;
		int y=(int)x;// Explicit type casting 
		System.out.println("y is "+y);
		byte z=(byte)x;
		System.out.println("z is "+z);
		char c=(char) x;
		System.out.println("c is "+c);

	}
}
