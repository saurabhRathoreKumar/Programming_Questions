package com.accolite.p2;

public class FinalBlockException {
	public static void main(String[] args) {
		try {
			int data = 10/0;
		}
		finally {
			System.out.println("Exception handeled ");
		}
	}
}
