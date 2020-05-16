package com.accolite.p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GFG8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(buf.readLine().trim());
		while(test>0) {
			test--;
			Integer.parseInt(buf.readLine().trim());
			String st = buf.readLine().trim();
			int b = findFirstNonRepeatingChar(st);
			if(b==-1) {
				System.out.println("-1");
			}
			else 
				System.out.println((char)b);
			
		}
	}

	private static int findFirstNonRepeatingChar(String st) {
		Set<Character> set = new HashSet<>();
		Deque<Character> dq = new LinkedList<>();
		for(Character c : st.toCharArray()) {
			if(set.contains(c)) {
				dq.removeIf(item -> item.compareTo(c)==0);
			}
			else {
				set.add(c);
				dq.add(c);
			}
		}
		return dq.peek()!= null ? dq.peek() : -1;
	}
}
