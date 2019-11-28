package com.ustglobal.map;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {

		HashMap hm=new HashMap();
		hm.put("kuku",998014);
		hm.put("mala",875432);
		hm.put("sheela",973456);

		HashMap hm1=new HashMap();
		hm1.put("deepu",789099);
		hm1.put("riya", 678909);
		hm1.put("kriti", 467787);

		boolean hashkey=hm.containsKey("mala");
		System.out.println(" has key "+hashkey);

		boolean hasValue=hm.containsValue("467787");
		System.out.println(" has value "+hasValue);

		hm.putAll(hm1);
		System.out.println("After put all "+hm);

		System.out.println(hm.size());

		boolean isEmpty=hm.isEmpty();
		System.out.println(" Map is emplty "+isEmpty);

		hm.clear();
		System.out.println("After clear"+hm);
	}
}
