package com.practice.leetcode.questions;

import java.util.Arrays;

public class MostFrequentEvenNum {

	public static void main(String[] args) {
		System.out.println("Program Started");
//		int arr[] = {0,1,2,2,4,4,1,8,7,6,5,6,8,6,8,8,8};
		int arr[] = {10001};
		System.out.println();
		System.out.println("Output is -> "+mostFrequentEven(arr));
	}
	
	public static int mostFrequentEven(int[] nums) {
	        boolean isEvenNumPresent = false;
	        int arrSize = 0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]%2==0){
	                arrSize++;
	            }
	        }
	        int j=0,mostFreqEvenNum=0,freqCount=0,initialCount=0;
	        int newArr[] = new int[arrSize];
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]%2==0){
	                isEvenNumPresent = true;
	                newArr[j++] = nums[i];
	            }
	        }
	        if(!isEvenNumPresent){
	            return -1;
	        }else{
	            Arrays.sort(newArr);
//	            for(int i=0;i<newArr.length;i++){
//	                System.out.print(newArr[i]);
//	            }
	            mostFreqEvenNum = newArr[0];
	            for(int i=0;i<newArr.length-1;i++){
	                if(newArr[i]==newArr[i+1]){
	                    freqCount++;
	                }else{
	                    if(initialCount<freqCount){
	                        mostFreqEvenNum = newArr[i];
	                        initialCount = freqCount;
	                    }
	                    freqCount = 0;
	                }
	            }
	            if(initialCount<freqCount) {
	            	mostFreqEvenNum = newArr[newArr.length-1];
	            }
	            return mostFreqEvenNum;
	        }
	    }

}
