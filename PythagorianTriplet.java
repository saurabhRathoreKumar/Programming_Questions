package com.accolite.p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PythagorianTriplet {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*	1
		5
		3 2 4 6 5*/
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int test =  Integer.parseInt(buff.readLine());

		while(test > 0) {
			test--;
			int size =  Integer.parseInt(buff.readLine());
			String temp[] = buff.readLine().split("\\s+");
			List<Integer> list = Arrays.stream(temp).mapToInt(a -> { 
				int b = Integer.parseInt(a);
				return b*b;
			}).boxed().sorted().collect(Collectors.toList());
			Integer[] arr = list.toArray(new Integer[0]);
			boolean flag =isPythagorianTriplet(arr, size);
			System.out.println(flag ? "Yes" : "No");
		}
	}

	private static boolean isPythagorianTriplet(Integer[] arr, int size) {
		for(int i = size-1;i>=0;i--) {
			int l = 0, r = i-1;
			while(l< r) {
				if(arr[l] + arr[r] < arr[i]) {
					l++;
				}
				else if(arr[l] + arr[r] > arr[i]) {
					r--;
				}
				else {
					return true;
				}
			}
		}
		return false;
	}
}
