package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByPincode implements Comparator<Bank> {
	
	public int compare(Bank b1, Bank b2) {
		Integer i=b1.pincode;
		Integer f=b2.pincode;
		return i.compareTo(f);
		
	}

}
