package stack;
import java.util.*;
public class ArrayStack {
int a[];
int top;
int capacity;
public ArrayStack(int capacity)
{
	this.capacity=capacity;
	top=-1;
	a=new int[capacity];
}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayStack as=new ArrayStack(5);
		
		as.demo();
	}
	 void demo() throws Exception
		{
			Scanner sc=new Scanner(System.in);
			int choice=0;
			while(true) {
			
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			System.out.println("4. check empty");
			System.out.println("5. exit");
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
					System.exit(0);
				default:
					System.out.println("your choice is wrong");
				}
				sc.close();
			}
		}
	 void push(int n) throws Exception
	 {
		 if(top==capacity-1)
			 throw new Exception();
		 top++;
		 a[top]=n;
	 }
	 int pop() throws Exception {
		 if(top==-1)
			 throw new Exception();
		 int res=a[top];
		 top--;
		 return res;
	 }
	 int peek() throws Exception{
		 if(top==-1)
			 throw new Exception();
		 return a[top];
	 }
	 boolean isEmpty()
	 {
		 return top==-1;
	 }

}
