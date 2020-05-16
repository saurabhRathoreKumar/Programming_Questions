package com.accolite.p6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MaxNumberFormed {

	public static void main(String[] args) {
		//int[] ar = {3, 30, 34, 5, 9};
		int [] ar = {54, 546, 548, 60};
		String[] arr = new String[ar.length];
		for(int i =0;i< ar.length;i++) {
			arr[i] = String.valueOf(ar[i]);
		}
		
		Comparator<String> c =  (a, b) -> {
			return  Integer.parseInt(b+a) - Integer.parseInt(a+b);
		};
		Arrays.sort(arr, c);
		String val = Arrays.stream(arr).collect(Collectors.joining());
		System.out.println(val);
	}

}
