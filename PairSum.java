package com.accolite.p4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
class PairSum
 {
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int test =  Integer.parseInt(buff.readLine());
		while(test >0) {
			test--;
			int[] temp = Arrays.stream(buff.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		    int[] arr = Arrays.stream(buff.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		    int size = arr.length;
		    int target = temp[1];
		    int count = 0;
		    for(int i =0;i< size-1;i++) {
		        int ele = target-arr[i];
		         for(int j =i+1;j< size;j++) {
		             if(ele == arr[j]) {
		               count++; 
		             }
		    }
		    }
		    
		   System.out.println(count); 
		}
	 }
}