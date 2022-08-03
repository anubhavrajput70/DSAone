package hashSet;
//count the distinct element in every window of size k
import java.util.*;
public class CountDistinctWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,2,1,3,1,1,3};
		int k=4;
		countDistinctWindow(a,k);
	}

	static void countDistinctWindow(int[] a,int k)
	{
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<k;i++)
		{
			map.put(a[i],map.getOrDefault(a[i],0)+1);
		}
		System.out.println(map.size());
		for(int i=k;i<a.length;i++)
		{
			if(map.get(a[i-k])==1)
			{
				map.remove(a[i-k]);
			}
			else
			{
				map.put(a[i-k],map.get(a[i-k])-1);
			}
			map.put(a[i],map.getOrDefault(a[i],0)+1);
			System.out.println(map.size());
		}
	}
}
