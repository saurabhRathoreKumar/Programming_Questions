package com.accolite.p1;

import java.util.HashSet;
import java.util.Set;

public class VowelCount {

	public static void main(String[] args) {
		String str = "baceb";
		char[] ch = str.toCharArray();
		Set<Character> set = new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		set.add('A');
		set.add('E');
		set.add('I');
		set.add('O');
		set.add('U');
		int count =0;
		for(int i =0;i< ch.length;i++) {
			int tempCount = 0;
			if(set.contains(ch[i])) {
				tempCount++;
			}
			count+=tempCount;
			for(int j = i+1; j< ch.length; j++) {
				if(set.contains(ch[j])) {
					tempCount++;
				}
				count+=tempCount;
			}
		}
		System.out.println(count);
	}
}
