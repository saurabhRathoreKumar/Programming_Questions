package com.accolite.p2;

class Parent {

	public void m1() {
		System.out.println("Parent m1");
	}

}

public class Child extends Parent{

	public static void main(String[] args) {
		Child p =  new Child();
		p.m1();
		p.m2();
	}

	public void m1() {
		System.out.println("Child m1");
	}

	public void m2() {
		System.out.println("Child m2");
	}

}
