package com.accolite.p4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class SubArraySum
 {
	public static void main (String[] args) throws IOException 
	 {
	BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	int test  = Integer.parseInt(buff.readLine());
	while(test-->0)
	{
	String[]  str = buff.readLine().split("\\s+");
	int sum = Integer.parseInt(str[1]);
	String [] temp = buff.readLine().split("\\s+");
	int n = temp.length;
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
	  arr[i] = Integer.parseInt(temp[i]);  
	}
	findSubArr(arr,n, sum);
	}
 }
	 
	 private static void findSubArr(int[] arr, int n, int sum) {
	     int size = arr.length,
	     start = 0, sum_so_far = 0;
	     for(int i =0;i< size;i++) {
	         sum_so_far+=arr[i];
	         while(sum_so_far > sum) {
	             sum_so_far-=arr[start++];
	         }
	         if(sum_so_far == sum) {
	             System.out.println(++start + " "+(++i));
	             return;
	         }
	     }
	      System.out.println("-1");
	 }
}
