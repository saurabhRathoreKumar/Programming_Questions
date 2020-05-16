package com.accolite.p1;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<Object, String> tm = new TreeMap<>();
		tm.put(new Object(), "f1");
		tm.put(new Object(), "f2");
		tm.put(new Object(), "f3");
		System.out.println(tm);
	}
}
