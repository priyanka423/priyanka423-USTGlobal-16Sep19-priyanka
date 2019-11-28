package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {

		TreeSet ts=new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(12);
		ts.add(9);
		ts.add(39);

		// not supported non generics type//
		//	ts.add("priya"); // will throw ClassCastException so it will only accept only generics//
		//	ts.add(null);// NULLPointerException

		System.out.println("******** using for each loop**************");
		for(Object t:ts) {
			System.out.println(t);
		}

		System.out.println("****** using iterator**************");
		Iterator it=ts.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println(o);
		}
	}
}
