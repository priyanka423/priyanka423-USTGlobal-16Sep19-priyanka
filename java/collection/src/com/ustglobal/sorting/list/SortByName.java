package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByName implements Comparator<Bank> {

	public int compare(Bank o1, Bank o2) {
		String s=o1.name;
		String t=o2.name;

		return s.compareTo(t);
	}

}
