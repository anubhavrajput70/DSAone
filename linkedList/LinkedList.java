package linkedList;
import java.util.*;
public class LinkedList  {
	class Node
	{
		int data;
		Node next;
		public Node (int data)
		{
		this.data=data;
		this.next=null;
		}
	}
	public Node head=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LinkedList sList = new LinkedList();    
          
	        //Add nodes to the list    
	        sList.addNode(1);    
	        sList.addNode(2);    
	        sList.addNode(3);    
	        sList.addNode(2); 
	        sList.addNode(1); 
		sList.demo();
	}
	 void demo()
	{
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		while(true) {
		
		System.out.println("1. insertion");
		System.out.println("2. deletion");
		System.out.println("3. traversal");
		System.out.println("4. iterative reverse");
		System.out.println("5. recursive reverse");
		System.out.println("6. check palindrome");
		System.out.println("7. exit");
		System.out.println("enter your choice");
		choice=sc.nextInt();
		
			switch(choice)
			{
		
			case 1:
			{
				System.out.println("enter postion to insert the node");
				int pos=sc.nextInt();
				System.out.println("enter node data");
				int data=sc.nextInt();
				insertion(data,head,pos);
			}
				break;
			case 2:
			{
				System.out.println("enter postion to delete the node");
				int pos=sc.nextInt();
				deletion(head,pos);
			}
				break;
			case 3:
				traversal(head);
				break;
			case 4:
				head=iterativeReverse(head);
				break;
			case 5:
				head=recursiveReverse(head);
				break;
			case 6:
				{
				   if(palindrome(head))
					   System.out.println("palindrome");
				   else
					   System.out.println("not a palindrome");}
				
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("your choice is wrong");
			}
			sc.close();
		}
	}
	
	public void addNode(int data)
	{	
		   Node newNode = new Node(data);    
	        if(head == null) {    
	            head = newNode;    
	        }   
	        else
	        {
	        	newNode.next=head;
	        	head=newNode;
	        }      
	}
 void traversal(Node head)
	{
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
 void insertion(int data,Node head, int pos)
 {
	 Node newNode = new Node(data);    
	 if(pos==0)
	 {
		 newNode.next=head;
     	head=newNode;
	 }
	 Node temp=head;
	 for(int i=0;i<pos-1;i++)
		 temp=temp.next;
	 newNode.next=temp.next;
	 temp.next=newNode;
 }
 void deletion(Node head,int pos)
 {
	 Node temp=head;
	 for(int i=0;i<pos-1;i++)
		 temp=temp.next;
	 temp.next=temp.next.next; 
 }
Node iterativeReverse(Node head)
{
	Node curr=head;
	Node prev=null;
	while(curr!=null)
	{
		Node temp=curr.next;
		curr.next=prev;
		prev=curr;
		curr=temp;
	}
	return prev;
}
Node recursiveReverse(Node head)
{
	if(head==null||head.next==null)
		return head;
	Node newHead=recursiveReverse(head.next);
	Node headNext=head.next;
	headNext.next=head;
	head.next=null;
	return newHead;
}
boolean palindrome(Node head)
{
	if(head==null)
	return true;
	Node mid=middle(head);
	Node last=iterativeReverse(mid.next);
	Node curr=head;
	while(last!=null)
	{
		if(last.data!=curr.data)
			return false;
		curr=curr.next;
		last=last.next;
	}
	return true;
}
Node middle(Node head)
{
	Node fast=head;
	Node slow=head;
	while(fast!=null&&fast.next!=null)
	{
		slow=slow.next;
		fast=fast.next.next;
	}
		return slow;
}
}
