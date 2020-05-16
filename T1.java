package com.accolite.p6;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n =  new Node(1);

		n.left = new Node(3);
		findPath(n, "");
	}
	static void findPath(Node root, String p) {
		if(root ==  null) {
			return;
		}
		p = p + root.data + " ";
		if(root.left == null && root.right == null) {
			System.out.print(p + "#");
			return;
		}
		if(root != null) {
			findPath(root.left,p);
			findPath(root.right, p); 
		}
	}

}
