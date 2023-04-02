package com.practice.string;

public class StringDemo {

	public static void main(String[] args) {
//		String s = new String("Durga");
//		String newStr = s.concat("Software");
//		System.out.println("String s is -> "+s);
//		System.out.println("String s is -> "+newStr);
//		
//		StringBuffer sb = new StringBuffer("Mohit ");
//		sb.append("Kumar");
//		System.out.println("StringBuffer sb is -> "+sb);
		
		String s1 = new String("Mohit");
		String s2 = "Mohit";
		System.out.println(s1==s2); // Reference Comparision
		System.out.println(s1.equals(s2)); // Content Comparision For String Class
		
		char[] ch= new char[] {'a','b','c'};
		System.out.println(ch);
		
	}

}
