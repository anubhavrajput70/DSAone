package heap;
//print the kth smallest element in the array
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,10,60,30,50,40};
		int k=3;
		System.out.println(k+"th smallest element is = "+largest(a,k));
	}
	static int largest(int[] a,int k)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<k;i++)
		{
			pq.add(a[i]);
		}
		for(int i=k;i<a.length;i++)
		{
			if(pq.peek()>a[i])
			{
				pq.poll();
				pq.add(a[i]);
			}
		}
		return pq.peek();
	}


}
