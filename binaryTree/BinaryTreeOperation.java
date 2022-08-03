package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeOperation {
	class Node
	{
		Node left;
		Node right;
		int data;
		public Node(int data)
		{
			this.data=data;
		}
	}
Node root=null;
Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeOperation bto=new BinaryTreeOperation();
      bto.demo();
	}
	 void demo()
		{
			int choice=0;
			while(true) {
			
			System.out.println("1. insertion");
			System.out.println("2. inorder traversal");
			System.out.println("3. preorder traversal");
			System.out.println("4. postorder traversal");
			System.out.println("5. level order traversal");
			System.out.println("6. height of tree");
			System.out.println("7. size of tree");
			System.out.println("8. exit");
			System.out.println("enter your choice");
			choice=sc.nextInt();
			
				switch(choice)
				{
			
				case 1:
					root=createTree();
					break;
				case 2:
				{
					inorder(root);
					System.out.println();}
					break;
				case 3:
				{
					preorder(root);
					System.out.println();
				}
					break;
				case 4:
				{
					postorder(root);
					System.out.println();
				}
				break;
				case 5:
					levelOrder(root);
					break;
					
				case 6:
				{
					int res=height(root);
					System.out.println("height of tree is = "+res);
				}
					break;
				case 7:
				{
					int res=size(root);
					System.out.println("sizr of tree is = "+res);
				}
					break;
				case 8:
					System.exit(0);
				default:
					System.out.println("your choice is wrong");
				}
			
			}
		}
	 Node createTree(){
		 Node root=null;
		 System.out.println("enter data ");
		 int data=sc.nextInt();
		 if(data==-1)
			 return null;
		 root=new Node(data);
		 System.out.println("enter left for "+data);
		 root.left=createTree();
		 System.out.println("enter right for "+data);
		 root.right=createTree();
		 return root;
	 }
	 void inorder(Node root)
	 {
		 if(root==null)
			 return;
	     
	     inorder(root.left);
	     System.out.print(root.data+" ");
		 inorder(root.right);
	 }
	 void preorder(Node root)
	 {
		 if(root==null)
			 return;
	     System.out.print(root.data+" ");
	     preorder(root.left);
		
		 preorder(root.right);
	 }
	 void postorder(Node root)
	 {
		 if(root==null)
			 return;
	    
	     postorder(root.left);
		
		 postorder(root.right);
		 System.out.print(root.data+" ");
	 }
	 int height(Node root)
	 {
		 if(root ==null)
			 return 0;
		 return Math.max(height(root.left),height(root.right))+1;
	 }
	 int size(Node root)
	 {
		 if(root ==null)
			 return 0;
		 return size(root.left)+size(root.right)+1;
	 }
	 void levelOrder(Node root)
	 {
		 Queue<Node> q=new LinkedList<>();
		 q.add(root);
		 while(!q.isEmpty())
		 {
			Node curr=q.poll();
			System.out.print(curr.data+" ");
			if(curr.left!=null)
				q.add(curr.left);
			if(curr.right!=null)
				q.add(curr.right);
		 } 
	 }
	 int findMax(Node root)
	 {
		 if(root==null)
			 return Integer.MIN_VALUE;
		 return(Math.max(root.data,Math.max(findMax(root.left),findMax(root.right))));
		 
	 }
}

