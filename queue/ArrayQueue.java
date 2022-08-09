package queue;

import java.util.Scanner;

public class ArrayQueue {
int a[];
int capacity;
int rear;
public ArrayQueue(int n) 
{
	capacity=n;
	a=new int[capacity];
	rear=-1;
}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the queue");
		int n=sc.nextInt();
		
		ArrayQueue aq=new ArrayQueue(n);
		aq.demo();
		
		
	}
	void demo() throws Exception
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
				enque(data);
			}
				break;
			case 2:
			{	
				int res=deque();
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
	void enque(int data) throws Exception
	{
		if(rear==capacity-1)
			throw new Exception(); 
		rear++;
		a[rear]=data;
	}
	int deque() throws Exception
	{
		if(rear==-1)
			throw new Exception(); 
		int res=a[0];
		for(int i=0;i<rear;i++)
			a[i]=a[i+1];
		return res;
	}
	int getFront() throws Exception
	{
		if(rear==-1)
			throw new Exception(); 
		return a[0];
	}

}
