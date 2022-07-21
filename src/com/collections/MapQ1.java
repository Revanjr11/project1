package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapQ1 {

	public static void main(String[] args) {
		
		
		Map<Integer, String> mp = new LinkedHashMap<>();
		
		
		mp.put(1, "ramesh");
		mp.put(2, "ram");
		mp.put(3, "ravi");
		mp.put(4, "sathish");
		mp.put(5, "234rf");
	
	
	Set<Entry<Integer, String>> entrySet = mp.entrySet();
		
	for (Entry<Integer, String> x : entrySet) {
		
		  String value = x.getValue();
		System.out.println(value);
	}
	
	
	}
}
