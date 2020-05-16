package com.accolite.p3;

//{ Driver Code Starts
//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

class Node {
	int key, value;
	Node next, pre;
	public int data;

	Node() {
	}
	Node(int key) {
		this.data = key;
	}
	Node(int key, int value) {
		this.key = key;
		this.value = value;
		next = pre = null;
	}
}

public class GFG4 {

	public static void main(String[] args) throws IOException {
		BufferedReader read =
				new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(read.readLine());

		while (t-- > 0) {

			int capacity = Integer.parseInt(read.readLine());
			int queries = Integer.parseInt(read.readLine());
			LRUCache cache = new LRUCache(capacity);
			String str[] = read.readLine().trim().split(" ");
			int len = str.length;
			int itr = 0;

			for (int i = 0; (i < queries) && (itr < len); i++) {
				String queryType = str[itr++];
				if (queryType.equals("SET")) {
					int key = Integer.parseInt(str[itr++]);
					int value = Integer.parseInt(str[itr++]);
					cache.set(key, value);
				}
				if (queryType.equals("GET")) {
					int key = Integer.parseInt(str[itr++]);
					System.out.print(cache.get(key) + " ");
				}
			}
			System.out.println();
		}
	}
}
//} Driver Code Ends

class LRUCache {

	static HashSet<Integer> map;
	private static int capacity, count;
	private static Node head, tail;
	static Deque<Node> dq;
	LRUCache(int cap) {
		dq = new LinkedList<>();
		map = new HashSet<>(); 
		capacity = cap;
	}

	// This method works in O(1)
	public static int get(int key) {
		int index = 0, i = 0; 
		Iterator<Node> itr = dq.iterator(); 
		int val = -1;
		while (itr.hasNext()) {
			Node n = itr.next();
			if (n.key == key) { 
				index = i; 
				val = n.value;
				break; 
			} 
			i++; 
		}
		if(val==66) {
			System.out.println(val);
		}
		return val;
	}

	// This method works in O(1)
	public static void set(int key, int value) {
		if (!map.contains(key)) { 
			if (dq.size() == capacity) { 
				Node last = dq.removeLast(); 
				map.remove(last.key); 
			} 
		} 
		else { 
			/* The found page may not be always the last element, even if it's an  
           intermediate element that needs to be removed and added to the start  
           of the Queue */
			int index = 0, i = 0; 
			Iterator<Node> itr = dq.iterator(); 
			Node n = null;
			while (itr.hasNext()) {
				n = itr.next();
				if (n.key == key) { 
					index = i; 
					break; 
				} 
				i++; 
			} 
			dq.remove(n); 
		} 
		dq.push(new Node(key, value)); 
		map.add(key); 
	}

}
