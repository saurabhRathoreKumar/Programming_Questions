package com.accolite.p5;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class SuperString {
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		List<Character> ch = Arrays.asList('a','e','i','o','u');
		int result = 0, tempCount =0;
		int size = line.length();
		for(int i = 0;i< size;i++) {
			if(ch.contains(line.charAt(i))) {
				tempCount++;
			}
			else {
				if(tempCount > result) {
					result = tempCount;
				}
				tempCount = 0;
			}
		}
		if(tempCount > result) {
			result = tempCount;
		}
		System.out.println(result);}
}
