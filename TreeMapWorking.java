package com.accolite.p2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Student/* implements Comparable<Object>*/ {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*@Override
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student o1 = (Student)o;
			return this.getName().compareTo(o1.getName());
		}
		else {
			Employee o2 = (Employee)o;
			return this.getName().compareTo(o2.getName());
		}
	}*/

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

public class TreeMapWorking {
	Object obj = new Object();
	public static void main(String[] args) {
		Map<Student, String> map = new TreeMap<>();
		map.put(new Student("Saurabh", 24), "Saurabh");
		map.put(new Student("Raj", 26), "Raj");
		map.put(new Student("Aditi", 29), "Aditi");
		map.put(new Student("Bobby", 21), "Bobby");
		map.put(new Student("Tanamay", 32), "Tanamay");
		System.out.println(map);
	}
}
