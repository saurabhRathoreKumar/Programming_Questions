package com.accolite.p1;

public class StaticTest2 {
	static float i;
	static {
		//i = 10;
		System.out.println("Block "+i);
	}
	StaticTest2() {
		System.out.println("Constructor "+i);
	}
	
	public static void main(String[] args) {
		System.out.println(i);
		StaticTest2 test = new StaticTest2();
		test.i = 30;
		System.out.println("Method "+test.i);
	}
}
