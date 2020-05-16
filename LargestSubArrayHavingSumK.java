package com.accolite.p6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayHavingSumK {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buf =  new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(buf.readLine());

		while(test -- > 0) {
			String[] temp = buf.readLine().split("\\s+");
			int  k = Integer.parseInt(temp[1]);
			int arr[] = Arrays.stream(buf.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
			System.out.println(findMaxRange(arr, k));
		}
	}

	private static int findMaxRange(int[] arr, int k) {
		int size = arr.length, sum = 0, max_range = Integer.MIN_VALUE;
		
		Map<Integer, Integer> mp = new HashMap<>();
		
		for(int end = 0; end < size; end++) {
			sum += arr[end];
			if(sum == k) {
				max_range = end + 1;
			}
			mp.putIfAbsent(sum, end);
			if(mp.containsKey(sum - k) && max_range < end - mp.get(sum - k)) {
				max_range = end - mp.get(sum-k);
			}
		}
		return max_range == Integer.MIN_VALUE ? 0 : max_range;
	}
}
