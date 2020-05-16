package com.accolite.p6;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {
	public static void main(String[] args) {
		Map<Integer, Integer> mp = new TreeMap<>(Comparator.reverseOrder());
		mp.put(14, 18);
		mp.put(15, 20);
		mp.put(11, 10);
		mp.put(19, 28);
		System.out.println(mp);
		
		Comparator c = (e1, e2) -> {
			return -1;
		};
		Map<Student1, Integer> mp1 = new TreeMap<>(c);
		mp1.put(new Student1("s1", 121,"M"), 18);
		mp1.put(new Student1("s2", 322, "F"), 20);
		mp1.put(new Student1("s3", 312, "F"), 20);
		mp1.put(new Student1("s4", 302, "F"), 20);
		mp1.put(new Student1("s5", 362, "F"), 20);
		System.out.println(mp1);
	}
}

class Student1 {
	private String name;
	int age;
	String sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Student1(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
}

