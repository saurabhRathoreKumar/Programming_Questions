package com.accolite.p1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicateFromUnsorted {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2};
		Set<Integer> set = IntStream.of(arr).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println(set);
	}
}
