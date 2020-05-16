package com.accolite.p6;

public class KadanesAlgo {

	public static void main(String[] args) {
		//int[] arr =  {1, 2, 3, -2, 5};
		//int[] arr =  {-1, -2, -3, -4};
		int[] arr =  {-4, -2, -1};
		int max_sum =  Integer.MIN_VALUE, max_so_far =0;
		for(int i = 0;i< arr.length;i++) {
			max_so_far += arr[i];
			if(max_so_far > max_sum) {
				max_sum = max_so_far;
			}
			if(max_so_far < 0) {
				max_so_far = 0;
			}
		}
		System.out.println(max_sum);
	}
}
