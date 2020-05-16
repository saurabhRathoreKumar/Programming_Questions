package com.accolite.p5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestPalindrome {
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
		int l = s.length();
		String result = new String();
		for(int i = 0;i< l;i++) {
			String evenLengthPalindrome = findEvenPalindromStr(i, l, s);
			String oddLengthPalindrome = findOddPalindromStr(i, l, s);
			if(evenLengthPalindrome.length() > oddLengthPalindrome.length() && evenLengthPalindrome.length() > result.length()) {
				result = evenLengthPalindrome;
			}
			else if(oddLengthPalindrome.length() > result.length()) {
				result = oddLengthPalindrome;
			}
		}
		System.out.println(result);
	}

	private static String findOddPalindromStr(int i, int size, String s) {
		int l = i, r = i;
		while(--l >=0 && ++r < size && s.charAt(l)==s.charAt(r)) {
			l--; r++;
		}
		if(l<0) {
			l++;r--;
		}
		if(r>=size) {
			r--;l++;
		}
		return s.substring(l, r+1);
	}

	private static String findEvenPalindromStr(int i, int size, String s) {
		int l = i, r = i+1;
		if(i==0) {
			return s.substring(0,1);
		}
		while(l >=0 && r < size && s.charAt(l)==s.charAt(r)) {
			l--; r++;
		}
		if(l<0) {
			l++;r--;
		}
		if(r>=size) {
			r--;l++;
		}
		return s.substring(l, r+1);
	}
}
