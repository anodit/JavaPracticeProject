package com.practice.packageDemo;

//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
          int n = sc.nextInt();
          int[] a = new int[n];
          for (int i = 0; i < n; i++) a[i] = sc.nextInt();
          Solution g = new Solution();
          ArrayList<Integer> ans = g.duplicates(a, n);
          for (Integer val : ans) System.out.print(val + " ");
          System.out.println();
      }
  }
}

//} Driver Code Ends


class Solution {
  public static ArrayList<Integer> duplicates(int arr[], int n) {
      Set<Integer> uniqueEle = new HashSet<>();
      ArrayList<Integer> retList = new ArrayList<Integer>();
      for(int i=0;i<arr.length;i++){
          if(uniqueEle.contains(arr[i])){
              retList.add(arr[i]);
          }else{
              uniqueEle.add(arr[i]);
          }
      }
      if(uniqueEle.size()==n){
          retList.add(-1);
          return retList;
      }
      else{
          return retList;
      }
  }
}
