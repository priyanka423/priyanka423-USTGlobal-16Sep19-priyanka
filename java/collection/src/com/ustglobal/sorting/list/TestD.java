package com.ustglobal.sorting.list;

import java.util.Stack;

public class TestD {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.add(12);
		s.push(23);
		s.push(45);

		System.out.println("Using get()............");
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		System.out.println(" Using pop().........");
		int j=s.size();
		for(int i=0;i<j;i++) {
			System.out.println(s.pop());
		}

	}
}
