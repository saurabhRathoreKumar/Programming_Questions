package com.accolite.p6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BottomUpTreeView {
	static Map<Integer, Integer> mp = new TreeMap<>();
	static Map<Integer, Integer> hm = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(20); 
		root.left = new Node(8); 
		root.right = new Node(22); 
		root.left.left = new Node(5); 
		root.left.right = new Node(3); 
		root.right.left = new Node(4); 
		root.right.right = new Node(25); 
		root.left.right.left = new Node(10); 
		root.left.right.right = new Node(14);
		bottomView(root);
	}
	// Method that prints the bottom view.
	public static void bottomView(Node n)
	{
		printBottomView(n, 0, 0);
		System.out.println(mp.values().toString().replace("[", "").replace("]", ""));
	}

	static void printBottomView(Node n, int v, int h) {
		if(n != null) {
			if(hm.containsKey(v) && hm.get(v) <= h) {
                hm.put(v, h);
                mp.put(v, n.data);
            }
            else if(!hm.containsKey(v)) {
                hm.put(v, h);
                mp.put(v, n.data);
            }
			printBottomView(n.left, v-1, h+1);
			printBottomView(n.right, v+1, h+1);
		}
	}
}
