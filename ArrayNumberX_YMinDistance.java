package com.accolite.p6;

import java.util.Arrays;

public class ArrayNumberX_YMinDistance {

	public static void main(String[] args) {
		/*long[] a ={1,2,4,5,0};
		System.out.println(minDist(a, 5, 1,2));
		
		long[] a1 ={2,4,1,5,0};
		System.out.println(minDist(a1, 5, 1,2));*/
		String a11 = "80 20 84 94 66 43 17 46 31 21 38 56 40 4 83 40 64 98 59 18 78 8 50 63 34 68 8 64 44 14 22 75 33 6 68 51 100 37 96 31 57 85 38 48 88 20 39 4 17 97 21 46 5 22 60 90 90 67 53 84 31";
		long [] arr = Arrays.stream(a11.split("\\s+")).mapToLong(Long::parseLong).toArray();
		System.out.println(minDist(arr, 59, 84,31));
	}

	static long minDist(long arr[], long n, long x, long y) {
		long shortest = Integer.MAX_VALUE;
		long k = 0, j  = 0;
		for(int  i =0;i < n;i++ ) {
			if(arr[i] == x) {
				k = i+1;
			}
			else if(arr[i] == y) {
				j = i+1;
			}
			if(k> 0 && j> 0 && Math.abs(j-k) < shortest) {
				shortest = Math.abs(j-k);
			}
		}
		return shortest == Integer.MAX_VALUE ? -1: shortest;
	}
}
