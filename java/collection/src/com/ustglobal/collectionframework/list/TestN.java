package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestN {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("girija");
		al.add("vanja");
		al.add("jalja");
		al.add("kiran");

		System.out.println("Befors Sort "+al);
		Collections.sort(al);
		System.out.println("After Sort "+al);
	}
}
