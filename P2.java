package com.accolite.p1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class P2 {

	public static void main(String[] args) {
		List<User> users = Arrays.asList(
	            new User("C", 30),
	            new User("D", 40),
	            new User("A", 10),
	            new User("B", 20),
	            new User("E", 50),
	            null);
		Collections.reverseOrder();
		List<User> sortedList = users.stream()
				.sorted(Comparator.nullsLast(Comparator.comparing(User::getName)))
				.collect(Collectors.toList());

		    sortedList.forEach(System.out::println);
	}

}
