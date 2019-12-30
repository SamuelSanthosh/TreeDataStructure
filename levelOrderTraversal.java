/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node left,right;
    
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class BinaryTree {
    Node root;
    
    void printLevelOrder(){
        Queue<node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data+" ");
            
            if(temp.left != null)
                q.add(temp.left);
                
            if(temp.right != null)
                q.add(temp.right);
        }
    }
	public static void main (String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("level order traversal of binary tree");
		tree.printLevelOrder();
	}
}
