package com.practice.collectionframework;

import java.util.ArrayList;

/**
 * @author mohit
 *
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		System.out.println("Array List Demo");
		ArrayList<Integer> arrList = new ArrayList<>();	
		for(int i=0;i<10;i++) {
			double randNum =  Math.random()*1000;
			arrList.add((int) randNum);
		}
		System.out.print("Array List Elements are -> ");
		for(int i=0;i<10;i++) {
			System.out.print(arrList.get(i)+" ");
		}
		System.out.println();
		System.out.println(arrList.clone());
		System.out.print("Array List Elements using for each loop are -> ");
		for(Integer i : arrList) {
			System.out.print(i + "");
		}
	}

}
