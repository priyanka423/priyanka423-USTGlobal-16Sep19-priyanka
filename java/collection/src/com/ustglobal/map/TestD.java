package com.ustglobal.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class TestD {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lh=new LinkedHashMap<String, Integer>();
		lh.put("Bangalore", 560068);
		lh.put("Patna", 888000);
		lh.put("Hariyana", 134203);

		for(Entry<String, Integer> m:lh.entrySet()) {
			String key=m.getKey();
			Integer value=m.getValue();
			System.out.println(" key is "+key+".......... "+"value "+value);
			System.out.println("........................");
		}
	}
}
