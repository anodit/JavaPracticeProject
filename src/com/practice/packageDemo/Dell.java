package com.practice.packageDemo;

public class Dell {
	
	Dell(){
		System.out.println("Inside Constructor");
	}

	public static void main(String[] args) {
		new Dell();
		System.out.println("From main Block");
	}
	static {
		System.out.println("Inside Static Block");
	}
}
