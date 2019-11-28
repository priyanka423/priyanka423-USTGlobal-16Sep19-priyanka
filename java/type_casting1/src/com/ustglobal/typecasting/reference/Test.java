package com.ustglobal.typecasting.reference;

public class Test {
	public static void main(String[] args) {
		//upcasting
		Pen p1=new Marker(); //Upcasting
		System.out.println(p1.cost);
		p1.write();
		//System.out.println(p1.size);// Not possible
		//p1.color();// not possible

		//Downcasting
		Marker m=(Marker) p1;//Downcasting
		System.out.println(m.size);
		m.write();
		m.color();

	}

}
