package com.ustglobal.sorting.list;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	public static void main(String[] args) {

		SortByNameCust sc=new SortByNameCust();
		TreeSet<Customer> ts=new TreeSet<Customer>(sc);
		Customer c1=new Customer("priya",1,200000);
		Customer c2=new Customer("priyanka",2,300000);
		Customer c3=new Customer("mriyansi",3,500000);
		Customer c4=new Customer("kriyansu",4,400000);

		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);


		System.out.println("********** using iterator***********");
		Iterator<Customer> it=ts.iterator();
		while(it.hasNext()) {
			Customer b=it.next();
			System.out.println("name is "+b.name);
			System.out.println(" pincode is "+b.id);
			System.out.println(" Micr is "+b.salary);
			System.out.println("..............");
		}

	}
}
