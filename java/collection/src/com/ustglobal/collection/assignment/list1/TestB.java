package com.ustglobal.collection.assignment.list1;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestB {
	public static void main(String[] args) {
		Vector<Employee> al=new Vector<Employee>();
		Employee e1=new Employee(1,"priya",100000);
		Employee e2=new Employee(2,"priyanka",2000000);
		Employee e3=new Employee(3,"priyanksi",300000);
		al.add(e1);
		al.add(e2);
		al.add(e3);

		System.out.println("............. for loop...............");

		for(int i=0;i<al.size();i++){
			Employee e=al.get(i);
			System.out.println("id is "+e.id);
			System.out.println("name is "+e.name);
			System.out.println("salary is "+e.salary);

		}

		System.out.println("...........for each.....................");

		for(Employee e4:al) {
			System.out.println("id is "+e4.id);
			System.out.println("name is "+e4.name);
			System.out.println("salary is "+e4.salary);
		}

		System.out.println("....... using iterator.............");

		Iterator it=al.iterator();
		while(it.hasNext()) {
			Employee o=(Employee) it.next();
			System.out.println("id is "+o.id);
			System.out.println("name is "+o.name);
			System.out.println("salary is "+o.salary);
		}

		System.out.println("..... using list iteraor................");
		ListIterator lt=al.listIterator();
		while(lt.hasNext()) {
			Employee o1=(Employee) lt.next();
			System.out.println("id is "+o1.id);
			System.out.println("name is "+o1.name);
			System.out.println("salary is "+o1.salary);

		}

		System.out.println("............... using iterator backward........ ");
		while(lt.hasPrevious()) {
			Employee o=(Employee) lt.previous();
			System.out.println("id is "+o.id);
			System.out.println("name is "+o.name);
			System.out.println("salary is "+o.salary);
		}
	}
}
