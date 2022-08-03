package priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class ConnectRopesMaxCost {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,4,8,6,9};
		System.out.println("maximum cost to connect the ropes is = "+maxCost(a));
	}
	static int maxCost(int[] a)
	{
		int cost=0;
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
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
