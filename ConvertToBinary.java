package com.accolite.p6;

import java.math.BigInteger;
import java.util.Scanner;

public class ConvertToBinary {

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

	private static long DecimalValue(Node1 node) {
		Node1 head = node;
		StringBuilder sb = new StringBuilder();
		int c = 0;
		double ans = 0.0;
		while(head != null) {
			sb.append(head.data);
			head = head.next;
		}
		int size = sb.length();
		c =  size - 1;
		
		for(int i =0; i< size; i++) {
			ans+= Integer.parseInt(sb.substring(i, i+1)) * Math.pow(2, c--);
			ans %= 1000000007;
		}
		return (long) ans;
	}
}
