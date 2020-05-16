package com.accolite.p4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberPlatforms {

	public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int test  = Integer.parseInt(buff.readLine());
		while(test-->0)
		{
			int size = Integer.parseInt(buff.readLine().trim());
			int [] arr = Arrays.stream(buff.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
			int [] dep = Arrays.stream(buff.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
			int n = findPlatforms(arr, dep, size);
			System.out.println(n);
		}

	}

	private static int findPlatforms(int[] arr, int[] dep, int size) {
		int count = 0, platform_needed = 0;
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i = 0, j =0;
		while(i< size & j< size) {
			if(arr[i] <= dep[j]) {
				count++;
				i++;
				if(platform_needed < count) {
					platform_needed = count;
				}
			}
			else {
				count--;
				j++;
			}
		}
		return platform_needed;
	}
}
