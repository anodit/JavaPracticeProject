package com.practice.string;

public class StringEqualDemo {
	public static void main(String[] args) {
		String s1 = new String("durga");
		String s2 = new String("Durga");
		s2 =s2.toLowerCase(); 
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		// StringBuffer
		StringBuffer sb1 = new StringBuffer("mohit");
		StringBuffer sb2 = new StringBuffer("mohit");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
	}
}
