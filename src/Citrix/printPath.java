package Citrix;

import java.util.ArrayList;
import java.util.Collections;

class Node {
	int data ;
	Node left , right ;
	
	public Node (int data){
		this.data = data ;
		left = right = null ;
	}
}


public class printPath {
	
	public static ArrayList path;
	public Boolean printPath(Node root, int dest){
		if(root==null) return false;
		if(root.data==dest||printPath(root.right,dest)||printPath(root.left,dest)){
			//System.out.print("  " + root.data);
			path.add(root.data);
			return true;
		}
		return false;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node (2);
		root.right = new Node (3);
		root.right.right = new Node (7);
		Node n1 = new Node (4);
		root.left.left = n1;
		root.left.right = new Node (5);
		Node n2 = new Node (8);
		root.left.right.right = n2;
		root.left.right.left = new Node (7);
		
		printPath i = new printPath();
		path = new ArrayList();
		i.printPath(root,7);
		Collections.reverse(path);
		System.out.println(" Path " + path);
		
	}

}
