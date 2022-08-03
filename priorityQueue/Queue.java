package priorityQueue;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(5);
		pq.add(15);
		pq.add(10);
		System.out.println("size = "+pq.size());
		while(!pq.isEmpty())
		{
			System.out.print(pq.peek()+" ");
			pq.poll();
		}
	}

}
