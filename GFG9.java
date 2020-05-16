package com.accolite.p3;

public class GFG9 {

	public static void main(String[] args) {
		int [] a = {-2, -3, -1, 0};
		int sum = findMaxSubArraySum(a);
		System.out.println(sum);
	}

	private static int findMaxSubArraySum(int[] a) {
		
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
		for(int i =0;i< a.length;i++) {
			max_ending_here+=a[i];
			if(max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
			if(max_ending_here <0) {
				max_ending_here =0;
			}
		}
		return max_so_far;
	}
}
