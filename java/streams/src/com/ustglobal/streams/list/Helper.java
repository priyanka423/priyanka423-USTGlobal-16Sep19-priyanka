package com.ustglobal.streams.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Helper {
	void displayAllStudent(ArrayList<Student> al) {

		Iterator<Student> it=al.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println("Id is "+s.id);
			System.out.println(" name is "+s.name);
			System.out.println(" percentage is "+s.percentage);
			System.out.println(".......................");
		}
	}

	// for failed student// 
	void displayFailedStudent(ArrayList<Student> al) {
		List<Student> l=al.stream().filter(student->student.percentage<40)
				.collect(Collectors.toList());

		Iterator<Student> it=l.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println("Id is "+s.id);
			System.out.println(" name is "+s.name);
			System.out.println(" percentage is "+s.percentage);
			System.out.println(".......................");
		}
	}

	// for passed student//

	void displayPassedStudent(ArrayList<Student> al) {
		List<Student> l=al.stream().filter(student->student.percentage>=40)
				.collect(Collectors.toList());

		Iterator<Student> it=l.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println("Id is "+s.id);
			System.out.println(" name is "+s.name);
			System.out.println(" percentage is "+s.percentage);
			System.out.println(".......................");
		}
	}

	// for topper of the class//

	void displayTopperStudent(ArrayList<Student> al) {
		Comparator<Student> cmp=(c1,c2)->{
			if(c1.percentage>c2.percentage) {
				return 1;
			}else if(c1.percentage<c2.percentage) {
				return -1;
			}else {
				return 0;
			}
		};

		Student l=al.stream().max(cmp).get();

		//	Iterator<Student> it=l.iterator();
		//	while(it.hasNext()) {
		//		Student s=it.next();
		System.out.println("Id is "+l.id);
		System.out.println(" name is "+l.name);
		System.out.println(" percentage is "+l.percentage);
		System.out.println(".......................");
	}

}
