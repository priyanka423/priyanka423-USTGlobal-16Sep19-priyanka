package com.ustglobal.tostring1;

public class TestB {
	public static void main(String[] args) {
		//1st object

		Car c=new Car(10000000,"BMW","orange");
		int hashcode=c.hashCode();
		System.out.println("overrident is "+hashcode);
		System.out.println(c);

		//2nd object
		Car c1=new Car(2000000,"Maruti_Suzuki","pink");
		int hashcode1=c1.hashCode();
		System.out.println("overrident is "+hashcode1);
		System.out.println(c1);
	}


}
