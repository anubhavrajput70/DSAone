package hashSet;

import java.util.*;
public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,15,-5,15,-10,5};
		int sum=5;
		subArraySum(a,sum);
		}
	 static void subArraySum(int a[],int sum)
	{
		int currSum=0;
		int start=0;
		int end=-1;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			currSum+=a[i];
			if(currSum-sum==0)
			{
				start=0;end=i;
				break;
			}
			if(map.containsKey(currSum-sum))
			{
				start=map.get(currSum-sum)+1;
				end=i;
				break;
			}
			map.put(currSum,i);
		}
		if(end==-1)
			System.out.println("not found");
		else
			System.out.println(start+" "+end);
	}


}
