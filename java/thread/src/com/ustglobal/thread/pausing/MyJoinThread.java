package com.ustglobal.thread.pausing;

public class MyJoinThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child tread");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
