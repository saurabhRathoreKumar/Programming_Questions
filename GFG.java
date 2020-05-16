package com.accolite.p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class GFG
{
	public static void main (String[] args) throws NumberFormatException, IOException
	{
		BufferedReader buff = 
				new BufferedReader(new InputStreamReader(System.in));
		int test =  Integer.parseInt(buff.readLine());
		while(test>0) {
			String output = getReversedString(buff.readLine());
			System.out.println(output);
			test--;
		}
	}

	private static String getReversedString(String string) {
		String[] temp =  string.split("\\.");
		int size = temp.length;
		for(int i =0;i< size/2;i++) {
			String st = temp[size-1-i];
			temp[size-1-i] = temp[i];
			temp[i] = st;
		}
		return String.join(".", temp);
	}
}