package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {


		int[] nums= {10,20,30,40,50};
		//System.out.println(nums[9]);   // ArrayIndexOutOfBoundException


		receive(nums);
		System.out.println("============================");

		int[] values=getArray();
		for(int val:values) {
			System.out.println(val);
		}

		System.out.println("=============================");
		String[] s=stringArray();
		for(String i:s) {
			System.out.println(i);
		}

	}
	static void receive(int[] numbers) {

		for(int num:numbers) {
			System.out.println(num);
		}
	}
	static int[] getArray() {
		int[] values= {20,30,40,50};
		return values;
	}


	static String[] stringArray() {
		String[] s= {"pri","priyanka","priya"};
		return s;
	}
}
