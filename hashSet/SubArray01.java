package hashSet;

import java.util.*;
public class SubArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,0,1,1,0,0};
		equalSum(a);
	}
	static void equalSum(int[] a)
	{
		int sum=0;
		int currSum=0;
		int start=0;
		int end=-1;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				a[i]=-1;
		}
		for(int i=0;i<a.length;i++)
		{
			currSum+=a[i];
		if(map.containsKey(currSum-sum))
		{
			start=map.get(currSum-sum)+1;
			
			end=i;
			//break;
		}
		map.put(currSum,i);
		}
		if(end==-1)
			System.out.println("not found");
		else
			System.out.println(start+" "+end);
		
	}

}
