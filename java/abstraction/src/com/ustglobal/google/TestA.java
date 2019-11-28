package com.ustglobal.google;

public class TestA {
	public static void main(String[] args) {
		Browser b=new Browser();
		Google q=new Gmail();
		b.open(q);
		Google s=new GoogleDrive();
		b.open(s);
	}
}
