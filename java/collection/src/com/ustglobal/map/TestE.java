package com.ustglobal.map;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {

		TreeMap<String,Integer> lh=new TreeMap<String,Integer>();
		lh.put("Bangalore", 560068);
		lh.put("Patna", 888000);
		lh.put("Hariyana", 134203);

		//	lh.put(null,676443); // NullPointerException

		for(Map.Entry<String,Integer> m:lh.entrySet()) {
			String key=m.getKey();
			Integer value=m.getValue();
			System.out.println(" key is "+key);
			System.out.println(" value is "+value);
		}
	}
}
