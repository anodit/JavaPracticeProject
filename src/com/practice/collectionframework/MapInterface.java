package com.practice.collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String args[]) {
		System.out.println("Map Interface Demo");
		Map<String,Integer> myMap = new HashMap<>();
		myMap.put("a", new Integer(100));
        myMap.put("b", new Integer(200));
        myMap.put("c", new Integer(300));
        myMap.put("d", new Integer(400));
        myMap.put("e", 500);
        
        System.out.println(myMap);
        
        //Traversing map using for each loop.
        for(Map.Entry<String,Integer> m : myMap.entrySet()) {
        	System.out.println("Key -> "+ m.getKey() +", Value -> "+ m.getValue());
        }
        
        System.out.println();
        
     // Creating an empty LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<>();
  
        // Inserting pair entries in above Map
        // using put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
  
        // Iterating over Map
        for (Map.Entry<String, Integer> e : map.entrySet())
  
            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                               + e.getValue());
        System.out.println();
        
     // Creating an empty TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
  
        // Inserting custom elements in the Map
        // using put() method
        treeMap.put("vishal", 10);
        treeMap.put("sachin", 30);
        treeMap.put("vaibhav", 20);
  
        // Iterating over Map using for each loop
        for (Map.Entry<String, Integer> e : map.entrySet())
  
            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                               + e.getValue());
	}
}


/*
	// Important Points.
	A map contains unique keys.
	
*/