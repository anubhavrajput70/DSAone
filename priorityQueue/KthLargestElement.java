package priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] a= {20,10,60,30,50,40};
		int k=3;
		kthLargest(a,k);
		
	}
	static void kthLargest(int a[],int k)
	{
		
		int count=k;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<a.length;i++)
			pq.add(a[i]);
		System.out.println("size = "+pq.size());
		while(count!=1)
		{
			pq.poll();
			count--;
		}
		System.out.print(k+"th largest element is = "+pq.peek() );
	}
}
