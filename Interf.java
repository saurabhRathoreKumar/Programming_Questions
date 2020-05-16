package com.accolite.p1;

interface I1 {
	public void Show();
}

interface I2 {
	public void Show();
}

interface I3 {
	public void Show();
}

public class Interf {
	public static void main(String[] args) {
		Interf obj = new Interf();
		System.out.println(obj.show());
	}
	
	public String show() {
		return "Hi";
	}
}
