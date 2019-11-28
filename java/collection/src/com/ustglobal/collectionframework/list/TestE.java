package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestE {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(45.6);
		al.add("yash");
		al.add(true);

		ListIterator li=al.listIterator();
		System.out.println("=========================> Forward =========");
		while(li.hasNext()) {
			Object o=li.next();
			System.out.println(o);
		}

		System.out.println("=========================> Backward =========");
		while(li.hasPrevious()) {
			Object o1=li.previous();
			System.out.println(o1);
		}


	}
}
