package com.practice.leetcode.questions;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

	public static void main(String[] args) {
		String s = "aaaaabbb";
		String t = "aaaaarbbb";
		char diffChar = 'a';
		HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();
        for(int i=97;i<=122;i++){
            sMap.put((char)i,0);
            tMap.put((char)i,0);
        }
        System.out.println(sMap);
        System.out.println(tMap);
        for(int i=0;i<s.length();i++) {
        	char ch = s.charAt(i);
        	if(sMap.containsKey(ch)) {
        		sMap.put(ch, sMap.get(ch)+1);
        	}
        }
        for(int j=0;j<t.length();j++) {
        	char ch = t.charAt(j);
        	if(tMap.containsKey(ch)) {
        		tMap.put(ch, tMap.get(ch)+1);
        	}
        }
        for(Map.Entry entry : sMap.entrySet()) {
        	if(entry.getValue() != tMap.get(entry.getKey())){
        		diffChar = (char)entry.getKey();
        	}
        }
       System.out.println(diffChar);
	}

}
