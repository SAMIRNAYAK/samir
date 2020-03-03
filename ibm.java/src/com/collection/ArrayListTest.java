package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testArrayList();
	}
private static void testArrayList() {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("ABC");
		arrayList.add("PQR");
		arrayList.add("LMN");
		arrayList.add("XYZ");
		
		Iterator<String> itr = arrayList.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		for(int i=(arrayList.size()-1);i>=0;i--) {
			System.out.println(arrayList.get(i));
		}
	}
}
