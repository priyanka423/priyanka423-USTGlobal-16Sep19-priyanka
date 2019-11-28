package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestG {
	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		al.add("Anupama");
		al.add("Kajal");
		al.add("Sabita");
		al.add("Priyanka");
		al.add("Pria");

		String name=al.get(0);
		System.out.println(name.toUpperCase());

		System.out.println("===========Using iterator============n");
		Iterator<String> li=al.iterator();
		while(li.hasNext()) {
			String s=li.next();
			System.out.println(s);
		}

		System.out.println("========================== Using list iterator========");
		ListIterator<String> li1=al.listIterator();
		while(li1.hasNext()) {
			String s=li1.next();
			System.out.println(s);
		}

		System.out.println("=======Using For Each Loop=======");

		for(String n:al) {
			System.out.println(n);
		}


	}
}
