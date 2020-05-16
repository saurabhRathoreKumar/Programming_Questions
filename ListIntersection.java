package com.accolite.p6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(2, 2, 3, 3,4, 6);
		List<Integer> l2 = Arrays.asList(2, 2, 3, 3, 4, 4, 5);
		int  i = 0, j = 0 , s1 = l1.size(), s2 = l2.size();
		List<Integer> l = new ArrayList<>();
		while(i < s1 & j < s2) {
			if(l1.get(i) == l2.get(j)) {
				l.add(l1.get(i++));
				j++;
			}
			else if(l1.get(i) < l2.get(j)) {
				i++;
			}
			else {
				j++;
			}
		}
		System.out.println(l);
	}

}
