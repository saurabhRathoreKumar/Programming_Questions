package com.accolite.p6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.LinkedList;
import java.util.Queue;


class GfG6 {

	static Node buildTree(String str){

		if(str.length()==0 || str.charAt(0)=='N'){
			return null;
		}

		String ip[] = str.split(" ");
		// Create the root of the tree
		Node root = new Node(Integer.parseInt(ip[0]));
		// Push the root to the queue

		Queue<Node> queue = new LinkedList<>(); 

		queue.add(root);
		// Starting from the second element

		int i = 1;
		while(queue.size()>0 && i < ip.length) {

			// Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();

			// Get the current node's value from the string
			String currVal = ip[i];

			// If the left child is not null
			if(!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));
				// Push it to the queue
				queue.add(currNode.left);
			}

			// For the right child
			i++;
			if(i >= ip.length)
				break;

			currVal = ip[i];

			// If the right child is not null
			if(!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}
	static void printInorder(Node root)
	{
		if(root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data+" ");

		printInorder(root.right);
	}

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t=Integer.parseInt(br.readLine());

		while(t > 0){
			String s1 = br.readLine();
			String s2 = br.readLine();
			Node root1 = buildTree(s1);
			Node root2 = buildTree(s2);
			BinaryTree tree = new BinaryTree();
			if (tree.isIsomorphic(root1, root2) == true) 
				System.out.println("Yes"); 
			else
				System.out.println("No");
			t--;

		}
	}

}

//} Driver Code Ends
//User function Template for Java

class BinaryTree  
{ 

	boolean isIsomorphic(Node n1, Node n2)  
	{ 
		if(n1 != null && n2 != null && n1.data == n2.data) {
			return checkIsomorphic(n1, n2);
		}
		else 
			return false;
	}

	boolean checkIsomorphic(Node n1, Node n2) {
		if(n1 != null && n2!=null) {
			if(n1.left != null && n1.right != null && n2.left != null && n2.right != null) {
				if(n1.left.data == n2.left.data && n1.right.data == n2.right.data) {
					boolean flag = checkIsomorphic(n1.left, n2.left);
					flag =  flag && checkIsomorphic(n1.right, n2.right);
					if(!flag) {
					    flag = checkIsomorphic(n1.left, n2.right);
						flag =  flag && checkIsomorphic(n1.right, n2.left);
					}
					return flag;
				}
				else if(n1.left.data == n2.right.data && n1.right.data == n2.left.data) {
					boolean flag = checkIsomorphic(n1.left, n2.right);
					return flag && checkIsomorphic(n1.right, n2.left); 
				}
				else 
					return false;
			}
			else if(n1.left == null && n1.right != null && n2.left != null && n2.right == null
					&& n1.right.data == n2.left.data) {
				return checkIsomorphic(n1.right, n2.left);
			}
			else if(n1.left != null && n1.right == null && n2.left == null && n2.right != null
					&& n1.left.data == n2.right.data) {
				return checkIsomorphic(n1.left, n2.right);
			}
			else if(n1.left != null && n1.right == null && n2.left != null && n2.right == null
					&& n1.left.data == n2.left.data) {
				return checkIsomorphic(n1.left, n2.left);
			}
			else if(n1.left == null && n1.right != null && n2.left == null && n2.right != null
					&& n1.right.data == n2.right.data) {
				return checkIsomorphic(n1.right, n2.right);
			}
			else if(n1.left == null && n1.right == null && n2.left == null && n2.right == null) {
				return true;
			}
			else {
				return false;
			}
		}
		else if((n1 == null && n2 != null)  || (n1  != null && n2 == null)) {
			return false;
		}
		else 
			return true;
	}

}    
