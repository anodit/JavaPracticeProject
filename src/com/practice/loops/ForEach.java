package com.practice.loops;

import java.util.HashMap;
import java.util.Map;

public class ForEach {

	public static void main(String[] args) {
		System.out.println("Inside Main");
		System.out.println("#### loopMapClassic ####");
		loopMapClassic();
		System.out.println("#### loopMapJava8 ####");
		loopMapJava8();
		
	}

	public static void loopMapClassic() {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("E", 50);
		map.put("F", 60);
		for(Map.Entry<String,Integer> entry : map.entrySet()) {
			System.out.println("Key -> "+entry.getKey() + " , Value -> "+entry.getValue());
		}
	}
	
	public static void loopMapJava8() {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("E", 50);
		map.put("F", 60);
		map.forEach((k,v)->System.out.println("Key -> "+k+" , Value -> "+v));
	}

}
