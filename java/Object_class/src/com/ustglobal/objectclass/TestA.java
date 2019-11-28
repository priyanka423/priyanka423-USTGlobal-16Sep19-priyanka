package com.ustglobal.objectclass;

public class TestA {
	public static void main(String[] args) {
		Pendrive p=new Pendrive();
		USBPart.connect(p);

		Mouse m=new Mouse();
		USBPart.connect(m);
	}
}
