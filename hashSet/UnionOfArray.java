package hashSet;
import java.util.*;
public class UnionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,10,15,5};
		int b[]= {10,15,10,5};
		Set<Integer> s=new HashSet<Integer>();
		for(int i:a)
			s.add(i);
		for(int i:b)
			s.add(i);
		System.out.println("union is = "+s.size());
	}

}
