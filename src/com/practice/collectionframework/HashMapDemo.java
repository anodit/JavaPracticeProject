package com.practice.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Monika", 27);
		map.put("Mohit", 25);
		map.put("Rohit", 19);
		map.put("Arpan", 15);
		map.put("Ranjan", 10);
		map.put("Monika", 27);
		map.put("Mohit", 25);
		map.put("Rohit", 19);
		map.put("Arpan", 15);
		map.put("", 20);
		map.put("m",null);
		map.put("n",null);
		
		System.out.println("Map is -> "+map);
		System.out.println("Size of Map is -> "+map.size());
//		Map<String,Object> myMap = new HashMap<>();
//		myMap.put("comment","null".toString());
//		System.out.println("myMap -> "+ myMap.size());
//		System.out.println("myMap -> "+ myMap);
//		System.out.println(myMap.get("comment"));
//		myMap.put("country","");
//		if(myMap.get("country").toString()=="") {
//			System.out.println("inside if");
//			myMap.put("country",null);
//		}
//		System.out.println("myMap ->"+myMap);
//		int[] arr = new int[5];
//		arr[0]=12;
//		String[] strarr = new String[10];
//		strarr[0] = "mohit";
//		myMap.put("strarr",strarr.toString());
//		System.out.println(arr.length);
//		System.out.println("myMap ->"+myMap);
	}
}
