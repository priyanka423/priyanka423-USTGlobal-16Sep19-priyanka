package com.ustglobal.collection.assignment.list3;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.30);
		al.add("true");
		al.add(null);
		al.add("priya");

		System.out.println("...... for loop............");
		for(int i=0;i<al.size();i++) {
			Object obj=al.get(i);
			System.out.println(obj);

		}

		System.out.println("........ for each loop..............");
		for(Object o:al) {
			System.out.println(o);
		}


	}
}
