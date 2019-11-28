package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("roopa");
		ts.add("jaya");
		ts.add("sushma");
		ts.add("munni");
		ts.add("sheela");

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
