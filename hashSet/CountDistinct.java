package hashSet;

import java.util.*;

public class CountDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,10,15,5,4,5};
		/*int count=0;
		for(int i=0;i<a.length;i++)
		{
			int j=0;
			for( j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					break;
				}
			
			}
			if(i==j)
				count++;
		}
		System.out.println("distinct elements are = "+ count);*/
		
		Set<Integer> set=new HashSet<Integer>();
		for(int i:a)
		{
			set.add(i);
		}
		System.out.println("distinct elements are = "+set.size());
	}

}

