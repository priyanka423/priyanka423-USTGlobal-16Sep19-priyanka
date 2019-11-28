package com.ustglobal.lambdaexpression1;

public class TestA{
	public static void main(String[] args) {
		GreetInterface gt=(message)->{
			System.out.println("Hello");
			System.out.println(message);
		};
		gt.greet("priya");
	}

}
