package queue;
//Queue implementation using linkedlist

import java.util.Scanner;

public class Queue {
Node rear;
Node front;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Queue q=new Queue();
		for(int i=4;i>=1;i--)
		{
		System.out.println("enter a element to insert in the queue");
		int data=sc.nextInt();
		
		q.enqueue(data);
		}
		System.out.println(q.dequeue());
		sc.close();
	}
	 void enqueue(int data)
	{
		Node newNode=new Node(data);
		if(front==null)
			front=rear=newNode;
			rear.next=newNode;	
			rear=newNode;
	}
	 int dequeue() throws Exception
	 {
		 if(front==null)
			 throw new Exception();
		 int res=front.data;
		 front=front.next;
		 return res;
	 }
class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
}

