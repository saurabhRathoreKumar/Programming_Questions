package com.accolite.p3;

public class PermutationString {

	public static void main(String[] args) {
		permuteString("ABC", "");
	}

	private static void permuteString(String string, String string2) {
		int length = string.length();
		if(string==null || string.isEmpty()) {
			System.out.println(string2);
		}
		else {
			for(int  i =0;i< length;i++) {
				String st = string.substring(i, i+1);
				permuteString(string.replace(st, ""), string2.concat(st));
			}
		}
	}
}
