package com.ustglobal.didemo.dao.impl;

import com.ustglobal.didemo.dao.I;

public class A implements I{

	@Override
	public void m1() {
		System.out.println("executing m1 using A");
	}
	
	@Override
	public void m2() {
		System.out.println("executing m2 using A");
	}
	
	@Override
	public void m3() {
		System.out.println("executing m3 using A");
	}
}
