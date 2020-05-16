package com.accolite.p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
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
	
	public void decrementAge(int offset) {
		this.age = this.age-offset;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}

public class P3 {
 
	public static void main(String[] args) {
		Student[] arrayOfEmps = { new Student("Sa", 32), new Student("GA", 24), new Student("ASD", 45) };
		List<Student> empList = Arrays.asList(arrayOfEmps);
		empList.stream()
		.peek(e -> {System.out.print(e);e.decrementAge(10); System.out.println(e);})
		.collect(Collectors.toList());
	}
}
