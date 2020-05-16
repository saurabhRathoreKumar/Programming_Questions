package com.accolite.p6;

import java.math.BigInteger;

public class BinaryNum {

	public static void main(String[] args) {

		
		int n = 3;
		StringBuilder sb = new StringBuilder();
		for(int  i = 1;i<= n;i++) {
			BigInteger bg =  new BigInteger(String.valueOf(i));
			sb.append(bg.toString(2));
		}
		String s = new BigInteger(sb.toString(), 2).mod(new BigInteger("1000000007")).toString();
		
		long val = Long.parseLong(s);
		System.out.println(val);
	}

}
