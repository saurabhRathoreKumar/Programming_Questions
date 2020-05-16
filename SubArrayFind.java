package com.accolite.p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubArrayFind {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0) {
			testCases--;
			int size = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split("\\s+");
			int[] arr = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();
			findSubArrays(size, arr);
		}

	}

	//	1
	//	10
	//	7 1 2 4 6 5 3 8 9 10
	private static void findSubArrays(int size, int[] arr) {
		int f = 0, s = 0, c = 0, max_so_far = 0;
		for(int  i = 0;i< size;i++) {
			if(i==0 && arr[0] < arr[1]){
				c++;
				max_so_far = arr[i];
			}
			else if( i-1 >=0 && arr[i] > max_so_far && arr[i] > arr[i-1]) {
				c++;
				max_so_far = arr[i];
			} else {
				s = f > s ? f : s;
				f =  c > f ? c : f;
				c = 0;
			}

		}
		System.out.println(s+f);
	}

	private static void findSubArraysBruteForce(int size, int[] arr) {
		Set<Integer> set = new HashSet<>();
		for(int  i =0;i< size;i++) {
			for(int j = i;j< size;j++) {
			}
		}

	}
}
