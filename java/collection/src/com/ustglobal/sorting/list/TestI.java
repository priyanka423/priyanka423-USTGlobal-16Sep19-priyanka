package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		//	SortByName sb=new SortByName();
		//	SortByPincode sn=new SortByPincode();
		SortBYMicr sm=new SortBYMicr();

		TreeSet<Bank> ts=new TreeSet<Bank>(sm);
		Bank b1=new Bank("HDFC",560068,678999);
		Bank b2=new Bank("UCO", 593300,788999);
		Bank b3=new Bank("SBI",560076,356678);
		Bank b4=new Bank("SBI",560076,356678);

		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);

		System.out.println("********** using iterator***********");
		Iterator<Bank> it=ts.iterator();
		while(it.hasNext()) {
			Bank b=it.next();
			System.out.println("name is "+b.name);
			System.out.println(" pincode is "+b.pincode);
			System.out.println(" Micr is "+b.micr);
			System.out.println("..............");
		}
	}
}
