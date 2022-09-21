import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i] = sc.nextInt();
		}
		Quicksort(a,0,n-1);
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}
	}
	public static void Quicksort(int[] a,int l,int h)
	{
	    if(l<h)
	    {
	        int p = Partition(a,l,h);
	        Quicksort(a,l,p-1);
	        Quicksort(a,p+1,h);
	    }
	}
	public static int Partition(int[] a,int l,int h)
	{
	    int pivot = a[h];
	    int i = l-1;
	    for(int j=l;j<=h-1;j++)
	    {
	        if(a[j] < pivot)
	        {
	            i++;
	            swap(a,i,j);
	        }
	    }
	    swap(a,i+1,h);
	    return i+1;
	}
	public static void swap(int[] a,int i,int j)
	{
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
}
