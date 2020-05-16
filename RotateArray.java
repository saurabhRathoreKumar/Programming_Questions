package com.accolite.p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int test =  Integer.parseInt(buff.readLine());
		while(test>0) {
			String[] str =  buff.readLine().split("\\s+");
			int rotate =  Integer.parseInt(str[1]);
			List<Integer> list = Arrays.stream(buff.readLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
			list = rotateArray(list, rotate);
			list.forEach(item -> System.out.print(item + " "));
			test--;
		}
		System.out.print("\n");
	}

	private static List<Integer> rotateArray(List<Integer> list, int rotate) {
		while(rotate >0) {
			int temp =  list.get(0);
			int i= 0;
			int size = list.size();
			for(;i< size-1;i++) {
				list.set(i, list.get(i+1));
			}
			list.set(i, temp);
			rotate--;
		}
		return list;
	}
}
