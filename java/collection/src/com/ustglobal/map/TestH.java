package com.ustglobal.map;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {

		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(101, "vijay");
		ht.put(102, "priya");
		ht.put(100, "pri");
		ht.put(99, "manish");
		ht.put(101, "sriram");
		ht.put(105, "john");
		ht.put(208, "sri");
		//	ht.put(null, "vijay"); // NullPointerException
		//	ht.put(1011, null); // NullPointerException

		System.out.println(" Data is  "+ht);

	}
}
