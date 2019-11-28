package com.ustglobal.thread.defining;

public class Test {
	public static void main(String[] args) {
		System.out.println("Main started");

		MyThread t1=new MyThread();

		/*
		 * don't call run(). it behaves like normal program All code will be executed
		 * inside the main thread only
		 */
		//		t1.run();

		t1.start();

		//		t1.start(); // IllegalThreadStartExceptio

		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
		System.out.println("Main ended");

	}
}

