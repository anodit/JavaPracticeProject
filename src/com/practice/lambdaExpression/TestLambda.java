package com.practice.lambdaExpression;


@FunctionalInterface
interface Cab{
	public void bookCab();
}

//class Ola implements Cab{
//	
//	public void bookCab() {
//		System.out.println("Ola Cab is booked");
//	}
//	()->System.out.println("Ola Cab is booked");
//	
//}

public class TestLambda {
	public static void main(String args[]) {
		System.out.println("From Main Method..");
//		Ola cab = new Ola();
		Cab cab = ()->System.out.println("Ola Cab is booked");
		cab.bookCab();
	}
}
