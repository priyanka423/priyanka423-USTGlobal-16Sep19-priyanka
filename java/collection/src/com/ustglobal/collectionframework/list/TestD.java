package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestD {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(29.7);
		a1.add(true);
		a1.add("Good Evening");

		System.out.println("==== USING iterator============");
		Iterator it=a1.iterator();
		while(it.hasNext()) {
			Object o1=it.next();
			System.out.println(o1);
		}

		//		System.out.println("======= for loop ");
		//		for(;it.hasNext();) {
		//			Object ob=it.next();
		//			System.out.println(ob);
		//	}
	}

}
