package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestAreaSubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,1,0,1,1},
				    {1,1,1,1,1},
					{0,1,1,1,1},
					{1,1,1,1,1},
					{1,0,1,1,1},
					{1,1,1,1,1}};
		System.out.println(largestSubmatrix(a));
	}
	static int largestSubmatrix(int[][] a)
	{
		int curRow[]=a[0];
		int maxAns=maxHistogram(curRow);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]==1)
					curRow[j]+=1;
				else
					curRow[j]=0;
			}
			int curAns=maxHistogram(curRow);
			maxAns=Math.max(maxAns,curAns);
		}
			return 	maxAns;
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
		return ns;
	}
}
