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
		a = countSort(a);
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}
	}
	public static int[] countSort(int[] a)
	{
	    int max = 0;
	    for(int i=0;i<a.length;i++)
	    {
	        max = Math.max(a[i],max);
	    }
	    int h[] = new int[max+1];
	    for(int i=0;i<a.length;i++)
	    {
	        h[a[i]]++;
	    }
	    for(int i=1;i<=max;i++)
	    {
	        h[i] = h[i]+h[i-1];
	    }
	    int res[] = new int[a.length];
	    for(int i=a.length-1;i>=0;i--)
	    {
	        res[--h[a[i]]] = a[i];
	    }
	    return res;
	}
}
