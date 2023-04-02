package com.practice.leetcode.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortThePeople {

	public static void main(String[] args) {
		String[] names = {"Alice","Bob","Bob"};
		int[] heights = {155,185,150};
		System.out.println(sortPeople(names,heights).toString());
	}
	
	public static String[] sortPeople(String[] names, int[] heights) {
        String returnNames[] = new String[heights.length];
        String returnNamesDesc[] = new String[heights.length];
        LinkedHashMap<String,Integer> namesHeightsMap = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<heights.length;i++){
            namesHeightsMap.put(names[i],heights[i]);
        }
        System.out.println("namesHeightsMap->"+namesHeightsMap);
        for(Map.Entry<String,Integer> entry : namesHeightsMap.entrySet()){
            list.add(entry.getValue());
        }
        System.out.println("list before sort-> "+list);
        Collections.sort(list);
        int i=0;
        for(int num:list){
            for(Map.Entry<String,Integer> entry : namesHeightsMap.entrySet()){
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                    returnNames[i] = entry.getKey();
                }
            }
            i++;
        }
       
        System.out.println("sortedMap-> "+sortedMap);
        System.out.println("list after sort-> "+list);
        System.out.println("returnNames -> "+returnNames);
        int j=0;
        for(i=heights.length-1;i>=0;i--){
            returnNamesDesc[j] = returnNames[i];
            j++;
        }
        return returnNamesDesc;
     }
}
