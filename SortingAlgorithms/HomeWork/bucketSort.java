import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		int a[] = new int[n];
// 		for(int i=0;i<n;i++)
// 		{
// 		    a[i] = sc.nextInt();
// 		}
        int a[] = {2,5,4,3,5,7,9,10};
		a = BucketSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static int[] BucketSort(int[] a)
	{
	    int k = 3;
	    int max = 0,min = Integer.MAX_VALUE;
	    int l = a.length;
	    for(int i=0;i<l;i++)
	    {
	        min = Math.min(min,a[i]);
	        max = Math.max(max,a[i]);
	    }
	    int size = (int)Math.ceil((max-min+1)/(float)k);
	    Vector<Integer>[] p = new Vector[size];
	    for(int i=0;i<size;i++)
	    {
	        p[i] = new Vector<Integer>();
	    }
	    for(int i=0;i<l;i++)
	    {
	        p[(int)((a[i]-min)/k)].add(a[i]);
	    }
	    for(int i=0;i<size;i++)
	    {
	        Collections.sort(p[i]);
	    }
	    int K = 0;
	    for(int i=0;i<k;i++)
	    {
	        for(int j=0;j<p[i].size();j++)
	        {
	            a[K++] = p[i].get(j);
	        }
	    }
	    return a;
	}
}
