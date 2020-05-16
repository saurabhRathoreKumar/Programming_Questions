package com.accolite.p2;

import java.util.Optional;

public class OptionalEx1 {
	public static void main(String[] args) {
		Optional<Integer> op = Optional.empty();
		System.out.println(" ofNullable "+op.ofNullable(12));
		if(op.isPresent()) {
			System.out.println(op.get());
		}
	}
}
