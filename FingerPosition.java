package com.accolite.p6;

import java.util.Scanner;

public class FingerPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- >0) {
			int n = sc.nextInt();
			if(n< 5) {
				System.out.println(n);
			}
			else {
				int rowNum = (int) Math.ceil((n-5)/4);
				if(rowNum%2 == 0) {
					System.out.println(1+ n%4);
				}
				else {
					System.out.println( 5 - n%4);
				}
			}
		}
	}

}
