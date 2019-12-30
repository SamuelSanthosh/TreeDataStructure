/*package whatever //do not write package name here */
/*Check if the level order traversal of a Binary Tree results in a palindrome*/
import java.io.*;
import java.util.*;

class GFG {
    static class node{
        char data;
        node left,right;
    };
    
    static node add(char data){
        node newNode = new node();
        newNode.data = data;
        newNode.left = newNode.right = null;
        return newNode;
    }
    static void findInv(Stack<node> S,node root){
        if(root == null)
            return;
        
        Queue<node> Q = new LinkedList<>();
        Q.add(root);
        while(Q.size() > 0){
            node temp = Q.peek();
            Q.remove();
            
            S.add(temp);
            
            if(temp.left != null)
                Q.add(temp.left);
                
            if(temp.right != null)
                Q.add(temp.right);
        }
    }
    static boolean isPalindrome(Stack<node> S,node root){
        Queue<node> Q = new LinkedList<>();
        Q.add(root);
        while(Q.size() > 0){
            node temp = Q.peek();
            
            node temp1 = S.peek();
            S.pop();
            Q.remove();
            
            if(temp.data != temp1.data)
                return false;
            if(temp.left!= null)
                Q.add(temp.left);
            if(temp.right!= null)
                Q.add(temp.right);
                
        }
        return true;
    }
	public static void main (String[] args) {
	    node root = add('R');
	    root.left = add('A');
	    root.right = add('D');
	    root.left.left = add('A');
	    root.left.right = add('Q');
	    
	    Stack<node> S = new Stack<node>();
	    findInv(S,root);
	    
	    if(isPalindrome(S,root)){
	        System.out.println("Yes");
	    }
	    else{
	       System.out.println("No");
	    }
	}
}
