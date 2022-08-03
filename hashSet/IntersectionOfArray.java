package hashSet;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,10,15,5,10};
		int b[]= {10,15,4,5};
		int count=0;
		Set<Integer> s=new HashSet<Integer>();
		for(int i:a)
			s.add(i);
		for(int i:b)
		{
			if(s.contains(i))
			{
				count++;
				s.remove(i);
			}
		}
		
		System.out.println("intersection is = "+count);
	}

}
