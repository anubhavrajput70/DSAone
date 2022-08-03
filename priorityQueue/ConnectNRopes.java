package priorityQueue;
//connect n ropes with minimum cost
import java.util.*;
public class ConnectNRopes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,4,8,6,9};
		System.out.println("minimum cost to connect the ropes is = "+minCost(a));
	}
	static int minCost(int[] a)
	{
		int cost=0;
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<a.length;i++)
		{
			pq.add(a[i]);
		}
		while(pq.size()>1)
		{
			int first=pq.poll();
			int second=pq.poll();
			int sum=first+second;
			cost+=sum;
			pq.add(sum);
		}
		return cost;
		
	}

}
