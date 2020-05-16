package com.accolite.p4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MiddleLLElement {

	public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int test =  Integer.parseInt(buff.readLine());
		while(test >0) {
			test--;
			int[] arr = Arrays.stream(buff.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
			System.out.println(arr[46]);
			System.out.println(arr[47]);
		}
	}
}
