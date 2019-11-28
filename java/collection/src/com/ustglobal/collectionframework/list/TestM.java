package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestM {
	public static void main(String[] args) {

		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(12);
		l.add(13);
		l.add(34);
		l.add(3);
		l.add(10);
		//		add(null); // here it will not write null because it will throw NullPointerException 

		System.out.println("Before sort "+l);
		Collections.sort(l);
		System.out.println("After sort "+l);

		Collections.reverse(l);
		System.out.println("After Reverse "+l);

		Collections.shuffle(l);
		System.out.println("After Shuffle "+l);
	}
}


