package com.accolite.p1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

class S1 implements Comparable<S1>{
	String name;
	S1(String n){
		this.name = n;
	}
	
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(S1 o) {
		return this.name.compareTo(o.name);
	}
}
public class HashSet2 {
	public static void main(String[] args) {
		TreeMap<S1,String> str = new TreeMap<>();
		str.put(new S1("T"), "p");
		str.put(new S1("U"), "U");
		str.put(new S1("R"), "R");
		str.put(new S1("S"), "S");
		System.out.println(str);
	}
	/*public static void main(String[] args) {
		String s1 = new String("S1");
		String s2 = new String("S1");
		String s3 = new String("world");
		Set<String> set =  new HashSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add("world");
		S1 s = new S1("world");
		set.add(s.toString());
		System.out.println(set);
	}*/
}
