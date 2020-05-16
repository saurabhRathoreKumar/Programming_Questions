package com.accolite.p6;

interface I1 {
	void m1();
}

interface I2 {
	void m1();
}

interface I3 {
	void m1();
}

public class MultipleInterf implements I1, I2, I3{

	public static void main(String[] args) {
		
	}

	@Override
	public void m1() {
		System.out.println("M1 method called...");
	}
}
