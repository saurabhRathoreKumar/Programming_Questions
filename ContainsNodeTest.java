package com.accolite.p1;

import java.util.HashSet;
import java.util.Set;

class Node {
	int data;
	Node next;
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}

public class ContainsNodeTest {
	public static void main(String[] args) {
		Set<Node> set = new HashSet<>();
		Node n = new Node(11, null);
		set.add(n);
		set.add(new Node(14, null));
		set.add(new Node(15, null));
		set.add(new Node(16, null));
		System.out.println(set.contains(n));
		Node n2 = new Node(11,null);
		System.out.println(set.contains(n2));
	}
}
