package com.ustglobal.practice;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		Predicate<Integer> p=age->{
			if(age>=18) {
				return true;
			}else {
				return false;
			}
		};
		boolean res=p.test(20);
		System.out.println(" Eligible for vote "+res);
	}
}
