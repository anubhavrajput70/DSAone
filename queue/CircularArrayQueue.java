package queue;

import java.util.Scanner;

public class CircularArrayQueue {
	int a[];
	int capacity;
	int rear,front;
	public CircularArrayQueue(int n) 
	{
		capacity=n;
		a=new int[capacity];
		rear=-1;
		front=-1;
	}
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of the queue");
			int n=sc.nextInt();
			
			CircularArrayQueue aq=new CircularArrayQueue(n);
			aq.demo();
			
		}
		void demo() 
		{
			Scanner sc=new Scanner(System.in);
			int choice=0;
			while(true) {
			
			System.out.println("1. enque");
			System.out.println("2. deque");
			System.out.println("3. get front");
			System.out.println("4. exit");
			System.out.println("enter your choice");
		    choice=sc.nextInt();
			
				switch(choice)
				{
				case 1:
				{
					System.out.println("enter element to add in the queue");
					int data=sc.nextInt();
					circularEnque(data);
				}
					break;
				case 2:
				{	
					int res=circularDeque();
					System.out.println(res+" is removed from queue");
				}
					break;
				case 3:
				{
					int res=getFront();
					System.out.println(res+" is queue front");
				}
					break;
				
			
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("your choice is wrong");
				}
				
			}
		}
		void circularEnque(int data) 
		{
			if((rear+1)%capacity==front)
				return;
			if(front==-1)
				front=0;
			rear=(rear+1)%capacity;
			a[rear]=data;
			System.out.println("front = "+front);
			System.out.println("rear = "+rear);
		}
		int circularDeque() 
		{
			if(front==-1)
				System.out.println("queue is empty");
			int res=a[front];
			if(front==rear)
				front=rear=-1;
			else
				front=(front+1)%capacity;
			System.out.println("front = "+front);
			System.out.println("rear = "+rear);
			return res;
			
		}
		int getFront() 
		{
			if(rear==-1)
				System.out.println("queue is empty");
			return a[front];
		}


}
