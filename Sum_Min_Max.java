package com.accolite.p4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

class Student {
	private String name;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}
public class Sum_Min_Max {

	public static void main(String[] args) {
		/*Integer [] a = {-2, -3, -1, 0, 2,2,3,2};
		Stream<Integer> i = Arrays.stream(a);
		Stream<Integer> p = Stream.of(a);
		i.max(Comparator.reverseOrder());
		
		System.out.println(i);*/
		
		Map<String, Student> map = new TreeMap<>((e1, e2) -> e2.compareToIgnoreCase(e1));
		map.put("AB", new Student("Raj", 23));
		map.put("CB", new Student("Sau", 24));
		map.put("BB", new Student("Gar", 10));
		System.out.println(map);
	}
}
