package com.ustglobal.accessmodifier.pkg1;

import com.ustglobal.accessmodifier.pkg2.Demo;

public class Sample extends Demo{
	public static void main(String[] args) {


		Demo d = new Demo();
		/*
		 * System.out.println(d.a); // not possible
		 */
		//Default
		/*
		 * System.out.println(d.b);
		 */		
		Sample s=new Sample();
		//Protected
		System.out.println(s.c);
		s.mul();

		//public
		System.out.println(d.name);
		d.div();
	}


}
