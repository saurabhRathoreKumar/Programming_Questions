package com.accolite.p4;

import java.io.IOException;
import java.util.Scanner;

public class GFG1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		while(test>0) {
			test--;
			long num = scan.nextInt();
			System.out.println(getStairHeight(num));
		}
	}

	private static long getStairHeight(long num) {
		long total = 0, count= 1;
		while(total <= num) {
			total+=count;
			count++;
		}
		return count-2;
	}

}
