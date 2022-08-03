package stack;

import java.util.ArrayDeque;
import java.util.Deque;
//nearest next smaller element if not found put -1
public class NextSmallerElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,10,5,8,20,15,3,12};
		nextSmall(a);
	}
	static void nextSmall(int a[])
	{
		int b[]=new int[a.length];
		Deque<Integer> s=new ArrayDeque<>();
		for(int i=a.length-1;i>=0;i--)
		{
			while(!s.isEmpty()&&s.peek()>=a[i])
				s.pop();
			if(s.isEmpty())
				b[i]=-1;
			else
				b[i]=s.peek();
			s.push(a[i]);
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	
}
