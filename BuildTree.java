package com.accolite.p6;

import java.util.Scanner;

class Node
{
	int data; 
	Node left, right;
	Node(int key)
	{
		data = key;
		left = right = null;
	}
}

class BuildTree
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- > 0)
		{
			int n = sc.nextInt();
			Node root = null;
			int ino[] = new int[n];
			int pre[] = new int[n];
			for(int i = 0; i < n; i++)
				ino[i] = sc.nextInt();

			for(int i = 0; i < n; i++)
				pre[i] = sc.nextInt();

			GfG gfg = new GfG(0);
			root = gfg.buildTree(ino, pre, 0, n-1);
			postOrdrer(root);
			System.out.println();
		}
	}

	public static void postOrdrer(Node root)
	{
		if(root == null)
			return;

		postOrdrer(root.left);
		postOrdrer(root.right);
		System.out.print(root.data + " ");
	}
}
// } Driver Code Ends
class GfG
{
	static int i;
	public static int preIndex;
	GfG(int ind)
	{
		preIndex = ind;
		i = 0;
	}

	static int getIndexOfElement(int[] a, int el) {
		for(int i = 0; i< a.length;i++) {
			if(a[i] == el) {
				return i;
			} 
		}
		return -1;
	}

	public static Node buildTree(int ino[], int pre[], int st, int end)
	{
		int el = pre[i++];
		Node root = new Node(el);
		int m = getIndexOfElement(ino, el);
		prepareTree(root, 0, m, ino.length-1, ino, pre);
		return root;
	}

	static Node prepareTree(Node node, int l, int m, int h, int[] in, int[] pr) {
		if(i >= in.length) {
			return null;
		}
		int nextNode = pr[i];
		int ind = getIndexOfElement(in, nextNode);
		Node n = new Node(nextNode);
		if(ind >= l && ind <m) {
			node.left = n;
			i++;
			prepareTree(n, l, ind, m-1, in, pr);
		}
		if(i >= in.length) {
			return n;
		}
		nextNode = pr[i];
		ind = getIndexOfElement(in, nextNode);
		n = new Node(nextNode);
		if(ind > m && ind <= h) {
			node.right = n;
			i++;
			prepareTree(n, m+1, ind, h, in, pr);
		}
		return n;
	}
}