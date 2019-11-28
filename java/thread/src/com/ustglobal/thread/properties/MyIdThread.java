package com.ustglobal.thread.properties;

public class MyIdThread extends Thread{

	public static void main(String[] args) {
		System.out.println("Main Started");
		System.out.println(Thread.currentThread().getId());

		MyIdThread mi=new MyIdThread();
		System.out.println("myId thread "+mi.getId());

		System.out.println("priority "+Thread.currentThread().getId());

		//		Thread.currentThread().setPriority(16); // when we give the priority more 
		//		than 10 than it gives the error IllegalArgumentException

		System.out.println("Main ended");
	}
}
