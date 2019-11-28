package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import com.ustglobal.sorting.list.Employee;

public class TestG {
	public static void main(String arg[]) {


		//Sorted by height using lambda expression//

		//	Comparator<Employee1> comp=(e1,e2)->{
		//		if(e1.height>e2.height) {
		//			return 1;
		//		}else if(e1.height<e2.height) {
		//			return -1;
		//		}else {
		//			return 0;
		//		}
		//	};
		//	

		// sorted by name by using lambda expression//

		//	Comparator<Employee1> comp=(e1,e2)->{
		//		String n=e1.name;
		//		String p=e2.name;
		//		return n.compareTo(p);
		//	};

		// sorted by id using lambda expression//

		Comparator<Employee1> comp=(e1,e2)->{
			if(e1.id>e2.id) {
				return 1;
			}else if(e1.id<e2.id) {
				return -1;
			}else {
				return 0;
			}
		};

		TreeSet<Employee1> ts=new TreeSet<Employee1>(comp);
		Employee1 e1=new Employee1("niki",4,5.6);
		Employee1 e2=new Employee1("baskar",1,5.2);
		Employee1 e3=new Employee1("suresh",5,5.1);
		Employee1 e4=new Employee1("dinesh",2,4.5);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		System.out.println("............................ using iterator................");
		Iterator<Employee1> it=ts.iterator();
		while(it.hasNext()) {
			Employee1 e=it.next();
			System.out.println(" name is "+e.name);
			System.out.println(" id  is "+e.id);
			System.out.println(" height is "+e.height);

		}
	}
}
