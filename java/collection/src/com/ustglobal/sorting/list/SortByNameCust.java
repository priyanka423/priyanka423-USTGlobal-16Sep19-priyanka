package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByNameCust implements Comparator<Customer>{

	public int compare(Customer c1, Customer c2) {
		String s=c1.name;
		String s1=c2.name;
		return s.compareTo(s1);
	}
}
