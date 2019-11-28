package com.ustglobal.hashcode;

public class TestA {
	public static void main(String[] args) {
		Pen p=new Pen();
		int phashcode=p.hashCode();
		System.out.println("Hashcode of p "+phashcode);
	}
}
