package stack;
//largest rectangular area in a histogram
import java.util.ArrayDeque;
import java.util.Deque;

public class LargestHistogram {
	public static void main(String args[])
{
	int a[]= {4,2,1,5,6,3,2,4,2};
	System.out.println(maxHistogram(a));
}
static int maxHistogram(int a[])
{
	int maxAns=0;
	int[] ps=prevSmaller(a);
	int[] ns=nextSmaller(a);
	for(int i=0;i<a.length;i++)
	{
		int curr=(ns[i]-ps[i]-1)*a[i];
		maxAns=Math.max(maxAns,curr);
	}
	return maxAns;
}
static int[] prevSmaller(int a[])
{
	int[] ps=new int[a.length];
	Deque<Integer> s=new ArrayDeque<>();
	for(int i=0;i<a.length;i++)
	{
		while(!s.isEmpty()&&a[s.peek()]>=a[i])
			s.pop();
		if(s.isEmpty())
				ps[i]=-1;
		else
			ps[i]=s.peek();
		s.push(i);
	}
	for(int i=0;i<ps.length;i++)
		System.out.print(ps[i]+" ");
	System.out.println();
	return ps;
}
static int[] nextSmaller(int a[])
{
	int z=a.length;
	int ns[]=new int[a.length];
	Deque<Integer> s=new ArrayDeque<>();
	for(int i=a.length-1;i>=0;i--)
	{
		while(!s.isEmpty()&&a[s.peek()]>=a[i])
			s.pop();
		if(s.isEmpty())
			ns[i]=z;
		else
			ns[i]=s.peek();
		s.push(i);
	}
	for(int i=0;i<ns.length;i++)
		System.out.print(ns[i]+" ");
	System.out.println();
	return ns;
}


}
