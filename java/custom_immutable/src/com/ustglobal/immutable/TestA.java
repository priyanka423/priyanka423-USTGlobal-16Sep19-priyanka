package com.ustglobal.immutable;

public class TestA {
	public static void main(String[] args) {
		MyString ms=new MyString(12,"renu");
		System.out.println(ms.getname());
		System.out.println(ms.getRollNo());
		System.out.println(ms);

		MyString ms1=ms.changeContent(20,"ranuka");
		System.out.println(ms.getname());
		System.out.println(ms.getRollNo());

		System.out.println("===================");

		System.out.println(ms1.getname());
		System.out.println(ms1.getRollNo());

	}
}
