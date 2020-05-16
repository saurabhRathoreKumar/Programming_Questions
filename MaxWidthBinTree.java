package com.accolite.p2;

import java.util.LinkedList;
import java.util.Queue;

class Node  
{ 
	int data; 
	Node left, right; 

	Node(int item)  
	{ 
		data = item; 
		left = right = null; 
	} 
}

public class MaxWidthBinTree {
	 
	public static void main(String[] args) {
		Node root;
		MaxWidthBinTree tree = new MaxWidthBinTree(); 

		/* 
        Constructed bunary tree is: 
              1 
            /  \ 
           2    3 
         /  \    \ 
        4   5     8  
                 /  \ 
                6   7 
		 */
		root = new Node(1); 
		root.left = new Node(2); 
		root.right = new Node(3); 
		root.left.left = new Node(4); 
		root.left.right = new Node(5); 
		root.right.left = new Node(11);
		root.right.right = new Node(8);
		root.right.right.left = new Node(6); 
		root.right.right.right = new Node(7); 
		Queue<Node> q =  new LinkedList<>();
		q.add(root);
		Integer max_width = 0;
		max_width = findMaxWidth(q, max_width);
		System.out.println(max_width);
	}
	
	private static Integer findMaxWidth(Queue<Node> q, Integer max_width) {
		Queue<Node> temp =  new LinkedList<>();
		while(!q.isEmpty()) {
			Node node =  q.poll();
			if(node.left!=null) {
				temp.offer(node.left);
			}
			if(node.right!=null) {
				temp.offer(node.right);
			}
		}
		if(temp.size() > max_width) {
			max_width = temp.size();
		}
		if(!temp.isEmpty()) {
			max_width = findMaxWidth(temp, max_width);
		} 
		return max_width;
	}
}
