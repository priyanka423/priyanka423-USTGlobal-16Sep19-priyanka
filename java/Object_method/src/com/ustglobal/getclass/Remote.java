package com.ustglobal.getclass;

public class Remote {
	void add() {
		System.out.println("add() method");
	}
	public static void main(String agr[]) throws InstantiationException, IllegalAccessException {
		Remote r=new Remote();
		Class c=r.getClass();
		Object o=c.newInstance();
		Remote q=(Remote)o;
		q.add();
	}
}
