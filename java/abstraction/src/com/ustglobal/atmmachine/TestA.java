package com.ustglobal.atmmachine;

public class TestA {
	public static void main(String[] args) {
		Machine m=new Machine();
		HDFC h=new HDFC();
		m.slot(h);

		ICICI i=new ICICI();
		m.slot(i);

		SBI s=new SBI();
		m.slot(s);
	}
}
