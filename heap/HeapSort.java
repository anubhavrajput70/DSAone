package heap;
public class HeapSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,30,50,20,35,15};
		int n=a.length;
		sorting(a,n);	
	}
	static void sorting(int[] a,int n)
	{
		buildHeap(a,n);
		for(int i=n-1;i>=0;i--)
		{
			int temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			heapify(a,i-1,0);
			
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	static void buildHeap(int[] a, int n)
	{
		for(int i=n/2-1;i>=0;i--)
			heapify(a, n,i);	
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
