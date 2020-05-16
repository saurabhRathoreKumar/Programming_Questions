package com.accolite.p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcelCOlumnName {
	StringBuilder out =  new StringBuilder();
	char[] alphabet =  {'A','B', 'C', 'D', 'E',
			'F','G','H','I','J',
			'K','L','M','N',
			'O','P','Q','R','S',
			'T','U','V','W','X',
			'Y','Z'};
	public static void main(String[] args) throws NumberFormatException, IOException {
		ExcelCOlumnName obj = new ExcelCOlumnName();
		BufferedReader buff = 
				new BufferedReader(new InputStreamReader(System.in));
		int test =  Integer.parseInt(buff.readLine());
		while(test>0) {
			int x = Integer.parseInt(buff.readLine());
			int num = getPower(x);
			obj.printColumnLabel(num, x);
			System.out.println(obj.out);
			test--;
		}
	}

	private void printColumnLabel(int num, double x) {
		while(num >0) {
			int index = getChar(num-1, x);
			double sub = Math.pow(26, num-1);
			if(index!=0)
				x = x - sub;
			out.append(alphabet[index-1]);
			num--;
		}
	}

	private static int getChar(int num, double x) {
		if(num==0) {
			return (int) x;
		}
		int index = 1;
		while(index* Math.pow(26, num) < x) {
			index++;
		}
		return --index;
	}

	private static int getPower(double x) {
		double  pow = 26;
		int count =0;
		while(pow <= x) {
			count++;
			pow = Math.pow(26, count);
		}
		return count;
	}
}
