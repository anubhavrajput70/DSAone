package heap;

public class InsertionHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[ ] a=new int[7];
		a[0]=50;
		a[1]=30;
		a[2]=40;
		a[3]=10;
		a[4]= 5;
		a[5]=20;
		a[6]=30;
		int e=60;
		int n=a.length;
		System.out.println(n);
		System.out.print("before insertion = ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		insertion(a,n,e);
	}
static void insertion(int[] a,int n,int e)
{
	n++;
	a=new int[n];
	a[n-1]=e;
	int i=n-1;
	while(i>1)
	{
		int parent=i/2;
		if(a[parent]<=a[i])
		{
			int temp=0;
			temp=a[parent];
			a[parent]=a[i];
			a[i]=temp;
			i=parent;
		}
		else
			return;
	}
	System.out.println();
	System.out.print("after insertion = ");
	for( i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
