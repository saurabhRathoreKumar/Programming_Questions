package com.accolite.p2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Employee implements Comparable<Object> {
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
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student o1 = (Student)o;
			return this.getName().compareTo(o1.getName());
		}
		else {
			Employee o2 = (Employee)o;
			return this.getName().compareTo(o2.getName());
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

public class TreemapEx {
	public static void main(String[] args) {
		Map<Employee, String> map = new TreeMap<>((o1, o2) -> {
			return o2.getAge() -  o1.getAge();
		});
		
		map.put(new Employee("Ajay", 24), "Ajay");
		map.put(new Employee("Ravi", 38), "Ravi");
		map.put(new Employee("Tanuja", 12), "Tanuja");
		
		/*map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
		collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, LinkedHashMap::new));
		*/
		
		map = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
		collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b) -> a,LinkedHashMap::new));
		
		map.entrySet().forEach(item-> {
			System.out.println(item.getKey() +" :: "+item.getValue());
		});
	}
}
