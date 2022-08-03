package stack;

import java.util.Scanner;

public class LinkedListStack {
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
Node head;
int size;
public LinkedListStack()
{
	head=null;
	size=0;
}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedListStack lls=new LinkedListStack();
		lls.demo();
	}
	void demo() throws Exception
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while(true) {
		System.out.println("1. push");
		System.out.println("2. pop");
		System.out.println("3. peek");
		System.out.println("4. check empty");
		System.out.println("5. size");
		System.out.println("6. exit");
		System.out.println("enter your choice");
		choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("enter element to add in the stack");
				int data=sc.nextInt();
				push(data);
			}
				break;
			case 2:
			{	
				int res=pop();
				System.out.println(res+" is removed from stack");
			}
				break;
			case 3:
			{
				int res=peek();
				System.out.println(res+" is stack top");
			}
				break;
			case 4:
				System.out.println(isEmpty());
				break;
			case 5:
			{
				int res=size();
				System.out.println("stack has "+res+" elements");
			}
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("your choice is wrong");
			}
			
		}
		
	}
Node newNode(int data) {
	Node node=new Node(data);
	return node;
}
void push(int n) throws Exception
{
	Node temp=newNode(n);
	temp.next=head;
	size++;
	head=temp;
}
int pop() throws Exception {
	if(head==null)
		throw new Exception();
		int res=head.data;
		size--;
		return res;
}
int peek() throws Exception{
	if(head==null)
		throw new Exception();
	return head.data;
}
boolean isEmpty()
{
	 return head==null;
}
int size()
{
	return size;
}
}
