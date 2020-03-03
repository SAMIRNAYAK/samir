package com.collection;

import java.util.HashMap;
import java.util.Map;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testHashMap();
	}
	private static void testHashMap() {
		Map<String, String> ht = 
				new HashMap<String, String>();
		ht.put("A", "Anand");
		ht.put("B", "Bipin");
		ht.put("C", "Chandan");
		ht.put("D", "Dawood");
		ht.put("E", null);
		
		String name = ht.get("D");
	}
}
