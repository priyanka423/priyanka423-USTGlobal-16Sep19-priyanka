package com.ustglobal.map;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("kuku",998014);
		hm.put("mala",875432);
		hm.put("sheela",973456);
		hm.put(null,766544);
		hm.put(null,788544);
		System.out.println(" data is "+hm);

		hm.put("mala", 876544);
		System.out.println(" After modify "+hm);

		hm.put("dimple", 876544);
		System.out.println(" after dimple "+hm);

		System.out.println(" After null "+hm);
		System.out.println("..................");
		System.out.println("After adding duplicate null");
		System.out.println(hm);
		System.out.println("....................");

		Object phoneno=hm.get("sheela");
		System.out.println("value"+ phoneno);

		System.out.println("..............");

		Object phoneno1=hm.get("she");
		System.out.println("value "+phoneno1);
		System.out.println("....................");

		Object value=hm.remove("kuku");
		System.out.println("value "+value);

		System.out.println(" after remove "+hm);

	}
}
