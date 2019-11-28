package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(12);
		l.add(13);
		l.add(45);
		l.add(34);
		Integer peekElement=l.peek();
		System.out.println("peek element "+peekElement);
		Integer peekFirstEle=l.peekFirst();
		System.out.println("first peek element "+peekFirstEle);
		Integer peekLastEle=l.peekLast();
		System.out.println("last peek  element "+peekLastEle);
		System.out.println("After peek..... "+l);

		System.out.println("=====================");

		Integer pollElement=l.poll();
		System.out.println("Poll Element "+pollElement);
		Integer pollFirstEle=l.pollFirst();
		System.out.println("poll first element "+pollFirstEle);
		Integer pollLastEle=l.pollLast();
		System.out.println("poll last element "+pollLastEle);
		System.out.println("===========After poll=================");

		l.push(12);
		System.out.println("after push "+l);
		Integer p=l.pop();
		System.out.println(p);
		System.out.println("after pop "+l);


	}
}
