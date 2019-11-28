package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TestE {
	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(20);
		marks.add(23);
		marks.add(5);
		marks.add(12);
		marks.add(4);
		marks.add(60);
		marks.add(50);

		Comparator<Integer> cmp=(m1,m2)->{
			if(m1>m2) {
				return 1;
			}else if(m1<m2) {
				return -1;			
			}else {
				return 0;
			}
		};
		long noOffailedStudent=marks.stream().filter(i->i<40).count();
		System.out.println(noOffailedStudent);

		System.out.println("................");
		Integer i=marks.stream().min(cmp).get();
		System.out.println("Min value is "+i);

		System.out.println("........................");
		Integer j=marks.stream().max(cmp).get();
		System.out.println("Max value is "+j);
	}		
}

