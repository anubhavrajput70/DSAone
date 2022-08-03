package stack;
import java.util.*;
//nearest previous smaller element if not found put -1
public class PreviousSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,10,5,8,20,15,3,12};
		preSmall(a);
	}
	static void preSmall(int a[])
	{
		Deque<Integer> s=new ArrayDeque<>();
		for(int i=0;i<a.length;i++)
		{
			while(!s.isEmpty()&&s.peek()>=a[i])
				s.pop();
			if(s.isEmpty())
				System.out.print("-1 ");
			else
				System.out.print(s.peek()+" ");
			s.push(a[i]);
		}
	}
	
}
