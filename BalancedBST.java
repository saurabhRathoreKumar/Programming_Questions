package com.accolite.p5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// A binary tree node 
class Node { 

	int data; 
	Node left, right; 

	Node(int d) { 
		data = d; 
		left = right = null; 
	} 
} 
class BalancedBST
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int test  = Integer.parseInt(buff.readLine());
		while(test-- > 0)
		{
			int k = Integer.parseInt(buff.readLine());
			int[] arr = Arrays.stream(buff.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
			Node root =	getBalancedBST(arr, 0, k-1);
			printPreOrder(root);
		}
	}

	static void printPreOrder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		printPreOrder(root.left);
		printPreOrder(root.right);
	}

	static Node getBalancedBST(int[] arr, int i, int j) {
		if(i==j) {
			return new Node(arr[i]);
		}
		int  m = (i+j)/2;
		Node node = new Node(arr[m]);
		if(m-1 >=0 && i<= m-1) {
			node.left = getBalancedBST(arr, i, m-1);
		}
		if(m+1<= j) 
			node.right = getBalancedBST(arr, m+1, j);
		return node;
	}
}
