package com.practice.leetcode.questions;

public class ShuffleString {

	public static void main(String[] args) {
		String s ="aiohn";
		int indecies[] = {3,1,4,2,0};
		System.out.println("main");
		System.out.println(restoreString(s, indecies));
	}
	public static String restoreString(String s, int[] indices) {
        StringBuffer str = new StringBuffer(s);
        for(int i=0;i<indices.length;i++){
            int index = indices[i];
            char ch = s.charAt(i);
            str.setCharAt(index,ch);
        }
        return str.toString();
    }

}
