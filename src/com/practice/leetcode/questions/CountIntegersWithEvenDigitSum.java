package com.practice.leetcode.questions;

public class CountIntegersWithEvenDigitSum {

	public static void main(String[] args) {
		System.out.println("inside main");
		System.out.println(countEven(30));
	}
	
	public static int countEven(int num) {
        int countInt=0;
        for(int i=2;i<=num;i++){
            if(isDigitEven(i)){
                countInt++;
            }
        }
        return countInt;
    }
    public static boolean isDigitEven(int n){
        int digitSum=0;
        while(n!=0){
            digitSum += n%10; 
            n/=10;
        }
        return (digitSum%2==0)?true:false;
    }

}
