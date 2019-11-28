package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {
	public static void main(String[] args) {

		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(12);
		pq.add(24);
		pq.add(35);
		pq.add(35);
		pq.offer(1);
		//	pq.add("hello"); ClassCastException // only generics type
		//	pq.add(null); // NullPointerException

		System.out.println("********** using iterator********");
		System.out.println(" before poll "+pq);
		Iterator <Integer> it=pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());

		}
		System.out.println(" After poll "+pq);
	}
}
