package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen>{
	double price;
	String brand;
	String color;
	public Pen(double price, String brand, String color) {
		super();
		this.price = price;
		this.brand = brand;
		this.color=color;
	}

	//public int compareTo(Pen p) {
	//	if(this.price>p.price) {
	//		return 1;
	//	}else if(this.price<p.price) {
	//		return -1;
	//	}
	//	else {
	//		return 0;
	//	}
	//}

	public int compareTo(Pen p) {
		String o=this.color;
		String q=p.color;
		return o.compareTo(q);

	}

}
