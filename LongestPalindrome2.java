package com.accolite.p5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestPalindrome2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int test  = Integer.parseInt(buff.readLine());
		while(test-->0)
		{
			String s = buff.readLine().trim();
			getLongestPalindrome(s);
		}
	}

	private static void getLongestPalindrome(String s) {
		String result = "";
		int i = 0, j = s.length()-1, lastIndex=j;
		char[]  c = s.toCharArray();
		while(i<=j) {
			int p = i, k = j, end = j;
			while(p<=k) {
				while(p<=k && c[p] == c[k]) {
					p++;
					k--;
				}
				if(k>p) {
					p = i;
					k = j--;
					end = k;
				}
			}
			if(k<=p && end-i+1 > result.length()) {
				result = s.substring(i, end+1);
			}
			i++;
			j=lastIndex;
		}
		System.out.println(result);
	}
}
