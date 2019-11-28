package com.ustglobal.lambdaexpression3;

public class TestA {
	public static void main(String[] args) {
		FactorialInterface f=(x)->{
			int fact=1;
			for(int i=2;i<=x;i++) {
				fact=fact*i;
			}
			return fact;
		};
		int factTotal=f.factorial(5);
		System.out.println("factorial is "+factTotal);
	}
}
