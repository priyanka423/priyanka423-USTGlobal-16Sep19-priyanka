package com.ustglobal.hashcodetostring;

public class Test {
	public static void main(String[] args) {
		Mraker m=new Mraker();
		int h=m.hashCode();
		String s=m.toString();
		System.out.println(h);
		System.out.println(s);
	}
}
