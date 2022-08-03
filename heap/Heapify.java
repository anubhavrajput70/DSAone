package heap;

public class Heapify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,30,50,20,35,15};
		int n=a.length;
		//n--;
		buildHeap(a,n);
	}
	static void buildHeap(int[] a, int n)
	{
		for(int i=n/2-1;i>=0;i--)
			heapify(a, n,i);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
	}

	static void heapify(int[] a,int n, int i)
	{	
	
		int large=i;
		int left=2*i+1;
		int right=2*i+2;
		if(left<n&&a[left]>a[large])
			large=left;
		
		if(right<n&&a[right]>a[large])
			large=right;
	
		if(large!=i)
		{
			int temp=0;
			temp=a[i];
			a[i]=a[large];
			a[large]=temp;
			heapify(a,n,large);
		}
		
	}
}
