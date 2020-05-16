package com.accolite.p6;

import java.util.HashMap;
import java.util.Map;

public class P100 {
 static Map<Integer , Integer>  mp = new HashMap<>();
	public static void main(String[] args) {
		Node n =  new Node(10);
		printTopView(n, 0);
		mp.entrySet().forEach(e -> System.out.println(e.getValue()));
	}

	private static void printTopView(Node n, int verticalOrder) {
		if(n != null) {
			if(!mp.containsKey(verticalOrder)) {
				mp.put(verticalOrder, n.data);
			}
			printTopView(n.left, verticalOrder++);
			printTopView(n.right, verticalOrder--);
		}
	}
}
