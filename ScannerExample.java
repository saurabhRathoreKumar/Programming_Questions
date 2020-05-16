package com.accolite.p1;

import java.math.BigInteger;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		do {
			BigInteger N1 = s.nextBigInteger();
			BigInteger N2 = s.nextBigInteger();
			System.out.println(N1.add(N2));
		} while(s.hasNext());
	}

}
