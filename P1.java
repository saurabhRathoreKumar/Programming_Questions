package com.accolite.p6;

import java.util.Scanner;

class Node1 {
	int data;
	Node1 next;
	Node1(int d)  { data = d;  next = null; }
}

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node1 node = new Node1(sc.nextInt());
		Node1  head = node;
		n--;
		while(n > 0) {
			n--;
			head.next = new Node1(sc.nextInt());
			head = head.next;
		}
		long val = DecimalValue(node);
		System.out.println(val);
	}

	static int count = 0;
	static long DecimalValue(Node1 head)
	{
		return decimalVal(head);
	}

	static long decimalVal(Node1 n) {
		if(n.next != null) {
			return decimalVal(n.next) + n.data * (long) Math.pow(2, count++) % 1000000007;
		}
		else {
			count++;
			return n.data;
		}
	}
}
