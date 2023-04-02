package com.practice.java8;

interface Inter{
	public void m2();
}

interface InterAddition{
	public void add(int a, int b);
}
public class Test {

	public static void main(String[] args) {
		Interf i = ()-> System.out.println("M1 Method from Lambda Expression");
		Inter i2 = ()-> System.out.println("M2 Method from Lambda Expression");
		i.m1();
		i2.m2();
		InterAddition i3 = (a,b)->System.out.println(a+b);
		i3.add(10,20);
	}

}
