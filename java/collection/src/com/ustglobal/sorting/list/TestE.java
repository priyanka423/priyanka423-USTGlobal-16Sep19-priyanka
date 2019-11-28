package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {
	public static void main(String[] args) {
		ArrayList<Pen> al=new ArrayList<Pen>();
		Pen p=new Pen(23000,"abc","red");
		Pen p1=new Pen(4000,"sdf","green");
		Pen p2=new Pen(45555,"hddd","pink");
		al.add(p);
		al.add(p1);
		al.add(p2);
		displayDetails(al);
		Collections.sort(al);
	}
	static void displayDetails(ArrayList<Pen> a) {
		Iterator<Pen> it=a.iterator();
		while(it.hasNext()) {
			Pen s=it.next();
			System.out.println("price is "+s.price);
			System.out.println("brand is "+s.brand);
			System.out.println("color is "+s.color);
		}
	}
}
