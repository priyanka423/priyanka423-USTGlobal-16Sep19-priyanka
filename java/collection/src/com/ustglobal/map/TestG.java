package com.ustglobal.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {

		Employee e1=new Employee(1,"priya",34000);
		Employee e2=new Employee(2,"pri",37000);
		Employee e3=new Employee(4,"priyanka",34345);
		Employee e4=new Employee(5,"priyansi",24000);
		Employee e5=new Employee(67,"piyush",23000);
		Employee e6=new Employee(89,"priyansu",30000);
		Employee e7=new Employee(2,"manish",10000);
		Employee e8=new Employee(56,"prity",90000);
		Employee e9=new Employee(3,"beauty",1000);
		Employee e10=new Employee(9,"sushant",50000);

		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);

		ArrayList<Employee> al1=new ArrayList<Employee>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);

		ArrayList<Employee> al2=new ArrayList<Employee>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);
		al2.add(e10);

		HashMap<String, ArrayList<Employee>> hm=new HashMap<>();
		hm.put("first",al);
		hm.put("second",al1);
		hm.put("third",al2);

		ArrayList<Employee> second=hm.get("second");

		Iterator<Employee> it=second.iterator();
		while(it.hasNext()) {
			Employee s=it.next();
			System.out.println(" id is "+s.id);
			System.out.println(" name is "+s.name);
			System.out.println(" salary is "+s.salary);




		}
	}
}
