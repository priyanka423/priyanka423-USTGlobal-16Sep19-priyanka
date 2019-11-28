package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] nums=new int[5];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=50;
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}

		System.out.println("=======FOR EACH LOOP=============");
		for(int i:nums) {
			System.out.println(i);
		}

		System.out.println("=====================");
		char[] ch= {'a','b','c','d'};
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println("===========================");
		for(int c:ch) {
			System.out.println(c);
		}

		System.out.println("==================================");
		boolean[] b= {true,false,true,false,false,true};
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}

		System.out.println("=================================");
		for(boolean i: b) {
			System.out.println(i);
		}
		System.out.println("=====================");
		double[] d= {10.22,20.33,30.44,22.00};
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}

		System.out.println("==========================");
		for(double i:d) {
			System.out.println(i);
		}

		System.out.println("=======================");
		byte[] b1= {0,1,4,5,6,8};
		for(int i=0;i<b1.length;i++) {
			System.out.println(b1[i]);
		}

		System.out.println("=======================");
		for(byte i:b1) {
			System.out.println(i);
		}
		System.out.println("========String ===============");
		String[] name= {"pri","priya","priyanka"};
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}

		System.out.println("=======================");
		for(String s:name) {
			System.out.println(s);
		}


	}
}
