package com.ustglobal.hasarelation.weak;

public class TestA {
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p.name);
		p.sleep();
		p.eat();
		p.m.write();//  Has-A Relation // Association

	}
}
