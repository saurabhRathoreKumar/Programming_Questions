package com.accolite.p3;

import java.io.IOException;
import java.util.Scanner;
class GFG2
{
	public static void main (String[] args) throws NumberFormatException, IOException
	{
		Scanner reader = new Scanner(System.in);
		int test =  reader.nextInt();
		while(test>0) {
			int x = reader.nextInt();
			long[] ugly = new long[x+1];
			ugly[0] = 1;
			for(int i=1;i<x;i++) {
				ugly[i] = getNextUglyNumber(ugly[i-1]+1);
			}
			System.out.println(ugly[x-1]);
			test--;
		}
	}
	static boolean isUglyNumber(long n) {
		while(n%2==0) {
			n/=2;
		}
		while(n%3==0) {
			n/=3;
		} 
		while(n%5==0) {
			n/=5;
		}
		return n==1;
	}

	static long getNextUglyNumber(long n) {
		while(true) {
			if(isUglyNumber(n)) {
				break;
			}
			n++;
		}
		return n;
	}
}
