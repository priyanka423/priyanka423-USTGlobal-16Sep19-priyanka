package com.ustglobal.scanner;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Scanner Class");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Age is "+age);

		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("name is "+name);
	}
}
