package com.accolite.p2;

public class StringEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(collapseString("GGGTTGGGG"));
	}

	public static String collapseString(String inputString) {
		int[] temp = new int[256];
		char[] ch = inputString.toCharArray();
		for(char c : ch) {
			temp[c]++;  
		}
		StringBuilder out = new StringBuilder();
		for(int i =0;i< inputString.length();) {
			char c = inputString.charAt(i);
			int count = temp[c];
			out.append(count).append(c);
			i = i+count;
		}
		return out.toString();
	}

}
