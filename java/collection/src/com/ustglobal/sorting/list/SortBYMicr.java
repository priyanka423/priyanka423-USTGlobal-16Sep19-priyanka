package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortBYMicr implements Comparator<Bank> {
	public int compare(Bank b1, Bank b2) {
		Long i=b1.micr;
		Long l=b2.micr;
		return i.compareTo(l);

	}

}
