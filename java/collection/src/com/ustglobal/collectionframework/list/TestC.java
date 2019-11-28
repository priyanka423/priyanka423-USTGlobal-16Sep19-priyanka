package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(29.7);
		a1.add(true);
		a1.add("Good Evening");

		Iterator it=a1.iterator();
		Object o1=it.next();
		System.out.println("obj1 "+o1);

		Object o2=it.next();
		System.out.println("obj2  "+o2);

		Object o3=it.next();
		System.out.println("obj3 "+o3);


		Object o4=it.next();
		System.out.println("obj4 "+o4);

		boolean b=it.hasNext();// so it will use hashNext() that check the size of the array
		System.out.println("Has Next "+b);

		Object o5=it.next(); // here it will give the error IndexOutOfBoundException 
		System.out.println("obj5 "+o5);

		for(int i=0;i<a1.size();i++) {
			Object o=a1.get(i);
			System.out.println(o);
		}
	}
}
