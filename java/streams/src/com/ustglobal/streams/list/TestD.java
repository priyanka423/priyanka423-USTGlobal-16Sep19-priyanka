package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestD {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(23);
		al.add(5);
		al.add(12);
		al.add(4);
		al.add(60);
		al.add(50);

		System.out.println("Before adding "+al);
		List<Integer> l=
				al.stream().map(i->i+50).collect(Collectors.toList());
		for(Integer i:l) {
			System.out.println(" after adding "+i);
		}

	}
}

